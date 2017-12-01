package com.example.milib.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.milib.R;

/**
 * Created by alejandroquiros on 28/11/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MiViewHolder>{


    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell_layout, null);
        MiViewHolder viewHolder = new MiViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {
    if(position == 0){
            holder.nombre .setText("Alex");
    } else if(position == 1){
        holder.nombre .setText("Segundo nombre");
    }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    class MiViewHolder extends RecyclerView.ViewHolder{
    public TextView nombre;
    public MiViewHolder(View view){
        super(view);
        nombre = (TextView)view.findViewById(R.id.nombre);
    }
}

}
