package com.mibanco.transaccionloterenovacioncdt.us.grpc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mibanco.transaccionloterenovacioncdt.us.ConsultarRenovacionesPorLoteYEstadoInput;
import com.mibanco.transaccionloterenovacioncdt.us.GuardarRenovacionesCDTInput;
import com.mibanco.transaccionloterenovacioncdt.us.RenovacionCDTType;
import com.mibanco.transaccionloterenovacioncdt.us.TransaccionLoteRenovacionGrpc;
import com.mibanco.transaccionloterenovacioncdt.us.util.TransaccionLoteRenovacionCdtMapperGrpc;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.Mock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@QuarkusTest
public class TransaccionLoteRenovacionCdtControllerGrcpTest {

    @GrpcClient
    TransaccionLoteRenovacionGrpc client;

    @Inject
    ObjectMapper objectMapper;

    @Mock
    private ObjectMapper mockObjectMapper;

    @Inject
    TransaccionLoteRenovacionCdtMapperGrpc transaccionLoteRenovacionCdtMapperGrpc;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    public GuardarRenovacionesCDTInput getRenovacionGrpc() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/us-TransaccionLoteRenovacion-api.json")), StandardCharsets.UTF_8);
        com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType clienteType = objectMapper.readValue(jsonString, com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType.class);

        return transaccionLoteRenovacionCdtMapperGrpc.renovacionToGrpc(clienteType);
    }

    @Test
    public void testGuardarRenovacionGrpc() throws IOException, ExecutionException, InterruptedException, TimeoutException {

        GuardarRenovacionesCDTInput renovacionGrpc = this.getRenovacionGrpc();

        CompletableFuture<RenovacionCDTType> message = new CompletableFuture<>();

        client.guardarRenovacionesCDT(renovacionGrpc)
                .subscribe()
                .with(reply -> message.complete(reply.getRpt()));


        Assertions.assertThat(message.get(5, TimeUnit.SECONDS)).isEqualTo(renovacionGrpc);

    }

    @Test
    public void testConsultaRenovacion() throws IOException, ExecutionException, InterruptedException, TimeoutException {

        ConsultarRenovacionesPorLoteYEstadoInput renovacionGrpc = ConsultarRenovacionesPorLoteYEstadoInput.newBuilder().setEstadoRenovacion("1").setCodigoLote("1").build();
        CompletableFuture<List<RenovacionCDTType>> message = new CompletableFuture<>();

        client.consultarRenovacionesPorLoteYEstado(renovacionGrpc)
                .subscribe()
                .with(reply -> message.complete(reply.getRptList()));

        Assertions.assertThat(message.get(5, TimeUnit.SECONDS)).asList();

    }
}
