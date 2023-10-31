package com.example.myapplication.ManageStore.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.R;

public class MarketingActivity extends AppCompatActivity {
    Button Btn_CreateCampaing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);
        Btn_CreateCampaing=findViewById(R.id.Btn_CreateCampaing);
        Btn_CreateCampaing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MarketingActivity.this,"Campaing is created",Toast.LENGTH_SHORT).show();
            }
        });

    }
}