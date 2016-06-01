package com.leuville.wssp.server;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
    	
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
    	System.out.println("handle " + pc.getIdentifier() + " " + pc.getPassword());
        if ("moi".equals(pc.getIdentifier())) {
           pc.setPassword("mypassword"); 
        }
    }
}
