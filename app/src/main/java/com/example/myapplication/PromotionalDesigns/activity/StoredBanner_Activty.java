package com.example.myapplication.PromotionalDesigns.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplication.R;

public class StoredBanner_Activty extends AppCompatActivity {

TextView BO_PhoneNo,Address_BO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stored_banner_activty);

        BO_PhoneNo=findViewById(R.id.BO_PhoneNo);
        Address_BO=findViewById(R.id.Address_BO);
//        Intent intent = getIntent();
//        String str = intent.getStringExtra("MobileNo");
//        BO_PhoneNo.setText(str);
//
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_APPEND);

// The value will be default as empty string because for
// the very first time when the app is opened, there is nothing to show
        String s1 = sh.getString("Mobile", String.valueOf(0));
        String s2 = sh.getString("Address_Office", " ");
        Log.e("abcd",s2);
        Log.e("acd",s1);

// We can then use the data
        BO_PhoneNo.setText(s1);
        Address_BO.setText(s2);



    }
}