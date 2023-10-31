package com.example.myapplication.ShoppingCart.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Model.AvailbleCuponModel;

import java.util.List;

public class AvailbleCouponAdapter extends RecyclerView.Adapter<AvailbleCouponAdapter.AvailableCouponViewHolder> {
    List<AvailbleCuponModel> availbleCuponModelList;
    Context context;

    public AvailbleCouponAdapter(List<AvailbleCuponModel> availbleCuponModelList, Context context) {
        this.availbleCuponModelList = availbleCuponModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public AvailableCouponViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cuponavailable, parent, false);
        return new AvailableCouponViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AvailableCouponViewHolder holder, int position) {

        AvailbleCuponModel availbleCuponModel=availbleCuponModelList.get(position);
        holder.AvailbleCoupon_Number.setText(availbleCuponModel.getAvailbleCoupon_Number());
        holder.AvailbleCoupon_txtoff.setText(availbleCuponModel.getAvailbleCoupon_txtoff());
        holder.AvaibleCoupon_UserPerUsed.setText(availbleCuponModel.getAvaibleCoupon_UserPerUsed());
        holder.txt_ApplyCode.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Add Coupon Sucessfully",Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return availbleCuponModelList.size();
    }

    public class AvailableCouponViewHolder extends RecyclerView.ViewHolder {
        TextView AvailbleCoupon_Number,AvailbleCoupon_txtoff,AvaibleCoupon_UserPerUsed,txt_ApplyCode;
        public AvailableCouponViewHolder(@NonNull View itemView) {
            super(itemView);
            AvailbleCoupon_Number=itemView.findViewById(R.id.AvailbleCoupon_Number);
            AvailbleCoupon_txtoff=itemView.findViewById(R.id.AvailbleCoupon_txtoff);
            AvaibleCoupon_UserPerUsed=itemView.findViewById(R.id.AvaibleCoupon_UserPerUsed);
            txt_ApplyCode=itemView.findViewById(R.id.txt_ApplyCode);
        }
    }
}
