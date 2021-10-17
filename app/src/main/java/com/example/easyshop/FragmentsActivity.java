package com.example.easyshop;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.easyshop.Fragments.HomeFragment;
import com.example.easyshop.Fragments.MyActivityFragment;
import com.example.easyshop.Fragments.ProfileFragment;
import com.example.easyshop.Fragments.SellFragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class FragmentsActivity extends AppCompatActivity {

//   Initialize variables

    MeowBottomNavigation bottomNavigation;
    FrameLayout framelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        //Assign variable
        framelayout = findViewById(R.id.frame);
        bottomNavigation = findViewById(R.id.bottomnavigation);

        getSupportActionBar().hide();

        //Add menu items

        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_dollars_money_bag_on_a_hand));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_baseline_forum_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_baseline_account_circle_24));

//        bottomNavigation.show(1,true);

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
//                Toast.makeText(FragmentsActivity.this, "showing item : " + item.getId(), Toast.LENGTH_SHORT).show();

                Fragment fragment= null;
                switch (item.getId()) {
                    case 1:
                        fragment = new HomeFragment();
                        break;
                    case 2:
                        fragment = new SellFragment();
                        break;
                    case 3:
                        fragment = new MyActivityFragment();
                        break;
                    case 4:
                        fragment = new ProfileFragment();
                        break;
                }
                loadfragment(fragment);
            }
        });

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(FragmentsActivity.this, "clicked item : " + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });


        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(FragmentsActivity.this, "reselected item : " + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigation.setCount(4, "115");

        bottomNavigation.show(4,true);

    }

    private void loadfragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().
                replace(R.id.frame,fragment,"").
                commit();
   }
}
