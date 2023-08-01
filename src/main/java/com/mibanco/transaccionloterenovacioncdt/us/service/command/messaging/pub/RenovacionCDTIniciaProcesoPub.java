package com.mibanco.transaccionloterenovacioncdt.us.service.command.messaging.pub;

import avro.GuardarRenovacionesCdtAvro;
import com.mibanco.transaccionloterenovacioncdt.us.config.producer.CrearProducerRenovacionCDT;
import com.mibanco.transaccionloterenovacioncdt.us.dto.GuardarRenovacionesCDTDTO;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.ICommand;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.IParam;
import com.mibanco.transaccionloterenovacioncdt.us.util.TransaccionLoteRenovacionMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class RenovacionCDTIniciaProcesoPub implements ICommand {

    private static final Logger LOG = LoggerFactory.getLogger(RenovacionCDTIniciaProcesoPub.class);

    @Inject
    TransaccionLoteRenovacionMapper mapper;

    @Inject
    CrearProducerRenovacionCDT producerKafka;

    @Override
    public Object execute(IParam parametro) {

        GuardarRenovacionesCDTDTO guardarRenovacionesCDTDTO = (GuardarRenovacionesCDTDTO) parametro;

        String key = guardarRenovacionesCDTDTO.getCdt().getNumeroDocumento();
        GuardarRenovacionesCdtAvro value = mapper.guardarRenovacionesCDTDTOToAvro(guardarRenovacionesCDTDTO);

        // Enviar el evento de GuardarRenovacionesCdt a Kafka con el objeto Avro
        LOG.info("Inicia command en RenovacionCDTIniciaProcesoPub");

        producerKafka.enviarMensajeProducer("renovarCDTDigital", key, value);

        LOG.info("Finaliza command en RenovacionCDTIniciaProcesoPub");

        return null;
    }
}
