package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class CreateDiscountCupons extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    TextView txt_Discription;
    SwitchCompat switch_coupon;
    RadioButton radio_Percent,radio_Discount;
    ConstraintLayout Constrient_layPercent;
    LinearLayout lay_FlatDiscount;
    RadioGroup Radio_groupCoupon;
    TextInputEditText Percent_cupons,Discount_cupons,MaxDiscount_cupons,Dis_amount,MinAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_discount_cupons);

        txt_Discription=findViewById(R.id.txt_Discription);
        switch_coupon=findViewById(R.id.switch_coupon);
        radio_Percent=findViewById(R.id.radio_Percent);
        radio_Discount=findViewById(R.id.radio_Discount);
        lay_FlatDiscount=findViewById(R.id.lay_FlatDiscount);
        Constrient_layPercent=findViewById(R.id.Constrient_layPercent);
        Radio_groupCoupon=findViewById(R.id.Radio_groupCoupon);
        Radio_groupCoupon.setOnCheckedChangeListener(this);
        Percent_cupons=findViewById(R.id.Percent_cupons);
        Discount_cupons=findViewById(R.id.Discount_cupons);
        MaxDiscount_cupons=findViewById(R.id.MaxDiscount_cupons);
        Dis_amount=findViewById(R.id.Dis_amount);
        MinAmount=findViewById(R.id.MinAmount);

        lay_FlatDiscount.setVisibility(View.GONE);


//        radio_Percent.setOnClickListener(v -> {
//
//            Constrient_layPercent.findViewById(R.id.Constrient_layPercent).setVisibility(View.VISIBLE);
//            lay_FlatDiscount.setVisibility(View.GONE);
//
//
//        });
//
//        radio_Discount.setOnClickListener(v -> {
//            lay_FlatDiscount.findViewById(R.id.lay_FlatDiscount).setVisibility(View.VISIBLE);
//            Constrient_layPercent.setVisibility(View.GONE);
//        });



        switch_coupon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(CreateDiscountCupons.this, "used for customer", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(CreateDiscountCupons.this,"Not used for customer",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId){
            case R.id.radio_Percent:
                Constrient_layPercent.findViewById(R.id.Constrient_layPercent).setVisibility(View.VISIBLE);
                lay_FlatDiscount.setVisibility(View.GONE);
                MaxDiscount_cupons.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }
                    @Override
                    public void afterTextChanged(Editable s) {
                if((!Percent_cupons.getText().toString().isEmpty()) && (!Discount_cupons.getText().toString().isEmpty())&&(! MaxDiscount_cupons.getText().toString().isEmpty())){
                        txt_Discription.setText(Percent_cupons.getText().toString()+" off on all orders above"+ Discount_cupons.getText().toString()+" upto"+ MaxDiscount_cupons.getText().toString());
                }
                    }
                });
                break;
            case R.id.radio_Discount:
                lay_FlatDiscount.findViewById(R.id.lay_FlatDiscount).setVisibility(View.VISIBLE);
                Constrient_layPercent.setVisibility(View.GONE);

                MinAmount.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        if((!Dis_amount.getText().toString().isEmpty())&&(!MinAmount.getText().toString().isEmpty())){
                            txt_Discription.setText(Dis_amount.getText().toString()+" of on all orders above "+MinAmount.getText().toString());
                        }
                    }

                    @Override
                    public void afterTextChanged(Editable s) {


                    }
                });

                break;
        }

    }
}