package com.mibanco.transaccionloterenovacioncdt.us.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.GuardarRenovacionesCDT;
import io.quarkus.test.Mock;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@QuarkusTest
public class TransaccionLoteRenovacionCdtControllerTest {

    @Inject
    ObjectMapper objectMapper;

    @Mock
    private ObjectMapper mockObjectMapper;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void guardarRenovacionesCDT() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new GuardarRenovacionesCDT());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/us-TransaccionLoteRenovacion-api.json")), StandardCharsets.UTF_8);
        GuardarRenovacionesCDT clienteType = objectMapper.readValue(jsonString, GuardarRenovacionesCDT.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("/v1/us/renovacionCDT")
                .then()
                .statusCode(201);
    }

    @Test
    void consultarRenovacionesPorLoteYEstado() throws IOException {
        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new GuardarRenovacionesCDT());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/us-TransaccionLoteRenovacion-api.json")), StandardCharsets.UTF_8);
        GuardarRenovacionesCDT clienteType = objectMapper.readValue(jsonString, GuardarRenovacionesCDT.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("/v1/us/renovacionCDT/{codigoLote}/{estado}")
                .then()
                .statusCode(204);
    }
}
