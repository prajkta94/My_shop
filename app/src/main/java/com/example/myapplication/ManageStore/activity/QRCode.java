package com.example.myapplication.ManageStore.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.myapplication.R;

public class QRCode extends AppCompatActivity {
    LinearLayout LinearLay_PrintPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        LinearLay_PrintPdf=findViewById(R.id.LinearLay_PrintPdf);
        LinearLay_PrintPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QRCode.this, "Your QRcode Pdf is Scuessfully downlode", Toast.LENGTH_SHORT).show();
            }
        });
    }
}