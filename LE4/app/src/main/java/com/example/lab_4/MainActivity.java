package com.example.lab_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button click;
    ImageView  image;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.button);
        image = findViewById(R.id.text1);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==1)
                {
                    image.setImageResource(R.drawable.trump);
                    i=0;
                }
                else {
                    image.setImageResource(R.drawable.modi);
                    i=1;
                }

            }
        });


    }
}