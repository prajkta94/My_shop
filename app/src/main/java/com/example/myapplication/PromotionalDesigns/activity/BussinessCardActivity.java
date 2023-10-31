package com.example.myapplication.PromotionalDesigns.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.Product_Adapter;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.PromotionalDesigns.Adapter.BusinessCardAdapter;
import com.example.myapplication.PromotionalDesigns.Model.BussinesCardModel;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class BussinessCardActivity extends AppCompatActivity {
    RecyclerView RecylerView_BusinessCard;
    BusinessCardAdapter adapter;
    List<BussinesCardModel> bussinesCardModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussiness_card);
        RecylerView_BusinessCard=findViewById(R.id.RecylerView_BusinessCard);
        RecylerView_BusinessCard.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        RecylerView_BusinessCard.setLayoutManager(layoutManager);
        bussinesCardModelList = new ArrayList<>();

        BussinesCardModel bussinesCardModel1=new BussinesCardModel("9420491091","Gramentshop","logo","https/:jfhsjfhjs");
        BussinesCardModel bussinesCardModel2=new BussinesCardModel("252512005","Gramentshop","Logo","https/:jfhsjfhjs");

        BussinesCardModel bussinesCardModel3=new BussinesCardModel("501205812","Gramentshop","Logo","https/:jfhsjfhjs");
        BussinesCardModel bussinesCardModel5=new BussinesCardModel("9420491091","Gramentshop","logo","https/:jfhsjfhjs");
        BussinesCardModel bussinesCardModel6=new BussinesCardModel("252512005","Gramentshop","Logo","https/:jfhsjfhjs");

        BussinesCardModel bussinesCardModel7=new BussinesCardModel("501205812","Gramentshop","Logo","https/:jfhsjfhjs");

        bussinesCardModelList.add(bussinesCardModel1);
        bussinesCardModelList.add(bussinesCardModel2);
        bussinesCardModelList.add(bussinesCardModel3);
        bussinesCardModelList.add(bussinesCardModel5);
        bussinesCardModelList.add(bussinesCardModel6);
        bussinesCardModelList.add(bussinesCardModel7);


        adapter = new BusinessCardAdapter((ArrayList<BussinesCardModel>) bussinesCardModelList, this);
        RecylerView_BusinessCard.setAdapter(adapter);


    }
}