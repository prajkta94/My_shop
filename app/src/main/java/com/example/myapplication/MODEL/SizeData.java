package com.example.myapplication.MODEL;

public class SizeData {
    String Size;
    int Price;
    int discount;

    public SizeData(String size, int price, int discount) {
        Size = size;
        Price = price;
        this.discount = discount;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
