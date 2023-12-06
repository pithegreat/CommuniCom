package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FE_HS_Home extends AppCompatActivity
{
    String versionN_H, versionF_H, versionR_H, versionM_H;
    TabLayout navigation;
    ViewPager2 viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_home);

        viewPager = findViewById(R.id.vp);
        navigation = findViewById(R.id.Navs);

        ViewPagerAdapter adapt = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(adapt);

        new TabLayoutMediator(navigation,viewPager,(tab, position) -> {
            switch (position){
                case 0: tab.setText("Home");
                break;
                case 1: tab.setText("News");
                    break;
                case 2: tab.setText("Forums");
                    break;
                case 3: tab.setText("Resources");
                    break;
                case 4: tab.setText("Map");
                    break;
            }
        }).attach();
    }
}
 /*   @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_home);

        CharSequence text = "Sending message...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this /* MyActivity *//*, text, duration);
    }
    public void onNewsClickH(View view){
        Intent intentN = new Intent(this, FE_HS_News.class);
        intentN.putExtra("version", versionN_H);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickH(View view)
    {
        Intent intentF = new Intent(this, FE_HS_Forums.class);
        intentF.putExtra("version", versionF_H);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickH(View view)
    {
        Intent intentR = new Intent(this, FE_HS_Resources.class);
        intentR.putExtra("version", versionR_H);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickH(View view)
    {
        Intent intentM = new Intent(this, FE_HS_Maps.class);
        intentM.putExtra("version", versionM_H);
        startActivity(intentM);

        finish();
    }
}*/