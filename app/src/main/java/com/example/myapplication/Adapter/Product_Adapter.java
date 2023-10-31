package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Catalogue.AddProductDescription;
import com.example.myapplication.Catalogue.EditProdutActivity;
import com.example.myapplication.MODEL.BackonProductDetail;
import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;


public class Product_Adapter extends RecyclerView.Adapter<Product_Adapter.ProductImage>{
    ArrayList<ProductDetail_Data> productDetail_dataArrayList;
    BackonProductDetail backonProductDetail;
    Context context;


    public Product_Adapter(ArrayList<ProductDetail_Data> productDetail_dataArrayList, Context context) {
        this.productDetail_dataArrayList = productDetail_dataArrayList;
        this.backonProductDetail = backonProductDetail;
        this.context = context;
    }


    @NonNull
    @Override
    public ProductImage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_adddetail, parent, false);
        return new ProductImage(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductImage holder, int position) {

        ProductDetail_Data detail_data = productDetail_dataArrayList.get(position);
        holder.ProductName.setText(detail_data.getProduct_Name());
        holder.ProductPiece.setText(detail_data.getProductPiece());
        holder.ProductStatus.setText(detail_data.getProduct_Status());
        holder.ProductMrp.setText(detail_data.getProduct_Mrp());
      holder.ProductDiscount.setText(detail_data.getProduct_Discount());
//        holder.Product_Image.setT(detail_data.getProduct_Image());

        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(context, EditProdutActivity.class);
            context.startActivity(i);
        });

        holder.Product_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(context, holder.Product_menu);
                popupMenu.inflate(R.menu.option_product);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
//                        if(item.getItemId()==0){
//                            Intent i = new Intent(context, EditProdutActivity.class);
//                        }
//                        else if(item.getItemId()==1){
//
//                        }
//                        else {
//                            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(context,R.style.bottom_shee_dailog_theam);
//                            View view= LayoutInflater.from(context.getApplicationContext()).
//                                    inflate(R.layout.deletepopup,null);
//                            bottomSheetDialog.setContentView(view);
//                            view.findViewById(R.id.deleoptionBtn).setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//
//                                    bottomSheetDialog.dismiss();
//                                }
//                            });
//                            bottomSheetDialog.show();
//                        }

                        switch (item.getItemId()) {
                            case R.id.Edit_option:
                                Intent i = new Intent(context, EditProdutActivity.class);
                                break;
                            case R.id.Moveto_option:

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
                                        productDetail_dataArrayList.remove(newPosition);
                                        notifyItemRemoved(newPosition);
                                        notifyItemRangeChanged(newPosition, productDetail_dataArrayList.size());

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


        holder.switchbtn.setChecked(true);
        holder.ProductStatus.setText("Instock");
holder.switchbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        if(isChecked){
            holder.ProductStatus.setText("Instock");
        }
        else{
            String checked;
            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(context,R.style.bottom_shee_dailog_theam);
            View view= LayoutInflater.from(context.getApplicationContext()).
                    inflate(R.layout.switchdailogbox,null);
            bottomSheetDialog.setContentView(view);
          ConstraintLayout hiden=view.findViewById(R.id.constraintLayoutHiden);
        ConstraintLayout outStock=  view.findViewById(R.id.constraintLayoutoutofstock);
        hiden.setOnClickListener(v -> {
                holder.ProductStatus.setText("Hidden");
                bottomSheetDialog.dismiss();
            });
            outStock.setOnClickListener(v -> {
                holder.ProductStatus.setText("OutOfStock");
                bottomSheetDialog.dismiss();
            });



            bottomSheetDialog.show();
        }

    }
});
    }
    @Override
    public int getItemCount() {
        return productDetail_dataArrayList.size();
    }

    public class ProductImage extends RecyclerView.ViewHolder {
        TextView ProductName,ProductPiece,ProductMrp,ProductDiscount,ProductStatus,Product_Image;
        ImageButton Product_menu;
        SwitchCompat switchbtn;

        LinearLayout linearLayout_shareProduct;
        public ProductImage(@NonNull View itemView) {
            super(itemView);
            ProductName=itemView.findViewById(R.id.Product_Nameinrecycle);
            ProductMrp=itemView.findViewById(R.id.Product_pricerecycle);
          ProductDiscount=itemView.findViewById(R.id.Product_Discountdrecycle);
            ProductStatus=itemView.findViewById(R.id.Product_Status);
           ProductPiece=itemView.findViewById(R.id.Product_Picesrecycle);
///            Product_Image=itemView.findViewById(R.id.Product_imagerecycle);
            Product_menu= itemView.findViewById(R.id.img_menu);
            switchbtn=itemView.findViewById(R.id.switchbtn);
            linearLayout_shareProduct=itemView.findViewById(R.id.linearLayout_shareProduct);

        }
    }
}
