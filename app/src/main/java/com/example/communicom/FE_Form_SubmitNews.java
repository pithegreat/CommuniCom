package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FE_Form_SubmitNews extends AppCompatActivity {

    private static final String FILE_NAME = "form_submitNews";
    public CheckBox susView, missingView, comm_aView, hazardView, weatherView, otherChkView;
    public EditText otherEntryView, commentsView;
    public Spinner locationSelectionView;
    public String sus, missing, comm_a, hazard, weather, other, location, time, comments;
    CharSequence text;
    int duration;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_form_submit_news);

        text = "Sending message...";
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(this /* MyActivity */, text, duration);

        susView = findViewById(R.id.susCheckbox);
        missingView = findViewById(R.id.missingCheckbox);
        comm_aView = findViewById(R.id.comm_aCheckbox);
        hazardView = findViewById(R.id.hazardCheckbox);
        weatherView = findViewById(R.id.weatherCheckbox);
        otherChkView = findViewById(R.id.checkBoxOther);
        otherEntryView = findViewById(R.id.otherEntry);
        commentsView = findViewById(R.id.additionalText);



        locationSelectionView = findViewById(R.id.form_submitNews_locationSelection);
        //location selection adapter
        ArrayAdapter<CharSequence> locationAdapter =
                ArrayAdapter.createFromResource(this,
                        R.array.locationsArray, android.R.layout.simple_spinner_item);
        locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationSelectionView.setAdapter(locationAdapter);
        //output with  string = locationSelection.getSelectedItem().toString();
        location = locationSelectionView.getSelectedItem().toString();
    }

    public void isOtherChecked(View view){
        CheckBox checkBoxOther = findViewById(R.id.checkBoxOther);
        TextView otherTextView = findViewById(R.id.otherTextView);
        EditText otherEntry = findViewById(R.id.otherEntry);

        if(checkBoxOther.isChecked()) {
            otherTextView.setVisibility(View.VISIBLE);
            otherEntry.setVisibility(View.VISIBLE);

        }else{
            otherTextView.setVisibility(View.INVISIBLE);
            otherEntry.setVisibility(View.INVISIBLE);
        }
    }
    public void onRadioButtonPressed(View view){

        RadioGroup radioGroup = findViewById(R.id.timeRadioGroup);
        int selectedID = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selectedID);
        time = radioButton.getText().toString();
    }
    public static void writeToFile(Context context, String fileName, String[] elements) {
        try {
            // Open the file in append mode, if the file doesn't exist, it will be created
            FileOutputStream fileOutputStream = context.openFileOutput(fileName, Context.MODE_APPEND);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            // Iterate through the elements and append them to the file
            for (String element : elements) {
                outputStreamWriter.write(element + ", ");//
            }
            outputStreamWriter.write("\n");
            // Close the streams
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onSubmitNewsButtonPressed(View view) {
        if (susView.isChecked()) {
            sus = "Suspicious Activity";
        }
        if (missingView.isChecked()) {
            missing = "Missing Items";
        }
        if (comm_aView.isChecked()) {
            comm_a = "Community Alert";
        }
        if (hazardView.isChecked()) {
            hazard = "Potential Hazards";
        }
        if (weatherView.isChecked()) {
            weather = "Weather Conditions";
        }
        if (otherChkView.isChecked()) {
            other = otherEntryView.getText().toString();
        }

        comments = commentsView.getText().toString();

        location = locationSelectionView.getSelectedItem().toString();
        //all outputs working
        String[] elements = {sus, missing, comm_a, hazard, weather, other, time, location, comments};
        writeToFile(this, FILE_NAME, elements);
        String newsElementsTrial = ("SUBMIT TO FILE!");
        toast.setText(newsElementsTrial);
        //String[] newsElements = {sus,missing,comm_a,hazard,weather,other};
        toast.show();
        finish();
    }
}