package com.example.myapplication.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.Catalogue.Catalogue;
import com.example.myapplication.Catalogue.Fragment.Categories;
import com.example.myapplication.Catalogue.Fragment.ProductFrgment;

public class AdapterViewpager extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public AdapterViewpager(Context context,FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                return new ProductFrgment();

            case 1:

                return new Categories();

            default:
                return null;
        }
    }
        @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "Product";
        else if (position == 1)
            title = "Category";
        return title;
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
