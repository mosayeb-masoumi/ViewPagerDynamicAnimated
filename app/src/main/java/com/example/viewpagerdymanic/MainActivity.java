package com.example.viewpagerdymanic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewpager;
    SmartTabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabLayout);


        List<String> tabs = new ArrayList<>();
        tabs.add("tab0_tab0");
        tabs.add("tab1");
        tabs.add("tab2_tab2");
        tabs.add("tab3");
        tabs.add("tab4_tab4");
        tabs.add("tab5");




        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), tabs);
        viewpager.setAdapter(adapter);
        tabLayout.setViewPager(viewpager); // set title to tabs

        viewpager.setCurrentItem(3);


    }


}