package com.example.myapplication.ShoppingCart.Model;

public class AvailbleCuponModel {

    String AvailbleCoupon_Number,AvailbleCoupon_txtoff,AvaibleCoupon_UserPerUsed;

    public AvailbleCuponModel(String availbleCoupon_Number, String availbleCoupon_txtoff, String avaibleCoupon_UserPerUsed) {
        AvailbleCoupon_Number = availbleCoupon_Number;
        AvailbleCoupon_txtoff = availbleCoupon_txtoff;
        AvaibleCoupon_UserPerUsed = avaibleCoupon_UserPerUsed;
    }

    public String getAvailbleCoupon_Number() {
        return AvailbleCoupon_Number;
    }

    public void setAvailbleCoupon_Number(String availbleCoupon_Number) {
        AvailbleCoupon_Number = availbleCoupon_Number;
    }

    public String getAvailbleCoupon_txtoff() {
        return AvailbleCoupon_txtoff;
    }

    public void setAvailbleCoupon_txtoff(String availbleCoupon_txtoff) {
        AvailbleCoupon_txtoff = availbleCoupon_txtoff;
    }

    public String getAvaibleCoupon_UserPerUsed() {
        return AvaibleCoupon_UserPerUsed;
    }

    public void setAvaibleCoupon_UserPerUsed(String avaibleCoupon_UserPerUsed) {
        AvaibleCoupon_UserPerUsed = avaibleCoupon_UserPerUsed;
    }
}
