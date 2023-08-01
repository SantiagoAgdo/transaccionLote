package com.mibanco.transaccionloterenovacioncdt.us.gen.contract;

import com.mibanco.transaccionloterenovacioncdt.us.gen.type.ConsultarRenovacionesPorLoteYEstadoOutput;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.EstadoRenovacionEnum;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.GuardarRenovacionesCDT;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/us/renovacionCDT")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-01T16:58:05.662005-05:00[America/Bogota]")
public interface V1TransaccionLoteRenovacionCDT {

    @GET
    @Path("/{codigoLote}/{estado}")
    @Produces({ "application/json" })
    Response consultarRenovacionesPorLoteYEstado(@PathParam("codigoLote") String codigoLote,@PathParam("estado") EstadoRenovacionEnum estado);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response guardarRenovacionesCDT(@Valid @NotNull GuardarRenovacionesCDT guardarRenovacionesCDT);
}
