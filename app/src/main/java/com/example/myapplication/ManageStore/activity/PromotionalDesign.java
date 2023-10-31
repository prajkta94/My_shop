package com.example.myapplication.ManageStore.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.PromotionalDesigns.activity.BussinessCardActivity;
import com.example.myapplication.PromotionalDesigns.activity.StoredBanner_Activty;
import com.example.myapplication.R;

public class PromotionalDesign extends AppCompatActivity {
    CardView cardView_whatsAppstories,cardview_BussinessCard,cardView_StoreBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotional_design);
        cardview_BussinessCard=findViewById(R.id.cardview_BussinessCard);
        cardView_StoreBanner=findViewById(R.id.cardView_StoreBanner);
        cardView_whatsAppstories=findViewById(R.id.cardView_whatsAppstories);


        cardview_BussinessCard.setOnClickListener(v -> {
            Intent i =new Intent(PromotionalDesign.this, BussinessCardActivity.class);
            startActivity(i);

        });
        cardView_StoreBanner.setOnClickListener(v -> {
            Intent i =new Intent(PromotionalDesign.this, StoredBanner_Activty.class);
            startActivity(i);

        });


        cardView_whatsAppstories.setOnClickListener(v -> {

        });

    }
}