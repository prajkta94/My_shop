package com.example.myapplication.Account.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BussinessDetailActivity extends AppCompatActivity {
    TextInputEditText Business_Name,txtBusiness_Category,NotListedBusiness_Category;
    Button Btn_ProcessFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussiness_detail);

        Business_Name=findViewById(R.id.Business_Name);
        NotListedBusiness_Category=findViewById(R.id.NotListedBusiness_Category);
       txtBusiness_Category=findViewById(R.id.txtBusiness_Category);
       Btn_ProcessFinish=findViewById(R.id.Btn_ProcessFinish);
       Btn_ProcessFinish.setOnClickListener(v -> {
           Intent i=new Intent(BussinessDetailActivity.this, MainActivity.class);
           startActivity(i);

       });

        NotListedBusiness_Category.setVisibility(View.GONE);
        txtBusiness_Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(BussinessDetailActivity.this,R.style.bottom_shee_dailog_theam);
                View view= LayoutInflater.from(BussinessDetailActivity.this.getApplicationContext()).
                        inflate(R.layout.layout_bussinesscatagorydeatil,null);
                bottomSheetDialog.setContentView(view);
                ListView List_BusinessCat=view.findViewById(R.id.ListView_CategoryBusiness);
                String CategoryList[]={"Home Decoreation & Electric Appliances","Kirana Store","Resturants & Hotels","Fruits,Vegetables","Bakery & cake Shops",
                        "Books and Sationery Product"};
//                ListView listReason= view.findViewById(R.id.list_ReasonOption);
                final List<String> List = new ArrayList<String>(Arrays.asList(CategoryList));
                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(BussinessDetailActivity.this,R.layout.layout_listviewofflinedailogbox,R.id.txt_onlineReason ,List);

                List_BusinessCat.setAdapter(arrayAdapter);

                view.findViewById(R.id.Mybussiness_cat).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtBusiness_Category.setText("My Bussiness Category is not listed");
                        NotListedBusiness_Category.setVisibility(View.VISIBLE);
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.show();
            }

        });





    }
}