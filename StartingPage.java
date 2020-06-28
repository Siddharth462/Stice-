package com.example.jobifyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingPage extends AppCompatActivity {
Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);

    }
    public void Buton(View view)
    {

        Intent intent = new Intent(this, FirstScreen.class);

        startActivity(intent);
    }
}