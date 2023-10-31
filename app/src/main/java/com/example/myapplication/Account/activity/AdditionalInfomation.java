package com.example.myapplication.Account.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.example.myapplication.LoginScreen;
import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.snackbar.Snackbar;

public class AdditionalInfomation extends AppCompatActivity {

    ConstraintLayout constrient_Sign_out;
    View constrient_AddInfo;
    Switch switch_Chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_infomation);

//        getSupportActionBar().setTitle("Additional Information");
        constrient_Sign_out=findViewById(R.id.constrient_Sign_out);
        switch_Chat=findViewById(R.id.switch_Chat);
        constrient_AddInfo=findViewById(R.id.constrient_WhatsaapChat);

        constrient_Sign_out.setOnClickListener(v -> {

            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this,R.style.bottom_shee_dailog_theam);
            View view= LayoutInflater.from(AdditionalInfomation.this).
                    inflate(R.layout.signoutdailogbox,null);
            bottomSheetDialog.setContentView(view);
            view.findViewById(R.id.Btn_SignOut).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AdditionalInfomation.this, LoginScreen.class);
                    startActivity(i);
                    bottomSheetDialog.dismiss();
                }
            });
            view.findViewById(R.id.Signout_close).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bottomSheetDialog.dismiss();
                }
            });

            bottomSheetDialog.show();

        });

      switch_Chat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if(isChecked){
                  Snackbar snackbar= Snackbar.make(constrient_AddInfo,"WhatApp Support is ON now!",Snackbar.LENGTH_SHORT);
                  View sbView=snackbar.getView();
                  sbView.setBackgroundColor(Color.GREEN);
                  snackbar.show();
              }else{
                  Snackbar snackbar=   Snackbar.make(constrient_AddInfo,"WhatApp Support is OFF now!",Snackbar.LENGTH_SHORT);
                  View sbView=snackbar.getView();
                  sbView.setBackgroundColor(Color.GREEN);
                  snackbar.show();
              }
          }
      });
    }
}