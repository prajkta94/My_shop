package com.example.myapplication.ShoppingCart.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.MODEL.CategoryDetail_Data;
import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Adapter.CustomerAddressAdapter;
import com.example.myapplication.ShoppingCart.Model.CustomerDetailAddModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MyAddressPage extends AppCompatActivity {
    LinearLayout Linear_AddressLay;
   Button Btn_ContinueAddress;
   RecyclerView RecyclerView_CustomerAddres;
    CustomerAddressAdapter adapter;
    List<CustomerDetailAddModel> customerDetailAddModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_address_page);

        Btn_ContinueAddress=findViewById(R.id.Btn_ContinueAddress);
        Linear_AddressLay=findViewById(R.id.Linear_AddressLay);
        Linear_AddressLay.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this,R.style.bottom_shee_dailog_theam);
            View view1= LayoutInflater.from(MyAddressPage.this).
                    inflate(R.layout.addressdailogbox,null);
            bottomSheetDialog.setContentView(view1);
            view1.findViewById(R.id.Add_custAddress).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MyAddressPage.this, "Your Address is sucessfully Added", Toast.LENGTH_SHORT).show();
                    bottomSheetDialog.dismiss();
                }
            });
            bottomSheetDialog.show();
        });

        Btn_ContinueAddress.setOnClickListener(v -> {
            Intent i=new Intent(MyAddressPage.this, PaymentOrder.class);
            startActivity(i);

        });

        RecyclerView_CustomerAddres=findViewById(R.id.RecyclerView_CustomerAddres);
        RecyclerView_CustomerAddres.setHasFixedSize(true);

        customerDetailAddModelList =new ArrayList<>();
        RecyclerView_CustomerAddres.setLayoutManager(new LinearLayoutManager(MyAddressPage.this));

        CustomerDetailAddModel customerDetailAddModel1=new CustomerDetailAddModel("Prjj","9887563562","Mumbai","400099");
        CustomerDetailAddModel customerDetailAddModel2=new CustomerDetailAddModel("Prjj","9887563562","Mumbai","400099");
        CustomerDetailAddModel customerDetailAddModel3=new CustomerDetailAddModel("Prjj","9887563562","Mumbai","400099");


        customerDetailAddModelList.add(customerDetailAddModel1);
        customerDetailAddModelList.add(customerDetailAddModel2);
        customerDetailAddModelList.add(customerDetailAddModel3);


        adapter = new CustomerAddressAdapter(customerDetailAddModelList,MyAddressPage.this);
        RecyclerView_CustomerAddres.setAdapter(adapter);
    }
}