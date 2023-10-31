package com.example.myapplication.ShoppingCart.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.HomePage;
import com.example.myapplication.R;
import com.example.myapplication.ShoppingCart.activity.MyAddressPage;
import com.example.myapplication.ShoppingCart.activity.MyOrder;

public class AccountFragment extends Fragment {
    ConstraintLayout constrient_MyOrder,constrient_MyAddress,constrient_SignOutCustomer;



    public AccountFragment() {
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
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        constrient_MyAddress=view.findViewById(R.id.constrient_MyAddress);
        constrient_MyOrder=view.findViewById(R.id.constrient_MyOrder);
        constrient_SignOutCustomer=view.findViewById(R.id.constrient_SignOutCustomer);
        constrient_MyOrder.setOnClickListener(v -> {
            Intent i=new Intent(getActivity(), MyOrder.class);
            startActivity(i);

        });

        constrient_MyAddress.setOnClickListener(v -> {
            Intent i=new Intent(getActivity(), MyAddressPage.class);
            startActivity(i);

        });

        constrient_SignOutCustomer.setOnClickListener(v -> {
            Intent i=new Intent(getActivity(), HomePage.class);
            startActivity(i);
        });

    }
}