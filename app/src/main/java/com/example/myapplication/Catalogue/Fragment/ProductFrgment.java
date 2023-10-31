package com.example.myapplication.Catalogue.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.Adapter.Product_Adapter;
import com.example.myapplication.Catalogue.AddProductActivity;
import com.example.myapplication.Catalogue.Catalogue;
import com.example.myapplication.Catalogue.ProductNAmeActivity;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class ProductFrgment extends Fragment {
    Button BtnAddProduct;
    RecyclerView Reycle_Product;
    Product_Adapter adapter;
    List<ProductDetail_Data> productDetail_data;
    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor myEdit;

    public ProductFrgment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_frgment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BtnAddProduct=view.findViewById(R.id.btn_AddProduct);
        Reycle_Product=view.findViewById(R.id.Reycle_Product);
        Reycle_Product.setHasFixedSize(true);
        Reycle_Product.setLayoutManager(new LinearLayoutManager(getActivity()));
        productDetail_data = new ArrayList<>();



        BtnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), ProductNAmeActivity.class);
                startActivity(i);
            }
        });

ProductDetail_Data productDetail_data1=new ProductDetail_Data("Jar","PP","InStock","40","30","1 piece");
        ProductDetail_Data productDetail_data2=new ProductDetail_Data("Jar","PP","InStock","40","30","1 piece");

        ProductDetail_Data productDetail_data3=new ProductDetail_Data("Jar","PP","InStock","40","30","1 piece");

        productDetail_data.add(productDetail_data1);

        productDetail_data.add(productDetail_data2);
        productDetail_data.add(productDetail_data3);

        adapter = new Product_Adapter((ArrayList<ProductDetail_Data>) productDetail_data, getActivity());
        Reycle_Product.setAdapter(adapter);
//        String name=Intent.getIntent().getStringExtra("productName");
//        String category=Intent.getIntent().getStringExtra("ProductCategory");


    }

}