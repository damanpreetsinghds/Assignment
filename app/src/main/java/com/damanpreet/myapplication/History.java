package com.damanpreet.myapplication;

import java.util.ArrayList;

public class History {

    private ArrayList<Order> orders;


    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "History{" +
                "orders=" + orders +
                '}';
    }
}
