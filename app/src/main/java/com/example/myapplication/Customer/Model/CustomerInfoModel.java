package com.example.myapplication.Customer.Model;

public class CustomerInfoModel {
    String Name_Customer,Addres_Custmer;

    int ToatlOrders_Customer,Total_Sales;

    public CustomerInfoModel(String name_Customer, String addres_Custmer, int toatlOrders_Customer, int total_Sales) {
        this.Name_Customer = name_Customer;
        this.Addres_Custmer = addres_Custmer;
        this.ToatlOrders_Customer = toatlOrders_Customer;
        this.Total_Sales = total_Sales;
    }

    public String getName_Customer() {
        return Name_Customer;
    }

    public void setName_Customer(String name_Customer) {
        Name_Customer = name_Customer;
    }

    public String getAddres_Custmer() {
        return Addres_Custmer;
    }

    public void setAddres_Custmer(String addres_Custmer) {
        Addres_Custmer = addres_Custmer;
    }

    public int getToatlOrders_Customer() {
        return ToatlOrders_Customer;
    }

    public void setToatlOrders_Customer(int toatlOrders_Customer) {
        ToatlOrders_Customer = toatlOrders_Customer;
    }

    public int getTotal_Sales() {
        return Total_Sales;
    }

    public void setTotal_Sales(int total_Sales) {
        Total_Sales = total_Sales;
    }
}
