package com.mibanco.transaccionloterenovacioncdt.us.service.command.messaging.sub;

import com.mibanco.transaccionloterenovacioncdt.us.service.command.ICommand;
import com.mibanco.transaccionloterenovacioncdt.us.service.command.IParam;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RenovacionCDTErrorDatosSub implements ICommand {
    @Override
    public Object execute(IParam parametro) {
        return null;
    }
}
