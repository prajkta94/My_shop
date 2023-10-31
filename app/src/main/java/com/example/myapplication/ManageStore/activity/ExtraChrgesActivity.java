package com.example.myapplication.ManageStore.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.ManageStore.adapter.ExtraChargeAdapter;
import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class ExtraChrgesActivity extends AppCompatActivity{
    Button Btn_SaveChnges;
    CheckBox check_ExtraCharge;
    RecyclerView Recyclerview_ExtraChargeCreate;
    Switch Check_Gst;
    LinearLayout linearlayout_Gst, Linearlay_onlineCharge,Linearlay_Percent,Linearlay_FlatCharge;
    TextInputEditText edtDelivery_chrges, edtFree_charge, edtCharge_Online, edtGstNo, edtGstNo_Percentage;
    TextView txt_extchargemsg, txt_createExtraCharge, txt_chargemsg;
    View Main_layout;
    ExtraChargeAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_chrges);

        Btn_SaveChnges = findViewById(R.id.Btn_SaveChnges);
        check_ExtraCharge = findViewById(R.id.check_ExtraCharge);
        Check_Gst = findViewById(R.id.Check_Gst);
        linearlayout_Gst = findViewById(R.id.linearlayout_Gst);
        edtCharge_Online = findViewById(R.id.edtCharge_Online);
        edtDelivery_chrges = findViewById(R.id.edtDelivery_chrges);
        edtFree_charge = findViewById(R.id.edtFree_charge);
        edtGstNo = findViewById(R.id.edtGstNo);
        edtGstNo_Percentage = findViewById(R.id.edtGstNo_Percentage);
        txt_chargemsg = findViewById(R.id.txt_chargemsg);
        txt_createExtraCharge = findViewById(R.id.txt_createExtraCharge);
        txt_extchargemsg = findViewById(R.id.txt_extchargemsg);
        Linearlay_onlineCharge = findViewById(R.id.Linearlay_onlineCharge);
//        Recyclerview_ExtraChargeCreate=findViewById(R.id.Recyclerview_ExtraChargeCreate);
//
//        Recyclerview_ExtraChargeCreate.setHasFixedSize(true);
//        Recyclerview_ExtraChargeCreate.setLayoutManager(new LinearLayoutManager(ExtraChrgesActivity.this));
//        Recyclerview_ExtraChargeCreate.setAdapter(adapter);


        edtFree_charge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                txt_chargemsg.setText(edtDelivery_chrges.getText().toString() + "will  be charged on all orders");
            }
        });

        Linearlay_onlineCharge.setVisibility(View.GONE);
        check_ExtraCharge.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (check_ExtraCharge.isChecked()) {
                    Linearlay_onlineCharge.setVisibility(View.VISIBLE);
                    edtCharge_Online.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                        }

                        @Override
                        public void afterTextChanged(Editable s) {
                            txt_extchargemsg.setText(edtCharge_Online.getText().toString() + "will be charged on all online paid orders  below " + edtFree_charge.getText().toString());

                        }
                    });
                }
            }
        });

        linearlayout_Gst.setVisibility(View.GONE);
        Check_Gst.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(Check_Gst.isChecked()){
                    linearlayout_Gst.setVisibility(View.VISIBLE);
                    Snackbar snackbar=   Snackbar.make(linearlayout_Gst,"Gst enable",Snackbar.LENGTH_SHORT);
                    View sbView=snackbar.getView();
                    sbView.setBackgroundColor(Color.GREEN);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();
                }
                else{
                    linearlayout_Gst.setVisibility(View.GONE);
                    Snackbar snackbar=   Snackbar.make(linearlayout_Gst,"Gst Disable",Snackbar.LENGTH_SHORT);
                    View sbView=snackbar.getView();
                    sbView.setBackgroundColor(Color.GREEN);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();

                }

            }
        });

        txt_createExtraCharge.setOnClickListener(v -> {

            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this,R.style.bottom_shee_dailog_theam);
            View view= LayoutInflater.from(ExtraChrgesActivity.this).
                    inflate(R.layout.createextracharge,null);
            bottomSheetDialog.setContentView(view);
            Linearlay_Percent=view.findViewById(R.id.Linearlay_Percent);
            Linearlay_FlatCharge=view.findViewById(R.id.Linearlay_FlatCharge);
            RadioButton RadioBtn_Percent=view.findViewById(R.id.RadioBtn_Percent);
            RadioButton RadioBtn_FlatCharge=view.findViewById(R.id.RadioBtn_FlatCharge);
            RadioGroup RadioGroup_checked=view.findViewById(R.id.RadioGroup_checked);
            Linearlay_FlatCharge.setVisibility(View.GONE);
           RadioBtn_Percent.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked){
                     Linearlay_Percent.setVisibility(View.VISIBLE);
                     Linearlay_FlatCharge.setVisibility(View.GONE);
                 }
                 else{

                 }
               }
           });


           RadioBtn_FlatCharge.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                   if(isChecked){

                                   Linearlay_Percent.setVisibility(View.GONE);
                                   Linearlay_FlatCharge.setVisibility(View.VISIBLE);
                               }
                   else{

                   }
               }
           });


            view.findViewById(R.id.Btn_CreateExtraCharge).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ExtraChrgesActivity.this,"Charge is created sucessfullly",Toast.LENGTH_SHORT).show();
                    bottomSheetDialog.dismiss();
                }
            });
//            view.findViewById(R.id.Signout_close).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    bottomSheetDialog.dismiss();
//                }
//            });

            bottomSheetDialog.show();

        });


    }



}