package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FE_Form_SubmitNews extends AppCompatActivity {

    private static final String FILE_NAME = "form_submitNews";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_form_submit_news);



        String[] elements = {};
        writeToFile(this, FILE_NAME, elements);

        /*studentNumber = w_studentNumEdit.getText().toString();
        lastName = w_lastEdit.getText().toString();
        firstName = w_firstEdit.getText().toString();
        gender = w_genderRGroup.getText().toString();
        division = w_divSpinner.getSelectedItem().toString();
        fullName = lastName + " , " + firstName;
        i++;
        saveCounterToPreferences(i);
        String[] elements = {String.valueOf(i), studentNumber, fullName, gender, division};
        writeToFile(this, FILE_NAME, elements);*/
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
}