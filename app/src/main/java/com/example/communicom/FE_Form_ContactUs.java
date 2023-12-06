package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FE_Form_ContactUs extends AppCompatActivity {

    CharSequence text;
    int duration;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_form_contact_us);

        text = "Sending message...";
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(this /* MyActivity */, text, duration);


    }
    public void onSubmitButtonPressed(View view){

        toast.setText("Form Submit!");
        toast.show();
        finish();
    }
}