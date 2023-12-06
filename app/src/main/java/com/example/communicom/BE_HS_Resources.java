package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BE_HS_Resources extends AppCompatActivity {

    String versionR_R_BE, versionF_R_BE, versionN_R_BE, versionM_R_BE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_hs_resources);
    }
    public void onNewsClickR_BE(View view){
        Intent intentN = new Intent(this, BE_HS_News.class);
        intentN.putExtra("version", versionN_R_BE);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickR_BE(View view)
    {
        Intent intentF = new Intent(this, BE_HS_Forums.class);
        intentF.putExtra("version", versionF_R_BE);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickR_BE(View view)
    {
        Intent intentR = new Intent(this, BE_HS_Resources.class);
        intentR.putExtra("version", versionR_R_BE);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickR_BE(View view)
    {
        Intent intentM = new Intent(this, BE_HS_Maps.class);
        intentM.putExtra("version", versionM_R_BE);
        startActivity(intentM);

        finish();
    }
}