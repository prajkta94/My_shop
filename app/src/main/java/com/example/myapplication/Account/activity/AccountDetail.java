package com.example.myapplication.Account.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.EditBussinessDetail;
import com.example.myapplication.R;

public class AccountDetail extends AppCompatActivity {
    TextView Edit_businessDetai;
    ConstraintLayout Constrient_CreditLimit,Constrient_Subscription,Constrient_Tutorials,Constrient_Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_detail);

//        getSupportActionBar().setTitle("Account");
        Constrient_CreditLimit=findViewById(R.id.constrient_credit);
        Constrient_Subscription=findViewById(R.id.constrient_Subscription);
        Constrient_Tutorials=findViewById(R.id.Constrinet_Tutorials);
        Constrient_Info=findViewById(R.id.Constrient_Info);


        Edit_businessDetai=findViewById(R.id.Edit_businessDetai);
        Edit_businessDetai.setOnClickListener(v -> {
            startActivity(new Intent(AccountDetail.this, EditBussinessDetail.class));

        });

        Constrient_CreditLimit.setOnClickListener(v -> {
            Intent i =new Intent(AccountDetail.this, Account_credit.class);
            startActivity(i);
        });

        Constrient_Info.setOnClickListener(v -> {
            Intent i=new Intent(AccountDetail.this, AdditionalInfomation.class);
            startActivity(i);
        });





    }
}