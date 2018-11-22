package com.example.ribeshmaharjan.gaddi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowFragment_10tTruck extends Fragment {


    public ShowFragment_10tTruck() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_show_fragment_10t_truck, container, false);
        RecyclerView recyclerView3 =rootview.findViewById(R.id.recyclerview3);
        // final InfoAdapter adapter = new InfoAdapter(getContext());
        final TenTruckInfoAdapter adapter= new TenTruckInfoAdapter(getContext());
        recyclerView3.setAdapter(adapter);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        return rootview;
    }

}
