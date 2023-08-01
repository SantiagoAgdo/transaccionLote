package com.mibanco.transaccionloterenovacioncdt.us.dao.entity;

import com.mibanco.transaccionloterenovacioncdt.us.gen.type.*;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;

@Data
@MongoEntity(collection = "renovacion_cdt")
public class RenovacionCDTEntity {

    private  Integer numCertificadoCancelar;
    private  Integer numeroCliente;
    private  NumeroProductoCDTEnum numeroProductoCDT;
    private  TipoRenovacionEnum tipoRenovacion;
    private  Integer plazoDias;
    private  String plazo;
    private  Integer fechaVencimientoDia;
    private  Integer fechaVencimientoMes;
    private  Integer fechaVencimientoAno;
    private  String codigoBanco;
    private  Integer codigoSucursal;
    private  String condicionManejo;
    private  String compensacion;
    private  String tipoProrroga;
    private  String cuentaDePago;
    private  Integer numeroCuentaContable;
    private  Integer concepto;
    private  String cuentaConcepto;
    private  String monedaPago;
    private  Integer montoCapital;
    private  String tipoPersona;
    private  String numeroDocumento;
    private  String nombreCliente;
    private  TipoTransaccionEnum tipoTransaccion;
    private  CodigoBancoEnum codigoBancoDestino;
    private  Integer numeroCuentaBancaria;
    private  String referencia;
    private  TransaccionLoteRenovacionCDTType transaccionRenovacion;
}
