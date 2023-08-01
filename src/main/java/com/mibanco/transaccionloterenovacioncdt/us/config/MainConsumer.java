package com.mibanco.transaccionloterenovacioncdt.us.config;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class MainConsumer implements QuarkusApplication {

    //clase para que el metodo consumer este a la escucha de los mensajes de kafka

//    @Inject
//    ConsumidorKafkaCDTError consumidorKafka;

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Do startup logic here");
        // Iniciar el consumidor de Kafka en un hilo separado sin problemas de concurrencia porque el que recibe es el while
        //Thread kafkaConsumerThread = new Thread(() -> consumidorKafka.consume());
        //kafkaConsumerThread.start();
        // Aquí podrías agregar más lógica si es necesario // ... // Esperar a que la aplicación se detenga
        Quarkus.waitForExit();
        return 0;
    }
}
