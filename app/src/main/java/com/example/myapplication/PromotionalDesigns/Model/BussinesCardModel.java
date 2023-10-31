package com.example.myapplication.PromotionalDesigns.Model;

public class BussinesCardModel {
    String BussinessCard_PhoneNumber,BusinessCard_NameofShop,BussinessCard_Logo,BussinessCard_Aaplink;

    public BussinesCardModel(String bussinessCard_PhoneNumber, String businessCard_NameofShop, String bussinessCard_Logo, String bussinessCard_Aaplink) {
        BussinessCard_PhoneNumber = bussinessCard_PhoneNumber;
        BusinessCard_NameofShop = businessCard_NameofShop;
        BussinessCard_Logo = bussinessCard_Logo;
        BussinessCard_Aaplink = bussinessCard_Aaplink;
    }

    public String getBussinessCard_PhoneNumber() {
        return BussinessCard_PhoneNumber;
    }

    public void setBussinessCard_PhoneNumber(String bussinessCard_PhoneNumber) {
        BussinessCard_PhoneNumber = bussinessCard_PhoneNumber;
    }

    public String getBusinessCard_NameofShop() {
        return BusinessCard_NameofShop;
    }

    public void setBusinessCard_NameofShop(String businessCard_NameofShop) {
        BusinessCard_NameofShop = businessCard_NameofShop;
    }

    public String getBussinessCard_Logo() {
        return BussinessCard_Logo;
    }

    public void setBussinessCard_Logo(String bussinessCard_Logo) {
        BussinessCard_Logo = bussinessCard_Logo;
    }

    public String getBussinessCard_Aaplink() {
        return BussinessCard_Aaplink;
    }

    public void setBussinessCard_Aaplink(String bussinessCard_Aaplink) {
        BussinessCard_Aaplink = bussinessCard_Aaplink;
    }
}
