package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.Adapter.mangeStoreAdapter;
import com.example.myapplication.MODEL.CategoryDetail_Data;
import com.example.myapplication.MODEL.MangeData;

import java.util.ArrayList;
import java.util.List;

public class MnageStore extends AppCompatActivity {
    RecyclerView Recycleview_Store;

    List<MangeData> mangeDataList;
    mangeStoreAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnage_store);
        Recycleview_Store = findViewById(R.id.Recycleview_Store);
        Recycleview_Store.setHasFixedSize(true);

        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        Recycleview_Store.setLayoutManager(layoutManager);
//        Recycleview_Store.setLayoutManager(new GridLayoutManager(this,2));
        mangeDataList = new ArrayList<>();

//     String NameEntity[]={"Promotional Designs","MyCustomer","order From"};
//     int Imagelogo[]={R.drawable.nopictures,R.drawable.nopictures};

        MangeData mangeData1=new MangeData("Promotional Designs",R.drawable.design);
        MangeData mangeData2=new MangeData("MyCustomer",R.drawable.customer);
        MangeData mangeData3=new MangeData("order From",R.drawable.order2);
        MangeData mangeData4=new MangeData("Discount Coupons",R.drawable.discount2);
        MangeData mangeData5=new MangeData("Extra Charges",R.drawable.discount2);
        MangeData mangeData6=new MangeData("Online Payment",R.drawable.pay1);
        MangeData mangeData7=new MangeData("Plugins",R.drawable.discount2);
        MangeData mangeData8=new MangeData("Themes ",R.drawable.discount2);
        MangeData mangeData9=new MangeData("Marketing",R.drawable.discount2);
        MangeData mangeData10=new MangeData("Delivery",R.drawable.deliver);
        MangeData mangeData11=new MangeData("Store QR Code",R.drawable.qrcode);



        mangeDataList.add(mangeData1);
        mangeDataList.add(mangeData2);
        mangeDataList.add(mangeData3);
        mangeDataList.add(mangeData4);
        mangeDataList.add(mangeData5);
        mangeDataList.add(mangeData6);
        mangeDataList.add(mangeData7);
        mangeDataList.add(mangeData8);
        mangeDataList.add(mangeData9);
        mangeDataList.add(mangeData10);
        mangeDataList.add(mangeData11);


        adapter=new mangeStoreAdapter(this, (ArrayList<MangeData>) mangeDataList);
        Recycleview_Store.setAdapter(adapter);




    }
}