package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.myapplication.ShoppingCart.Fragment.AccountFragment;
import com.example.myapplication.ShoppingCart.Fragment.BagFragment;
import com.example.myapplication.ShoppingCart.Fragment.Homefragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class StoreDetail extends AppCompatActivity {
    ChipNavigationBar chipNavigationBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_detail);
        chipNavigationBar=findViewById(R.id.bottom_nav_barChips);

        chipNavigationBar.setItemSelected(R.id.bottom_nav_barChips,
                true);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,
                        new Homefragment()).commit();
        bottomMenu();

    }

    private void bottomMenu() {
       chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
           @Override
           public void onItemSelected(int i) {

               Fragment fragment = null;
               switch (i){
                   case R.id.nav_home:
                       fragment = new Homefragment();
                       break;
                   case R.id.nav_bag:
                       fragment = new BagFragment();
                       break;
                   case R.id.nav_profile:
                       fragment = new AccountFragment();
                       break;
               }
               getSupportFragmentManager().beginTransaction()
                       .replace(R.id.fragment_container,
                               fragment).commit();
           }
       });

//
        }
}