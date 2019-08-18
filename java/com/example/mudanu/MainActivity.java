package com.example.mudanu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.mudanu.adapter.AboutAdapter;
import com.example.mudanu.adapter.ListDaiAdapter;
import com.example.mudanu.model.Dai;
import com.example.mudanu.model.DaiData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvGenmud;
    private ArrayList<Dai> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGenmud = findViewById(R.id.rv_genmud);
        rvGenmud.setHasFixedSize(true);

        list.addAll(DaiData.getListData());
        showRecyclerList();
/**
        ImageButton btnMoveDataGenmud = findViewById(R.id.img_genmud_photo);
        btnMoveDataGenmud.setOnClickListener(this);
*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        Intent intent = new Intent(this, AboutAdapter.class);
        intent.addCategory(Intent.CATEGORY_ALTERNATIVE);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        rvGenmud.setLayoutManager(new LinearLayoutManager(this));
        ListDaiAdapter listDaiAdapter = new ListDaiAdapter(list);
        rvGenmud.setAdapter(listDaiAdapter);

        listDaiAdapter.setOnDaiClickCallBack(new ListDaiAdapter.OnDaiClickCallback() {
            @Override
            public void onDaiClicked(Dai data) {
                showSelectedDai(data);
            }
        });
    }

    private void showAboutMenu(){
    }

    private void showSelectedDai(Dai dai){
        Toast.makeText(this, dai.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rv_genmud:
                Intent moveIntent = new Intent(MainActivity.this, GenmudActivity.class);
                //coba tambah ini
                moveIntent.putExtra(GenmudActivity.EXTRA_DESC, "desc");
                //batas
                startActivity(moveIntent);
                break;
                /*
            case R.id.desc_view:
                Intent GenmudActivity = new Intent(this, GenmudActivity.class);
                GenmudActivity.putExtra(com.example.mudanu.GenmudActivity.EXTRA_NAME, "foto");
                GenmudActivity.putExtra(com.example.mudanu.GenmudActivity.EXTRA_DESC, "desc");
                startActivity(GenmudActivity);
                break;
                 */
        }
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.activity_main:
                break;
            case R.id.about_menu:
                Intent intent = new Intent(this, AboutActivity.class);
                this.startActivity(intent);
                break;
        }
    }
}
