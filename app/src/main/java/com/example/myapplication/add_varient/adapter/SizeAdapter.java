package com.example.myapplication.add_varient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputEditText;

public class SizeAdapter extends RecyclerView.Adapter<SizeAdapter.myViewHolder> {

    Context context;
    int size=1;

    public SizeAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sizeitemlayout,null,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        String p= String.valueOf(position+1);

        holder.Size_edt.setHint("Size "+p+"*");
    }

    @Override
    public int getItemCount() {
        return size;
    }
    public void addSize(){
        size=size+1;
        notifyDataSetChanged();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        TextInputEditText Size_edt,prize_edt,Discount_edt;
        TextView delete_Size;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            Size_edt =itemView.findViewById(R.id.Size_edt);
            prize_edt =itemView.findViewById(R.id.prize_edt);
            Discount_edt =itemView.findViewById(R.id.Discount_edt);
            delete_Size =itemView.findViewById(R.id.delete_Size);
        }
    }
}
