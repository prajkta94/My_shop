package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.Adapter.AdapterCreateCupon;
import com.example.myapplication.Adapter.Product_Adapter;
import com.example.myapplication.MODEL.CouponDataModel;
import com.example.myapplication.MODEL.MangeData;
import com.example.myapplication.MODEL.ProductDetail_Data;

import java.util.ArrayList;
import java.util.List;

public class DiscountCupons extends AppCompatActivity {
    Button Btn_CouponCreate;
    RecyclerView recyclerView;
    AdapterCreateCupon adapterCreateCupon;
    List<CouponDataModel> couponDataModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_cupons);
        Btn_CouponCreate=findViewById(R.id.Btn_CouponCreate);
        Btn_CouponCreate.setOnClickListener(v -> {
            Intent i =new Intent(DiscountCupons.this,CreateDiscountCupons.class);
            startActivity(i);
        });
        recyclerView=findViewById(R.id.Recyclerview_Coupon);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(DiscountCupons.this));
        couponDataModelList = new ArrayList<>();

        CouponDataModel couponDataModel1=new CouponDataModel("54098","20off5500",0,0);
        CouponDataModel couponDataModel2=new CouponDataModel("69090","20off5500",0,0);
        CouponDataModel couponDataModel3=new CouponDataModel("87979","20off5500",0,0);
        CouponDataModel couponDataModel4=new CouponDataModel("64639","20off5500",0,0);
        CouponDataModel couponDataModel5=new CouponDataModel("983963","20off5500",0,0);
        couponDataModelList.add(couponDataModel1);
        couponDataModelList.add(couponDataModel2);
        couponDataModelList.add(couponDataModel3);
        couponDataModelList.add(couponDataModel4);
        couponDataModelList.add(couponDataModel5);
        adapterCreateCupon = new AdapterCreateCupon(this,couponDataModelList);
        recyclerView.setAdapter(adapterCreateCupon);
    }
}