package com.example.myapplication.ManageStore.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExtraChargeAdapter extends RecyclerView.Adapter<ExtraChargeAdapter.ExtraChargeViewHolder> {
    @NonNull
    @Override
    public ExtraChargeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ExtraChargeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ExtraChargeViewHolder extends RecyclerView.ViewHolder {
        public ExtraChargeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
