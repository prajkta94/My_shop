package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.CoupondetailDelete;
import com.example.myapplication.CreateDiscountCupons;
import com.example.myapplication.MODEL.CouponDataModel;
import com.example.myapplication.MODEL.MangeData;
import com.example.myapplication.R;

import java.util.List;

public class AdapterCreateCupon extends RecyclerView.Adapter<AdapterCreateCupon.CouponViewholder> {
    Context context;
    List<CouponDataModel> couponDataModelList;

    public AdapterCreateCupon(Context context, List<CouponDataModel> couponDataModelList) {
        this.context = context;
        this.couponDataModelList = couponDataModelList;
    }

    @NonNull
    @Override
    public CouponViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.couponscreatedlayout, parent, false);
        return new CouponViewholder(v);

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull CouponViewholder holder, int position) {
        CouponDataModel couponDataModel= couponDataModelList.get(position);
        holder.Coupon_id.setText(couponDataModel.getCoupon_id());
        holder.Coupon_desc.setText(couponDataModel.getCoupon_Desc());
//        holder.Coupon_Timeused.setText(couponDataModel.getCoupon_Used());
//        holder.Coupon_Sales.setText(couponDataModel.getCoupon_SaleGenerated());
        holder.cardView_Coupon.setOnClickListener(v -> {
            Intent i =new Intent(context, CoupondetailDelete.class);
            context.startActivity(i);
        });

        holder.Share_cupon.setOnClickListener(v -> {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
//           sendIntent.putExtra(Intent.ACTION_GET_CONTENT,holder.cardView_Coupon.getAutofillValue().toString());

            sendIntent.setType("images/*");
            Intent.createChooser(sendIntent,"Share via");
            context.startActivity(sendIntent);
        });

        holder.Check_Coupon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(context, "Valid", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(context,"Invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return couponDataModelList.size();
    }

    public class CouponViewholder extends RecyclerView.ViewHolder{
        TextView Coupon_id,Coupon_desc,Coupon_Timeused,Coupon_Sales,Share_cupon;
        CardView cardView_Coupon;
        SwitchCompat Check_Coupon;
        public CouponViewholder(@NonNull View itemView) {
            super(itemView);
            Coupon_id=itemView.findViewById(R.id.Coupon_id);
            Coupon_desc=itemView.findViewById(R.id.Desciption_off);
            Coupon_Timeused=itemView.findViewById(R.id.No_TimeUsed);
            Coupon_Sales=itemView.findViewById(R.id.Sales_genrated);
            cardView_Coupon=itemView.findViewById(R.id.cardView_Coupon);
            Share_cupon=itemView.findViewById(R.id.Share_cupon);
            Check_Coupon=itemView.findViewById(R.id.Switch_Sharecoupon);
        }
    }
}
