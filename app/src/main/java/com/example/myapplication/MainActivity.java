package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> icons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icons.add(R.drawable.ic_baseline_javascript_24);
        icons.add(R.drawable.ic_baseline_keyboard_arrow_left_24);
        icons.add(R.drawable.ic_baseline_keyboard_arrow_right_24);
        icons.add(R.drawable.ic_baseline_keyboard_arrow_up_24);
        Spinner spinner = findViewById(R.id.spinner);
        AdapterView.OnItemSelectedListener selected = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String language = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, language, Toast.LENGTH_SHORT).show();
                ImageView iconImageView = findViewById(R.id.imageView);
                iconImageView.setImageResource(icons.get(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        spinner.setOnItemSelectedListener(selected);
        //ArrayAdapter<String> languagesAdapter = new ArrayAdapter<>();
    }
}