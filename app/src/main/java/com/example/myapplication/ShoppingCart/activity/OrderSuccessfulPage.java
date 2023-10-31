package com.example.myapplication.ShoppingCart.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Fragment.Homefragment;

public class OrderSuccessfulPage extends AppCompatActivity {
    Button Btn_ContinueShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_successful_page);

        Btn_ContinueShop=findViewById(R.id.Btn_ContinueShop);
        Btn_ContinueShop.setOnClickListener(v -> {
            startActivity(new Intent(OrderSuccessfulPage.this, Homefragment.class));
        });

    }
}