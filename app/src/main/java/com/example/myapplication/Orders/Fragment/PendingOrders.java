package com.example.myapplication.Orders.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.R;

public class PendingOrders extends Fragment {

    Spinner SpineAllOrders;
    String s[]={"This week","Today","Yesterday","This Month","Life Time","Custom range"};

    public PendingOrders() {
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
        return inflater.inflate(R.layout.fragment_pending_orders, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SpineAllOrders=view.findViewById(R.id.spine_allOrders);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getContext(),R.layout.support_simple_spinner_dropdown_item,s);
        SpineAllOrders.setAdapter(arrayAdapter);
    }
}