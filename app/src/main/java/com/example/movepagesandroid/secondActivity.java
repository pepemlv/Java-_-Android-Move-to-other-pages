package com.example.movepagesandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Button myButton  = findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoFirstPage();
            }
        });

// 1.initialize button
Button buttonGoogle = findViewById(R.id.buttonGoogle);
//2. set the click listener in button using button id  follow by the .setOncl...
        // int the parenthese type new view.on.click.. the android will create the method onclick
        // int method on clik put the function created like  goToWebpage()
        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToWebPage();

            }
        });

    }

    public void gotoFirstPage(){
        Intent intent =new Intent( this, MainActivity.class);
        startActivity(intent);
    }
public void goToWebPage (){
    Uri webpage = Uri.parse("https://www.google.com");
    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
    startActivity(intent);

}

}