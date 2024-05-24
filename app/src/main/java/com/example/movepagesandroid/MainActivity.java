package com.example.movepagesandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
// Intents : facilitate to move bet components
        //second step is to call the button action
        Button btn =  findViewById(R.id.Btn) ;// this is calling the id button from main.xml
        btn.setOnClickListener(new View.OnClickListener() {       // this function
            @Override
            public void onClick(View v) {
                goToSecondActivity(); // in this function we  call  the goToSecondActivity()
            }
        });


    }

    public void goToSecondActivity(){
        Intent intent = new Intent(this, secondActivity.class);
        // first step. this help to go the next pas, ('This' means current location and secondAct.class is the class of next page
        startActivity(intent);
        // startActivity(intent) is a android method




    }
}