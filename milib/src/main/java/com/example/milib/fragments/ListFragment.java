package com.example.milib.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.milib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    public RecyclerView milista;
    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);


        milista = (RecyclerView)getView().findViewById(R.id.milista);
        milista.setLayoutManager(new GridLayoutManager(getContext(), 2));
        milista.setAdapter(new ListAdapter());
        return v;
    }

}
