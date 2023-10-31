package com.example.myapplication.Customer.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.Product_Adapter;
import com.example.myapplication.Customer.Model.CustomerInfoModel;
import com.example.myapplication.Customer.adapter.CustomerInfoAdapter;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class AllCustomerFragment extends Fragment {
    RecyclerView RecylerView_Allcustomer;
    CustomerInfoAdapter adapter;
    List<CustomerInfoModel> customerInfoModelList;


    public AllCustomerFragment() {
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
        return inflater.inflate(R.layout.fragment_all_customer, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecylerView_Allcustomer=view.findViewById(R.id.RecylerView_Allcustomer);

        RecylerView_Allcustomer.setHasFixedSize(true);
        RecylerView_Allcustomer.setLayoutManager(new LinearLayoutManager(getActivity()));
        customerInfoModelList = new ArrayList<>();

        CustomerInfoModel customerInfoModel1=new CustomerInfoModel("John","pune",1,1);
        CustomerInfoModel customerInfoModel2=new CustomerInfoModel("John","pune",1,1);

        CustomerInfoModel customerInfoModel3=new CustomerInfoModel("John","pune",1,1);

        customerInfoModelList.add(customerInfoModel1);
        customerInfoModelList.add(customerInfoModel2);
        customerInfoModelList.add(customerInfoModel3);

        adapter = new CustomerInfoAdapter((ArrayList<CustomerInfoModel>) customerInfoModelList, getActivity());
        RecylerView_Allcustomer.setAdapter(adapter);





    }
}