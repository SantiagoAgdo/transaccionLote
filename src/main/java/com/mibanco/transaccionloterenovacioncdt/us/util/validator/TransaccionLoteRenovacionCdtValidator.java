package com.mibanco.transaccionloterenovacioncdt.us.util.validator;

import com.mibanco.transaccionloterenovacioncdt.us.constants.Constants;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.GuardarRenovacionesCDT;
import com.mibanco.transaccionloterenovacioncdt.us.util.exceptions.ApplicationExceptionValidation;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@ApplicationScoped
public class TransaccionLoteRenovacionCdtValidator {
    public static final Logger logger = LoggerFactory.getLogger(TransaccionLoteRenovacionCdtValidator.class);

    private String msmError = "";

    public void verificarGuardarRenovacionesCDT(GuardarRenovacionesCDT guardarRenovacionesCDT) throws ApplicationExceptionValidation {

        if (guardarRenovacionesCDT == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.SERVICIO_INTERNAL + "la peticion no puede presentar dato null."
            );
        }

        if (guardarRenovacionesCDT.getLista() == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.SERVICIO_INTERNAL + "la peticion no puede presentar alertas null."
            );
        }

        if (guardarRenovacionesCDT.getCantidadCDTs() == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.SERVICIO_INTERNAL + "la peticion no puede presentar alertas null."
            );
        }

        logger.info("Validacion realizadas correctamente");
        Response.ok().build();
    }
}
