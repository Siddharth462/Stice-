package com.example.jobifyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class AddTask extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<String>(5);
    ArrayList<String> arrayList = new ArrayList<>(5);
    ArrayList<String>payment = new ArrayList<>(5);
    ArrayList<String>phone = new ArrayList<>(5);
    ArrayList<String> timing = new ArrayList<>(5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        Intent intent = getIntent();

        this.list= intent.getStringArrayListExtra("List");
        this.arrayList = intent.getStringArrayListExtra("Description");
        this.payment = intent.getStringArrayListExtra("Payment");
        this.phone = intent.getStringArrayListExtra("Phone");
        this.timing  = intent.getStringArrayListExtra("Time");

    }
    public void goTo(View view)
    {

        EditText editText = findViewById(R.id.editTextTextPersonName3);
        list.add(editText.getText().toString());
        editText = findViewById(R.id.editTextTextMultiLine2);
        arrayList.add(editText.getText().toString());
        editText = findViewById(R.id.editTextTextPersonName4);
        payment.add(editText.getText().toString());
        editText = findViewById(R.id.editTextTextPersonName6);
        phone.add(editText.getText().toString());
        editText = findViewById(R.id.editTextTextPersonName5);
        timing.add(editText.getText().toString());

        Intent intent = new Intent(this,TaskList.class);

        intent.putExtra("Phone",phone);
        intent.putExtra("Time",timing);
        intent.putExtra("Description",arrayList);
        intent.putExtra("Payment",payment);
        intent.putExtra("List",list);
        startActivity(intent);

    }
}