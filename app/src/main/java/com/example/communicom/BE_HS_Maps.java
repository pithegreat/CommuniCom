package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BE_HS_Maps extends AppCompatActivity {

    String versionN_M_BE, versionF_M_BE, versionR_M_BE, versionM_M_BE;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_hs_maps);
    }
    public void onNewsClickM_BE (View view)
    {
        Intent intentN = new Intent(this, BE_HS_News.class);
        intentN.putExtra("version", versionN_M_BE);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickM_BE (View view)
    {
        Intent intentF = new Intent(this, BE_HS_Forums.class);
        intentF.putExtra("version", versionF_M_BE);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickM_BE (View view)
    {
        Intent intentR = new Intent(this, BE_HS_Resources.class);
        intentR.putExtra("version", versionR_M_BE);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickM_BE (View view)
    {
        Intent intentM = new Intent(this, FE_HS_Maps.class);
        intentM.putExtra("version", versionM_M_BE);
        startActivity(intentM);

        finish();
    }

}