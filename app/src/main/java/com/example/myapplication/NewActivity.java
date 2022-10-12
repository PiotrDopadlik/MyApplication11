package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity {
    ArrayList<Language> languages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        LanguagesRepo.fillTable();
        languages = LanguagesRepo.returnV();
        ArrayAdapter<Language> adapterLanguages = new ArrayAdapter<>(NewActivity.this, android.R.layout.simple_list_item_1, languages);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapterLanguages);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.editTextTextPersonName);
                String newLanguage = editText.getText().toString();
                languages.add(new Language(newLanguage, R.drawable.ic_baseline_keyboard_arrow_right_24));
                adapterLanguages.notifyDataSetChanged();
                editText.setText("");
            }
        });
    }
}