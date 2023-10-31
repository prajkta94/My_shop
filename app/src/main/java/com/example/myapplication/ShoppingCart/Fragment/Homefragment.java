package com.example.myapplication.ShoppingCart.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.myapplication.Adapter.Product_Adapter;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.Orders.Fragment.AllOrders;
import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Adapter.CategoryItemAdapetr;
import com.example.myapplication.ShoppingCart.Model.CategoryItemModel;
import com.example.myapplication.ShoppingCart.activity.Allcat;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Homefragment extends Fragment implements View.OnClickListener {
    ExtendedFloatingActionButton fab_category;
    RecyclerView RecyclerView_Category;
    CategoryItemAdapetr adapter;
    List<CategoryItemModel> categoryItemModelList;
    LinearLayout Linearlay_ViewAllCat;



    public Homefragment() {
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
        return inflater.inflate(R.layout.fragment_homefragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Linearlay_ViewAllCat=view.findViewById(R.id.Linearlay_ViewAllCat);
        Linearlay_ViewAllCat.setOnClickListener(v -> {
            Intent i=new Intent(getActivity(), Allcat.class);
            startActivity(i);
        });
        RecyclerView_Category=view.findViewById(R.id.RecyclerView_Category);

        RecyclerView_Category.setHasFixedSize(true);
//        RecyclerView_Category.setLayoutManager(new LinearLayoutManager(getActivity()));
        categoryItemModelList = new ArrayList<>();
        fab_category = view.findViewById(R.id.fab_category);
        fab_category.setOnClickListener(this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,true);
        RecyclerView_Category.setLayoutManager(layoutManager);
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

        adapter = new CategoryItemAdapetr( getActivity(),(ArrayList<CategoryItemModel>) categoryItemModelList);
        RecyclerView_Category.setAdapter(adapter);

    }
    @Override
    public void onClick(View v) {
        if(fab_category.isExtended())
        {
            fab_category.shrink();
        }
        else{
            fab_category.extend();
        }
    }
}