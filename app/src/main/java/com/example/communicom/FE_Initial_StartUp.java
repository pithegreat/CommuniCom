package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class FE_Initial_StartUp extends AppCompatActivity {

    Spinner locationSelection;
    Button confirmButton;
    String selectionString;
    String keyword = "Please?";

    CharSequence text;
    int duration;
    Toast toast;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_initial_start_up);

        text = "Sending message...";
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(this /* MyActivity */, text, duration);

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

    }
    public void onAdminModePressed(View view){
        selectionString = locationSelection.getSelectedItem().toString();
        if (selectionString.equals(keyword)){
            Intent adminIntent = new Intent(this, BE_HS_Home.class);
            Bundle adminBundle = new Bundle();
            adminBundle.getString("selectionString", selectionString);
            adminIntent.putExtras(adminBundle);
            startActivity(adminIntent);
            toast.setText("ADMIN MODE ENABLED");
            toast.show();
        } else{
            toast.setText("Gotta say the magic word!");
            toast.show();
        }
    }

}