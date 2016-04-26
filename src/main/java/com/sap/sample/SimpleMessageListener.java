package com.sap.sample;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * Created by i325571 on 4/21/16.
 */
public class SimpleMessageListener implements MessageListener{

    @Override
    public void onMessage(Message message) {


        Order order = null;
        try {
            order = (Order)(((ObjectMessage)message).getObject());
            System.out.println("Order Received : "+order.getOrderId());
            //TODO Please put your code here to create orders by Calling orderfacade.createOrder(order)
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
