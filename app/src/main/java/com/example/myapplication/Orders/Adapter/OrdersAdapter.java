package com.example.myapplication.Orders.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.mangeStoreAdapter;
import com.example.myapplication.Orders.OrdersDescriptionModel;
import com.example.myapplication.R;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrderViewHolder> {
    List<OrdersDescriptionModel> ordersDescriptionModelList;
    Context context;

    public OrdersAdapter(List<OrdersDescriptionModel> ordersDescriptionModelList, Context context) {
        this.ordersDescriptionModelList = ordersDescriptionModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderitem_layoutfile, parent, false);
        return new OrderViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        OrdersDescriptionModel ordersDescriptionModel=ordersDescriptionModelList.get(position);
        holder.Order_orderNo.setText(ordersDescriptionModel.getOrder_orderNo());
        holder.Order_SatusDetail.setText(ordersDescriptionModel.getOrder_SatusDetail());
        holder.order_Image.setImageResource(ordersDescriptionModel.getOrder_Image());
        holder.Order_price.setText(Integer.toString(ordersDescriptionModel.getOrder_price()));
        holder.Order_Item.setText(Integer.toString(ordersDescriptionModel.getOrder_Item()));
        holder.Order_payDetail.setText(ordersDescriptionModel.getOrder_payDetail());
        holder.Order_SatusColor.setImageResource(ordersDescriptionModel.getOrder_SatusColor());
        holder.Order_Datetime.setText(ordersDescriptionModel.getOrder_Datetime());

    }

    @Override
    public int getItemCount() {
        return ordersDescriptionModelList.size();
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        ImageView order_Image,Order_SatusColor;
        TextView Order_orderNo,Order_Datetime,Order_Item,Order_price,Order_payDetail,Order_SatusDetail,Order_Detail;
        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            Order_Item=itemView.findViewById(R.id.Order_Item);
            Order_Detail=itemView.findViewById(R.id.Order_Detail);
            Order_orderNo=itemView.findViewById(R.id.orderNo);
            Order_Datetime=itemView.findViewById(R.id.Order_Datetime);
            Order_price=itemView.findViewById(R.id.Order_price);
            Order_payDetail=itemView.findViewById(R.id.Order_payDetail);
            Order_SatusDetail=itemView.findViewById(R.id.Order_SatusDetail);
            Order_SatusColor=itemView.findViewById(R.id.Order_SatusColor);
            order_Image=itemView.findViewById(R.id.order_Image);

        }
    }
}
