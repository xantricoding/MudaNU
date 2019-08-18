package com.example.mudanu.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mudanu.MainActivity;
import com.example.mudanu.R;

public class AboutAdapter extends RecyclerView.Adapter<AboutAdapter.AboutViewHolder>{
    private String aboutMenu;

    public AboutAdapter(MainActivity mainActivity, int i) {
        this.aboutMenu = aboutMenu;
    }

    @NonNull
    @Override
    public AboutAdapter.AboutViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.about, viewGroup, false);
        return new AboutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutAdapter.AboutViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AboutViewHolder extends RecyclerView.ViewHolder{
        public AboutViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
