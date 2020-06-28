package com.example.jobifyme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TaskList extends AppCompatActivity implements FruitSelectionListener {
RecyclerView recyclerView;
private RecyclerView.Adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        Intent intent = getIntent();
        ArrayList<String> arr= intent.getStringArrayListExtra("List");
        String[] str = new String[arr.size()];
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int j = 0; j < arr.size(); j++) {

            // Assign each value to String array
            str[j] = arr.get(j);
        }

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter( str);
        recyclerView.setAdapter(mAdapter);
    }
    public void onFruitSelected(String FruitName) {

        Intent intent = new Intent(this,TaskView.class);

        intent.putExtra("fruit",FruitName);
        startActivity(intent);
    }
}