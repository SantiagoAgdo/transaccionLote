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



@JsonTypeName("ConsultarRenovacionesPorLoteYEstadoOutput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-01T16:58:05.662005-05:00[America/Bogota]")
public class ConsultarRenovacionesPorLoteYEstadoOutput   {
  private @Valid List<RenovacionCDTType> lista;

  /**
   **/
  public ConsultarRenovacionesPorLoteYEstadoOutput lista(List<RenovacionCDTType> lista) {
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

  public ConsultarRenovacionesPorLoteYEstadoOutput addListaItem(RenovacionCDTType listaItem) {
    if (this.lista == null) {
      this.lista = new ArrayList<>();
    }

    this.lista.add(listaItem);
    return this;
  }

  public ConsultarRenovacionesPorLoteYEstadoOutput removeListaItem(RenovacionCDTType listaItem) {
    if (listaItem != null && this.lista != null) {
      this.lista.remove(listaItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarRenovacionesPorLoteYEstadoOutput consultarRenovacionesPorLoteYEstadoOutput = (ConsultarRenovacionesPorLoteYEstadoOutput) o;
    return Objects.equals(this.lista, consultarRenovacionesPorLoteYEstadoOutput.lista);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lista);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarRenovacionesPorLoteYEstadoOutput {\n");
    
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
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

