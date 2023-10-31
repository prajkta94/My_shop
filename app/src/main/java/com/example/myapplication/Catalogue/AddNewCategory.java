package com.example.myapplication.Catalogue;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputEditText;

public class AddNewCategory extends AppCompatActivity {

    ImageView Category_Picture;
    TextView TxtUpadte_image;
    TextInputEditText Addnew_Category;
    Button BtnCreate_Category;
    private static final int PICK_FROM_GALLERY = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_category);
        Category_Picture=findViewById(R.id.Category_Picture);
        Addnew_Category=findViewById(R.id.Catgory_Namenew);
        BtnCreate_Category=findViewById(R.id.BtnCreate);
        BtnCreate_Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddNewCategory.this,"Category add sucesfully",Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(AddNewCategory.this,Catalogue.class);
//             String s=   Addnew_Category.getText().toString();
//             String i=Category_Picture.getT
//                i.putExtra("categoryName","s");
//                i.putExtra("image","")
//                startActivity(i);

            }
        });

//        Category_Picture.setOnClickListener(v -> {
//            try {
//                if (ActivityCompat.checkSelfPermission(AddNewCategory.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(AddNewCategory.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, PICK_FROM_GALLERY);
//                } else {
//                    Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                    startActivityForResult(galleryIntent, PICK_FROM_GALLERY);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            @Override
//            public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults)
//            {
//                switch (requestCode) {
//                    case PICK_FROM_GALLERY:
//                        // If request is cancelled, the result arrays are empty.
//                        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                            Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                            startActivityForResult(galleryIntent, PICK_FROM_GALLERY);
//                        } else {
//                            //do something like displaying a message that he didn`t allow the app to access gallery and you wont be able to let him select from gallery
//                        }
//                        break;
//                }
//            }
//    });




    }
}