package com.damanpreet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    public String inputStreamToString(InputStream inputStream) {
        try {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, bytes.length);
            String json = new String(bytes);
            return json;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        String myJson = inputStreamToString(getResources().openRawResource(R.raw.events));
        Type collectionType = new TypeToken<ArrayList<Order>>() {
        }.getType();

        ArrayList<Order> enums = new Gson().fromJson(myJson, collectionType);

        ArrayList<CheckoutHistory> checkoutHistories = new ArrayList<>();

        for (int i = 0; i < enums.size(); i++) {
            CheckoutHistory checkoutHistory = new CheckoutHistory(enums.get(i).getCreatedAt(), enums.get(i));
            int index = checkoutHistories.indexOf(checkoutHistory);
            if (index < 0) {
                checkoutHistories.add(checkoutHistory);
            } else {
                checkoutHistories.get(index).getOrders().add(enums.get(i));
            }
        }

        recyclerView.setAdapter(new RecyclerAdapter(checkoutHistories, this));

    }
}
