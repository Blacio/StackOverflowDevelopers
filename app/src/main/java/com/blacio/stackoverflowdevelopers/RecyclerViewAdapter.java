package com.blacio.stackoverflowdevelopers;

/**
 * Created by Blacio on 3/21/2018.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private String[] names = {"First Name",
            "Second Name",
            "Third Name",
            "Fourth Name",
            "Fifth Name"
    };


    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        ImageView listImage;
        TextView listName;


        ViewHolder(View itemView) {
            super(itemView);
            listImage = itemView.findViewById(R.id.list_photo);
            listName =  itemView.findViewById(R.id.list_name);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();



                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
//        viewHolder.listImage.setImageBitmap();
        viewHolder.listName.setText(names[i]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }
}