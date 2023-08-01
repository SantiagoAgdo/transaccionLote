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
public class TransaccionLoteRenovacionCdtArvo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 481073901525528248L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TransaccionLoteRenovacionCdtArvo\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"numCertificadoCancelar\",\"type\":\"int\"},{\"name\":\"numCertificadoNuevo\",\"type\":\"int\"},{\"name\":\"numeroCliente\",\"type\":\"int\"},{\"name\":\"codigoLote\",\"type\":\"string\"},{\"name\":\"estadoRenovacion\",\"type\":{\"type\":\"enum\",\"name\":\"EstadoRenovacionEnum\",\"symbols\":[\"POR_PROCESAR\",\"ERROR_DATOS\",\"EXITOSO\",\"NO_EXITOSO\"]}},{\"name\":\"tipoProceso\",\"type\":{\"type\":\"enum\",\"name\":\"TipoProcesoEnum\",\"symbols\":[\"CANCELACION\",\"RENOVACION\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TransaccionLoteRenovacionCdtArvo> ENCODER =
      new BinaryMessageEncoder<TransaccionLoteRenovacionCdtArvo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TransaccionLoteRenovacionCdtArvo> DECODER =
      new BinaryMessageDecoder<TransaccionLoteRenovacionCdtArvo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TransaccionLoteRenovacionCdtArvo> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TransaccionLoteRenovacionCdtArvo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TransaccionLoteRenovacionCdtArvo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TransaccionLoteRenovacionCdtArvo>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TransaccionLoteRenovacionCdtArvo to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TransaccionLoteRenovacionCdtArvo from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TransaccionLoteRenovacionCdtArvo instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TransaccionLoteRenovacionCdtArvo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int numCertificadoCancelar;
   private int numCertificadoNuevo;
   private int numeroCliente;
   private java.lang.CharSequence codigoLote;
   private avro.EstadoRenovacionEnum estadoRenovacion;
   private avro.TipoProcesoEnum tipoProceso;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TransaccionLoteRenovacionCdtArvo() {}

  /**
   * All-args constructor.
   * @param numCertificadoCancelar The new value for numCertificadoCancelar
   * @param numCertificadoNuevo The new value for numCertificadoNuevo
   * @param numeroCliente The new value for numeroCliente
   * @param codigoLote The new value for codigoLote
   * @param estadoRenovacion The new value for estadoRenovacion
   * @param tipoProceso The new value for tipoProceso
   */
  public TransaccionLoteRenovacionCdtArvo(java.lang.Integer numCertificadoCancelar, java.lang.Integer numCertificadoNuevo, java.lang.Integer numeroCliente, java.lang.CharSequence codigoLote, avro.EstadoRenovacionEnum estadoRenovacion, avro.TipoProcesoEnum tipoProceso) {
    this.numCertificadoCancelar = numCertificadoCancelar;
    this.numCertificadoNuevo = numCertificadoNuevo;
    this.numeroCliente = numeroCliente;
    this.codigoLote = codigoLote;
    this.estadoRenovacion = estadoRenovacion;
    this.tipoProceso = tipoProceso;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return numCertificadoCancelar;
    case 1: return numCertificadoNuevo;
    case 2: return numeroCliente;
    case 3: return codigoLote;
    case 4: return estadoRenovacion;
    case 5: return tipoProceso;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: numCertificadoCancelar = (java.lang.Integer)value$; break;
    case 1: numCertificadoNuevo = (java.lang.Integer)value$; break;
    case 2: numeroCliente = (java.lang.Integer)value$; break;
    case 3: codigoLote = (java.lang.CharSequence)value$; break;
    case 4: estadoRenovacion = (avro.EstadoRenovacionEnum)value$; break;
    case 5: tipoProceso = (avro.TipoProcesoEnum)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'numCertificadoCancelar' field.
   * @return The value of the 'numCertificadoCancelar' field.
   */
  public int getNumCertificadoCancelar() {
    return numCertificadoCancelar;
  }


  /**
   * Sets the value of the 'numCertificadoCancelar' field.
   * @param value the value to set.
   */
  public void setNumCertificadoCancelar(int value) {
    this.numCertificadoCancelar = value;
  }

  /**
   * Gets the value of the 'numCertificadoNuevo' field.
   * @return The value of the 'numCertificadoNuevo' field.
   */
  public int getNumCertificadoNuevo() {
    return numCertificadoNuevo;
  }


  /**
   * Sets the value of the 'numCertificadoNuevo' field.
   * @param value the value to set.
   */
  public void setNumCertificadoNuevo(int value) {
    this.numCertificadoNuevo = value;
  }

  /**
   * Gets the value of the 'numeroCliente' field.
   * @return The value of the 'numeroCliente' field.
   */
  public int getNumeroCliente() {
    return numeroCliente;
  }


  /**
   * Sets the value of the 'numeroCliente' field.
   * @param value the value to set.
   */
  public void setNumeroCliente(int value) {
    this.numeroCliente = value;
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
   * Gets the value of the 'estadoRenovacion' field.
   * @return The value of the 'estadoRenovacion' field.
   */
  public avro.EstadoRenovacionEnum getEstadoRenovacion() {
    return estadoRenovacion;
  }


  /**
   * Sets the value of the 'estadoRenovacion' field.
   * @param value the value to set.
   */
  public void setEstadoRenovacion(avro.EstadoRenovacionEnum value) {
    this.estadoRenovacion = value;
  }

  /**
   * Gets the value of the 'tipoProceso' field.
   * @return The value of the 'tipoProceso' field.
   */
  public avro.TipoProcesoEnum getTipoProceso() {
    return tipoProceso;
  }


  /**
   * Sets the value of the 'tipoProceso' field.
   * @param value the value to set.
   */
  public void setTipoProceso(avro.TipoProcesoEnum value) {
    this.tipoProceso = value;
  }

  /**
   * Creates a new TransaccionLoteRenovacionCdtArvo RecordBuilder.
   * @return A new TransaccionLoteRenovacionCdtArvo RecordBuilder
   */
  public static avro.TransaccionLoteRenovacionCdtArvo.Builder newBuilder() {
    return new avro.TransaccionLoteRenovacionCdtArvo.Builder();
  }

  /**
   * Creates a new TransaccionLoteRenovacionCdtArvo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TransaccionLoteRenovacionCdtArvo RecordBuilder
   */
  public static avro.TransaccionLoteRenovacionCdtArvo.Builder newBuilder(avro.TransaccionLoteRenovacionCdtArvo.Builder other) {
    if (other == null) {
      return new avro.TransaccionLoteRenovacionCdtArvo.Builder();
    } else {
      return new avro.TransaccionLoteRenovacionCdtArvo.Builder(other);
    }
  }

  /**
   * Creates a new TransaccionLoteRenovacionCdtArvo RecordBuilder by copying an existing TransaccionLoteRenovacionCdtArvo instance.
   * @param other The existing instance to copy.
   * @return A new TransaccionLoteRenovacionCdtArvo RecordBuilder
   */
  public static avro.TransaccionLoteRenovacionCdtArvo.Builder newBuilder(avro.TransaccionLoteRenovacionCdtArvo other) {
    if (other == null) {
      return new avro.TransaccionLoteRenovacionCdtArvo.Builder();
    } else {
      return new avro.TransaccionLoteRenovacionCdtArvo.Builder(other);
    }
  }

  /**
   * RecordBuilder for TransaccionLoteRenovacionCdtArvo instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TransaccionLoteRenovacionCdtArvo>
    implements org.apache.avro.data.RecordBuilder<TransaccionLoteRenovacionCdtArvo> {

    private int numCertificadoCancelar;
    private int numCertificadoNuevo;
    private int numeroCliente;
    private java.lang.CharSequence codigoLote;
    private avro.EstadoRenovacionEnum estadoRenovacion;
    private avro.TipoProcesoEnum tipoProceso;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.TransaccionLoteRenovacionCdtArvo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.numCertificadoCancelar)) {
        this.numCertificadoCancelar = data().deepCopy(fields()[0].schema(), other.numCertificadoCancelar);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.numCertificadoNuevo)) {
        this.numCertificadoNuevo = data().deepCopy(fields()[1].schema(), other.numCertificadoNuevo);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.numeroCliente)) {
        this.numeroCliente = data().deepCopy(fields()[2].schema(), other.numeroCliente);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.codigoLote)) {
        this.codigoLote = data().deepCopy(fields()[3].schema(), other.codigoLote);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.estadoRenovacion)) {
        this.estadoRenovacion = data().deepCopy(fields()[4].schema(), other.estadoRenovacion);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.tipoProceso)) {
        this.tipoProceso = data().deepCopy(fields()[5].schema(), other.tipoProceso);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing TransaccionLoteRenovacionCdtArvo instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.TransaccionLoteRenovacionCdtArvo other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.numCertificadoCancelar)) {
        this.numCertificadoCancelar = data().deepCopy(fields()[0].schema(), other.numCertificadoCancelar);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numCertificadoNuevo)) {
        this.numCertificadoNuevo = data().deepCopy(fields()[1].schema(), other.numCertificadoNuevo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.numeroCliente)) {
        this.numeroCliente = data().deepCopy(fields()[2].schema(), other.numeroCliente);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.codigoLote)) {
        this.codigoLote = data().deepCopy(fields()[3].schema(), other.codigoLote);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.estadoRenovacion)) {
        this.estadoRenovacion = data().deepCopy(fields()[4].schema(), other.estadoRenovacion);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tipoProceso)) {
        this.tipoProceso = data().deepCopy(fields()[5].schema(), other.tipoProceso);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'numCertificadoCancelar' field.
      * @return The value.
      */
    public int getNumCertificadoCancelar() {
      return numCertificadoCancelar;
    }


    /**
      * Sets the value of the 'numCertificadoCancelar' field.
      * @param value The value of 'numCertificadoCancelar'.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder setNumCertificadoCancelar(int value) {
      validate(fields()[0], value);
      this.numCertificadoCancelar = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'numCertificadoCancelar' field has been set.
      * @return True if the 'numCertificadoCancelar' field has been set, false otherwise.
      */
    public boolean hasNumCertificadoCancelar() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'numCertificadoCancelar' field.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder clearNumCertificadoCancelar() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'numCertificadoNuevo' field.
      * @return The value.
      */
    public int getNumCertificadoNuevo() {
      return numCertificadoNuevo;
    }


    /**
      * Sets the value of the 'numCertificadoNuevo' field.
      * @param value The value of 'numCertificadoNuevo'.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder setNumCertificadoNuevo(int value) {
      validate(fields()[1], value);
      this.numCertificadoNuevo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'numCertificadoNuevo' field has been set.
      * @return True if the 'numCertificadoNuevo' field has been set, false otherwise.
      */
    public boolean hasNumCertificadoNuevo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'numCertificadoNuevo' field.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder clearNumCertificadoNuevo() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'numeroCliente' field.
      * @return The value.
      */
    public int getNumeroCliente() {
      return numeroCliente;
    }


    /**
      * Sets the value of the 'numeroCliente' field.
      * @param value The value of 'numeroCliente'.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder setNumeroCliente(int value) {
      validate(fields()[2], value);
      this.numeroCliente = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'numeroCliente' field has been set.
      * @return True if the 'numeroCliente' field has been set, false otherwise.
      */
    public boolean hasNumeroCliente() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'numeroCliente' field.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder clearNumeroCliente() {
      fieldSetFlags()[2] = false;
      return this;
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
    public avro.TransaccionLoteRenovacionCdtArvo.Builder setCodigoLote(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.codigoLote = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'codigoLote' field has been set.
      * @return True if the 'codigoLote' field has been set, false otherwise.
      */
    public boolean hasCodigoLote() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'codigoLote' field.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder clearCodigoLote() {
      codigoLote = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'estadoRenovacion' field.
      * @return The value.
      */
    public avro.EstadoRenovacionEnum getEstadoRenovacion() {
      return estadoRenovacion;
    }


    /**
      * Sets the value of the 'estadoRenovacion' field.
      * @param value The value of 'estadoRenovacion'.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder setEstadoRenovacion(avro.EstadoRenovacionEnum value) {
      validate(fields()[4], value);
      this.estadoRenovacion = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'estadoRenovacion' field has been set.
      * @return True if the 'estadoRenovacion' field has been set, false otherwise.
      */
    public boolean hasEstadoRenovacion() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'estadoRenovacion' field.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder clearEstadoRenovacion() {
      estadoRenovacion = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'tipoProceso' field.
      * @return The value.
      */
    public avro.TipoProcesoEnum getTipoProceso() {
      return tipoProceso;
    }


    /**
      * Sets the value of the 'tipoProceso' field.
      * @param value The value of 'tipoProceso'.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder setTipoProceso(avro.TipoProcesoEnum value) {
      validate(fields()[5], value);
      this.tipoProceso = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'tipoProceso' field has been set.
      * @return True if the 'tipoProceso' field has been set, false otherwise.
      */
    public boolean hasTipoProceso() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'tipoProceso' field.
      * @return This builder.
      */
    public avro.TransaccionLoteRenovacionCdtArvo.Builder clearTipoProceso() {
      tipoProceso = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TransaccionLoteRenovacionCdtArvo build() {
      try {
        TransaccionLoteRenovacionCdtArvo record = new TransaccionLoteRenovacionCdtArvo();
        record.numCertificadoCancelar = fieldSetFlags()[0] ? this.numCertificadoCancelar : (java.lang.Integer) defaultValue(fields()[0]);
        record.numCertificadoNuevo = fieldSetFlags()[1] ? this.numCertificadoNuevo : (java.lang.Integer) defaultValue(fields()[1]);
        record.numeroCliente = fieldSetFlags()[2] ? this.numeroCliente : (java.lang.Integer) defaultValue(fields()[2]);
        record.codigoLote = fieldSetFlags()[3] ? this.codigoLote : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.estadoRenovacion = fieldSetFlags()[4] ? this.estadoRenovacion : (avro.EstadoRenovacionEnum) defaultValue(fields()[4]);
        record.tipoProceso = fieldSetFlags()[5] ? this.tipoProceso : (avro.TipoProcesoEnum) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TransaccionLoteRenovacionCdtArvo>
    WRITER$ = (org.apache.avro.io.DatumWriter<TransaccionLoteRenovacionCdtArvo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TransaccionLoteRenovacionCdtArvo>
    READER$ = (org.apache.avro.io.DatumReader<TransaccionLoteRenovacionCdtArvo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.numCertificadoCancelar);

    out.writeInt(this.numCertificadoNuevo);

    out.writeInt(this.numeroCliente);

    out.writeString(this.codigoLote);

    out.writeEnum(this.estadoRenovacion.ordinal());

    out.writeEnum(this.tipoProceso.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.numCertificadoCancelar = in.readInt();

      this.numCertificadoNuevo = in.readInt();

      this.numeroCliente = in.readInt();

      this.codigoLote = in.readString(this.codigoLote instanceof Utf8 ? (Utf8)this.codigoLote : null);

      this.estadoRenovacion = avro.EstadoRenovacionEnum.values()[in.readEnum()];

      this.tipoProceso = avro.TipoProcesoEnum.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.numCertificadoCancelar = in.readInt();
          break;

        case 1:
          this.numCertificadoNuevo = in.readInt();
          break;

        case 2:
          this.numeroCliente = in.readInt();
          break;

        case 3:
          this.codigoLote = in.readString(this.codigoLote instanceof Utf8 ? (Utf8)this.codigoLote : null);
          break;

        case 4:
          this.estadoRenovacion = avro.EstadoRenovacionEnum.values()[in.readEnum()];
          break;

        case 5:
          this.tipoProceso = avro.TipoProcesoEnum.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









