package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FE_HS_News extends AppCompatActivity {

    String versionN_N, versionF_N, versionR_N, versionM_N;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_news);
    }
    public void onNewsClickN(View view){
        Intent intentN = new Intent(this, FE_HS_News.class);
        intentN.putExtra("version", versionN_N);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickN(View view)
    {
        Intent intentF = new Intent(this, FE_HS_Forums.class);
        intentF.putExtra("version", versionF_N);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickN(View view)
    {
        Intent intentR = new Intent(this, FE_HS_Resources.class);
        intentR.putExtra("version", versionR_N);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickN(View view)
    {
        Intent intentM = new Intent(this, FE_HS_Maps.class);
        intentM.putExtra("version", versionM_N);
        startActivity(intentM);

        finish();
    }
    public void onReturnHomePressedN_FE(View view){
        Intent mapsHome = new Intent(this, FE_HS_Home.class);
        startActivity(mapsHome);

        finish();
    }
}