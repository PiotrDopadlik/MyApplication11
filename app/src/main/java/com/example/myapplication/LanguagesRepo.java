package com.example.myapplication;

import java.util.ArrayList;

public class LanguagesRepo {
    public static ArrayList<Language> languages = new ArrayList<>();

    public static void fillTable()
    {
        languages.clear();
        languages.add(new Language("PHP", R.drawable.ic_baseline_php_24));
        languages.add(new Language("Ruby", R.drawable.ic_baseline_javascript_24));
        languages.add(new Language("Java", R.drawable.ic_baseline_keyboard_arrow_right_24));
        languages.add(new Language("C++", R.drawable.ic_baseline_keyboard_arrow_left_24));
    }

    public static ArrayList<Language> returnV()
    {
        fillTable();
        return languages;
    }
}
