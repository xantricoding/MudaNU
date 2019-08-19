package com.example.mudanu.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mudanu.MainActivity;
import com.example.mudanu.R;
import com.example.mudanu.model.About;
import com.example.mudanu.model.Dai;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AboutAdapter extends RecyclerView.Adapter<AboutAdapter.AboutViewHolder>{
    private String aboutMenu;
    private ArrayList<About> listAbout;

    public AboutAdapter(ArrayList<About> listabout) {
        this.listAbout = listabout;
    }

    @NonNull
    @Override
    public AboutAdapter.AboutViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.about, viewGroup, false);
        return new AboutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutAdapter.AboutViewHolder holder, int position) {
        About about = listAbout.get(position);

        holder.textView.setText(about.getNameAuthor());
        holder.emailView.setText(about.getEmailAuthor());
    }

    @Override
    public int getItemCount() {
        return listAbout.size();
    }

    public class AboutViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView textView, emailView;

        public AboutViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.author_photo);
            textView = itemView.findViewById(R.id.author_name);
            emailView = itemView.findViewById(R.id.author_email);
        }
    }
}
