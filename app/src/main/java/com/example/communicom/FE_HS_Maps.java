package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FE_HS_Maps extends AppCompatActivity {

    String versionN_M, versionF_M, versionR_M, versionM_M;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_maps);
    }
    public void onNewsClickM(View view)
    {
        Intent intentN = new Intent(this, FE_HS_News.class);
        intentN.putExtra("version", versionN_M);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickM(View view)
    {
        Intent intentF = new Intent(this, FE_HS_Forums.class);
        intentF.putExtra("version", versionF_M);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickM(View view)
    {
        Intent intentR = new Intent(this, FE_HS_Resources.class);
        intentR.putExtra("version", versionR_M);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickM(View view)
    {
        Intent intentM = new Intent(this, FE_HS_Maps.class);
        intentM.putExtra("version", versionM_M);
        startActivity(intentM);

        finish();
    }
    public void onReturnHomePressedM_FE(View view){
        Intent mapsHome = new Intent(this, FE_HS_Home.class);
        startActivity(mapsHome);
    }
}