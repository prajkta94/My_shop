package com.example.myapplication.Catalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputEditText;

public class ProductNAmeActivity extends AppCompatActivity {
    TextInputEditText Product_NAme;
    Button BtnContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_name);
        Product_NAme=findViewById(R.id.product_name);
        Product_NAme.clearFocus();
        BtnContinue=findViewById(R.id.btn_continue);


        Product_NAme.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().trim().length()==0){
                    BtnContinue.setVisibility(View.INVISIBLE);
                }
                else{
                    BtnContinue.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
BtnContinue.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {



        Intent i=new Intent(ProductNAmeActivity.this,AddProductDescription.class);
        i.putExtra("ProductName",Product_NAme.getText().toString());
        startActivity(i);


    }
});










    }




}