package com.mibanco.transaccionloterenovacioncdt.us.gen.type;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.EstadoRenovacionEnum;
import com.mibanco.transaccionloterenovacioncdt.us.gen.type.TipoProcesoEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TransaccionLoteRenovacionCDT_Type")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-01T16:58:05.662005-05:00[America/Bogota]")
public class TransaccionLoteRenovacionCDTType   {
  private @Valid Integer numCertificadoCancelar;
  private @Valid Integer numCertificadoNuevo;
  private @Valid Integer numeroCliente;
  private @Valid String codigoLote;
  private @Valid EstadoRenovacionEnum estadoRenovacion;
  private @Valid TipoProcesoEnum tipoProceso;

  /**
   **/
  public TransaccionLoteRenovacionCDTType numCertificadoCancelar(Integer numCertificadoCancelar) {
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
  public TransaccionLoteRenovacionCDTType numCertificadoNuevo(Integer numCertificadoNuevo) {
    this.numCertificadoNuevo = numCertificadoNuevo;
    return this;
  }

  
  @JsonProperty("numCertificadoNuevo")
  public Integer getNumCertificadoNuevo() {
    return numCertificadoNuevo;
  }

  @JsonProperty("numCertificadoNuevo")
  public void setNumCertificadoNuevo(Integer numCertificadoNuevo) {
    this.numCertificadoNuevo = numCertificadoNuevo;
  }

  /**
   **/
  public TransaccionLoteRenovacionCDTType numeroCliente(Integer numeroCliente) {
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
  public TransaccionLoteRenovacionCDTType codigoLote(String codigoLote) {
    this.codigoLote = codigoLote;
    return this;
  }

  
  @JsonProperty("codigoLote")
  public String getCodigoLote() {
    return codigoLote;
  }

  @JsonProperty("codigoLote")
  public void setCodigoLote(String codigoLote) {
    this.codigoLote = codigoLote;
  }

  /**
   **/
  public TransaccionLoteRenovacionCDTType estadoRenovacion(EstadoRenovacionEnum estadoRenovacion) {
    this.estadoRenovacion = estadoRenovacion;
    return this;
  }

  
  @JsonProperty("estadoRenovacion")
  public EstadoRenovacionEnum getEstadoRenovacion() {
    return estadoRenovacion;
  }

  @JsonProperty("estadoRenovacion")
  public void setEstadoRenovacion(EstadoRenovacionEnum estadoRenovacion) {
    this.estadoRenovacion = estadoRenovacion;
  }

  /**
   **/
  public TransaccionLoteRenovacionCDTType tipoProceso(TipoProcesoEnum tipoProceso) {
    this.tipoProceso = tipoProceso;
    return this;
  }

  
  @JsonProperty("tipoProceso")
  public TipoProcesoEnum getTipoProceso() {
    return tipoProceso;
  }

  @JsonProperty("tipoProceso")
  public void setTipoProceso(TipoProcesoEnum tipoProceso) {
    this.tipoProceso = tipoProceso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransaccionLoteRenovacionCDTType transaccionLoteRenovacionCDTType = (TransaccionLoteRenovacionCDTType) o;
    return Objects.equals(this.numCertificadoCancelar, transaccionLoteRenovacionCDTType.numCertificadoCancelar) &&
        Objects.equals(this.numCertificadoNuevo, transaccionLoteRenovacionCDTType.numCertificadoNuevo) &&
        Objects.equals(this.numeroCliente, transaccionLoteRenovacionCDTType.numeroCliente) &&
        Objects.equals(this.codigoLote, transaccionLoteRenovacionCDTType.codigoLote) &&
        Objects.equals(this.estadoRenovacion, transaccionLoteRenovacionCDTType.estadoRenovacion) &&
        Objects.equals(this.tipoProceso, transaccionLoteRenovacionCDTType.tipoProceso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numCertificadoCancelar, numCertificadoNuevo, numeroCliente, codigoLote, estadoRenovacion, tipoProceso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransaccionLoteRenovacionCDTType {\n");
    
    sb.append("    numCertificadoCancelar: ").append(toIndentedString(numCertificadoCancelar)).append("\n");
    sb.append("    numCertificadoNuevo: ").append(toIndentedString(numCertificadoNuevo)).append("\n");
    sb.append("    numeroCliente: ").append(toIndentedString(numeroCliente)).append("\n");
    sb.append("    codigoLote: ").append(toIndentedString(codigoLote)).append("\n");
    sb.append("    estadoRenovacion: ").append(toIndentedString(estadoRenovacion)).append("\n");
    sb.append("    tipoProceso: ").append(toIndentedString(tipoProceso)).append("\n");
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

