package com.example.myapplication.add_varient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.myapplication.Adapter.CategoriesAdapter;
import com.example.myapplication.Adapter.SizeAddAdapter;
import com.example.myapplication.MODEL.CategoryDetail_Data;
import com.example.myapplication.MODEL.SizeData;
import com.example.myapplication.R;
import com.example.myapplication.add_varient.adapter.SizeAdapter;

import java.util.ArrayList;
import java.util.List;

public class AcivityAddVarient extends AppCompatActivity {

    RecyclerView size_recycler;
    Button size_add_btn;
    LinearLayout size_extendable_layout;
    ConstraintLayout size_base_layout;
    CardView sizeCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acivity_add_varient);
        size_recycler=findViewById(R.id.size_recycler);
        size_add_btn=findViewById(R.id.size_add_btn);
        size_base_layout=findViewById(R.id.size_base_layout);
        sizeCardView=findViewById(R.id.size_card_view);
        size_extendable_layout=findViewById(R.id.size_extendable_layout);
        size_recycler.setLayoutManager(new GridLayoutManager(this,1));
        SizeAdapter sizeAdapter=new SizeAdapter(this);
        size_recycler.setAdapter(sizeAdapter);
        size_add_btn.setOnClickListener(v -> {
            sizeAdapter.addSize();
        });

        size_base_layout.setOnClickListener(v -> {
            if (size_extendable_layout.getVisibility()== View.VISIBLE){
                TransitionManager.beginDelayedTransition(sizeCardView,
                        new AutoTransition());
                size_extendable_layout.setVisibility(View.GONE);
            }else {
                TransitionManager.beginDelayedTransition(sizeCardView,
                        new AutoTransition());
                size_extendable_layout.setVisibility(View.VISIBLE);
            }
        });
    }
}