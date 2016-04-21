package com.sap.sample;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by i325571 on 4/21/16.
 */
public class SimpleMessageListener implements MessageListener{

    @Override
    public void onMessage(Message message) {

        //TODO Please put your code here to create orders by Calling orderfacade.xcreateOrder
        String property = System.getProperty("JMSPorcessingOngoing");

        System.out.println("Every Message Response : "+property);
        System.out.println(message);
    }
}
