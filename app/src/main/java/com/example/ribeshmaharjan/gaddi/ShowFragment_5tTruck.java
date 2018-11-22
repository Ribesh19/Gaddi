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
public class ShowFragment_5tTruck extends Fragment {


    public ShowFragment_5tTruck() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_show_fragment_5t_truck, container, false);
        RecyclerView recyclerView2 =rootview.findViewById(R.id.recyclerview2);
       // final InfoAdapter adapter = new InfoAdapter(getContext());
        final TruckInfoAdapter adapter= new TruckInfoAdapter(getContext());
        recyclerView2.setAdapter(adapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        return rootview;
    }

}
