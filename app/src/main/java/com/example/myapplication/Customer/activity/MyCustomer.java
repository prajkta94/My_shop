package com.example.myapplication.Customer.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.Customer.fragment.AllCustomerFragment;
import com.example.myapplication.Customer.fragment.ImportedCustomerFragment;
import com.example.myapplication.Customer.fragment.NewCustomerFragment;
import com.example.myapplication.Customer.fragment.ReturingCustomerFragment;
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
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MyCustomer extends AppCompatActivity {
    Button Add_newCust;
//    ExtendedFloatingActionButton Add_List;

    TextView All_customer,New_customer,Returing_customer,Imported_customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_customer);
        All_customer=findViewById(R.id.All_customer);
        New_customer=findViewById(R.id.New_customer);
        Returing_customer=findViewById(R.id.Returing_customer);
        Imported_customer=findViewById(R.id.Imported_customer);
//        Add_List=findViewById(R.id.Add_List);

//        All_customer.setOnClickListener(v -> {
//            Intent i=new Intent(this, AllCustomerFragment.class);
//            startActivity(i);
//        });
//        New_customer.setOnClickListener(v -> {
//            Intent i=new Intent(this, NewCustomerActivity.class);
//            startActivity(i);
//        });
//        Returing_customer.setOnClickListener(v -> {
//            Intent i=new Intent(MyCustomer.this, Returning.class);
//            startActivity(i);
//        });
//        Imported_customer.setOnClickListener(v -> {
//            Intent i=new Intent(MyCustomer.this, Imported.class);
//            startActivity(i);
//        });


        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout,new AllCustomerFragment()).commit();





        Add_newCust=findViewById(R.id.Add_newCust);
        Add_newCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MyCustomer.this,R.style.bottom_shee_dailog_theam);
                View view= LayoutInflater.from(MyCustomer.this).
                        inflate(R.layout.addnewcustomer,(LinearLayout)findViewById(R.id.bottom_sheet_layout));
                bottomSheetDialog.setContentView(view);
//                EditText txtEdit= view.findViewById(R.id.Add_customerNew);
                view.findViewById(R.id.Add_customerNew).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        String productDetail=txtEdit.getText().toString();
                        bottomSheetDialog.dismiss();

                    }
                });
//        view.findViewById(R.id.btn_yes).setOnClickListener(v -> {
//            notesViewModel.delete_GSM_Note(id);
//            bottomSheetDialog.dismiss();
//            finish();
//        });

                bottomSheetDialog.show();
            }


        });


    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.All_customer:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new AllCustomerFragment()).commit();
                break;
            case R.id.New_customer:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new NewCustomerFragment()).commit();
                break;
            case R.id.Returing_customer:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new ReturingCustomerFragment()).commit();
                break;
            case R.id.Imported_customer:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new ImportedCustomerFragment()).commit();
                break;
        }
        }

}