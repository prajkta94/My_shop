package com.example.myapplication.ShoppingCart.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.ShoppingCart.Adapter.AvailbleCouponAdapter;
import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.Adapter.ShoppingCartAdapter;
import com.example.myapplication.ShoppingCart.Model.AvailbleCuponModel;
import com.example.myapplication.ShoppingCart.Model.ModelItemCart;
import com.example.myapplication.ShoppingCart.activity.MyAddressPage;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;


public class BagFragment extends Fragment {
    RecyclerView RecyclerView_ItemShoppingCart;
    ShoppingCartAdapter adapter;
    List<ModelItemCart> modelItemCartList;
    Button Btn_Continue;
    TextView txt_ApplyCoupon;



    public BagFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bag, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txt_ApplyCoupon=view.findViewById(R.id.txt_ApplyCoupon);
        txt_ApplyCoupon.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(getContext(),R.style.bottom_shee_dailog_theam);
            View view1= LayoutInflater.from(getContext()).
                    inflate(R.layout.layout_applycoupon,null);
            bottomSheetDialog.setContentView(view1);
            List<AvailbleCuponModel> availbleCuponModelList;
            AvailbleCouponAdapter adapter;

           RecyclerView RecylerView_AvailabeCoupon= view1.findViewById(R.id.RecylerView_AvailabeCoupon);
            RecylerView_AvailabeCoupon.setHasFixedSize(true);
            RecylerView_AvailabeCoupon.setLayoutManager(new LinearLayoutManager(view1.getContext()));
            availbleCuponModelList = new ArrayList<>();

            AvailbleCuponModel availbleCuponModel1=new AvailbleCuponModel("#123454","you saved 90rs(upto rs300)","Applicable 3 times per user");
            AvailbleCuponModel availbleCuponModel2=new AvailbleCuponModel("#12143","you saved 50rs(upto rs200)","Applicable 1 times per user");
            AvailbleCuponModel availbleCuponModel3=new AvailbleCuponModel("#12143","you saved 30rs(upto rs100)","Applicable 2 times per user");

            availbleCuponModelList.add(availbleCuponModel1);
            availbleCuponModelList.add(availbleCuponModel2);
            availbleCuponModelList.add(availbleCuponModel3);

            adapter = new AvailbleCouponAdapter((ArrayList<AvailbleCuponModel>) availbleCuponModelList, view1.getContext());
            RecylerView_AvailabeCoupon.setAdapter(adapter);
            view1.findViewById(R.id.txt_Apply).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Your Coupon is sucessfully Added", Toast.LENGTH_SHORT).show();
                    bottomSheetDialog.dismiss();
                }
            });



            bottomSheetDialog.show();
        });
        Btn_Continue=view.findViewById(R.id.btn_AddItem);
        Btn_Continue.setOnClickListener(v -> {
            Intent i=new Intent(getActivity(), MyAddressPage.class);
            startActivity(i);
        });

        RecyclerView_ItemShoppingCart=view.findViewById(R.id.RecyclerView_ItemShoppingCart);
        RecyclerView_ItemShoppingCart.setHasFixedSize(true);
        RecyclerView_ItemShoppingCart.setLayoutManager(new LinearLayoutManager(getActivity()));
        modelItemCartList = new ArrayList<>();


        ModelItemCart modelItemCart1=new ModelItemCart("Sari","you saved 90rs","300","210","(30%off)",0);
        ModelItemCart modelItemCart2=new ModelItemCart("T-shirt","you saved 50rs","400","350","(30%off)",0);
        ModelItemCart modelItemCart3=new ModelItemCart("T-shirt","you saved 30rs","300","270","(30%off)",0);

        modelItemCartList.add(modelItemCart1);
        modelItemCartList.add(modelItemCart2);
        modelItemCartList.add(modelItemCart3);

        adapter = new ShoppingCartAdapter( getActivity(),(ArrayList<ModelItemCart>) modelItemCartList);
        RecyclerView_ItemShoppingCart.setAdapter(adapter);
    }
}