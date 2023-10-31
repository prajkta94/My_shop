package com.example.myapplication.Orders.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.Customer.Model.CustomerInfoModel;
import com.example.myapplication.Customer.adapter.CustomerInfoAdapter;
import com.example.myapplication.Orders.Adapter.OrdersAdapter;
import com.example.myapplication.Orders.OrdersDescriptionModel;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class AllOrders extends Fragment {

Spinner SpineAllOrders;
RecyclerView Recycle_Allorders;
    OrdersAdapter adapter;
    List<OrdersDescriptionModel> ordersDescriptionModelList;
String s[]={"This week","Today","Yesterday","This Month","Life Time","Custom range"};
    public AllOrders() {
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
        return inflater.inflate(R.layout.fragment_all_orders, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SpineAllOrders=view.findViewById(R.id.spine_allOrders);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getContext(),R.layout.support_simple_spinner_dropdown_item,s);
        SpineAllOrders.setAdapter(arrayAdapter);
        Recycle_Allorders=view.findViewById(R.id.Recycle_Allorders);
        Recycle_Allorders.setHasFixedSize(true);
        Recycle_Allorders.setLayoutManager(new LinearLayoutManager(getActivity()));
        ordersDescriptionModelList = new ArrayList<>();

        OrdersDescriptionModel ordersDescriptionModel1=new OrdersDescriptionModel("#12345","24dec11.40Am","COD","Rejected","Details",1230,R.drawable.circleshape,R.drawable.nopictures,8);
        OrdersDescriptionModel ordersDescriptionModel2=new OrdersDescriptionModel("#12345","24dec11.40Am","COD","Rejected","Details",1230,R.drawable.circleshape,R.drawable.nopictures,8);
        OrdersDescriptionModel ordersDescriptionModel3=new OrdersDescriptionModel("#12345","24dec11.40Am","COD","Rejected","Details",1230,R.drawable.circleshape,R.drawable.nopictures,8);
        OrdersDescriptionModel ordersDescriptionModel4=new OrdersDescriptionModel("#12345","24dec11.40Am","COD","Rejected","Details",1230,R.drawable.circleshape,R.drawable.nopictures,8);

        ordersDescriptionModelList.add(ordersDescriptionModel1);
        ordersDescriptionModelList.add(ordersDescriptionModel2);
        ordersDescriptionModelList.add(ordersDescriptionModel3);
        ordersDescriptionModelList.add(ordersDescriptionModel4);

        adapter = new OrdersAdapter((ArrayList<OrdersDescriptionModel>) ordersDescriptionModelList, getActivity());
        Recycle_Allorders.setAdapter(adapter);




    }
}