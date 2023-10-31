package com.example.myapplication.Customer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.AdapterCreateCupon;
import com.example.myapplication.Customer.Model.CustomerInfoModel;
import com.example.myapplication.R;

import java.util.List;

public class CustomerInfoAdapter extends RecyclerView.Adapter<CustomerInfoAdapter.CustomerViewHolder> {

    List<CustomerInfoModel> customerInfoModelList;
    Context context;

    public CustomerInfoAdapter(List<CustomerInfoModel> customerInfoModelList, Context context) {
        this.customerInfoModelList = customerInfoModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.customerdiscription_layout, parent, false);
        return new CustomerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerViewHolder holder, int position) {

        CustomerInfoModel customerInfoModel=customerInfoModelList.get(position);
        holder.Name_customer.setText(customerInfoModel.getName_Customer());
        holder.Address_customer.setText(customerInfoModel.getAddres_Custmer());
        holder.TotalOrsder_customer.setText(Integer.toString(customerInfoModel.getToatlOrders_Customer()));
        holder.TotalSales_customer.setText(Integer.toString(customerInfoModel.getTotal_Sales()));

    }

    @Override
    public int getItemCount() {
        return customerInfoModelList.size();
    }

    public class CustomerViewHolder extends RecyclerView.ViewHolder{
        TextView Name_customer,Address_customer,TotalOrsder_customer,TotalSales_customer;
        public CustomerViewHolder(@NonNull View itemView) {
            super(itemView);
            Name_customer=itemView.findViewById(R.id.txt_custName);
            Address_customer=itemView.findViewById(R.id.txt_custAddress);
            TotalOrsder_customer=itemView.findViewById(R.id.txt_totalOrder);
            TotalSales_customer=itemView.findViewById(R.id.txt_totalSales);

        }
    }
}
