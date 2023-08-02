package com.mibanco.transaccionloterenovacioncdt.us.grpc;

import com.mibanco.transaccionloterenovacioncdt.us.*;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import com.mibanco.transaccionloterenovacioncdt.us.service.impl.TransaccionLoteRenovacionCdtServiceImpl;
import com.mibanco.transaccionloterenovacioncdt.us.util.ApplicationException;
import com.mibanco.transaccionloterenovacioncdt.us.util.TransaccionLoteRenovacionCdtMapperGrpc;
import com.mibanco.transaccionloterenovacioncdt.us.util.validator.TransaccionLoteRenovacionCdtValidator;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class TransaccionLoteRenovacionCdtGrpc extends TransaccionLoteRenovacionGrpcGrpc.TransaccionLoteRenovacionGrpcImplBase {
    public static final Logger LOG = LoggerFactory.getLogger(TransaccionLoteRenovacionCdtGrpc.class);

    @Inject
    TransaccionLoteRenovacionCdtServiceImpl transaccionLoteRenovacionCdtService;

    @Inject
    TransaccionLoteRenovacionCdtMapperGrpc mapper;

    @Inject
    TransaccionLoteRenovacionCdtValidator validator;

    @Override
    @Blocking
    public void guardarRenovacionesCDT(GuardarRenovacionesCDTInput request, StreamObserver<ResponseGuardarRenovacionesCDT> responseObs) {

        LOG.info("Inicia guardado renovaciones por GRPC");

        try {
            GuardarRenovacionesCDTEntity entity = mapper.renovacionGrpcToEntity(request);
            transaccionLoteRenovacionCdtService.guardarRenovacionesCDT(entity);

            ResponseGuardarRenovacionesCDT response = ResponseGuardarRenovacionesCDT.newBuilder().setRpt(request.getLista()).build();
            LOG.info("Finaliza guardado renovaciones por GRPC");

            responseObs.onNext(response);
            responseObs.onCompleted();

        } catch (Exception e) {

            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObs.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarRenovacionesPorLoteYEstado(ConsultarRenovacionesPorLoteYEstadoInput request, StreamObserver<ResponseListGuardarRenovacionesCDT> responseObs) {

        LOG.info("Inicia consultarRenovacionesPorLoteYEstado por GRPC");
        try {

//            validator
            List<RenovacionCDTType> consultaList = transaccionLoteRenovacionCdtService.consultarRenovacionesPorLoteYEstado(request.getCodigoLote(), request.getEstadoRenovacion().toString());

            List<com.mibanco.transaccionloterenovacioncdt.us.RenovacionCDTType> renovacionListResponse = new ArrayList<>();
            for (RenovacionCDTType renovacion : consultaList) {
                TransaccionLoteRenovacionCDT_Type transaccionLoteRenovacionCDTType = TransaccionLoteRenovacionCDT_Type.newBuilder()
                        .setCodigoLote(renovacion.getTransaccionRenovacion().getCodigoLote())
                        .setNumCertificadoNuevo(renovacion.getTransaccionRenovacion().getNumCertificadoNuevo())
                        .setNumCertificadoCancelar(renovacion.getTransaccionRenovacion().getNumCertificadoCancelar())
                        .setNumeroCliente(renovacion.getTransaccionRenovacion().getNumeroCliente())
                        .setCodigoLote(renovacion.getTransaccionRenovacion().getCodigoLote())
                        .setEstadoRenovacion(renovacion.getTransaccionRenovacion().getEstadoRenovacion().toString())
                        .setTipoProceso(renovacion.getTransaccionRenovacion().getTipoProceso().toString())
                        .build();

                renovacionListResponse.add(com.mibanco.transaccionloterenovacioncdt.us.RenovacionCDTType.newBuilder()
                        .setNumCertificadoCancelar(renovacion.getNumCertificadoCancelar())
                        .setNumeroCliente(renovacion.getNumeroCliente())
                        .setNumeroProductoCDT(renovacion.getNumeroProductoCDT().toString())
                        .setTipoRenovacion(renovacion.getTipoRenovacion().toString())
                        .setPlazoDias(renovacion.getPlazoDias())
                        .setPlazo(renovacion.getPlazo())
                        .setFechaVencimientoDia(renovacion.getFechaVencimientoDia())
                        .setFechaVencimientoMes(renovacion.getFechaVencimientoMes())
                        .setFechaVencimientoAno(renovacion.getFechaVencimientoAno())
                        .setCodigoBanco(renovacion.getCodigoBanco())
                        .setCodigoSucursal(renovacion.getCodigoSucursal())
                        .setCondicionManejo(renovacion.getCondicionManejo())
                        .setCompensacion(renovacion.getCompensacion())
                        .setTipoProrroga(renovacion.getTipoProrroga())
                        .setCuentaDePago(renovacion.getCuentaDePago())
                        .setNumeroCuentaContable(renovacion.getNumeroCuentaContable())
                        .setConcepto(renovacion.getConcepto())
                        .setCuentaConcepto(renovacion.getCuentaConcepto())
                        .setMonedaPago(renovacion.getMonedaPago())
                        .setMontoCapital(renovacion.getMontoCapital())
                        .setTipoPersona(renovacion.getTipoPersona())
                        .setNumeroDocumento(renovacion.getNumeroDocumento())
                        .setNombreCliente(renovacion.getNombreCliente())
                        .setTipoTransaccion(renovacion.getTipoTransaccion().toString())
                        .setCodigoBancoDestino(renovacion.getCodigoBancoDestino().toString())
                        .setNumeroCuentaBancaria(renovacion.getNumeroCuentaBancaria())
                        .setReferencia(renovacion.getReferencia())
                        .setTransaccionRenovacion(transaccionLoteRenovacionCDTType)
                        .build());
            }
            ResponseListGuardarRenovacionesCDT response = ResponseListGuardarRenovacionesCDT.newBuilder().addAllRpt(renovacionListResponse).build();

            LOG.info("Finaliza consultarRenovacionesPorLoteYEstado por GRPC");
            responseObs.onNext(response);
            responseObs.onCompleted();

        } catch (ApplicationException e) {

            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObs.onError(statusException);
        } catch (Exception e) {

            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObs.onError(statusException);
        }
    }

    private StatusException responseExceptionGrpc(Status statusCode, String exceptionMessage) {

        LOG.error(exceptionMessage + "Exception: " + exceptionMessage);

        Metadata metadata = new Metadata();
        metadata.put(Metadata.Key.of("Error: ", Metadata.ASCII_STRING_MARSHALLER), exceptionMessage);

        return statusCode.asException(metadata);
    }

}
