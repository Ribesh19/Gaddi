package com.example.ribeshmaharjan.gaddi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    Button mbtncar;
    Button mbtn5Ttruck;
    Button mbtn10Ttruck;




    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final CarFragment carFragment=new CarFragment();
        final  FiveTFragment fiveTFragment=new FiveTFragment();
        final  TenTFragment tenTFragment=new TenTFragment();
        final View rootview= inflater.inflate(R.layout.fragment_home, container, false);
        mbtncar=rootview.findViewById(R.id.btn_car);
        mbtn5Ttruck=rootview.findViewById(R.id.btn_fiveTTruck);
        mbtn10Ttruck=rootview.findViewById(R.id.btn_tenttruck);
        mbtncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();
                fragmentManager0.beginTransaction()
                        .replace(R.id.frame_layout,carFragment)
                        .commit();

            }
        });
        mbtn5Ttruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();
                fragmentManager0.beginTransaction()
                        .replace(R.id.frame_layout,fiveTFragment)
                        .commit();

            }
        });
        mbtn10Ttruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();
                fragmentManager0.beginTransaction()
                        .replace(R.id.frame_layout,tenTFragment)
                        .commit();

            }
        });

        return  rootview;
    }

}
