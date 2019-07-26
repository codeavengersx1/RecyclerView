package com.code.avengers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
{
    @BindView(R.id.recycler_activity_main)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        /*
        * UI Load hoto
        * */
        setContentView(R.layout.activity_main);

        /*
        * ButterKnife
        * */
        ButterKnife.bind(this);

        /*
        * RecyclerView requires a java.util.List to display. Compulsory.
        * */
        ProgrammingLanguage java = new ProgrammingLanguage();
        java.setName("Java");
        java.setYeteKiNahi(true);

        ProgrammingLanguage ruby = new ProgrammingLanguage();
        ruby.setName("Ruby");
        ruby.setYeteKiNahi(false);

        ProgrammingLanguage python = new ProgrammingLanguage();
        python.setName("Python");
        python.setYeteKiNahi(true);

        ProgrammingLanguage kotlin = new ProgrammingLanguage();
        kotlin.setName(null);
        kotlin.setYeteKiNahi(true);

        List<ProgrammingLanguage> languageList = new ArrayList<>();
        languageList.add(java);
        languageList.add(ruby);
        languageList.add(python);
        languageList.add(kotlin);


        /*
        * Basic Installation of RecyclerView aka Init
        * */
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        /*
        * Create an Object of LanguageAdapter class
        * */
        LanguageAdapter adapter = new LanguageAdapter(languageList);

        recyclerView.setAdapter(adapter);
    }
}
