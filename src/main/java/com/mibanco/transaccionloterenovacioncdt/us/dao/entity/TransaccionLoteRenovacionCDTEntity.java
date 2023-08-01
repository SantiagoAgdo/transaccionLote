package com.mibanco.transaccionloterenovacioncdt.us.dao.entity;

import com.mibanco.transaccionloterenovacioncdt.us.gen.type.EstadoRenovacionEnum;
import lombok.Data;

@Data
public class TransaccionLoteRenovacionCDTEntity {

    private Integer numCertificadoCancelar;
    private Integer numCertificadoNuevo;
    private Integer numeroCliente;
    private String codigoLote;
    private EstadoRenovacionEnum estadoRenovacion;
    private String tipoProceso;
}
