package com.example.myapplication.ShoppingCart.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.myapplication.R;

public class PaymentOrder extends AppCompatActivity {
    Switch paymentSwitch;
    Button Btn_PlaceOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_payment_order);
        paymentSwitch=findViewById(R.id.paymentSwitch);
        Btn_PlaceOrder=findViewById(R.id.Btn_PlaceOrder);
        paymentSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(PaymentOrder.this,"Cash On Delivery",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(PaymentOrder.this,"Online Payment",Toast.LENGTH_SHORT).show();
                }
            }
        });



        Btn_PlaceOrder.setOnClickListener(v -> {
            startActivity(new Intent(PaymentOrder.this,OrderSuccessfulPage.class));
            Toast.makeText(PaymentOrder.this,"Your order is Placed",Toast.LENGTH_SHORT).show();


        });


    }
}