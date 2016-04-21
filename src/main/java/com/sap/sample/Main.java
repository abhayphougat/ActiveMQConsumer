package com.sap.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by i325571 on 4/21/16.
 */
public class Main {

    private static final String messageBody = "ping";
    private static final int messageCount = 100;
    protected static final String MESSAGE_COUNT = "messageCount";

    public static void main(String [] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
        //ConnectionFactory connectionFactory = context.getBean(ConnectionFactory.class);
        JmsTemplate template = context.getBean(JmsTemplate.class);;
        for (int i = 0; i < messageCount; i++) {
            final int index = i;
            final String text = "Message number is " + i + ".";
            template.send((session -> {Order order = new Order();
                order.setOrderId(index);
                ObjectMessage message = session.createObjectMessage(order);
                return message;} ));



        }
    }
}
