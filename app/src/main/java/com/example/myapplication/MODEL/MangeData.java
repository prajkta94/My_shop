package com.example.myapplication.MODEL;

public class MangeData {
    String NameEntityList;
    int ImageList;

    public MangeData(String nameEntityList, int imageList) {
        NameEntityList = nameEntityList;
        ImageList = imageList;
    }

    public String getNameEntityList() {
        return NameEntityList;
    }

    public void setNameEntityList(String nameEntityList) {
        NameEntityList = nameEntityList;
    }

    public int getImageList() {
        return ImageList;
    }

    public void setImageList(int imageList) {
        ImageList = imageList;
    }
}
