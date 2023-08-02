package com.mibanco.transaccionloterenovacioncdt.us.service.impl;

import com.mibanco.transaccionloterenovacioncdt.us.EstadoRenovacionEnum;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.RenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dto.GuardarRenovacionesCDTDTO;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.business.CrearLoteRenovacionCmd;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.messaging.pub.RenovacionCDTIniciaProcesoPub;
import com.mibanco.transaccionloterenovacioncdt.us.service.contract.TransaccionLoteRenovacionCdtService;
import com.mibanco.transaccionloterenovacioncdt.us.util.ApplicationException;
import com.mibanco.transaccionloterenovacioncdt.us.util.TransaccionLoteRenovacionMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@ApplicationScoped
public class TransaccionLoteRenovacionCdtServiceImpl implements TransaccionLoteRenovacionCdtService {

    private static final Logger LOG = LoggerFactory.getLogger(TransaccionLoteRenovacionCdtServiceImpl.class);

    @Inject
    TransaccionLoteRenovacionMapper transaccionLoteRenovacionMapper;

    @Inject
    CrearLoteRenovacionCmd crearLoteRenovacionCmd;

    @Inject
    RenovacionCDTIniciaProcesoPub renovacionCDTIniciaProcesoPub;


    @Override
    public List<RenovacionCDTType> consultarRenovacionesPorLoteYEstado(String codigoLote, String estado) {
        // Implementa la lógica para consultar las renovaciones por lote y estado
        LOG.info("Consultando renovaciones por lote {} y estado {}", codigoLote, estado);
//
//        // Utiliza transaccionLoteRenovacionDAO u otro mecanismo de acceso a datos para realizar la consulta
//        List<RenovacionCDTEntity> renovaciones = transaccionLoteRenovacionDAO.consultarRenovacionesPorLoteYEstado(codigoLote, estado);
//
//        // Convierte las entidades a RenovacionCDTType utilizando el mapper
//        List<RenovacionCDTType> renovacionesType = transaccionLoteRenovacionMapper.renovacionEntityListToRenovacionTypeList(renovaciones);
//
//        return renovacionesType;
        return null;
    }

    //@Transactional
    @Override
    public RenovacionCDTEntity guardarRenovacionesCDT(GuardarRenovacionesCDTEntity guardarRenovacionesCDT) throws ApplicationException {
        LOG.info("Inicia guardarRenovacionesCDT en TransaccionLoteRenovacionCdtServiceImpl");
        GuardarRenovacionesCDTEntity guardarRenovacionesCDTEntity = transaccionLoteRenovacionMapper.guardarRenovacionesCDTToEntity(guardarRenovacionesCDT);

        List<GuardarRenovacionesCDTDTO> listGuardarRenovacionesCDTDTO = (List<GuardarRenovacionesCDTDTO>) crearLoteRenovacionCmd.execute(guardarRenovacionesCDTEntity);

        // Verificar si la lista no está vacía antes de procesar
        if (!listGuardarRenovacionesCDTDTO.isEmpty()) {
            // El comando enviar mensaje kafka se envía aquí
            for (GuardarRenovacionesCDTDTO guardarRenovacionesCDTDTO : listGuardarRenovacionesCDTDTO) {
                renovacionCDTIniciaProcesoPub.execute(guardarRenovacionesCDTDTO);
            }

            LOG.info("Finaliza guardarRenovacionesCDT en TransaccionLoteRenovacionCdtServiceImpl");
            // Devolver el primer elemento de la lista
            return guardarRenovacionesCDT.getLista().get(0);
        } else {
            // Manejar el caso en que la lista esté vacía, según sea necesario
            throw new ApplicationException("La lista de GuardarRenovacionesCDTDTO está vacía");
        }
    }

}
