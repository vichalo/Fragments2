package com.example.toolbarplus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.widget.Toolbar;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private Spinner cmbToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tbar = findViewById(R.id.appbar);
        setSupportActionBar(tbar);

        ViewPager2 viewPager = findViewById(R.id.viewpager);
        FragmentAdapter fragmentAdapter  = new FragmentAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(fragmentAdapter);

        TabLayout tabLayout = findViewById(R.id.appbartabs);

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            tab.setText("Tab " + (position+1));
        }).attach();



    }
}