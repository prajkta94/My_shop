package com.example.myapplication.ShoppingCart.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Fragment.PaymentFragment;

public class AddressSender extends AppCompatActivity {
    Button BtnContinue_Address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_sender);
        BtnContinue_Address=findViewById(R.id.BtnContinue_Address);
        BtnContinue_Address.setOnClickListener(v -> {
            Intent i=new Intent(AddressSender.this, PaymentOrder.class);
            startActivity(i);
        });
    }
}