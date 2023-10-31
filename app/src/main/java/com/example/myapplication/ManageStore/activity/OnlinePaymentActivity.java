package com.example.myapplication.ManageStore.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myapplication.R;

public class OnlinePaymentActivity extends AppCompatActivity {

    LinearLayout Linearlay_BankInfo,Linearlay_Upiinfo;
    RadioButton RadioBtn_upiinfo,RadioBtn_bankinfo;
    RadioGroup RadioGroup_payment;
    Button Btn_verifyAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_payment);

        Linearlay_BankInfo=findViewById(R.id.Linearlay_BankInfo);
        Linearlay_Upiinfo=findViewById(R.id.Linearlay_Upiinfo);
        RadioBtn_bankinfo=findViewById(R.id.RadioBtn_bankinfo);
        RadioBtn_upiinfo=findViewById(R.id.RadioBtn_upiinfo);
        RadioGroup_payment=findViewById(R.id.RadioGroup_payment);
        Btn_verifyAccount=findViewById(R.id.Btn_verifyAccount);

        Linearlay_BankInfo.setVisibility(View.GONE);
        RadioGroup_payment.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.RadioBtn_upiinfo:

        Linearlay_Upiinfo.setVisibility(View.VISIBLE);
        Linearlay_BankInfo.setVisibility(View.GONE);
                break;
                    case R.id.RadioBtn_bankinfo:
                Linearlay_BankInfo.setVisibility(View.VISIBLE);
                Linearlay_Upiinfo.setVisibility(View.GONE);
                break;
                }

            }
        });

        Btn_verifyAccount.setOnClickListener(v -> {
            Toast.makeText(OnlinePaymentActivity.this, "Verify your Account Sucessfully", Toast.LENGTH_SHORT).show();
        });

//        RadioBtn_bankinfo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//
//                    Linearlay_BankInfo.setVisibility(View.VISIBLE);
//                    Linearlay_Upiinfo.setVisibility(View.GONE);
//
//                }
//                else{
//
//
//                }
//            }
//        });
//
//RadioBtn_upiinfo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//    @Override
//    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        if (isChecked) {
//            Linearlay_Upiinfo.setVisibility(View.VISIBLE);
//
//        }
//        else{
//
//        }
//    }
//});
    }
}