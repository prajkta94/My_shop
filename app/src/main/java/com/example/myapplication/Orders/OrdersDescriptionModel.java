package com.example.myapplication.Orders;

public class OrdersDescriptionModel {
    String Order_orderNo,Order_Datetime,Order_payDetail,Order_SatusDetail,Order_Detail;
       int Order_price,Order_SatusColor,order_Image,Order_Item;

    public OrdersDescriptionModel(String order_orderNo, String order_Datetime, String order_payDetail, String order_SatusDetail, String order_Detail, int order_price, int order_SatusColor, int order_Image, int order_Item) {
        Order_orderNo = order_orderNo;
        Order_Datetime = order_Datetime;
        Order_payDetail = order_payDetail;
        Order_SatusDetail = order_SatusDetail;
        Order_Detail = order_Detail;
        Order_price = order_price;
        Order_SatusColor = order_SatusColor;
        this.order_Image = order_Image;
        Order_Item = order_Item;
    }

    public String getOrder_orderNo() {
        return Order_orderNo;
    }

    public void setOrder_orderNo(String order_orderNo) {
        Order_orderNo = order_orderNo;
    }

    public String getOrder_Datetime() {
        return Order_Datetime;
    }

    public void setOrder_Datetime(String order_Datetime) {
        Order_Datetime = order_Datetime;
    }

    public String getOrder_payDetail() {
        return Order_payDetail;
    }

    public void setOrder_payDetail(String order_payDetail) {
        Order_payDetail = order_payDetail;
    }

    public String getOrder_SatusDetail() {
        return Order_SatusDetail;
    }

    public void setOrder_SatusDetail(String order_SatusDetail) {
        Order_SatusDetail = order_SatusDetail;
    }

    public String getOrder_Detail() {
        return Order_Detail;
    }

    public void setOrder_Detail(String order_Detail) {
        Order_Detail = order_Detail;
    }

    public int getOrder_price() {
        return Order_price;
    }

    public void setOrder_price(int order_price) {
        Order_price = order_price;
    }

    public int getOrder_SatusColor() {
        return Order_SatusColor;
    }

    public void setOrder_SatusColor(int order_SatusColor) {
        Order_SatusColor = order_SatusColor;
    }

    public int getOrder_Image() {
        return order_Image;
    }

    public void setOrder_Image(int order_Image) {
        this.order_Image = order_Image;
    }

    public int getOrder_Item() {
        return Order_Item;
    }

    public void setOrder_Item(int order_Item) {
        Order_Item = order_Item;
    }
}
