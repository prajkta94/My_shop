package com.example.myapplication.ShoppingCart.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Model.CustomerDetailAddModel;

import java.util.List;

public class CustomerAddressAdapter extends RecyclerView.Adapter<CustomerAddressAdapter.CustomerAddViewHolder> {
    List<CustomerDetailAddModel> customerDetailAddModelList;
    Context context;

    public CustomerAddressAdapter(List<CustomerDetailAddModel> customerDetailAddModelList, Context context) {
        this.customerDetailAddModelList = customerDetailAddModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomerAddViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_addaddressrecyler, parent, false);
        return new CustomerAddViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAddViewHolder holder, int position) {

      CustomerDetailAddModel customerDetailAddModel=customerDetailAddModelList.get(position);
      holder.Name_Customer.setText(customerDetailAddModel.getName_Customer());
      holder.MobileNo_Customer.setText(customerDetailAddModel.getMobileNo_Customer());
      holder.Address_Customer.setText(customerDetailAddModel.getAddress_Customer());
      holder.Pincode_Customer.setText(customerDetailAddModel.getPincode_Customer());

    }

    @Override
    public int getItemCount() {
        return customerDetailAddModelList.size();
    }

    public class CustomerAddViewHolder extends RecyclerView.ViewHolder {
        TextView  Name_Customer,MobileNo_Customer,Address_Customer,Pincode_Customer,Delete_Customer,Edit_Customer;
        public CustomerAddViewHolder(@NonNull View itemView) {
            super(itemView);
            Name_Customer=itemView.findViewById(R.id.Name_Customer);
            MobileNo_Customer=itemView.findViewById(R.id.MobileNo_Customer);
            Address_Customer=itemView.findViewById(R.id.Address_Customer);
            Pincode_Customer=itemView.findViewById(R.id.Pincode_Customer);
            Delete_Customer=itemView.findViewById(R.id.Delete_CustomerAddress);
            Edit_Customer=itemView.findViewById(R.id.Edit_CustomerAddress);


        }
    }
}
