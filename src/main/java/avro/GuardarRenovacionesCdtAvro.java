/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GuardarRenovacionesCdtAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1298914666471790476L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GuardarRenovacionesCdtAvro\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"codigoLote\",\"type\":\"string\"},{\"name\":\"cdt\",\"type\":{\"type\":\"record\",\"name\":\"RenovacionCdtAvro\",\"fields\":[{\"name\":\"numCertificadoCancelar\",\"type\":\"int\"},{\"name\":\"numeroCliente\",\"type\":\"int\"},{\"name\":\"numeroProductoCDT\",\"type\":{\"type\":\"enum\",\"name\":\"NumeroProductoCDTEnum\",\"symbols\":[\"D180\",\"D360\",\"D540\",\"D541\"]}},{\"name\":\"tipoRenovacion\",\"type\":{\"type\":\"enum\",\"name\":\"TipoRenovacionEnum\",\"symbols\":[\"_1\",\"_2\",\"_4\"]}},{\"name\":\"plazoDias\",\"type\":\"int\"},{\"name\":\"plazo\",\"type\":\"string\"},{\"name\":\"fechaVencimientoDia\",\"type\":\"int\"},{\"name\":\"fechaVencimientoMes\",\"type\":\"int\"},{\"name\":\"fechaVencimientoAno\",\"type\":\"int\"},{\"name\":\"codigoBanco\",\"type\":\"string\"},{\"name\":\"codigoSucursal\",\"type\":\"int\"},{\"name\":\"condicionManejo\",\"type\":\"string\"},{\"name\":\"compensacion\",\"type\":\"string\"},{\"name\":\"tipoProrroga\",\"type\":\"string\"},{\"name\":\"cuentaDePago\",\"type\":\"string\"},{\"name\":\"numeroCuentaContable\",\"type\":\"int\"},{\"name\":\"concepto\",\"type\":\"int\"},{\"name\":\"cuentaConcepto\",\"type\":\"string\"},{\"name\":\"monedaPago\",\"type\":\"string\"},{\"name\":\"montoCapital\",\"type\":\"int\"},{\"name\":\"tipoPersona\",\"type\":\"string\"},{\"name\":\"numeroDocumento\",\"type\":\"string\"},{\"name\":\"nombreCliente\",\"type\":\"string\"},{\"name\":\"tipoTransaccion\",\"type\":{\"type\":\"enum\",\"name\":\"TipoTransaccionEnum\",\"symbols\":[\"_37\",\"_27\"]}},{\"name\":\"codigoBancoDestino\",\"type\":{\"type\":\"enum\",\"name\":\"CodigoBancoEnum\",\"symbols\":[\"_1001\",\"_1002\",\"_1006\",\"_1007\",\"_1009\",\"_1012\",\"_1013\",\"_1014\",\"_1019\",\"_1023\",\"_1031\",\"_1032\",\"_1040\",\"_1047\",\"_1051\",\"_1052\",\"_1053\",\"_1059\",\"_1060\",\"_1061\",\"_1062\",\"_1063\",\"_1065\",\"_1066\",\"_1067\",\"_1069\",\"_1071\",\"_1086\",\"_1121\",\"_1151\",\"_1283\",\"_1289\",\"_1291\",\"_1292\",\"_1303\",\"_1370\",\"_1507\",\"_1551\",\"_1558\",\"_1637\"]}},{\"name\":\"numeroCuentaBancaria\",\"type\":\"int\"},{\"name\":\"referencia\",\"type\":\"string\"},{\"name\":\"transaccionRenovacion\",\"type\":{\"type\":\"record\",\"name\":\"TransaccionLoteRenovacionCdtArvo\",\"fields\":[{\"name\":\"numCertificadoCancelar\",\"type\":\"int\"},{\"name\":\"numCertificadoNuevo\",\"type\":\"int\"},{\"name\":\"numeroCliente\",\"type\":\"int\"},{\"name\":\"codigoLote\",\"type\":\"string\"},{\"name\":\"estadoRenovacion\",\"type\":{\"type\":\"enum\",\"name\":\"EstadoRenovacionEnum\",\"symbols\":[\"POR_PROCESAR\",\"ERROR_DATOS\",\"EXITOSO\",\"NO_EXITOSO\"]}},{\"name\":\"tipoProceso\",\"type\":{\"type\":\"enum\",\"name\":\"TipoProcesoEnum\",\"symbols\":[\"CANCELACION\",\"RENOVACION\"]}}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GuardarRenovacionesCdtAvro> ENCODER =
      new BinaryMessageEncoder<GuardarRenovacionesCdtAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GuardarRenovacionesCdtAvro> DECODER =
      new BinaryMessageDecoder<GuardarRenovacionesCdtAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GuardarRenovacionesCdtAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GuardarRenovacionesCdtAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GuardarRenovacionesCdtAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GuardarRenovacionesCdtAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GuardarRenovacionesCdtAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GuardarRenovacionesCdtAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GuardarRenovacionesCdtAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GuardarRenovacionesCdtAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence codigoLote;
   private avro.RenovacionCdtAvro cdt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GuardarRenovacionesCdtAvro() {}

  /**
   * All-args constructor.
   * @param codigoLote The new value for codigoLote
   * @param cdt The new value for cdt
   */
  public GuardarRenovacionesCdtAvro(java.lang.CharSequence codigoLote, avro.RenovacionCdtAvro cdt) {
    this.codigoLote = codigoLote;
    this.cdt = cdt;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return codigoLote;
    case 1: return cdt;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: codigoLote = (java.lang.CharSequence)value$; break;
    case 1: cdt = (avro.RenovacionCdtAvro)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'codigoLote' field.
   * @return The value of the 'codigoLote' field.
   */
  public java.lang.CharSequence getCodigoLote() {
    return codigoLote;
  }


  /**
   * Sets the value of the 'codigoLote' field.
   * @param value the value to set.
   */
  public void setCodigoLote(java.lang.CharSequence value) {
    this.codigoLote = value;
  }

  /**
   * Gets the value of the 'cdt' field.
   * @return The value of the 'cdt' field.
   */
  public avro.RenovacionCdtAvro getCdt() {
    return cdt;
  }


  /**
   * Sets the value of the 'cdt' field.
   * @param value the value to set.
   */
  public void setCdt(avro.RenovacionCdtAvro value) {
    this.cdt = value;
  }

  /**
   * Creates a new GuardarRenovacionesCdtAvro RecordBuilder.
   * @return A new GuardarRenovacionesCdtAvro RecordBuilder
   */
  public static avro.GuardarRenovacionesCdtAvro.Builder newBuilder() {
    return new avro.GuardarRenovacionesCdtAvro.Builder();
  }

  /**
   * Creates a new GuardarRenovacionesCdtAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GuardarRenovacionesCdtAvro RecordBuilder
   */
  public static avro.GuardarRenovacionesCdtAvro.Builder newBuilder(avro.GuardarRenovacionesCdtAvro.Builder other) {
    if (other == null) {
      return new avro.GuardarRenovacionesCdtAvro.Builder();
    } else {
      return new avro.GuardarRenovacionesCdtAvro.Builder(other);
    }
  }

  /**
   * Creates a new GuardarRenovacionesCdtAvro RecordBuilder by copying an existing GuardarRenovacionesCdtAvro instance.
   * @param other The existing instance to copy.
   * @return A new GuardarRenovacionesCdtAvro RecordBuilder
   */
  public static avro.GuardarRenovacionesCdtAvro.Builder newBuilder(avro.GuardarRenovacionesCdtAvro other) {
    if (other == null) {
      return new avro.GuardarRenovacionesCdtAvro.Builder();
    } else {
      return new avro.GuardarRenovacionesCdtAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for GuardarRenovacionesCdtAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GuardarRenovacionesCdtAvro>
    implements org.apache.avro.data.RecordBuilder<GuardarRenovacionesCdtAvro> {

    private java.lang.CharSequence codigoLote;
    private avro.RenovacionCdtAvro cdt;
    private avro.RenovacionCdtAvro.Builder cdtBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.GuardarRenovacionesCdtAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.codigoLote)) {
        this.codigoLote = data().deepCopy(fields()[0].schema(), other.codigoLote);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.cdt)) {
        this.cdt = data().deepCopy(fields()[1].schema(), other.cdt);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasCdtBuilder()) {
        this.cdtBuilder = avro.RenovacionCdtAvro.newBuilder(other.getCdtBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing GuardarRenovacionesCdtAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.GuardarRenovacionesCdtAvro other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.codigoLote)) {
        this.codigoLote = data().deepCopy(fields()[0].schema(), other.codigoLote);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cdt)) {
        this.cdt = data().deepCopy(fields()[1].schema(), other.cdt);
        fieldSetFlags()[1] = true;
      }
      this.cdtBuilder = null;
    }

    /**
      * Gets the value of the 'codigoLote' field.
      * @return The value.
      */
    public java.lang.CharSequence getCodigoLote() {
      return codigoLote;
    }


    /**
      * Sets the value of the 'codigoLote' field.
      * @param value The value of 'codigoLote'.
      * @return This builder.
      */
    public avro.GuardarRenovacionesCdtAvro.Builder setCodigoLote(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.codigoLote = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'codigoLote' field has been set.
      * @return True if the 'codigoLote' field has been set, false otherwise.
      */
    public boolean hasCodigoLote() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'codigoLote' field.
      * @return This builder.
      */
    public avro.GuardarRenovacionesCdtAvro.Builder clearCodigoLote() {
      codigoLote = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'cdt' field.
      * @return The value.
      */
    public avro.RenovacionCdtAvro getCdt() {
      return cdt;
    }


    /**
      * Sets the value of the 'cdt' field.
      * @param value The value of 'cdt'.
      * @return This builder.
      */
    public avro.GuardarRenovacionesCdtAvro.Builder setCdt(avro.RenovacionCdtAvro value) {
      validate(fields()[1], value);
      this.cdtBuilder = null;
      this.cdt = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'cdt' field has been set.
      * @return True if the 'cdt' field has been set, false otherwise.
      */
    public boolean hasCdt() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'cdt' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public avro.RenovacionCdtAvro.Builder getCdtBuilder() {
      if (cdtBuilder == null) {
        if (hasCdt()) {
          setCdtBuilder(avro.RenovacionCdtAvro.newBuilder(cdt));
        } else {
          setCdtBuilder(avro.RenovacionCdtAvro.newBuilder());
        }
      }
      return cdtBuilder;
    }

    /**
     * Sets the Builder instance for the 'cdt' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public avro.GuardarRenovacionesCdtAvro.Builder setCdtBuilder(avro.RenovacionCdtAvro.Builder value) {
      clearCdt();
      cdtBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'cdt' field has an active Builder instance
     * @return True if the 'cdt' field has an active Builder instance
     */
    public boolean hasCdtBuilder() {
      return cdtBuilder != null;
    }

    /**
      * Clears the value of the 'cdt' field.
      * @return This builder.
      */
    public avro.GuardarRenovacionesCdtAvro.Builder clearCdt() {
      cdt = null;
      cdtBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GuardarRenovacionesCdtAvro build() {
      try {
        GuardarRenovacionesCdtAvro record = new GuardarRenovacionesCdtAvro();
        record.codigoLote = fieldSetFlags()[0] ? this.codigoLote : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (cdtBuilder != null) {
          try {
            record.cdt = this.cdtBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("cdt"));
            throw e;
          }
        } else {
          record.cdt = fieldSetFlags()[1] ? this.cdt : (avro.RenovacionCdtAvro) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GuardarRenovacionesCdtAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<GuardarRenovacionesCdtAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GuardarRenovacionesCdtAvro>
    READER$ = (org.apache.avro.io.DatumReader<GuardarRenovacionesCdtAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.codigoLote);

    this.cdt.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.codigoLote = in.readString(this.codigoLote instanceof Utf8 ? (Utf8)this.codigoLote : null);

      if (this.cdt == null) {
        this.cdt = new avro.RenovacionCdtAvro();
      }
      this.cdt.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.codigoLote = in.readString(this.codigoLote instanceof Utf8 ? (Utf8)this.codigoLote : null);
          break;

        case 1:
          if (this.cdt == null) {
            this.cdt = new avro.RenovacionCdtAvro();
          }
          this.cdt.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










