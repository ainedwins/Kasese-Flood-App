package com.example.kafews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>{

    Context contex;
    ArrayList<ContactModel> list;

    public ContactAdapter(Context contex, ArrayList<ContactModel> list) {
        this.contex = contex;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(contex).inflate(R.layout.row_contact,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvname.setText(list.get(position).getTvName());
        holder.tvnumber.setText(list.get(position).getTvNumber());
        holder.image.setImageResource(list.get(position).getImageView());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView tvname, tvnumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageView);
            tvname = itemView.findViewById(R.id.tvName);
            tvnumber = itemView.findViewById(R.id.tvNumber);

        }
    }
}
