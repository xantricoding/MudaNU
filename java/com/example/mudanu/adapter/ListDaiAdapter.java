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
import com.example.mudanu.R;
import com.example.mudanu.model.Dai;

import java.util.ArrayList;

public class ListDaiAdapter extends RecyclerView.Adapter<ListDaiAdapter.ListViewHolder> {
    private ArrayList<Dai> listDai;
    private OnDaiClickCallback onDaiClickCallback;

    public void setOnDaiClickCallBack(OnDaiClickCallback onDaiClickCallback){
        this.onDaiClickCallback = onDaiClickCallback;
    }

    public ListDaiAdapter(ArrayList<Dai> list){
        this.listDai = list;
    }

    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_dai, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Dai dai = listDai.get(position);

        Glide.with(holder.itemView.getContext())
                .load(dai.getPhoto())
                .apply(new RequestOptions())
                .into(holder.daiPhoto);

        holder.tvName.setText(dai.getName());
        holder.tvInfo.setText(dai.getInfo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDaiClickCallback.onDaiClicked(listDai.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listDai.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView daiPhoto;
        TextView tvName, tvInfo;

        ListViewHolder(View itemView) {
            super(itemView);
            daiPhoto = itemView.findViewById(R.id.img_genmud_photo);
            tvName = itemView.findViewById(R.id.tv_genmud_name);
            tvInfo = itemView.findViewById(R.id.tv_genmud_info);
           }
    }
    public interface OnDaiClickCallback{
        void onDaiClicked(Dai data);
    }
}
