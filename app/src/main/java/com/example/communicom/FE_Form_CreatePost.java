package com.example.communicom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FE_Form_CreatePost extends AppCompatActivity {
    CharSequence text;
    int duration;
    Toast toast;
    TextView post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe_form_create_post);
        post = findViewById(R.id.post);
        text = "Cooking...";
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(this /* MyActivity */, text, duration);
    }
    public void onFinishClicked(View view)
    {
        if(post.getText()!=null)
        {
            try (FileOutputStream outputStream = openFileOutput("info.txt", Context.MODE_APPEND)) {
                String out = post.getText().toString()+";\n";
                outputStream.write(out.getBytes());
                // outputStream.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        toast.setText("Cooked!");
        toast.show();
        finish();
    }
}