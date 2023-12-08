package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FE_HS_Home extends AppCompatActivity
{
    String versionN_H, versionF_H, versionR_H, versionM_H;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_home);

        CharSequence text = "Sending message...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this /* MyActivity */, text, duration);
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
    public void onSubmitNewsClickH(View view){
        Intent intentSubmit = new Intent (this, FE_Form_SubmitNews.class);
        startActivity(intentSubmit);
    }
}