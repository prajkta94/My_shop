package com.example.myapplication.Orders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

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
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MaintabActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintab);
        getSupportActionBar().setTitle(" ");

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

       getSupportActionBar().setTitle("ORDERS");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
//       tabLayout.addOnTabSelectedListener();

//      tabLayout.getTabAt(0).setCustomView(R.layout.fragment_all_orders);
//        tabLayout.getTabAt(1).setCustomView(R.layout.fragment_pending_orders);
//        tabLayout.getTabAt(2).setCustomView(R.layout.fragment_accepted_orders);
//        tabLayout.getTabAt(3).setCustomView(R.layout.fragment_shipped_orders);
//        tabLayout.getTabAt(4).setCustomView(R.layout.fragment_delivered_orders);
//        tabLayout.getTabAt(5).setCustomView(R.layout.fragment_modify_orders);
//        tabLayout.getTabAt(6).setCustomView(R.layout.fragment_rejectd_orders);
//        tabLayout.getTabAt(7).setCustomView(R.layout.fragment_cancelled_orders);
//        tabLayout.getTabAt(8).setCustomView(R.layout.fragment_failed_orders);


    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AllOrders(), "All");
        adapter.addFragment(new PendingOrders(), "Pending");
        adapter.addFragment(new AcceptedOrders(), "Accepted");
        adapter.addFragment(new ShippedOrders(), "Shipped");
        adapter.addFragment(new DeliveredOrders(), "Delivers");
        adapter.addFragment(new ModifyOrders(), "Modify");
        adapter.addFragment(new RejectdOrders(), "Rejectd");
        adapter.addFragment(new CancelledOrders(), "Cancelled");
        adapter.addFragment(new FailedOrders(), "Failed");
        viewPager.setAdapter(adapter);




        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}