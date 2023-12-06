package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FE_HS_Forums extends AppCompatActivity {
//strings for transfer of data
    String versionM_F, versionN_F, versionF_F, versionR_F;
//strings for internal use
    String filterString;
    ArrayAdapter<CharSequence> filterSelectionAdapter;
    Spinner filterSelection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_forums);

        filterSelection = findViewById(R.id.filterBySpinner);
        filterSelectionAdapter = ArrayAdapter.createFromResource(this,
                R.array.filterByArray, android.R.layout.simple_spinner_item);
        //location selection adapter
        filterSelectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filterSelection.setAdapter(filterSelectionAdapter);
        //output with  string = locationSelection.getSelectedItem().toString();
        filterString = filterSelection.getSelectedItem().toString();
    }

    public void onConfirmFilterClicked(View view){

    }
    public void onNewsClickF(View view){
        Intent intentN = new Intent(this, FE_HS_News.class);
        intentN.putExtra("version", versionN_F);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickF(View view)
    {
        Intent intentF = new Intent(this, FE_HS_Forums.class);
        intentF.putExtra("version", versionF_F);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickF(View view)
    {
        Intent intentR = new Intent(this, FE_HS_Resources.class);
        intentR.putExtra("version", versionR_F);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickF(View view)
    {
        Intent intentM = new Intent(this, FE_HS_Maps.class);
        intentM.putExtra("version", versionM_F);
        startActivity(intentM);

        finish();
    }
}