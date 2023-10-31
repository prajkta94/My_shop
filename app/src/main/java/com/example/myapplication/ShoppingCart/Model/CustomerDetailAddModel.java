package com.example.myapplication.ShoppingCart.Model;

public class CustomerDetailAddModel {

    String Name_Customer,MobileNo_Customer,Address_Customer,Pincode_Customer;

    public CustomerDetailAddModel(String name_Customer, String mobileNo_Customer, String address_Customer, String pincode_Customer) {
        Name_Customer = name_Customer;
        MobileNo_Customer = mobileNo_Customer;
        Address_Customer = address_Customer;
        Pincode_Customer = pincode_Customer;
    }

    public String getName_Customer() {
        return Name_Customer;
    }

    public void setName_Customer(String name_Customer) {
        Name_Customer = name_Customer;
    }

    public String getMobileNo_Customer() {
        return MobileNo_Customer;
    }

    public void setMobileNo_Customer(String mobileNo_Customer) {
        MobileNo_Customer = mobileNo_Customer;
    }

    public String getAddress_Customer() {
        return Address_Customer;
    }

    public void setAddress_Customer(String address_Customer) {
        Address_Customer = address_Customer;
    }

    public String getPincode_Customer() {
        return Pincode_Customer;
    }

    public void setPincode_Customer(String pincode_Customer) {
        Pincode_Customer = pincode_Customer;
    }
}
