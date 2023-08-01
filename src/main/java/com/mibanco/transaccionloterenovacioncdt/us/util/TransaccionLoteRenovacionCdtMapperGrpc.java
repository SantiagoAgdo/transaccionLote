package com.mibanco.transaccionloterenovacioncdt.us.util;

import com.mibanco.transaccionloterenovacioncdt.us.GuardarRenovacionesCDTInput;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.RenovacionCDTEntity;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class TransaccionLoteRenovacionCdtMapperGrpc {

    public GuardarRenovacionesCDTEntity renovacionGrpcToEntity(GuardarRenovacionesCDTInput grpc) {
        return new ModelMapper().map(grpc, GuardarRenovacionesCDTEntity.class);
    }

}
