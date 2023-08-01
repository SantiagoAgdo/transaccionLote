package com.mibanco.transaccionloterenovacioncdt.us.controller;

import com.mibanco.transaccionloterenovacioncdt.us.constants.Constants;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.RenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.gen.contract.V1TransaccionLoteRenovacionCDT;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.EstadoRenovacionEnum;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.GuardarRenovacionesCDT;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import com.mibanco.transaccionloterenovacioncdt.us.service.impl.TransaccionLoteRenovacionCdtServiceImpl;
import com.mibanco.transaccionloterenovacioncdt.us.util.ApplicationException;
import com.mibanco.transaccionloterenovacioncdt.us.util.TransaccionLoteRenovacionMapper;
import com.mibanco.transaccionloterenovacioncdt.us.util.exceptions.ApplicationExceptionValidation;
import com.mibanco.transaccionloterenovacioncdt.us.util.validator.TransaccionLoteRenovacionCdtValidator;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransaccionLoteRenovacionCdtController implements V1TransaccionLoteRenovacionCDT {
    public static final Logger LOG = LoggerFactory.getLogger(TransaccionLoteRenovacionCdtController.class);

    @Inject
    TransaccionLoteRenovacionCdtValidator validator;
    @Inject
    TransaccionLoteRenovacionCdtServiceImpl transaccionLoteRenovacionCdtService;

    @Inject
    TransaccionLoteRenovacionMapper transaccionLoteRenovacionMapper;

    @Override
    public Response consultarRenovacionesPorLoteYEstado(String codigoLote, EstadoRenovacionEnum estado) {
        LOG.info("Consultando renovaciones por lote {} y estado {}" + codigoLote + estado);
        return null;
    }

    @Override
    public Response guardarRenovacionesCDT(GuardarRenovacionesCDT guardarRenovacionesCDT) {

        LOG.info("Inicia guardarRenovacionesCDT en TransaccionLoteRenovacionCdtController");

        try {
            // Llama al método guardarRenovacionesCDT del servicio
            validator.verificarGuardarRenovacionesCDT(guardarRenovacionesCDT);
            GuardarRenovacionesCDTEntity entity = transaccionLoteRenovacionMapper.guardarRenovacionTypeToEntity(guardarRenovacionesCDT);
            RenovacionCDTEntity resultado = transaccionLoteRenovacionCdtService.guardarRenovacionesCDT(entity);

            // Si el guardado es exitoso, puedes devolver el resultado
            LOG.info("Termina guardarRenovacionesCDT en TransaccionLoteRenovacionCdtController");

            return Response.status(Response.Status.CREATED).entity(resultado).build();

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de guardarRenovacionesCDT - TransaccionLoteRenovacionCdtController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "guardarRenovacionesCDT en TransaccionLoteRenovacionCdtController exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "guardarRenovacionesCDT, exception: " + e.getMessage()).build();
        }
    }
}
