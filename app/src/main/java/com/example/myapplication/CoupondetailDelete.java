package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.snackbar.Snackbar;

public class CoupondetailDelete extends AppCompatActivity {
    TextView txt_deleteCoupon;
   SwitchCompat switch_couponDelete;
    View coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupondetail_delete);

        coordinatorLayout =findViewById(R.id.con2);
        switch_couponDelete=findViewById(R.id.switch_couponDelete);


        txt_deleteCoupon=findViewById(R.id.txt_deleteCoupon);
        txt_deleteCoupon.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(CoupondetailDelete.this,R.style.bottom_shee_dailog_theam);
            View view= LayoutInflater.from(CoupondetailDelete.this).
                    inflate(R.layout.deletepopup,null);
            bottomSheetDialog.setContentView(view);
//            view.findViewById(R.id.deleoptionBtn).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    int newPosition = holder.getAdapterPosition();
//                    categoryDetail_dataArrayList.remove(newPosition);
//                    notifyItemRemoved(newPosition);
//                    notifyItemRangeChanged(newPosition, categoryDetail_dataArrayList.size());
//                    bottomSheetDialog.dismiss();
//                }
//            });
            bottomSheetDialog.show();

        });

        switch_couponDelete.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                 Snackbar snackbar=   Snackbar.make(coordinatorLayout,"Coupon is visible to customer now",Snackbar.LENGTH_SHORT);
                 View sbView=snackbar.getView();
                 sbView.setBackgroundColor(Color.GREEN);
                    snackbar.show();
                }else{

                    Snackbar snackbar=   Snackbar.make(coordinatorLayout,"Coupon is not visible to customer now",Snackbar.LENGTH_SHORT);
                    View sbView=snackbar.getView();
                    sbView.setBackgroundColor(Color.GREEN);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();                }
            }
        });





    }
}