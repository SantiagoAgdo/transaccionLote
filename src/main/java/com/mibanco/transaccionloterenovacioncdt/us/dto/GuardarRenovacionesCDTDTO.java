package com.mibanco.transaccionloterenovacioncdt.us.dto;

import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.RenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.IParam;
import lombok.Data;
@Data
public class GuardarRenovacionesCDTDTO implements IParam {
    private RenovacionCDTType cdt;
    private String codigoLote;
}
