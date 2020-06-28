package com.example.jobifyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button = findViewById(R.id.button);

    }
    public void But(View view)
    {

               Intent intent = new Intent(this, FirstScreen.class);

               startActivity(intent);
               Toast.makeText(this,"Sign up successful",Toast.LENGTH_LONG);


           }
}