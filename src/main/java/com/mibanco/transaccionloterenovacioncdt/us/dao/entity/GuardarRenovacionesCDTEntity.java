package com.mibanco.transaccionloterenovacioncdt.us.dao.entity;

import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.IParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuardarRenovacionesCDTEntity implements IParam {
    private List<RenovacionCDTEntity> lista;
    private Integer cantidadCDTs;
}
