package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DiscountCupons;
import com.example.myapplication.MODEL.MangeData;
import com.example.myapplication.Customer.activity.MyCustomer;
import com.example.myapplication.ManageStore.activity.ExtraChrgesActivity;
import com.example.myapplication.ManageStore.activity.MarketingActivity;
import com.example.myapplication.ManageStore.activity.OnlinePaymentActivity;
import com.example.myapplication.ManageStore.activity.OrderForm;
import com.example.myapplication.ManageStore.activity.Plugin_Activity;
import com.example.myapplication.ManageStore.activity.PromotionalDesign;
import com.example.myapplication.ManageStore.activity.QRCode;
import com.example.myapplication.ManageStore.activity.SetUp_DeliveryActivity;
import com.example.myapplication.R;

import java.util.List;

public class mangeStoreAdapter extends RecyclerView.Adapter<mangeStoreAdapter.MangeStore> {
    Context context;
    List<MangeData> mangeStoreArrayList;

    public mangeStoreAdapter(Context context, List<MangeData> mangeStoreArrayList) {
        this.context = context;
        this.mangeStoreArrayList = mangeStoreArrayList;
    }

    @NonNull
    @Override
    public MangeStore onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mangestoreitem, parent, false);
        return new MangeStore(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MangeStore holder, int position) {
        MangeData mangeData= mangeStoreArrayList.get(position);
       holder.NameEntity.setText(mangeData.getNameEntityList());
       holder.Imagelogo.setImageResource(mangeData.getImageList());

       holder.cardView.setOnClickListener(v -> {
           if(position==3){
               Intent i=new Intent(context, DiscountCupons.class);
               context.startActivity(i);
           }
           else if(position==1){
               Intent i=new Intent(context, MyCustomer.class);
               context.startActivity(i);

           }
           else if(position==0){
               Intent i=new Intent(context, PromotionalDesign.class);
               context.startActivity(i);

           }
           else if(position==2){
               Intent i=new Intent(context, OrderForm.class);
               context.startActivity(i);

           }
           else if(position==4){
               Intent i=new Intent(context, ExtraChrgesActivity.class);
               context.startActivity(i);

           }
           else if(position==10){
               Intent i=new Intent(context, QRCode.class);
               context.startActivity(i);

           }
           else if(position==5) {
               Intent i = new Intent(context, OnlinePaymentActivity.class);
               context.startActivity(i);


           }
           else if(position==8){
               Intent i=new Intent(context, MarketingActivity.class);
               context.startActivity(i);

           }
           else if(position==9){
               Intent i=new Intent(context, SetUp_DeliveryActivity.class);
               context.startActivity(i);

           }
           else if(position==6){
               Intent i=new Intent(context, Plugin_Activity.class);
               context.startActivity(i);

           }
       });
    }

    @Override
    public int getItemCount() {
        return mangeStoreArrayList.size();
    }

    public class MangeStore extends RecyclerView.ViewHolder{
        ImageView Imagelogo;
        TextView NameEntity;
        CardView cardView;
        public MangeStore(@NonNull View itemView) {
            super(itemView);
            Imagelogo=itemView.findViewById(R.id.imagestore);
            NameEntity=itemView.findViewById(R.id.textstore);
            cardView=itemView.findViewById(R.id.cardviewMangeStore);
        }
    }
}
