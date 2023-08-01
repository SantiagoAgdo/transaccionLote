package com.mibanco.transaccionloterenovacioncdt.us.service.command.business;


import com.mibanco.transaccionloterenovacioncdt.us.constants.Constants;
import com.mibanco.transaccionloterenovacioncdt.us.dao.contract.SaveDataLoteRenovacionCdtDao;
import com.mibanco.transaccionloterenovacioncdt.us.dao.contract.TransaccionLoteRenovacionDAO;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.LoteRenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.RenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.SaveDataLoteRenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dto.GuardarRenovacionesCDTDTO;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.ICommand;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.IParam;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.messaging.pub.RenovacionCDTIniciaProcesoPub;
import com.mibanco.transaccionloterenovacioncdt.us.util.ApplicationException;
import com.mibanco.transaccionloterenovacioncdt.us.util.TransaccionLoteRenovacionMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class CrearLoteRenovacionCmd implements ICommand {
    private static final Logger LOG = LoggerFactory.getLogger(CrearLoteRenovacionCmd.class);

    @Inject
    TransaccionLoteRenovacionDAO transaccionLoteRenovacionDAO;

    @Inject
    SaveDataLoteRenovacionCdtDao saveDataLoteRenovacionCdtDao;

    @Inject
    RenovacionCDTIniciaProcesoPub renovacionCDTIniciaProcesoPub;

    @Inject
    TransaccionLoteRenovacionMapper mapper;


    @Override
    public Object execute(IParam parametro) {
        LOG.info("Inicia CrearLoteRenovacion command");
        List<GuardarRenovacionesCDTDTO> listGuardarRenovacionesCDTDTO = new ArrayList<>();
        try {
            GuardarRenovacionesCDTEntity guardarRenovacionesCDTEntity = (GuardarRenovacionesCDTEntity) parametro;

            LoteRenovacionCDTEntity loteRenovacionCDTEntity = new LoteRenovacionCDTEntity();
            loteRenovacionCDTEntity.setCodigoLote(java.util.UUID.randomUUID().toString());
            loteRenovacionCDTEntity.setFechaCreacion(new Date());
            loteRenovacionCDTEntity.setCantidadCDTs(0);
            loteRenovacionCDTEntity.setCdtsRenovacionNoExitoso(0);
            loteRenovacionCDTEntity.setCdtsRenovados(0);
            loteRenovacionCDTEntity.setTotalCDTsProcesados(0);
            transaccionLoteRenovacionDAO.persist(loteRenovacionCDTEntity);

            for (RenovacionCDTEntity renovacion : guardarRenovacionesCDTEntity.getLista()) {
                SaveDataLoteRenovacionCDTEntity saveDataLoteRenovacionCDTEntity = new SaveDataLoteRenovacionCDTEntity();
                saveDataLoteRenovacionCDTEntity.setCodigoLote(loteRenovacionCDTEntity.getCodigoLote());
                saveDataLoteRenovacionCDTEntity.setFechaCreacion(loteRenovacionCDTEntity.getFechaCreacion());
                RenovacionCDTType renovacionCDTType = mapper.renovacionEntityToRenovacionType(renovacion);
                saveDataLoteRenovacionCDTEntity.setRenovacionCDTType(renovacionCDTType);
                saveDataLoteRenovacionCdtDao.persist(saveDataLoteRenovacionCDTEntity);

                //politica 71
                GuardarRenovacionesCDTDTO guardarRenovacionesCDTDTO = new GuardarRenovacionesCDTDTO();
                guardarRenovacionesCDTDTO.setCodigoLote(saveDataLoteRenovacionCDTEntity.getCodigoLote());
                guardarRenovacionesCDTDTO.setCdt(saveDataLoteRenovacionCDTEntity.getRenovacionCDTType());
                if(guardarRenovacionesCDTDTO != null){
                    listGuardarRenovacionesCDTDTO.add(guardarRenovacionesCDTDTO);
                }

            }
            //retornar lista
            return listGuardarRenovacionesCDTDTO;
        } catch (Exception e) {
            LOG.info("Error CrearLoteCancelacion command : " + e.getMessage());
            throw new ApplicationException(Constants.ERROR_SERVICIO + e.getMessage());
        }
    }
}
