package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginScreen extends AppCompatActivity {
    Button Btn_Login;
    TextInputEditText editText_MobileNo;
   public int MobileNo = 900000200;
   public String Address_Office="King Worldwide Courier & Logistics,Gala No 1,Sai Darshan CHS,Road No 7,near \nAkruti Star Center,Andheri MIDC, Andheri East, Mumbai-400069";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        editText_MobileNo=findViewById(R.id.edt_PhoneNumber);

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);

// Creating an Editor object to edit(write to the file)
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

// Storing the key and its value as the data fetched from edittext
        myEdit.putString("Mobile", String.valueOf(MobileNo));
        myEdit.putString("Address_Office", String.valueOf(Address_Office));



// Once the changes have been made,
// we need to commit to apply those changes made,
// otherwise, it will throw an error
        myEdit.commit();
        Btn_Login=findViewById(R.id.Btn_Login);
        Btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if((editText_MobileNo.getText().toString()).equals(MobileNo)){
                Intent i = new Intent(LoginScreen.this,HomePage.class);
//                i.putExtra(String.valueOf(MobileNo),"MobileNo");
                startActivity(i);
//            }
        }
        });


    }
}