package com.example.myapplication.ManageStore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.ManageStore.Model.PluginModel;
import com.example.myapplication.R;

import java.util.List;

public class PluginAdapter extends RecyclerView.Adapter<PluginAdapter.PluginViewHolder> {
    List<PluginModel> pluginModelList;
    Context context;

    public PluginAdapter(List<PluginModel> pluginModelList, Context context) {
        this.pluginModelList = pluginModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public PluginViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
   View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_plugins,parent,false);
   return new PluginViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PluginViewHolder holder, int position) {


        PluginModel pluginModel=pluginModelList.get(position);
        holder.PluginName.setText(pluginModel.getPulgin_Name());
        holder.PluginDesc.setText(pluginModel.getPlugin_Description());
        holder.Plugin_Image.setImageResource(pluginModel.getPlugin_Image());

    }

    @Override
    public int getItemCount() {
        return pluginModelList.size();
    }

    public class PluginViewHolder extends RecyclerView.ViewHolder {
        TextView PluginName,PluginDesc;
        ImageView Plugin_Image;
        public PluginViewHolder(@NonNull View itemView) {
            super(itemView);

            Plugin_Image=itemView.findViewById(R.id.Imgeview_plugin);
            PluginName=itemView.findViewById(R.id.txt_NamePlugin);
            PluginDesc=itemView.findViewById(R.id.txt_DescPlugin);



        }
    }
}
