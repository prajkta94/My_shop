package com.example.myapplication.PromotionalDesigns.Adapter;

import static com.example.myapplication.R.color.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.PromotionalDesigns.Model.BussinesCardModel;
import com.example.myapplication.R;

import java.util.List;

public class BusinessCardAdapter extends RecyclerView.Adapter<BusinessCardAdapter.BusinessCardInfo> {
    List<BussinesCardModel> bussinesCardModelList;
    Context context;

    public BusinessCardAdapter(List<BussinesCardModel> bussinesCardModelList, Context context) {
        this.bussinesCardModelList = bussinesCardModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public BusinessCardInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cradviewlayout_bussinesscard, parent, false);
        return new BusinessCardInfo(v);
    }

    @SuppressLint({"ResourceAsColor", "ResourceType"})
    @Override
    public void onBindViewHolder(@NonNull BusinessCardInfo holder, int position) {
        BussinesCardModel bussinesCardModel=bussinesCardModelList.get(position);

        holder.Business_Number.setText(bussinesCardModel.getBussinessCard_PhoneNumber());
        holder.Business_NameOfShop.setText(bussinesCardModel.getBusinessCard_NameofShop());
        holder.Business_AppLink.setText(bussinesCardModel.getBussinessCard_Aaplink());
        holder.Bussiness_LogoOfShop.setText(bussinesCardModel.getBussinessCard_Logo());
//        holder.itemLabel.text = listItems[position]
//        holder.itemView.setOnClickListener(); {
//            selectedItemPosition = position
//            notifyDataSetChanged()
//        }

        switch (position){
            case 0:
//                holder.Bussiness_card.setCardBackgroundColor(R.drawable.circleshape);
                holder.Bussiness_card.setBackgroundResource(R.drawable.card_back4);
                break;

            case 1:
                holder.Bussiness_card.setBackgroundResource(R.drawable.card2_businesscard);
                break;

            case 2:
                holder.Bussiness_card.setBackgroundResource(R.drawable.card_back);
                break;
            case 3:
                holder.Bussiness_card.setBackgroundResource(R.drawable.card3_businesscard3);
                break;
            case 4:
                holder.Bussiness_card.setBackgroundResource(R.drawable.card_back1);
                break;
            case 5:
                holder.Bussiness_card.setBackgroundResource(R.drawable.card_back3);
                break;



        }


//        if(position==0){
//            holder.Bussiness_card.setCardBackgroundColor(green_cardcolor);
//        }
//         else if(position==1){
//            holder.Bussiness_card.setCardBackgroundColor(R.drawable.card3_businesscard3);
//        }
//         else if(position==2){
////            holder.Bussiness_card.setCardBackgroundColor(R.drawable.card3_businesscard3);
//            holder.Bussiness_card.setCardBackgroundColor(R.drawable.adlogo);
//        }
    }

    @Override
    public int getItemCount() {
        return bussinesCardModelList.size();
    }

    public class BusinessCardInfo extends RecyclerView.ViewHolder {
        TextView Business_Number,Business_NameOfShop,Business_AppLink,Bussiness_LogoOfShop;
        CardView Bussiness_card;
        public BusinessCardInfo(@NonNull View itemView) {
            super(itemView);
            Business_Number=itemView.findViewById(R.id.Business_Number);
            Business_AppLink=itemView.findViewById(R.id.Business_AppLink);
            Business_NameOfShop=itemView.findViewById(R.id.Business_NameOfShop);
            Bussiness_LogoOfShop=itemView.findViewById(R.id.Bussiness_LogoOfShop);
            Bussiness_card=itemView.findViewById(R.id.Bussiness_card);


        }
    }
}
