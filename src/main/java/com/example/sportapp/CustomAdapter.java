package com.example.sportapp;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// This class is an adapter class
// It's a bridge between your Data (List<Sport>) and the RecyclerView + CardView

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder>  {

    private List<Sport> sportList;
    public SportClickListener clickListener;

    public void setClickListener(SportClickListener myListener){
        this.clickListener = myListener;
    }

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_layout,
                        parent,
                        false
                );

        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {

        Sport sport = sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);



    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public  class SportsViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageviewCard);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if(clickListener != null){
                clickListener.onCLick(v, getAdapterPosition() );
            }
        }
    }
}
