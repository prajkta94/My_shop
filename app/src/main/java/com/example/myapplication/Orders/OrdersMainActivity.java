package com.example.myapplication.Orders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.myapplication.Orders.Fragment.AcceptedOrders;
import com.example.myapplication.Orders.Fragment.AllOrders;
import com.example.myapplication.Orders.Fragment.CancelledOrders;
import com.example.myapplication.Orders.Fragment.DeliveredOrders;
import com.example.myapplication.Orders.Fragment.FailedOrders;
import com.example.myapplication.Orders.Fragment.ModifyOrders;
import com.example.myapplication.Orders.Fragment.PendingOrders;
import com.example.myapplication.Orders.Fragment.RejectdOrders;
import com.example.myapplication.Orders.Fragment.ShippedOrders;
import com.example.myapplication.R;

public class OrdersMainActivity extends AppCompatActivity implements View.OnClickListener {
    ColorStateList def;
    TextView item1,item2,item3,item4,item5,item6,item7,item8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_main);
//        getSupportActionBar().setTitle("Orders");
        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout,new AllOrders()).commit();
//        Toolbar toolbar1 = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar1);
//        item1 = findViewById(R.id.All_fragment);
//        item2 = findViewById(R.id.Pending_frgment);
//        item3 = findViewById(R.id.Accepted_fragment);
//        item2.setOnClickListener(this);
//        item3.setOnClickListener(this);
//

    }


//    @Override
//    public void onClick(View view) {
//        if (view.getId() == R.id.item1){
//            select.animate().x(0).setDuration(100);
//            item1.setTextColor(Color.WHITE);
//            item2.setTextColor(def);
//            item3.setTextColor(def);
//        } else if (view.getId() == R.id.item2){
//            item1.setTextColor(def);
//            item2.setTextColor(Color.WHITE);
//            item3.setTextColor(def);
//            int size = item2.getWidth();
//            select.animate().x(size).setDuration(100);
//        } else if (view.getId() == R.id.item3){
//            item1.setTextColor(def);
//            item3.setTextColor(Color.WHITE);
//            item2.setTextColor(def);
//            int size = item2.getWidth() * 2;
//            select.animate().x(size).setDuration(100);
//        }
//    }


    public void onClick(View v){
        switch (v.getId()){
            case R.id.All_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new AllOrders()).commit();

                break;
            case R.id.Pending_frgment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new PendingOrders()).commit();
                break;
            case R.id.Accepted_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new AcceptedOrders()).commit();
                break;
            case R.id.Shipped_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new ShippedOrders()).commit();
                break;
            case R.id.Delivered_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new DeliveredOrders()).commit();
                break;
            case R.id.Modify_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new ModifyOrders()).commit();
                break;
                case R.id.Rejected_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new RejectdOrders()).commit();
                break;
                case R.id.Cancelled_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new CancelledOrders()).commit();
                break;
            case R.id.Failed_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frLayout,
                                new FailedOrders()).commit();
                break;


        }
    }
}



