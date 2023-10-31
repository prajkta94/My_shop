package com.example.myapplication.ShoppingCart.Model;

public class CategoryItemModel {
    String CategoryName;
    int Image_CategoryItem;

    public CategoryItemModel(String categoryName, int image_CategoryItem) {
        CategoryName = categoryName;
        Image_CategoryItem = image_CategoryItem;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public int getImage_CategoryItem() {
        return Image_CategoryItem;
    }

    public void setImage_CategoryItem(int image_CategoryItem) {
        Image_CategoryItem = image_CategoryItem;
    }
}
