package com.mibanco.transaccionloterenovacioncdt.us.gen.type;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("LoteRenovacionCDT_Type")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-01T16:58:05.662005-05:00[America/Bogota]")
public class LoteRenovacionCDTType   {
  private @Valid String codigoLote;
  private @Valid Date fechaCreacion;
  private @Valid Integer cantidadCDTs;
  private @Valid Integer cdtsRenovacionNoExitoso;
  private @Valid Integer cdtsRenovados;
  private @Valid Integer totalCDTsProcesados;

  /**
   **/
  public LoteRenovacionCDTType codigoLote(String codigoLote) {
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
  public LoteRenovacionCDTType fechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    return this;
  }

  
  @JsonProperty("fechaCreacion")
  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  @JsonProperty("fechaCreacion")
  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  /**
   **/
  public LoteRenovacionCDTType cantidadCDTs(Integer cantidadCDTs) {
    this.cantidadCDTs = cantidadCDTs;
    return this;
  }

  
  @JsonProperty("cantidadCDTs")
  public Integer getCantidadCDTs() {
    return cantidadCDTs;
  }

  @JsonProperty("cantidadCDTs")
  public void setCantidadCDTs(Integer cantidadCDTs) {
    this.cantidadCDTs = cantidadCDTs;
  }

  /**
   **/
  public LoteRenovacionCDTType cdtsRenovacionNoExitoso(Integer cdtsRenovacionNoExitoso) {
    this.cdtsRenovacionNoExitoso = cdtsRenovacionNoExitoso;
    return this;
  }

  
  @JsonProperty("cdtsRenovacionNoExitoso")
  public Integer getCdtsRenovacionNoExitoso() {
    return cdtsRenovacionNoExitoso;
  }

  @JsonProperty("cdtsRenovacionNoExitoso")
  public void setCdtsRenovacionNoExitoso(Integer cdtsRenovacionNoExitoso) {
    this.cdtsRenovacionNoExitoso = cdtsRenovacionNoExitoso;
  }

  /**
   **/
  public LoteRenovacionCDTType cdtsRenovados(Integer cdtsRenovados) {
    this.cdtsRenovados = cdtsRenovados;
    return this;
  }

  
  @JsonProperty("cdtsRenovados")
  public Integer getCdtsRenovados() {
    return cdtsRenovados;
  }

  @JsonProperty("cdtsRenovados")
  public void setCdtsRenovados(Integer cdtsRenovados) {
    this.cdtsRenovados = cdtsRenovados;
  }

  /**
   **/
  public LoteRenovacionCDTType totalCDTsProcesados(Integer totalCDTsProcesados) {
    this.totalCDTsProcesados = totalCDTsProcesados;
    return this;
  }

  
  @JsonProperty("totalCDTsProcesados")
  public Integer getTotalCDTsProcesados() {
    return totalCDTsProcesados;
  }

  @JsonProperty("totalCDTsProcesados")
  public void setTotalCDTsProcesados(Integer totalCDTsProcesados) {
    this.totalCDTsProcesados = totalCDTsProcesados;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoteRenovacionCDTType loteRenovacionCDTType = (LoteRenovacionCDTType) o;
    return Objects.equals(this.codigoLote, loteRenovacionCDTType.codigoLote) &&
        Objects.equals(this.fechaCreacion, loteRenovacionCDTType.fechaCreacion) &&
        Objects.equals(this.cantidadCDTs, loteRenovacionCDTType.cantidadCDTs) &&
        Objects.equals(this.cdtsRenovacionNoExitoso, loteRenovacionCDTType.cdtsRenovacionNoExitoso) &&
        Objects.equals(this.cdtsRenovados, loteRenovacionCDTType.cdtsRenovados) &&
        Objects.equals(this.totalCDTsProcesados, loteRenovacionCDTType.totalCDTsProcesados);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoLote, fechaCreacion, cantidadCDTs, cdtsRenovacionNoExitoso, cdtsRenovados, totalCDTsProcesados);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteRenovacionCDTType {\n");
    
    sb.append("    codigoLote: ").append(toIndentedString(codigoLote)).append("\n");
    sb.append("    fechaCreacion: ").append(toIndentedString(fechaCreacion)).append("\n");
    sb.append("    cantidadCDTs: ").append(toIndentedString(cantidadCDTs)).append("\n");
    sb.append("    cdtsRenovacionNoExitoso: ").append(toIndentedString(cdtsRenovacionNoExitoso)).append("\n");
    sb.append("    cdtsRenovados: ").append(toIndentedString(cdtsRenovados)).append("\n");
    sb.append("    totalCDTsProcesados: ").append(toIndentedString(totalCDTsProcesados)).append("\n");
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

