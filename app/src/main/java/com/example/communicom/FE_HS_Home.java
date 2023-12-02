package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FE_HS_Home extends AppCompatActivity {

    Spinner pageSelSpinner;
    String pageSelectionString, confirmDataString;
    TextView currentPage_Header;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_home);

        CharSequence text = "Sending message...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this /* MyActivity */, text, duration);

        Intent confirmIntent = getIntent();
        Bundle confirmBundle = confirmIntent.getExtras();

        confirmDataString = confirmBundle.getString("selectionString");
        pageSelSpinner = findViewById(R.id.pageSelSpinner);

        //location selection spinner
        //location selection adapter

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this,
                        R.array.pageSelArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pageSelSpinner.setAdapter(adapter);

        //output with  string = locationSelection.getSelectedItem().toString();
        currentPage_Header.setText(pageSelSpinner.getSelectedItem().toString());


    }
}