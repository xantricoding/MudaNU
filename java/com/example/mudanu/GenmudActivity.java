package com.example.mudanu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mudanu.model.DaiData;

public class GenmudActivity extends AppCompatActivity {
    /**
    public static final String EXTRA_NAME = "extra name"; */
    public static final String EXTRA_DESC = "extra desc";

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genmud);

    }
}
