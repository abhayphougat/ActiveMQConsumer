package com.sap.sample;

import java.io.Serializable;

/**
 * Created by i325571 on 4/22/16.
 */
public class Order implements Serializable {

    public final static long serialVersionUID = -1350229733L;

    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
