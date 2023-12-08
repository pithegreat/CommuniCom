package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FE_HS_Forums extends AppCompatActivity {
//strings for transfer of data via intent
    String versionM_F, versionN_F, versionF_F, versionR_F;
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
    TextView display;
    String line = "";
    String txt = "";
    String [] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_hs_forums);
        display = findViewById(R.id.displayPosts);

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

        try(FileInputStream fis = openFileInput("info.txt")){
            InputStreamReader input = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(input);
            while((line = br.readLine())!=null)
                txt+= line+"\n";

        } catch (FileNotFoundException e) {
            //System.out.println("Nooooooooo");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        data = txt.split("\n");

        display.setText(data[0]);



    }

    public void onConfirmFilterClicked(View view){
        TextView currentFilter = findViewById(R.id.currentFilter);
        filterString = filterSelection.getSelectedItem().toString();
        currentFilter.setText("Currently Filtered By: "+filterString);
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
    public void onCPostBtnPressed_FE(View view)
    {
        Intent createPost = new Intent(this, FE_Form_CreatePost.class);
        startActivity(createPost);
    }
    public void onAlertsBtnPressed_FE(View view)
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
    public void onShareBtnPressed_FE(View view)
    {
        toast.setText("SHARED WITH FRIENDS!");
        toast.show();
    }
    public void onReportBtnPressed_FE(View view)
    {
        toast.setText("REPORT SUBMIT!");
        toast.show();
    }
    public void onReturnHomePressedF_FE(View view){
        Intent forumHome = new Intent(this, FE_HS_Home.class);
        startActivity(forumHome);

        finish();
    }

    public void onNextClicked(View view)
    {

    }
    public void onPrevClicked(View view)
    {

    }
}