package com.mibanco.transaccionloterenovacioncdt.us.dao.entity;

import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;

import java.util.List;

@Data
public class ConsultarRenovacionesPorLoteYEstadoEntity {
    private List<RenovacionCDTType> lista;
}
