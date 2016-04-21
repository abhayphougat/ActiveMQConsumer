package com.sap.sample;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by i325571 on 4/21/16.
 */
public class SimpleMessageListener implements MessageListener{

    @Override
    public void onMessage(Message message) {

        //TODO Please put your code here to create orders by Calling orderfacade.createOrder
        System.out.println(message);
    }
}
