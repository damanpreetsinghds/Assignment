package com.damanpreet.myapplication;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CheckoutHistory {

    private final static String TAG = "CheckoutHistory";

    private Calendar calendar;

    private ArrayList<Order> orders = new ArrayList<>();

    public CheckoutHistory(String date, Order order) {

        calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.getDefault()).parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        orders.add(order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckoutHistory that = (CheckoutHistory) o;

        Log.d(TAG, calendar.get(Calendar.YEAR) + " " + that.calendar.get(Calendar.YEAR));
        Log.d(TAG, calendar.get(Calendar.MONTH) + " " + that.calendar.get(Calendar.MONTH));
        Log.d(TAG, calendar.get(Calendar.DAY_OF_MONTH) + " " + that.calendar.get(Calendar.DAY_OF_MONTH));

        return calendar.get(Calendar.YEAR) == that.calendar.get(Calendar.YEAR) &&
                calendar.get(Calendar.MONTH) == that.calendar.get(Calendar.MONTH) &&
                calendar.get(Calendar.DAY_OF_MONTH) == that.calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int hashCode() {
        return calendar.get(Calendar.YEAR) + calendar.get(Calendar.MONTH) + calendar.get(Calendar.DAY_OF_MONTH
        );
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "CheckoutHistory{" +
                "calendar=" + calendar +
                ", orders=" + orders +
                '}';
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
