package com.mibanco.transaccionloterenovacioncdt.us.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CodigoBancoEnum
 */
public enum CodigoBancoEnum {
  
  _1001("1001"),
  
  _1002("1002"),
  
  _1006("1006"),
  
  _1007("1007"),
  
  _1009("1009"),
  
  _1012("1012"),
  
  _1013("1013"),
  
  _1014("1014"),
  
  _1019("1019"),
  
  _1023("1023"),
  
  _1031("1031"),
  
  _1032("1032"),
  
  _1040("1040"),
  
  _1047("1047"),
  
  _1051("1051"),
  
  _1052("1052"),
  
  _1053("1053"),
  
  _1059("1059"),
  
  _1060("1060"),
  
  _1061("1061"),
  
  _1062("1062"),
  
  _1063("1063"),
  
  _1065("1065"),
  
  _1066("1066"),
  
  _1067("1067"),
  
  _1069("1069"),
  
  _1071("1071"),
  
  _1086("1086"),
  
  _1121("1121"),
  
  _1151("1151"),
  
  _1283("1283"),
  
  _1289("1289"),
  
  _1291("1291"),
  
  _1292("1292"),
  
  _1303("1303"),
  
  _1370("1370"),
  
  _1507("1507"),
  
  _1551("1551"),
  
  _1558("1558"),
  
  _1637("1637");

  private String value;

  CodigoBancoEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static CodigoBancoEnum fromString(String s) {
      for (CodigoBancoEnum b : CodigoBancoEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CodigoBancoEnum fromValue(String value) {
    for (CodigoBancoEnum b : CodigoBancoEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


