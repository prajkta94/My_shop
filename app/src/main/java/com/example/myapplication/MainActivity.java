package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.myapplication.Account.activity.AccountDetail;
import com.example.myapplication.Catalogue.Catalogue;
import com.example.myapplication.Catalogue.ProductNAmeActivity;
import com.example.myapplication.Orders.OrdersMainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    Button btnAddProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().setTitle("Store");
//        ColorDrawable cd = new ColorDrawable(Color.parseColor("#FF076BA3"));
//        getSupportActionBar().setBackgroundDrawable(cd);

        btnAddProduct=findViewById(R.id.btnAddProduct);

        btnAddProduct.setOnClickListener(v -> {
            Intent i =new Intent(MainActivity.this, ProductNAmeActivity.class);
            startActivity(i);
        });

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.botnov);
        frameLayout=(FrameLayout)findViewById(R.id.Fr_Container);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch(item.getItemId()){
                    case R.id.Home:
                       startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;
                    case R.id.Orders:
                       startActivity(new Intent(MainActivity.this,OrdersMainActivity.class));
                        break;
                    case R.id.Product:
                    startActivity(new Intent(MainActivity.this, Catalogue.class));
                        break;
                   case R.id.Manage:
                       startActivity(new Intent(MainActivity.this, MnageStore.class));
                       break;

                   case R.id.Account:
                       startActivity(new Intent(MainActivity.this, AccountDetail.class));

                }

//                getSupportFragmentManager().beginTransaction().replace(R.id.Fr_Container,temp1).commit();
//
               return true;
           }
       });



    }
}