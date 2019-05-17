package com.ikar.example.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ikar.example.gwt.shared.MessageService;

import java.time.LocalDateTime;

public class MessageServiceImpl extends RemoteServiceServlet implements MessageService {

    public String sendMessage(String message)
            throws IllegalArgumentException {
        if (message == null) {
            throw new IllegalArgumentException("message is null");
        }

        return "Hello, " + message + "!<br><br> Time received: "
                + LocalDateTime.now();
    }

}
