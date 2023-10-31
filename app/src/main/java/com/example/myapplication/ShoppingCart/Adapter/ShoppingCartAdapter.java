package com.example.myapplication.ShoppingCart.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Model.ModelItemCart;

import java.util.List;

public class ShoppingCartAdapter extends RecyclerView.Adapter<ShoppingCartAdapter.ShoppingCartViewHolder> {
    Context context;
    List<ModelItemCart> modelItemCartList;

    public ShoppingCartAdapter(Context context, List<ModelItemCart> modelItemCartList) {
        this.context = context;
        this.modelItemCartList = modelItemCartList;
    }

    @NonNull
    @Override
    public ShoppingCartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shoppingcartitem, parent, false);
        return new ShoppingCartViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingCartViewHolder holder, int position) {

        ModelItemCart modelItemCart=modelItemCartList.get(position);
        holder.item_name.setText(modelItemCart.getName_Product());
        holder.item_ActualPrice.setText(modelItemCart.getActual_Price());
        holder.item_DiscountPrice.setText(modelItemCart.getDiscounted_Price());
//        holder.item_Quantity.setOnItemClickListener(modelItemCart.getQuantity());
        holder.item_youSaved.setText(modelItemCart.getSaved_Money());
        holder.item_Percentageoff.setText(modelItemCart.getPercentage_off());

    }


    @Override
    public int getItemCount() {
        return modelItemCartList.size();
    }

    public class ShoppingCartViewHolder extends RecyclerView.ViewHolder{
        TextView item_name,item_ActualPrice,item_DiscountPrice,item_Percentageoff,item_youSaved;
        Spinner item_Quantity;
        public ShoppingCartViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name=itemView.findViewById(R.id.cartItemName);
            item_ActualPrice=itemView.findViewById(R.id.item_Price);
            item_DiscountPrice=itemView.findViewById(R.id.item_ActualPrice);
            item_Percentageoff=itemView.findViewById(R.id.item_PriceOff);
            item_youSaved=itemView.findViewById(R.id.item_savePrice);
            item_Quantity=itemView.findViewById(R.id.item_Quantity);

        }
    }
}
