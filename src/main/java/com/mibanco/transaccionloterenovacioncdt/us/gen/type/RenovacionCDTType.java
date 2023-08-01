package com.mibanco.transaccionloterenovacioncdt.us.gen.type;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.CodigoBancoEnum;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.NumeroProductoCDTEnum;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.TipoRenovacionEnum;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.TipoTransaccionEnum;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.TransaccionLoteRenovacionCDTType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RenovacionCDT_Type")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-01T16:58:05.662005-05:00[America/Bogota]")
public class RenovacionCDTType   {
  private @Valid Integer numCertificadoCancelar;
  private @Valid Integer numeroCliente;
  private @Valid NumeroProductoCDTEnum numeroProductoCDT;
  private @Valid TipoRenovacionEnum tipoRenovacion;
  private @Valid Integer plazoDias;
  private @Valid String plazo;
  private @Valid Integer fechaVencimientoDia;
  private @Valid Integer fechaVencimientoMes;
  private @Valid Integer fechaVencimientoAno;
  private @Valid String codigoBanco;
  private @Valid Integer codigoSucursal;
  private @Valid String condicionManejo;
  private @Valid String compensacion;
  private @Valid String tipoProrroga;
  private @Valid String cuentaDePago;
  private @Valid Integer numeroCuentaContable;
  private @Valid Integer concepto;
  private @Valid String cuentaConcepto;
  private @Valid String monedaPago;
  private @Valid Integer montoCapital;
  private @Valid String tipoPersona;
  private @Valid String numeroDocumento;
  private @Valid String nombreCliente;
  private @Valid TipoTransaccionEnum tipoTransaccion;
  private @Valid CodigoBancoEnum codigoBancoDestino;
  private @Valid Integer numeroCuentaBancaria;
  private @Valid String referencia;
  private @Valid TransaccionLoteRenovacionCDTType transaccionRenovacion;

  /**
   **/
  public RenovacionCDTType numCertificadoCancelar(Integer numCertificadoCancelar) {
    this.numCertificadoCancelar = numCertificadoCancelar;
    return this;
  }

  
  @JsonProperty("numCertificadoCancelar")
  public Integer getNumCertificadoCancelar() {
    return numCertificadoCancelar;
  }

  @JsonProperty("numCertificadoCancelar")
  public void setNumCertificadoCancelar(Integer numCertificadoCancelar) {
    this.numCertificadoCancelar = numCertificadoCancelar;
  }

  /**
   **/
  public RenovacionCDTType numeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
    return this;
  }

  
  @JsonProperty("numeroCliente")
  public Integer getNumeroCliente() {
    return numeroCliente;
  }

  @JsonProperty("numeroCliente")
  public void setNumeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
  }

  /**
   **/
  public RenovacionCDTType numeroProductoCDT(NumeroProductoCDTEnum numeroProductoCDT) {
    this.numeroProductoCDT = numeroProductoCDT;
    return this;
  }

  
  @JsonProperty("numeroProductoCDT")
  public NumeroProductoCDTEnum getNumeroProductoCDT() {
    return numeroProductoCDT;
  }

  @JsonProperty("numeroProductoCDT")
  public void setNumeroProductoCDT(NumeroProductoCDTEnum numeroProductoCDT) {
    this.numeroProductoCDT = numeroProductoCDT;
  }

  /**
   **/
  public RenovacionCDTType tipoRenovacion(TipoRenovacionEnum tipoRenovacion) {
    this.tipoRenovacion = tipoRenovacion;
    return this;
  }

  
  @JsonProperty("tipoRenovacion")
  public TipoRenovacionEnum getTipoRenovacion() {
    return tipoRenovacion;
  }

  @JsonProperty("tipoRenovacion")
  public void setTipoRenovacion(TipoRenovacionEnum tipoRenovacion) {
    this.tipoRenovacion = tipoRenovacion;
  }

  /**
   **/
  public RenovacionCDTType plazoDias(Integer plazoDias) {
    this.plazoDias = plazoDias;
    return this;
  }

  
  @JsonProperty("plazoDias")
  public Integer getPlazoDias() {
    return plazoDias;
  }

  @JsonProperty("plazoDias")
  public void setPlazoDias(Integer plazoDias) {
    this.plazoDias = plazoDias;
  }

  /**
   **/
  public RenovacionCDTType plazo(String plazo) {
    this.plazo = plazo;
    return this;
  }

  
  @JsonProperty("plazo")
  public String getPlazo() {
    return plazo;
  }

  @JsonProperty("plazo")
  public void setPlazo(String plazo) {
    this.plazo = plazo;
  }

  /**
   **/
  public RenovacionCDTType fechaVencimientoDia(Integer fechaVencimientoDia) {
    this.fechaVencimientoDia = fechaVencimientoDia;
    return this;
  }

  
  @JsonProperty("fechaVencimientoDia")
  public Integer getFechaVencimientoDia() {
    return fechaVencimientoDia;
  }

  @JsonProperty("fechaVencimientoDia")
  public void setFechaVencimientoDia(Integer fechaVencimientoDia) {
    this.fechaVencimientoDia = fechaVencimientoDia;
  }

  /**
   **/
  public RenovacionCDTType fechaVencimientoMes(Integer fechaVencimientoMes) {
    this.fechaVencimientoMes = fechaVencimientoMes;
    return this;
  }

  
  @JsonProperty("fechaVencimientoMes")
  public Integer getFechaVencimientoMes() {
    return fechaVencimientoMes;
  }

  @JsonProperty("fechaVencimientoMes")
  public void setFechaVencimientoMes(Integer fechaVencimientoMes) {
    this.fechaVencimientoMes = fechaVencimientoMes;
  }

  /**
   **/
  public RenovacionCDTType fechaVencimientoAno(Integer fechaVencimientoAno) {
    this.fechaVencimientoAno = fechaVencimientoAno;
    return this;
  }

  
  @JsonProperty("fechaVencimientoAno")
  public Integer getFechaVencimientoAno() {
    return fechaVencimientoAno;
  }

  @JsonProperty("fechaVencimientoAno")
  public void setFechaVencimientoAno(Integer fechaVencimientoAno) {
    this.fechaVencimientoAno = fechaVencimientoAno;
  }

  /**
   **/
  public RenovacionCDTType codigoBanco(String codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }

  
  @JsonProperty("codigoBanco")
  public String getCodigoBanco() {
    return codigoBanco;
  }

  @JsonProperty("codigoBanco")
  public void setCodigoBanco(String codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  /**
   **/
  public RenovacionCDTType codigoSucursal(Integer codigoSucursal) {
    this.codigoSucursal = codigoSucursal;
    return this;
  }

  
  @JsonProperty("codigoSucursal")
  public Integer getCodigoSucursal() {
    return codigoSucursal;
  }

  @JsonProperty("codigoSucursal")
  public void setCodigoSucursal(Integer codigoSucursal) {
    this.codigoSucursal = codigoSucursal;
  }

  /**
   **/
  public RenovacionCDTType condicionManejo(String condicionManejo) {
    this.condicionManejo = condicionManejo;
    return this;
  }

  
  @JsonProperty("condicionManejo")
  public String getCondicionManejo() {
    return condicionManejo;
  }

  @JsonProperty("condicionManejo")
  public void setCondicionManejo(String condicionManejo) {
    this.condicionManejo = condicionManejo;
  }

  /**
   **/
  public RenovacionCDTType compensacion(String compensacion) {
    this.compensacion = compensacion;
    return this;
  }

  
  @JsonProperty("compensacion")
  public String getCompensacion() {
    return compensacion;
  }

  @JsonProperty("compensacion")
  public void setCompensacion(String compensacion) {
    this.compensacion = compensacion;
  }

  /**
   **/
  public RenovacionCDTType tipoProrroga(String tipoProrroga) {
    this.tipoProrroga = tipoProrroga;
    return this;
  }

  
  @JsonProperty("tipoProrroga")
  public String getTipoProrroga() {
    return tipoProrroga;
  }

  @JsonProperty("tipoProrroga")
  public void setTipoProrroga(String tipoProrroga) {
    this.tipoProrroga = tipoProrroga;
  }

  /**
   **/
  public RenovacionCDTType cuentaDePago(String cuentaDePago) {
    this.cuentaDePago = cuentaDePago;
    return this;
  }

  
  @JsonProperty("cuentaDePago")
  public String getCuentaDePago() {
    return cuentaDePago;
  }

  @JsonProperty("cuentaDePago")
  public void setCuentaDePago(String cuentaDePago) {
    this.cuentaDePago = cuentaDePago;
  }

  /**
   **/
  public RenovacionCDTType numeroCuentaContable(Integer numeroCuentaContable) {
    this.numeroCuentaContable = numeroCuentaContable;
    return this;
  }

  
  @JsonProperty("numeroCuentaContable")
  public Integer getNumeroCuentaContable() {
    return numeroCuentaContable;
  }

  @JsonProperty("numeroCuentaContable")
  public void setNumeroCuentaContable(Integer numeroCuentaContable) {
    this.numeroCuentaContable = numeroCuentaContable;
  }

  /**
   **/
  public RenovacionCDTType concepto(Integer concepto) {
    this.concepto = concepto;
    return this;
  }

  
  @JsonProperty("concepto")
  public Integer getConcepto() {
    return concepto;
  }

  @JsonProperty("concepto")
  public void setConcepto(Integer concepto) {
    this.concepto = concepto;
  }

  /**
   **/
  public RenovacionCDTType cuentaConcepto(String cuentaConcepto) {
    this.cuentaConcepto = cuentaConcepto;
    return this;
  }

  
  @JsonProperty("cuentaConcepto")
  public String getCuentaConcepto() {
    return cuentaConcepto;
  }

  @JsonProperty("cuentaConcepto")
  public void setCuentaConcepto(String cuentaConcepto) {
    this.cuentaConcepto = cuentaConcepto;
  }

  /**
   **/
  public RenovacionCDTType monedaPago(String monedaPago) {
    this.monedaPago = monedaPago;
    return this;
  }

  
  @JsonProperty("monedaPago")
  public String getMonedaPago() {
    return monedaPago;
  }

  @JsonProperty("monedaPago")
  public void setMonedaPago(String monedaPago) {
    this.monedaPago = monedaPago;
  }

  /**
   **/
  public RenovacionCDTType montoCapital(Integer montoCapital) {
    this.montoCapital = montoCapital;
    return this;
  }

  
  @JsonProperty("montoCapital")
  public Integer getMontoCapital() {
    return montoCapital;
  }

  @JsonProperty("montoCapital")
  public void setMontoCapital(Integer montoCapital) {
    this.montoCapital = montoCapital;
  }

  /**
   **/
  public RenovacionCDTType tipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
    return this;
  }

  
  @JsonProperty("tipoPersona")
  public String getTipoPersona() {
    return tipoPersona;
  }

  @JsonProperty("tipoPersona")
  public void setTipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
  }

  /**
   **/
  public RenovacionCDTType numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

  
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  @JsonProperty("numeroDocumento")
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   **/
  public RenovacionCDTType nombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
    return this;
  }

  
  @JsonProperty("nombreCliente")
  public String getNombreCliente() {
    return nombreCliente;
  }

  @JsonProperty("nombreCliente")
  public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
  }

  /**
   **/
  public RenovacionCDTType tipoTransaccion(TipoTransaccionEnum tipoTransaccion) {
    this.tipoTransaccion = tipoTransaccion;
    return this;
  }

  
  @JsonProperty("tipoTransaccion")
  public TipoTransaccionEnum getTipoTransaccion() {
    return tipoTransaccion;
  }

  @JsonProperty("tipoTransaccion")
  public void setTipoTransaccion(TipoTransaccionEnum tipoTransaccion) {
    this.tipoTransaccion = tipoTransaccion;
  }

  /**
   **/
  public RenovacionCDTType codigoBancoDestino(CodigoBancoEnum codigoBancoDestino) {
    this.codigoBancoDestino = codigoBancoDestino;
    return this;
  }

  
  @JsonProperty("codigoBancoDestino")
  public CodigoBancoEnum getCodigoBancoDestino() {
    return codigoBancoDestino;
  }

  @JsonProperty("codigoBancoDestino")
  public void setCodigoBancoDestino(CodigoBancoEnum codigoBancoDestino) {
    this.codigoBancoDestino = codigoBancoDestino;
  }

  /**
   **/
  public RenovacionCDTType numeroCuentaBancaria(Integer numeroCuentaBancaria) {
    this.numeroCuentaBancaria = numeroCuentaBancaria;
    return this;
  }

  
  @JsonProperty("numeroCuentaBancaria")
  public Integer getNumeroCuentaBancaria() {
    return numeroCuentaBancaria;
  }

  @JsonProperty("numeroCuentaBancaria")
  public void setNumeroCuentaBancaria(Integer numeroCuentaBancaria) {
    this.numeroCuentaBancaria = numeroCuentaBancaria;
  }

  /**
   **/
  public RenovacionCDTType referencia(String referencia) {
    this.referencia = referencia;
    return this;
  }

  
  @JsonProperty("referencia")
  public String getReferencia() {
    return referencia;
  }

  @JsonProperty("referencia")
  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  /**
   **/
  public RenovacionCDTType transaccionRenovacion(TransaccionLoteRenovacionCDTType transaccionRenovacion) {
    this.transaccionRenovacion = transaccionRenovacion;
    return this;
  }

  
  @JsonProperty("transaccionRenovacion")
  public TransaccionLoteRenovacionCDTType getTransaccionRenovacion() {
    return transaccionRenovacion;
  }

  @JsonProperty("transaccionRenovacion")
  public void setTransaccionRenovacion(TransaccionLoteRenovacionCDTType transaccionRenovacion) {
    this.transaccionRenovacion = transaccionRenovacion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenovacionCDTType renovacionCDTType = (RenovacionCDTType) o;
    return Objects.equals(this.numCertificadoCancelar, renovacionCDTType.numCertificadoCancelar) &&
        Objects.equals(this.numeroCliente, renovacionCDTType.numeroCliente) &&
        Objects.equals(this.numeroProductoCDT, renovacionCDTType.numeroProductoCDT) &&
        Objects.equals(this.tipoRenovacion, renovacionCDTType.tipoRenovacion) &&
        Objects.equals(this.plazoDias, renovacionCDTType.plazoDias) &&
        Objects.equals(this.plazo, renovacionCDTType.plazo) &&
        Objects.equals(this.fechaVencimientoDia, renovacionCDTType.fechaVencimientoDia) &&
        Objects.equals(this.fechaVencimientoMes, renovacionCDTType.fechaVencimientoMes) &&
        Objects.equals(this.fechaVencimientoAno, renovacionCDTType.fechaVencimientoAno) &&
        Objects.equals(this.codigoBanco, renovacionCDTType.codigoBanco) &&
        Objects.equals(this.codigoSucursal, renovacionCDTType.codigoSucursal) &&
        Objects.equals(this.condicionManejo, renovacionCDTType.condicionManejo) &&
        Objects.equals(this.compensacion, renovacionCDTType.compensacion) &&
        Objects.equals(this.tipoProrroga, renovacionCDTType.tipoProrroga) &&
        Objects.equals(this.cuentaDePago, renovacionCDTType.cuentaDePago) &&
        Objects.equals(this.numeroCuentaContable, renovacionCDTType.numeroCuentaContable) &&
        Objects.equals(this.concepto, renovacionCDTType.concepto) &&
        Objects.equals(this.cuentaConcepto, renovacionCDTType.cuentaConcepto) &&
        Objects.equals(this.monedaPago, renovacionCDTType.monedaPago) &&
        Objects.equals(this.montoCapital, renovacionCDTType.montoCapital) &&
        Objects.equals(this.tipoPersona, renovacionCDTType.tipoPersona) &&
        Objects.equals(this.numeroDocumento, renovacionCDTType.numeroDocumento) &&
        Objects.equals(this.nombreCliente, renovacionCDTType.nombreCliente) &&
        Objects.equals(this.tipoTransaccion, renovacionCDTType.tipoTransaccion) &&
        Objects.equals(this.codigoBancoDestino, renovacionCDTType.codigoBancoDestino) &&
        Objects.equals(this.numeroCuentaBancaria, renovacionCDTType.numeroCuentaBancaria) &&
        Objects.equals(this.referencia, renovacionCDTType.referencia) &&
        Objects.equals(this.transaccionRenovacion, renovacionCDTType.transaccionRenovacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numCertificadoCancelar, numeroCliente, numeroProductoCDT, tipoRenovacion, plazoDias, plazo, fechaVencimientoDia, fechaVencimientoMes, fechaVencimientoAno, codigoBanco, codigoSucursal, condicionManejo, compensacion, tipoProrroga, cuentaDePago, numeroCuentaContable, concepto, cuentaConcepto, monedaPago, montoCapital, tipoPersona, numeroDocumento, nombreCliente, tipoTransaccion, codigoBancoDestino, numeroCuentaBancaria, referencia, transaccionRenovacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenovacionCDTType {\n");
    
    sb.append("    numCertificadoCancelar: ").append(toIndentedString(numCertificadoCancelar)).append("\n");
    sb.append("    numeroCliente: ").append(toIndentedString(numeroCliente)).append("\n");
    sb.append("    numeroProductoCDT: ").append(toIndentedString(numeroProductoCDT)).append("\n");
    sb.append("    tipoRenovacion: ").append(toIndentedString(tipoRenovacion)).append("\n");
    sb.append("    plazoDias: ").append(toIndentedString(plazoDias)).append("\n");
    sb.append("    plazo: ").append(toIndentedString(plazo)).append("\n");
    sb.append("    fechaVencimientoDia: ").append(toIndentedString(fechaVencimientoDia)).append("\n");
    sb.append("    fechaVencimientoMes: ").append(toIndentedString(fechaVencimientoMes)).append("\n");
    sb.append("    fechaVencimientoAno: ").append(toIndentedString(fechaVencimientoAno)).append("\n");
    sb.append("    codigoBanco: ").append(toIndentedString(codigoBanco)).append("\n");
    sb.append("    codigoSucursal: ").append(toIndentedString(codigoSucursal)).append("\n");
    sb.append("    condicionManejo: ").append(toIndentedString(condicionManejo)).append("\n");
    sb.append("    compensacion: ").append(toIndentedString(compensacion)).append("\n");
    sb.append("    tipoProrroga: ").append(toIndentedString(tipoProrroga)).append("\n");
    sb.append("    cuentaDePago: ").append(toIndentedString(cuentaDePago)).append("\n");
    sb.append("    numeroCuentaContable: ").append(toIndentedString(numeroCuentaContable)).append("\n");
    sb.append("    concepto: ").append(toIndentedString(concepto)).append("\n");
    sb.append("    cuentaConcepto: ").append(toIndentedString(cuentaConcepto)).append("\n");
    sb.append("    monedaPago: ").append(toIndentedString(monedaPago)).append("\n");
    sb.append("    montoCapital: ").append(toIndentedString(montoCapital)).append("\n");
    sb.append("    tipoPersona: ").append(toIndentedString(tipoPersona)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    nombreCliente: ").append(toIndentedString(nombreCliente)).append("\n");
    sb.append("    tipoTransaccion: ").append(toIndentedString(tipoTransaccion)).append("\n");
    sb.append("    codigoBancoDestino: ").append(toIndentedString(codigoBancoDestino)).append("\n");
    sb.append("    numeroCuentaBancaria: ").append(toIndentedString(numeroCuentaBancaria)).append("\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
    sb.append("    transaccionRenovacion: ").append(toIndentedString(transaccionRenovacion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

