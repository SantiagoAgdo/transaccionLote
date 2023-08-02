package com.mibanco.transaccionloterenovacioncdt.us.util;

import com.google.gson.Gson;
import com.google.protobuf.MessageOrBuilder;
import com.mibanco.transaccionloterenovacioncdt.us.GuardarRenovacionesCDTInput;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;
import com.google.protobuf.util.JsonFormat;

import java.io.IOException;

@ApplicationScoped
public class TransaccionLoteRenovacionCdtMapperGrpc {

    private Gson obj = new Gson();

    public String toJson(MessageOrBuilder messageOrBuilder) throws IOException {
        return JsonFormat.printer().print(messageOrBuilder);
    }

    public GuardarRenovacionesCDTEntity renovacionGrpcToEntity(GuardarRenovacionesCDTInput grpc) {
        return new ModelMapper().map(grpc, GuardarRenovacionesCDTEntity.class);
    }

    public GuardarRenovacionesCDTInput renovacionToGrpc(com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType clienteCDTDigitalType) throws IOException {
        GuardarRenovacionesCDTInput.Builder structBuilder = GuardarRenovacionesCDTInput.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(this.obj.toJson(clienteCDTDigitalType), structBuilder);
        return structBuilder.build();
    }

}
