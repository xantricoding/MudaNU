package com.example.mudanu;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mudanu.model.About;
import com.example.mudanu.model.AboutData;
import com.example.mudanu.model.Dai;
import com.example.mudanu.model.DaiData;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {
    private RelativeLayout previewAbout;
    private ArrayList<About> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        previewAbout = findViewById(R.id.author_photo);
        list.addAll(AboutData.getListData());
    }
}
