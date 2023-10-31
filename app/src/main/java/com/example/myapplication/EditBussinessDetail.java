package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class EditBussinessDetail extends AppCompatActivity {
    TextView delete_Account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_bussiness_detail);
        delete_Account=findViewById(R.id.delete_Account);
        delete_Account.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this,R.style.bottom_shee_dailog_theam);
            View view= LayoutInflater.from(EditBussinessDetail.this).
                    inflate(R.layout.delete_myaccount,null);
            bottomSheetDialog.setContentView(view);
            CheckBox checkBox=view.findViewById(R.id.check_delete);
//            if(checkBox.isChecked()) {
                view.findViewById(R.id.delete_continue).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(EditBussinessDetail.this,DeleteAccount.class);
                        startActivity(i);
                        finish();
                        bottomSheetDialog.dismiss();
                   }
                });
//        }
                bottomSheetDialog.show();


        });
    }
}