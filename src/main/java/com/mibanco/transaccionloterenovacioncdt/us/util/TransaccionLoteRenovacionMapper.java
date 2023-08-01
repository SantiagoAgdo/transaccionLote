package com.mibanco.transaccionloterenovacioncdt.us.util;

import avro.GuardarRenovacionesCdtAvro;
import avro.RenovacionCdtAvro;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.RenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.SaveDataLoteRenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dto.GuardarRenovacionesCDTDTO;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.GuardarRenovacionesCDT;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import jakarta.inject.Singleton;
import org.modelmapper.ModelMapper;

@Singleton
public class TransaccionLoteRenovacionMapper {

    public RenovacionCDTType renovacionEntityToRenovacionType(RenovacionCDTEntity renovacionCDTEntity) {
        return new ModelMapper().map(renovacionCDTEntity, RenovacionCDTType.class);
    }

    public RenovacionCDTEntity renovacionTypeToRenovacionEntity(RenovacionCDTType renovacionCDTType) {
        return new ModelMapper().map(renovacionCDTType, RenovacionCDTEntity.class);
    }

    public GuardarRenovacionesCDTEntity guardarRenovacionTypeToEntity(GuardarRenovacionesCDT renovacionCDTType) {
        return new ModelMapper().map(renovacionCDTType, GuardarRenovacionesCDTEntity.class);
    }

    public GuardarRenovacionesCDTDTO guardarRenovacionesCDTTypeToDTO(SaveDataLoteRenovacionCDTEntity saveDataLoteRenovacionCDTEntity) {
        return new ModelMapper().map(saveDataLoteRenovacionCDTEntity, GuardarRenovacionesCDTDTO.class);
    }

    public GuardarRenovacionesCDTEntity guardarRenovacionesCDTToEntity(GuardarRenovacionesCDTEntity guardarRenovacionesCDT) {
        return new ModelMapper().map(guardarRenovacionesCDT, GuardarRenovacionesCDTEntity.class);
    }

    public GuardarRenovacionesCdtAvro guardarRenovacionesCDTDTOToAvro(GuardarRenovacionesCDTDTO renovacionesCDTDTO) {
    return new ModelMapper().map(renovacionesCDTDTO, GuardarRenovacionesCdtAvro.class);
    }
    public RenovacionCdtAvro renovacionCDTEntityToAvro(RenovacionCDTType renovacionCDTType) {
        return new ModelMapper().map(renovacionCDTType, RenovacionCdtAvro.class);
    }

}
