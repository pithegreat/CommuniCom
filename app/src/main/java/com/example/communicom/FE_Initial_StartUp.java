package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FE_Initial_StartUp extends AppCompatActivity {

    Spinner locationSelection;
    Button confirmButton;
    String selectionString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_initial_start_up);

        //confirmation selection button
        confirmButton = findViewById(R.id.confirmButton);
        //location selection spinner
        locationSelection = findViewById(R.id.locationSelection);
        //location selection adapter
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this,
                        R.array.locationsArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationSelection.setAdapter(adapter);
        //output with  string = locationSelection.getSelectedItem().toString();
        selectionString = locationSelection.getSelectedItem().toString();
    }
    public void onConfirmPressed(View view){
        selectionString = locationSelection.getSelectedItem().toString();
        Intent confirmIntent = new Intent(this, FE_HS_Home.class);
        Bundle confirmBundle = new Bundle();
        confirmBundle.getString("selectionString", selectionString);
        confirmIntent.putExtras(confirmBundle);
        startActivity(confirmIntent);

        finish();

    }

}