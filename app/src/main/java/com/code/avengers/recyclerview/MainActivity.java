package com.code.avengers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

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
        setContentView(R.layout.activity_main);

        /*
        * ButterKnife
        * */
        ButterKnife.bind(this);

        /*
        * Basic Installation of RecyclerView aka Init
        * */
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        /*
        * Create an Object of LanguageAdapter class
        * */
        LanguageAdapter adapter = new LanguageAdapter();

        recyclerView.setAdapter(adapter);
    }
}
