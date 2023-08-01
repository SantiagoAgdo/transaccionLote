package com.mibanco.transaccionloterenovacioncdt.us.config.producer;


import avro.GuardarRenovacionesCdtAvro;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.messaging.pub.RenovacionCDTIniciaProcesoPub;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

@ApplicationScoped
public class CrearProducerRenovacionCDT {
    private static final Logger LOG = LoggerFactory.getLogger(RenovacionCDTIniciaProcesoPub.class);

    private final KafkaProducer<String, GuardarRenovacionesCdtAvro> kafkaProducer;


    @Inject
    public CrearProducerRenovacionCDT(@ConfigProperty(name = "BOOTSTRAP_SERVERS_CONFIG") String bootstrapServers, @ConfigProperty(name = "security.protocol") String securityProtocol, @ConfigProperty(name = "sasl.jaas.config") String saslJaasConfig, @ConfigProperty(name = "sasl.mechanism") String saslMechanism, @ConfigProperty(name = "schema.registry.url") String schemaRegistryUrl) {

        // Configurar las propiedades del KafkaProducer
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.put(ProducerConfig.ACKS_CONFIG, "all");


        properties.put("security.protocol", securityProtocol);
        properties.put("sasl.jaas.config", saslJaasConfig);
        properties.put("sasl.mechanism", saslMechanism);

        // Agregar la propiedad del schema registry
        properties.put("schema.registry.url", schemaRegistryUrl);

        // Crear propiedades del producer
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName()); // Usa AvroSerializer

        // Crear una instancia de KafkaProducer con Avro serializer
        this.kafkaProducer = new KafkaProducer<>(properties);
    }

    public void enviarMensajeProducer(String topic, String key, GuardarRenovacionesCdtAvro value) {
        ProducerRecord<String, GuardarRenovacionesCdtAvro> record = new ProducerRecord<>(topic, key, value);
        kafkaProducer.send(record, (metadata, exception) -> {
            if (exception == null) {
                LOG.info("Recibiendo nueva metadata. \n" + "Key: " + key + "\n" + "Topic: " + metadata.topic() + "\n" + "Partition: " + metadata.partition() + "\n" + "Offset: " + metadata.offset() + "\n" + "Timestamp: " + metadata.timestamp());
            } else {
                LOG.error("Error al enviar mensaje a Kafka", exception);
            }
        });
        // enviar al productor para enviar la información y bloquear el hilo -- sincrono
        // kafkaProducer.flush();
        // Resto del código...
    }

}
