package com.mibanco.transaccionloterenovacioncdt.us.dao.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;

import java.util.Date;

@Data
@MongoEntity(database = "lotes_renovacion",collection = "renovacionLote")
public class LoteRenovacionCDTEntity {
    private String codigoLote;
    private Date fechaCreacion;
    private Integer cantidadCDTs;
    private Integer cdtsRenovacionNoExitoso;
    private Integer cdtsRenovados;
    private Integer totalCDTsProcesados;
}
