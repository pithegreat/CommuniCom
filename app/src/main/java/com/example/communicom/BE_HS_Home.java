package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BE_HS_Home extends AppCompatActivity {

    String versionN_H_BE, versionF_H_BE, versionR_H_BE, versionM_H_BE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_hs_home);


        CharSequence text = "Sending message...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this /* MyActivity */, text, duration);
    }
    public void onNewsClickH_BE(View view){
        Intent intentN = new Intent(this, BE_HS_News.class);
        intentN.putExtra("version", versionN_H_BE);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickH_BE(View view)
    {
        Intent intentF = new Intent(this, BE_HS_Forums.class);
        intentF.putExtra("version", versionF_H_BE);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickH_BE(View view)
    {
        Intent intentR = new Intent(this, BE_HS_Resources.class);
        intentR.putExtra("version", versionR_H_BE);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickH_BE(View view)
    {
        Intent intentM = new Intent(this, BE_HS_Maps.class);
        intentM.putExtra("version", versionM_H_BE);
        startActivity(intentM);

        finish();
    }
}