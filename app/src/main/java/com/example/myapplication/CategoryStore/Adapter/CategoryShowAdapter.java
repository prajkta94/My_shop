package com.example.myapplication.CategoryStore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.CategoryStore.ModelCategory;
import com.example.myapplication.R;

import java.util.List;

public class CategoryShowAdapter extends RecyclerView.Adapter<CategoryShowAdapter.CategoryAll> {
    Context context;
    List<ModelCategory> modelCategoryList;

    public CategoryShowAdapter(Context context, List<ModelCategory> modelCategoryList) {
        this.context = context;
        this.modelCategoryList = modelCategoryList;
    }

    @NonNull
    @Override
    public CategoryAll onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.catgory_listview, parent, false);
        return new CategoryAll(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAll holder, int position) {



    }

    @Override
    public int getItemCount() {
        return modelCategoryList.size();
    }

    public class CategoryAll extends RecyclerView.ViewHolder{
        TextView Category_name;
        ImageView Ctegory_Image;

        public CategoryAll(@NonNull View itemView) {
            super(itemView);


        }
    }
}
