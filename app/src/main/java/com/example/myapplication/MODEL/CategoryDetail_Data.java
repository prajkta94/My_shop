package com.example.myapplication.MODEL;

public class CategoryDetail_Data {

    String Category_Name, Category_ListdProduct, Category_Status;
    int Category_Image;

    public CategoryDetail_Data(String category_Name, String category_ListdProduct, String category_Status, int category_Image) {
        Category_Name = category_Name;
        Category_ListdProduct = category_ListdProduct;
        Category_Status = category_Status;
        Category_Image = category_Image;
    }

    public String getCategory_Name() {
        return Category_Name;
    }

    public void setCategory_Name(String category_Name) {
        Category_Name = category_Name;
    }

    public String getCategory_ListdProduct() {
        return Category_ListdProduct;
    }

    public void setCategory_ListdProduct(String category_ListdProduct) {
        Category_ListdProduct = category_ListdProduct;
    }

    public String getCategory_Status() {
        return Category_Status;
    }

    public void setCategory_Status(String category_Status) {
        Category_Status = category_Status;
    }

    public int getCategory_Image() {
        return Category_Image;
    }
}


