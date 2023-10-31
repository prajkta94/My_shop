package com.example.myapplication.ShoppingCart.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Model.CategoryItemModel;
import com.example.myapplication.ShoppingCart.Model.ModelItemCart;

import java.util.List;

public class CategoryItemAdapetr extends RecyclerView.Adapter<CategoryItemAdapetr.CategoryItemViewHolder> {

    Context context;
    List<CategoryItemModel> categoryItemModelList;

    public CategoryItemAdapetr(Context context, List<CategoryItemModel> categoryItemModelList) {
        this.context = context;
        this.categoryItemModelList = categoryItemModelList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.catgory_listview, parent, false);
        return new CategoryItemViewHolder(v);    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {

        CategoryItemModel categoryItemModel=categoryItemModelList.get(position);
        holder.Txt_categoryName.setText(categoryItemModel.getCategoryName());
        holder.Img_categoryImage.setImageResource(categoryItemModel.getImage_CategoryItem());
    }

    @Override
    public int getItemCount() {
        return categoryItemModelList.size();
    }
    public class CategoryItemViewHolder extends RecyclerView.ViewHolder {
        ImageView Img_categoryImage;
        TextView Txt_categoryName;
        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            Img_categoryImage=itemView.findViewById(R.id.Image_CategoryItem);
            Txt_categoryName=itemView.findViewById(R.id.Name_CategoryItem);


        }
    }
}
