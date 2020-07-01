package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Movie a = new Movie( title :"taken3");
        Movie a1 =  new Movie(title : "the lion king ")
     a.watch(a,a1);
        a.whichoneisthebest();

    }
}