package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class BE_HS_Forums extends AppCompatActivity {

    String versionM_F_BE, versionN_F_BE, versionF_F_BE, versionR_F_BE;
    //strings for internal use
    String filterString;
    ArrayAdapter<CharSequence> filterSelectionAdapter;
    Spinner filterSelection;
    //settings for toast
    CharSequence text;
    int duration;
    Toast toast;
    //subscriber alert switch
    int sub = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_hs_forums);

        text = "Sending message...";
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(this /* MyActivity */, text, duration);

        filterSelection = findViewById(R.id.filterBySpinner);
        filterSelectionAdapter = ArrayAdapter.createFromResource(this,
                R.array.filterByArray, android.R.layout.simple_spinner_item);
        //location selection adapter
        filterSelectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filterSelection.setAdapter(filterSelectionAdapter);
        //output with  string = locationSelection.getSelectedItem().toString();
    }
    public void onConfirmFilterClicked_BE(View view){
        TextView currentFilter = findViewById(R.id.currentFilter);
        filterString = filterSelection.getSelectedItem().toString();
        currentFilter.setText("Currently Filtered By: "+filterString);
    }
    public void onNewsClickF_BE(View view){
        Intent intentN = new Intent(this, BE_HS_News.class);
        intentN.putExtra("version", versionN_F_BE);
        startActivity(intentN);

        finish();
    }
    public void onForumsClickF_BE(View view)
    {
        Intent intentF = new Intent(this, BE_HS_Forums.class);
        intentF.putExtra("version", versionF_F_BE);
        startActivity(intentF);

        finish();
    }
    public void onResourcesClickF_BE(View view)
    {
        Intent intentR = new Intent(this, BE_HS_Resources.class);
        intentR.putExtra("version", versionR_F_BE);
        startActivity(intentR);

        finish();

    }
    public void onMapsClickF_BE(View view)
    {
        Intent intentM = new Intent(this, BE_HS_Maps.class);
        intentM.putExtra("version", versionM_F_BE);
        startActivity(intentM);

        finish();
    }
    public void onCPostBtnPressed_BE(View view)
    {

    }
    public void onAlertsBtnPressed_BE(View view)
    {
        if (sub == 0){
            sub = 1;
            toast.setText("SUBSCRIPTION CONFIRMED!");
            toast.show();
        }
        else if (sub == 1){
            sub = 0;
            toast.setText("SUBSCRIPTION REVOKED!");
            toast.show();
        }
    }
    public void onShareBtnPressed_BE(View view)
    {
        toast.setText("BACK_END RESPONSE_SHARE");
        toast.show();
    }
    public void onReportBtnPressed_BE(View view)
    {
        toast.setText("BACK_END RESPONSE_REPORT");
        toast.show();
    }

}