package com.example.myapplication.ManageStore.Model;

public class PluginModel {

    String Pulgin_Name,Plugin_Description;
    int Plugin_Image;

    public PluginModel(String pulgin_Name, String plugin_Description, int plugin_Image) {
        Pulgin_Name = pulgin_Name;
        Plugin_Description = plugin_Description;
        Plugin_Image = plugin_Image;
    }

    public String getPulgin_Name() {
        return Pulgin_Name;
    }

    public void setPulgin_Name(String pulgin_Name) {
        Pulgin_Name = pulgin_Name;
    }

    public String getPlugin_Description() {
        return Plugin_Description;
    }

    public void setPlugin_Description(String plugin_Description) {
        Plugin_Description = plugin_Description;
    }

    public int getPlugin_Image() {
        return Plugin_Image;
    }

    public void setPlugin_Image(int plugin_Image) {
        Plugin_Image = plugin_Image;
    }
}
