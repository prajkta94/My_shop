package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MODEL.CategoryDetail_Data;
import com.example.myapplication.MODEL.SizeData;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class SizeAddAdapter extends RecyclerView.Adapter<SizeAddAdapter.SizeAddClass> {
    ArrayList<SizeData> sizeDataArrayList;
    Context context;

    public SizeAddAdapter(ArrayList<SizeData> sizeDataArrayList, Context context) {
        this.sizeDataArrayList = sizeDataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public SizeAddClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sizeitemlayout, parent, false);
        return new SizeAddClass(v);

    }

    @Override
    public void onBindViewHolder(@NonNull SizeAddClass holder, int position) {
        SizeData sizeData=sizeDataArrayList.get(position);
        holder.Sizebox.setText(sizeData.getSize());
        holder.Pricebox.setText(sizeData.getPrice());
        holder.Discountbox.setText(sizeData.getDiscount());
    }
    @Override
    public int getItemCount() {
        return sizeDataArrayList.size();
    }

    public class SizeAddClass extends RecyclerView.ViewHolder {
        EditText Sizebox,Pricebox,Discountbox;
        TextView deleteSize;
        Button btnAddSize;
        public SizeAddClass(@NonNull View itemView) {
            super(itemView);
            Sizebox=itemView.findViewById(R.id.Size_edt);
            Pricebox=itemView.findViewById(R.id.prize_edt);
            Discountbox=itemView.findViewById(R.id.Discount_edt);
            deleteSize=itemView.findViewById(R.id.delete_Size);
//            btnAddSize=itemView.findViewById(R.id.btn_AddSize);
        }
    }
}
