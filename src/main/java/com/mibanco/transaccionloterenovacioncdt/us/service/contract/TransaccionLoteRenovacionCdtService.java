package com.mibanco.transaccionloterenovacioncdt.us.service.contract;

import com.mibanco.transaccionloterenovacioncdt.us.EstadoRenovacionEnum;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.GuardarRenovacionesCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.dao.entity.RenovacionCDTEntity;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;

import java.util.List;

public interface TransaccionLoteRenovacionCdtService {


    List<RenovacionCDTType> consultarRenovacionesPorLoteYEstado(String codigoLote, String estado);


    RenovacionCDTEntity guardarRenovacionesCDT(GuardarRenovacionesCDTEntity guardarRenovacionesCDT);

}
