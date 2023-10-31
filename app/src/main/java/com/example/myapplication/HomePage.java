package com.example.myapplication;

import static com.example.myapplication.R.color.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.Account.activity.AccountDetail;
import com.example.myapplication.Catalogue.Catalogue;
import com.example.myapplication.Orders.OrdersMainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends AppCompatActivity {
    CardView cardview_orders,cardview_Totalsales,cardview_Storeview,cardView_Productview;
    TextView txtApp_link;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    SwitchCompat App_Status;
    Dialog dialog;
View view3;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        view3=findViewById(R.id.view3);

        App_Status=findViewById(R.id.toggle_Status);
        cardview_orders=findViewById(R.id.cardview_orders);
        cardview_Totalsales=findViewById(R.id.cardview_Totalsales);
        cardview_Storeview=findViewById(R.id.cardview_Storeview);
        cardView_Productview=findViewById(R.id.cardView_Productview);
        txtApp_link=findViewById(R.id.txtApp_link);
        txtApp_link.setOnClickListener(v -> {
            Intent i=new Intent(HomePage.this, StoreDetail.class);
            startActivity(i);
        });

//        cardview_orders.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), AllOrders.class);
//                startActivity(i);
//            }
//        });

//        cardview_Totalsales.setOnClickListener(v -> {
//            Intent i =new Intent(HomePage.this, DeliveredOrders.class);
//            startActivity(i);
//        });
        cardview_Storeview.setOnClickListener(v -> {
            dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.layout_storedviewdailogbox);
            dialog.show();

            Button Stored_viewClosed = (Button)dialog.findViewById(R.id.Stored_viewClosed);

            Stored_viewClosed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

        });
        cardView_Productview.setOnClickListener(v -> {
            dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.productviewdailogbox);
            dialog.show();

            Button Product_viewClosed = (Button)dialog.findViewById(R.id.Product_viewClosed);

            Product_viewClosed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
        });

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.botnov);
        frameLayout=(FrameLayout)findViewById(R.id.Fr_Container);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.Home:
                        startActivity(new Intent(HomePage.this,MainActivity.class));
                        break;
                    case R.id.Orders:
                        startActivity(new Intent(HomePage.this, OrdersMainActivity.class));
                        break;
                    case R.id.Product:
                        startActivity(new Intent(HomePage.this, Catalogue.class));
                        break;
                    case R.id.Manage:
                        startActivity(new Intent(HomePage.this, MnageStore.class));
                        break;

                    case R.id.Account:
                        startActivity(new Intent(HomePage.this, AccountDetail.class));

                }

//                getSupportFragmentManager().beginTransaction().replace(R.id.Fr_Container,temp1).commit();
//
                return true;
            }
        });


        App_Status.setTextOn("Online");
        App_Status.setTextOff("Offline");
        App_Status.setChecked(true);
        App_Status.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    App_Status.setTextOn("Online");
                    view3.setBackgroundColor(Purpule_500);
                } else {
                    App_Status.setTextOn("offline");
                    view3.setBackgroundColor(Color.RED);


                    BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(HomePage.this,R.style.bottom_shee_dailog_theam);
                    View view= LayoutInflater.from(HomePage.this.getApplicationContext()).
                            inflate(R.layout.offlinedailogbox,null);
                    bottomSheetDialog.setContentView(view);
                    ListView List_OnlineAfter=view.findViewById(R.id.ListView_OnlineAfter);
                    String ReasonsDeletion[]={"1 hour","2 hour","4 hour","Tomorrow,at same time",
                            "I will go online myself"};
                    ListView listReason= view.findViewById(R.id.list_ReasonOption);
                    final List<String> List = new ArrayList<String>(Arrays.asList(ReasonsDeletion));
                    final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(HomePage.this,R.layout.layout_listviewofflinedailogbox,R.id.txt_onlineReason ,List);

                    List_OnlineAfter.setAdapter(arrayAdapter);

                    view.findViewById(R.id.Btn_Conform).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            bottomSheetDialog.dismiss();
                        }
                    });
                    bottomSheetDialog.show();
                }
            }
        });

}
}