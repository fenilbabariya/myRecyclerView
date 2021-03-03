package com.rku_18fotca11002.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    Context context;
    String[] nameList;
    String[] descriptionList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rowtxtName, rowtxtDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rowtxtName = itemView.findViewById(R.id.txtName);
            rowtxtDescription = itemView.findViewById(R.id.txtDescription);
        }
    }

    public Adapter(Context context, String[] nameList, String[] nameDescription){
        this.context = context;
        this.nameList = nameList;
        this.descriptionList = nameDescription;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_iteam, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.rowtxtName.setText(nameList[position]);
        holder.rowtxtDescription.setText(descriptionList[position]);
    }

    @Override
    public int getItemCount() {
        return nameList.length;
    }
}
