package com.mibanco.transaccionloterenovacioncdt.us.dao.contract;

import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.LoteRenovacionCDTEntity;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

public interface ITransacicionLoteRenovacionCDT extends PanacheMongoRepository<LoteRenovacionCDTEntity> {
}
