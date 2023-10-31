package com.example.myapplication.ManageStore.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.Product_Adapter;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.ManageStore.Model.PluginModel;
import com.example.myapplication.ManageStore.adapter.PluginAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Plugin_Activity extends AppCompatActivity {
    RecyclerView RecylerView_Plugin;
    PluginAdapter adapter;
    List<PluginModel> pluginModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin);
        RecylerView_Plugin=findViewById(R.id.RecylerView_Plugin);
        RecylerView_Plugin.setHasFixedSize(true);
        RecylerView_Plugin.setLayoutManager(new LinearLayoutManager(Plugin_Activity.this));
        pluginModelList = new ArrayList<>();

        PluginModel pluginModel=new PluginModel("Facebook Pixcel","PP",R.drawable.facebooklogo);
        PluginModel pluginModel1=new PluginModel("Google Analystics","PP",R.drawable.nopictures);

        PluginModel pluginModel2=new PluginModel("Pincode/Distance Based Delivary","PP",R.drawable.nopictures);

        pluginModelList.add(pluginModel);

        pluginModelList.add(pluginModel1);
        pluginModelList.add(pluginModel2);

        adapter = new PluginAdapter((ArrayList<PluginModel>) pluginModelList, Plugin_Activity.this);
        RecylerView_Plugin.setAdapter(adapter);




    }
}