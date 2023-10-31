package com.example.myapplication.Orders.Fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class TabScrollMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_scroll_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout, new AllOrders()).commit();

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.All_fragment:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new AllOrders()).commit();
                break;
//            case R.id.course_lay:
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.layout,
//                                new CourseFragment()).commit();
//                break;
//            case R.id.profile_lay:
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.layout,
//                                new ProfileFragment()).commit();
        }
    }
}