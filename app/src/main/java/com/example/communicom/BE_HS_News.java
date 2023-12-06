package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BE_HS_News extends AppCompatActivity {

    String versionN_N_BE, versionF_N_BE, versionR_N_BE, versionM_N_BE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_hs_news);
    }
    public void onNewsClickN_BE(View view){
        Intent intentN = new Intent(this, BE_HS_News.class);
        intentN.putExtra("version", versionN_N_BE);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickN_BE(View view)
    {
        Intent intentF = new Intent(this, BE_HS_Forums.class);
        intentF.putExtra("version", versionF_N_BE);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickN_BE(View view)
    {
        Intent intentR = new Intent(this, BE_HS_Resources.class);
        intentR.putExtra("version", versionR_N_BE);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickN_BE(View view)
    {
        Intent intentM = new Intent(this, BE_HS_Maps.class);
        intentM.putExtra("version", versionM_N_BE);
        startActivity(intentM);

        finish();
    }
}