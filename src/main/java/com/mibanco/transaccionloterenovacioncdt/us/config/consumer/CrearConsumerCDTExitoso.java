package com.mibanco.transaccionloterenovacioncdt.us.config.consumer;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CrearConsumerCDTExitoso {

    /*private final Logger LOG = LoggerFactory.getLogger(ConsumidorKafkaCDTExitoso.class);
    private final KafkaConsumer<String, T> kafkaConsumer;
    private final ConsumerConfiguration consumerConfig;

    private final String topic;

    @Inject
    public ConsumidorKafkaCDTExitoso(String topic){
        this.topic = topic;
        this.consumerConfig = new ConsumerConfiguration();

        // Configurar las propiedades de conexión del KafkaConsumer
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, this.consumerConfig.getBootstrapServers());
        properties.put("security.protocol", this.consumerConfig.getSecurityProtocol());
        properties.put("sasl.jaas.config", this.consumerConfig.getSaslJaasConfig());
        properties.put("sasl.mechanism", this.consumerConfig.getSaslMechanism());

        // Agregar la propiedad del schema registry
        properties.put("schema.registry.url", this.consumerConfig.getSchemaRegistryUrl());

        // Crear propiedades del consumidor
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName()); // Usa AvroDeserializer
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, this.consumerConfig.getGroupId());
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, this.consumerConfig.getAutoOffsetReset());

        // Crear una instancia de KafkaConsumer
        this.kafkaConsumer = new KafkaConsumer<>(properties);

    }
    public void consume() {

        kafkaConsumer.subscribe(List.of(topic));

        LOG.info("Inicia consumidor kafka en ConsumidorKafka");

        while (true) {
            LOG.info("Recibiendo nueva data desde topic {} en ConsumidorKafka", this.consumerConfig.getTopic());
            ConsumerRecords<String, T> records = kafkaConsumer.poll(Duration.ofMillis(1000));

            for (ConsumerRecord<String, T> record : records) {
                LOG.info("Key: " + record.key() + ", Value: " + record.value());
                LOG.info("Partition: " + record.partition() + ", Offset:" + record.offset());
            }
        }
    }*/
}
