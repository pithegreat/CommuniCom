package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class FE_Form_SubmitNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_form_submit_news);
    }
    public void isOtherChecked(View view){
        CheckBox checkBoxOther = findViewById(R.id.checkBoxOther);
        EditText otherEntry = findViewById(R.id.otherEntry);

        if(checkBoxOther.isChecked()) {
            otherEntry.setVisibility(View.VISIBLE);

        }else{
            otherEntry.setVisibility(View.INVISIBLE);
        }
    }
}