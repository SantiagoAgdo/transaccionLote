package com.mibanco.transaccionloterenovacioncdt.us.dao.entity;

import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;

import java.util.Date;

@Data
@MongoEntity(collection = "DataNuevoLote")
public class SaveDataLoteRenovacionCDTEntity {

    private String codigoLote;
    private Date fechaCreacion;
    private RenovacionCDTType renovacionCDTType;
}
