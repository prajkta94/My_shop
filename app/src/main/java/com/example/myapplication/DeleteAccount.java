package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.myapplication.Catalogue.AddProductDescription;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DeleteAccount extends AppCompatActivity {
    TextInputEditText edt_ResonsforDelete;
    LinearLayout Linearlayout_otp,Linearlayout_getOtp;
    Button Btn_GetOtp,Btn_Delete;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_account);
        edt_ResonsforDelete=findViewById(R.id.edt_ResonsforDelete);
        Linearlayout_otp=findViewById(R.id.Linearlayout_otp);
        Linearlayout_getOtp=findViewById(R.id.Linearlayout_getOtp);
        Linearlayout_otp.setVisibility(View.GONE);
        Linearlayout_getOtp.setVisibility(View.GONE);
        Btn_Delete=findViewById(R.id.Btn_Delete);
        Btn_GetOtp=findViewById(R.id.Btn_GetOtp);
        edt_ResonsforDelete.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(DeleteAccount.this,R.style.bottom_shee_dailog_theam);
            View view= LayoutInflater.from(DeleteAccount.this).
                    inflate(R.layout.popupreasonfordeletion,(LinearLayout)findViewById(R.id.bottom_sheet_layout));
            bottomSheetDialog.setContentView(view);
            String ReasonsDeletion[]={"Too many bugs","App is difficult to use","Using other app for my store","Concerned about my data",
            "Created a second account","Something else"};
            ListView listReason= view.findViewById(R.id.list_ReasonOption);
            final List<String> List = new ArrayList<String>(Arrays.asList(ReasonsDeletion));
            final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(DeleteAccount.this,R.layout.simple_list_view,R.id.chck ,List);

            listReason.setAdapter(arrayAdapter);

            listReason.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String reason=(arrayAdapter.getItem(position));
                    edt_ResonsforDelete.setText(reason);
                    bottomSheetDialog.dismiss();
                }
            });

            bottomSheetDialog.show();
        });

   edt_ResonsforDelete.addTextChangedListener(new TextWatcher() {
       @Override
       public void beforeTextChanged(CharSequence s, int start, int count, int after) {

       }

       @Override
       public void onTextChanged(CharSequence s, int start, int before, int count) {

       }

       @Override
       public void afterTextChanged(Editable s) {
           Linearlayout_otp.setVisibility(View.VISIBLE);


       }
   });

   Btn_GetOtp.setOnClickListener(v -> {
       Linearlayout_getOtp.setVisibility(View.VISIBLE);
       Linearlayout_otp.setVisibility(View.GONE);
   });
Btn_Delete.setOnClickListener(v -> {
    Intent i = new Intent(DeleteAccount.this,DeletePage.class);
    startActivity(i);
});


    }
}