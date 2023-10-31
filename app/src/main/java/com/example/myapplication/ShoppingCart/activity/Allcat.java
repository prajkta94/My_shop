package com.example.myapplication.ShoppingCart.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Adapter.CategoryItemAdapetr;
import com.example.myapplication.ShoppingCart.Model.CategoryItemModel;

import java.util.ArrayList;
import java.util.List;

public class Allcat extends AppCompatActivity {
    RecyclerView RecyclerView_CategoryList;
    CategoryItemAdapetr adapter;
    List<CategoryItemModel> categoryItemModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allcat);
        RecyclerView_CategoryList=findViewById(R.id.RecyclerView_CategoryList);


        RecyclerView_CategoryList.setHasFixedSize(true);
//        RecyclerView_Category.setLayoutManager(new LinearLayoutManager(getActivity()));
        categoryItemModelList = new ArrayList<>();

        LinearLayoutManager layoutManager = new GridLayoutManager(Allcat.this,2);
        RecyclerView_CategoryList.setLayoutManager(layoutManager);

        CategoryItemModel categoryItemModel1=new CategoryItemModel("Women",R.drawable.nopictures);
        CategoryItemModel categoryItemModel2=new CategoryItemModel("Boy's",R.drawable.nopictures);
        CategoryItemModel categoryItemModel3=new CategoryItemModel("Men",R.drawable.nopictures);
        CategoryItemModel categoryItemModel4=new CategoryItemModel("Boy's",R.drawable.nopictures);
        CategoryItemModel categoryItemModel5=new CategoryItemModel("Men",R.drawable.nopictures);
        CategoryItemModel categoryItemModel6=new CategoryItemModel("Boy's",R.drawable.nopictures);
        CategoryItemModel categoryItemModel7=new CategoryItemModel("Men",R.drawable.nopictures);
        categoryItemModelList.add(categoryItemModel1);
        categoryItemModelList.add(categoryItemModel2);
        categoryItemModelList.add(categoryItemModel3);
        categoryItemModelList.add(categoryItemModel4);
        categoryItemModelList.add(categoryItemModel5);
        categoryItemModelList.add(categoryItemModel6);
        categoryItemModelList.add(categoryItemModel7);

        adapter = new CategoryItemAdapetr( Allcat.this,(ArrayList<CategoryItemModel>) categoryItemModelList);
        RecyclerView_CategoryList.setAdapter(adapter);

    }
}