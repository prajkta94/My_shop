package com.example.myapplication.MODEL;

import android.widget.TextView;

public class CouponDataModel {
    String Coupon_id,Coupon_Desc;
    int Coupon_Used,Coupon_SaleGenerated;

    public CouponDataModel(String coupon_id, String coupon_Desc, int coupon_Used, int coupon_SaleGenerated) {
        Coupon_id = coupon_id;
        Coupon_Desc = coupon_Desc;
        Coupon_Used = coupon_Used;
        Coupon_SaleGenerated = coupon_SaleGenerated;
    }

    public String getCoupon_id() {
        return Coupon_id;
    }

    public void setCoupon_id(String coupon_id) {
        Coupon_id = coupon_id;
    }

    public String getCoupon_Desc() {
        return Coupon_Desc;
    }

    public void setCoupon_Desc(String coupon_Desc) {
        Coupon_Desc = coupon_Desc;
    }

    public int getCoupon_Used() {
        return Coupon_Used;
    }

    public void setCoupon_Used(int coupon_Used) {
        Coupon_Used = coupon_Used;
    }

    public int getCoupon_SaleGenerated() {
        return Coupon_SaleGenerated;
    }

    public void setCoupon_SaleGenerated(int coupon_SaleGenerated) {
        Coupon_SaleGenerated = coupon_SaleGenerated;
    }
}
