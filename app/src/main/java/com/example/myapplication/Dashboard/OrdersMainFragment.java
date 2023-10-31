package com.example.myapplication.Dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Orders.Fragment.AllOrders;
import com.example.myapplication.R;


public class OrdersMainFragment extends Fragment {



    public OrdersMainFragment() {
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
        return inflater.inflate(R.layout.fragment_orders_main, container, false);

//        getSupportActionBar().setTitle("Orders");
//        view.getSupportFragmentManager().beginTransaction()
//
//                .add(R.id.layout,new AllOrders()).commit();


    }
}