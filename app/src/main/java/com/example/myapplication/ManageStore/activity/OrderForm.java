package com.example.myapplication.ManageStore.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.R;

public class OrderForm extends AppCompatActivity {
    Button Btn_AddFiled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);
        Btn_AddFiled=findViewById(R.id.Btn_AddFiled);
        Btn_AddFiled.setOnClickListener(v -> {
            Intent i=new Intent(OrderForm.this,AddFieldOrderForm.class);
            startActivity(i);
        });

    }
}