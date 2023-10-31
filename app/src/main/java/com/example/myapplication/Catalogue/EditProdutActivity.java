package com.example.myapplication.Catalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.MODEL.ProductDetail_Data;
import com.example.myapplication.R;

public class EditProdutActivity extends AppCompatActivity {
    ImageView Update_ProductImage;

    EditText Update_ProductName,Update_ProductDetail,Update_ProductMrp,Update_ProductDicount,Update_ProductCategory;
    TextView txt_updatepricenew,txt_updatediscountPrice,Delete_product;
    Button BtnUpdate;

    ProductDetail_Data productDetail_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_produt);

        Update_ProductName =findViewById(R.id.Update_ProductName);
        Update_ProductDetail=findViewById(R.id.Update_ProductDetail);
        Update_ProductImage=findViewById(R.id.Update_ProductImage);
        Update_ProductMrp=findViewById(R.id.Update_ProductMrp);
        Update_ProductDicount=findViewById(R.id.Update_ProductDicount);
        Update_ProductCategory=findViewById(R.id.Update_ProductCategory);
        txt_updatepricenew=findViewById(R.id.txt_updatepricenew);
        txt_updatediscountPrice=findViewById(R.id.txt_updatediscountPrice);
        Delete_product=findViewById(R.id.Delete_product);
        BtnUpdate=findViewById(R.id.BtnUpdate);

//         Update_ProductName.setText(productDetail_data.getProduct_Name());
////         Update_ProductCategory.setText(productDetail_data.);
////        Update_ProductDetail.setText(productDetail_data.get);
////        Update_ProductImage.set
//
//        Update_ProductDicount.setText(productDetail_data.getProduct_Discount());
//        Update_ProductMrp.setText(productDetail_data.getProduct_Mrp());

    }
}