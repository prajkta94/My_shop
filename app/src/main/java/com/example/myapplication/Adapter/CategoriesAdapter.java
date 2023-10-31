package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ShareActionProvider;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Catalogue.AddProductDescription;
import com.example.myapplication.Catalogue.EditProdutActivity;
import com.example.myapplication.Catalogue.Fragment.Categories;
import com.example.myapplication.MODEL.CategoryDetail_Data;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoryItem> {
   ArrayList<CategoryDetail_Data> categoryDetail_dataArrayList;
    Context context;

    public CategoriesAdapter() {
    }

    public CategoriesAdapter(List<CategoryDetail_Data> categoryDetail_dataArrayList, Context context) {
        this.categoryDetail_dataArrayList = (ArrayList<CategoryDetail_Data>) categoryDetail_dataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_adddetail, parent, false);
        return new CategoryItem(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItem holder, int position) {

        CategoryDetail_Data categoryDetail_data=categoryDetail_dataArrayList.get(position);
        holder.CategoryName.setText(categoryDetail_data.getCategory_Name());
        holder.CategoryStatus.setText(categoryDetail_data.getCategory_Status());
        holder.Product_Listed.setText(categoryDetail_data.getCategory_ListdProduct());
//        holder.Category_Image.setImageResource(categoryDetail_data.getCategory_Image());

        holder.itemView.setOnClickListener(v -> {
            Intent i=new Intent(context, AddProductDescription.class);
        });


        holder.catagory_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(context, holder.catagory_menu);
                popupMenu.inflate(R.menu.category_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.Edit_option:
                                Intent i = new Intent(context, EditProdutActivity.class);
                                break;
                            case R.id.DeleteProduct_option:

                                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(context,R.style.bottom_shee_dailog_theam);
                                View view= LayoutInflater.from(context.getApplicationContext()).
                                        inflate(R.layout.deletepopup,null);
                                bottomSheetDialog.setContentView(view);
                                view.findViewById(R.id.deleoptionBtn).setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int newPosition = holder.getAdapterPosition();
                                        categoryDetail_dataArrayList.remove(newPosition);
                                        notifyItemRemoved(newPosition);
                                        notifyItemRangeChanged(newPosition, categoryDetail_dataArrayList.size());
                                        bottomSheetDialog.dismiss();
                                    }
                                });
                                bottomSheetDialog.show();

                                break;

                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        holder.switch_btn.setChecked(true);
        holder.CategoryStatus.setText("Instock");
        holder.switch_btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    holder.CategoryStatus.setText("Instock");
                }
                else{
                    BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(context,R.style.bottom_shee_dailog_theam);
                    View view= LayoutInflater.from(context.getApplicationContext()).
                            inflate(R.layout.switchdailogbox,null);
                    bottomSheetDialog.setContentView(view);
                    ConstraintLayout hiden=view.findViewById(R.id.constraintLayoutHiden);
                    ConstraintLayout outStock=  view.findViewById(R.id.constraintLayoutoutofstock);
                    hiden.setOnClickListener(v -> {
                        holder.CategoryStatus.setText("Hidden");
                        bottomSheetDialog.dismiss();

                    });

                    outStock.setOnClickListener(v -> {
                        holder.CategoryStatus.setText("OutOfStock");
                        bottomSheetDialog.dismiss();
                    });
                    bottomSheetDialog.show();
                }
            }
        });

        holder.linearLayout_shareCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(context,R.style.bottom_shee_dailog_theam);
                View view= LayoutInflater.from(context.getApplicationContext()).
                        inflate(R.layout.shareproductpopup,null);
                bottomSheetDialog.setContentView(view);
              LinearLayout Sahrepdf=  view.findViewById(R.id.linPdf);
              LinearLayout ShareImage=  view.findViewById(R.id.linImage);
              Sahrepdf.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
//                      ShareActionProvider shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareMenuItem);
                      Intent shareIntent = new Intent(Intent.ACTION_SEND);
                      shareIntent.setType("image/*");

//                      shareActionProvider.setShareIntent(shareIntent);
                  }
              });

              ShareImage.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {


                  }
              });

//                view.findViewById(R.id.deleoptionBtn).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int newPosition = holder.getAdapterPosition();
//                        categoryDetail_dataArrayList.remove(newPosition);
//                        notifyItemRemoved(newPosition);
//                        notifyItemRangeChanged(newPosition, categoryDetail_dataArrayList.size());
//                        bottomSheetDialog.dismiss();
//                    }
//                });
                bottomSheetDialog.show();


//                Intent myIntent= new Intent(Intent.ACTION_SEND);
//                myIntent.setType("text/Plain");
//                String shareType=

            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryDetail_dataArrayList.size();
    }

    public class CategoryItem extends RecyclerView.ViewHolder {
        TextView Product_Listed,CategoryName,CategoryStatus;
        ImageView Category_Image;
        ImageButton catagory_menu;
        SwitchCompat switch_btn;
        LinearLayout linearLayout_shareCategory;

        public CategoryItem(@NonNull View itemView) {
            super(itemView);
            Product_Listed=itemView.findViewById(R.id.Category_Picesrecycle);
            CategoryStatus=itemView.findViewById(R.id.Category_Status);
            CategoryName=itemView.findViewById(R.id.Category_Nameinrecycle);
            Category_Image=itemView.findViewById(R.id.Category_Picture);
            switch_btn=itemView.findViewById(R.id.switch_btn);
            catagory_menu=itemView.findViewById(R.id.img_menu);
            linearLayout_shareCategory=itemView.findViewById(R.id.linearLayout_shareCategory);


        }
    }
}
