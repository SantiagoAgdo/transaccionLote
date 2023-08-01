package com.mibanco.transaccionloterenovacioncdt.us.gen.type;

import com.mibanco.transaccionloterenovacioncdt.us.gen.type.RenovacionCDTType;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("GuardarRenovacionesCDT")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-01T16:58:05.662005-05:00[America/Bogota]")
public class GuardarRenovacionesCDT   {
  private @Valid List<RenovacionCDTType> lista;
  private @Valid Integer cantidadCDTs;

  /**
   **/
  public GuardarRenovacionesCDT lista(List<RenovacionCDTType> lista) {
    this.lista = lista;
    return this;
  }

  
  @JsonProperty("lista")
  public List<RenovacionCDTType> getLista() {
    return lista;
  }

  @JsonProperty("lista")
  public void setLista(List<RenovacionCDTType> lista) {
    this.lista = lista;
  }

  public GuardarRenovacionesCDT addListaItem(RenovacionCDTType listaItem) {
    if (this.lista == null) {
      this.lista = new ArrayList<>();
    }

    this.lista.add(listaItem);
    return this;
  }

  public GuardarRenovacionesCDT removeListaItem(RenovacionCDTType listaItem) {
    if (listaItem != null && this.lista != null) {
      this.lista.remove(listaItem);
    }

    return this;
  }
  /**
   **/
  public GuardarRenovacionesCDT cantidadCDTs(Integer cantidadCDTs) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuardarRenovacionesCDT guardarRenovacionesCDT = (GuardarRenovacionesCDT) o;
    return Objects.equals(this.lista, guardarRenovacionesCDT.lista) &&
        Objects.equals(this.cantidadCDTs, guardarRenovacionesCDT.cantidadCDTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lista, cantidadCDTs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuardarRenovacionesCDT {\n");
    
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
    sb.append("    cantidadCDTs: ").append(toIndentedString(cantidadCDTs)).append("\n");
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

