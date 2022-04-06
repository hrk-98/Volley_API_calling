package com.example.apicalling;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    Activity activity;
    List<ProfileData> modellist;

    public RecyclerAdapter(MainActivity mainActivity,List<ProfileData> modellist){

        activity=mainActivity;
        this.modellist=modellist;
    }
    @NonNull
    @Override
    public RecyclerAdapter.RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(activity).inflate(R.layout.profile,parent,false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerHolder holder, int position) {
        holder.userid.setText(modellist.get(position).userid+"");
        holder.id.setText(modellist.get(position).id+"");
        holder.title.setText(modellist.get(position).title);
        holder.body.setText(modellist.get(position).body);

    }


    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {

        TextView userid,id,title,body;
        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);


            userid=itemView.findViewById(R.id.userid);
            id=itemView.findViewById(R.id.id);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);
        }
    }
}
