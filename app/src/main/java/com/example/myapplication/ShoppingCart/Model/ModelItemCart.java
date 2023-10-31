package com.example.myapplication.ShoppingCart.Model;

public class ModelItemCart {
    String Name_Product,Saved_Money,Actual_Price,Discounted_Price,Percentage_off;
    int Quantity;

    public ModelItemCart(String name_Product, String saved_Money, String actual_Price, String discounted_Price, String percentage_off, int quantity) {
        Name_Product = name_Product;
        Saved_Money = saved_Money;
        Actual_Price = actual_Price;
        Discounted_Price = discounted_Price;
        Percentage_off = percentage_off;
        Quantity = quantity;
    }

    public String getName_Product() {
        return Name_Product;
    }

    public void setName_Product(String name_Product) {
        Name_Product = name_Product;
    }

    public String getSaved_Money() {
        return Saved_Money;
    }

    public void setSaved_Money(String saved_Money) {
        Saved_Money = saved_Money;
    }

    public String getActual_Price() {
        return Actual_Price;
    }

    public void setActual_Price(String actual_Price) {
        Actual_Price = actual_Price;
    }

    public String getDiscounted_Price() {
        return Discounted_Price;
    }

    public void setDiscounted_Price(String discounted_Price) {
        Discounted_Price = discounted_Price;
    }

    public String getPercentage_off() {
        return Percentage_off;
    }

    public void setPercentage_off(String percentage_off) {
        Percentage_off = percentage_off;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
