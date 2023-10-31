package com.example.myapplication.Catalogue.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.Adapter.Product_Adapter;
import com.example.myapplication.Catalogue.AddNewCategory;
import com.example.myapplication.Catalogue.ProductNAmeActivity;
import com.example.myapplication.MODEL.CategoryDetail_Data;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class Categories extends Fragment {
    Button BtnAddCategory;
    RecyclerView Reycle_Category;

    CategoriesAdapter adapter;
    List<CategoryDetail_Data> categoryDetail_dataArrayList;


    public Categories() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BtnAddCategory=view.findViewById(R.id.btn_AddCtagory);
        Reycle_Category=view.findViewById(R.id.Reycle_Category);
        Reycle_Category.setHasFixedSize(true);
        Reycle_Category.setLayoutManager(new LinearLayoutManager(getActivity()));
        categoryDetail_dataArrayList = new ArrayList<>();

        BtnAddCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), AddNewCategory.class);
                startActivity(i);
            }
        });

        CategoryDetail_Data categoryDetail_dataList1=new CategoryDetail_Data("jar","3","In Stock",R.drawable.nopictures);
        CategoryDetail_Data categoryDetail_dataList2=new CategoryDetail_Data("jar","3","In Stock",R.drawable.nopictures);

        categoryDetail_dataArrayList.add(categoryDetail_dataList1);
        categoryDetail_dataArrayList.add(categoryDetail_dataList2);
        categoryDetail_dataArrayList.add(categoryDetail_dataList1);
        adapter = new CategoriesAdapter(categoryDetail_dataArrayList,getActivity());
        Reycle_Category.setAdapter(adapter);

//        ItemTouchHelper.Callback callback = new CategoriesAdapter(adapter);
//        ItemTouchHelper helper = new ItemTouchHelper(callback);
//        helper.attachToRecyclerView(Reycle_Category);

    }
}