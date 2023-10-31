package com.example.myapplication.CategoryStore;

public class ModelCategory {
    String Name_Category;
    int Image_Catagory;

    public ModelCategory(String name_Category, int image_Catagory) {
        Name_Category = name_Category;
        Image_Catagory = image_Catagory;
    }

    public String getName_Category() {
        return Name_Category;
    }

    public void setName_Category(String name_Category) {
        Name_Category = name_Category;
    }

    public int getImage_Catagory() {
        return Image_Catagory;
    }

    public void setImage_Catagory(int image_Catagory) {
        Image_Catagory = image_Catagory;
    }
}
