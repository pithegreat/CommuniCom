package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FE_HS_Resources extends AppCompatActivity {

    String versionR_R, versionF_R, versionN_R, versionM_R;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_resources);
    }
    public void onContactUsPressedF_FE(View view){
        Intent intentN = new Intent(this, FE_Form_ContactUs.class);
        startActivity(intentN);
    }
    public void onNewsClickR(View view){
        Intent intentN = new Intent(this, FE_HS_News.class);
        intentN.putExtra("version", versionN_R);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickR(View view)
    {
        Intent intentF = new Intent(this, FE_HS_Forums.class);
        intentF.putExtra("version", versionF_R);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickR(View view)
    {
        Intent intentR = new Intent(this, FE_HS_Resources.class);
        intentR.putExtra("version", versionR_R);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickR(View view)
    {
        Intent intentM = new Intent(this, FE_HS_Maps.class);
        intentM.putExtra("version", versionM_R);
        startActivity(intentM);

        finish();
    }
    public void onReturnHomePressedR_FE(View view){
        Intent resourcesHome = new Intent(this, FE_HS_Home.class);
        startActivity(resourcesHome);

        finish();
    }
}