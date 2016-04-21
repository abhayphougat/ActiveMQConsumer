package com.sap.sample;

import org.springframework.jms.listener.DefaultMessageListenerContainer;

import javax.jms.Session;

/**
 * Created by i325571 on 4/13/16.
 */
public class OrderQueueMessageListenerContainer extends DefaultMessageListenerContainer{

    @Override
    public void start() {
        super.start();
    }

    @Override
    protected void messageReceived(Object invoker, Session session) {
        super.messageReceived(invoker, session);
        System.setProperty("JMSPorcessingOngoing","true");
    }

    @Override
    protected void noMessageReceived(Object invoker, Session session) {
        super.noMessageReceived(invoker, session);
        System.setProperty("JMSPorcessingOngoing","false");
    }



}
