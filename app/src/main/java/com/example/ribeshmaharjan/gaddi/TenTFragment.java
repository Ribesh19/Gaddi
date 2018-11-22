package com.example.ribeshmaharjan.gaddi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class TenTFragment extends Fragment {

    Button mbtn_StartTime;
    Button mbtn_1stbreak;
    Button mbtn_2ndbreak;
    Button mbtn_EndTime;
    Button mbtn_savelog;
    Button mbtn_showlog;
    Button mbtn_previous;
    Button mbtn_next;
    Button mbtn_home;

    TextView mStartTime;
    TextView m1stBreak;
    TextView m2ndBreak;
    TextView mEndTime;

    EditText mDrivernname;
    EditText mRegno;

    String starttime;
    String firstbreak;
    String secondbreak;
    String endtime;


    public TenTFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       final ShowFragment_10tTruck showFragment_10tTruck=new ShowFragment_10tTruck();
        final CarFragment carFragment=new CarFragment();
        final HomeFragment homeFragment=new HomeFragment();
        final FiveTFragment fiveTFragment=new FiveTFragment();
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_ten_t, container, false);
        mbtn_StartTime=rootview.findViewById(R.id.btn_starttime_10ttruck);
        mbtn_1stbreak=rootview.findViewById(R.id.btn_1break_10ttruck);
        mbtn_2ndbreak=rootview.findViewById(R.id.btn_2break_10ttruck);
        mbtn_EndTime=rootview.findViewById(R.id.btn_endtime_10ttruck);
        mbtn_savelog=rootview.findViewById(R.id.btn_savelogentry_10ttruck);
        mbtn_showlog=rootview.findViewById(R.id.btn_showlogentry_10ttruck);
        mbtn_previous=rootview.findViewById(R.id.btn_previous_10ttruck);
        mbtn_next=rootview.findViewById(R.id.btn_next_10ttruck);
        mbtn_home=rootview.findViewById(R.id.btn_home_10ttruck);
        mStartTime=rootview.findViewById(R.id.txtView_starttime_10ttruck);
        m1stBreak=rootview.findViewById(R.id.txtView_1stbreak_10ttruck);
        m2ndBreak=rootview.findViewById(R.id.txtView_2ndbreak_10ttruck);
        mEndTime=rootview.findViewById(R.id.txtView_endtime_10ttruck);
        mDrivernname=rootview.findViewById(R.id.drivername_10ttruck);
        mRegno=rootview.findViewById(R.id.regno_10ttruck);
        mbtn_StartTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbtn_1stbreak.setVisibility(View.VISIBLE);
                Date currentime1=Calendar.getInstance().getTime();
                mStartTime.setVisibility(View.VISIBLE);
                mStartTime.setText(currentime1.toString());
                starttime=currentime1.toString();

            }
        });
        mbtn_1stbreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbtn_2ndbreak.setVisibility(View.VISIBLE);
                Date currentime2=Calendar.getInstance().getTime();
                m1stBreak.setVisibility(View.VISIBLE);

                m1stBreak.setText(currentime2.toString());
                firstbreak =currentime2.toString();
            }
        });
        mbtn_2ndbreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbtn_EndTime.setVisibility(View.VISIBLE);
                Date currentime3=Calendar.getInstance().getTime();
                m2ndBreak.setVisibility(View.VISIBLE);
                m2ndBreak.setText(currentime3.toString());
                secondbreak =currentime3.toString();
            }
        });
        mbtn_EndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date currentime4=Calendar.getInstance().getTime();
                mEndTime.setVisibility(View.VISIBLE);
                mEndTime.setText(currentime4.toString());
                endtime =currentime4.toString();
            }
        });

        mbtn_savelog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DriverName=mDrivernname.getText().toString();
                String Regnumber=mRegno.getText().toString();

                //inseting into database
                if(DriverName!=""&& Regnumber!=""&&starttime!=""&&firstbreak!=""&endtime!="" )
                {
                    //Logs logs = new Logs();
                    TenTruckLogs tentruckLogs=new TenTruckLogs();
                    tentruckLogs.setMdrivername(DriverName);
                    tentruckLogs.setMregno(Regnumber);
                    tentruckLogs.setMstartime(starttime);
                    tentruckLogs.setM1stbreak(firstbreak);
                    tentruckLogs.setM2ndbreak(secondbreak);
                    tentruckLogs.setMendtime(endtime);
                    MainActivity.tenTruckLogsDatabase.tenTruckLogsDao().insert(tentruckLogs);
                    Toast.makeText(getActivity(),"Saved",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getActivity(),"Fields cannot Be empty",Toast.LENGTH_SHORT).show();
                }
                mDrivernname.setText("");
                mRegno.setText("");
                starttime="";
                firstbreak="";
                secondbreak="";
                endtime="";

                mStartTime.setVisibility(View.INVISIBLE);
                m1stBreak.setVisibility(View.INVISIBLE);
                m2ndBreak.setVisibility(View.INVISIBLE);
                mEndTime.setVisibility(View.INVISIBLE);
                mbtn_1stbreak.setVisibility(View.INVISIBLE);
                mbtn_2ndbreak.setVisibility(View.INVISIBLE);
                mbtn_EndTime.setVisibility(View.INVISIBLE);

            }
        });
        mbtn_showlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();
                fragmentManager0.beginTransaction()
                        .addToBackStack("b")
                        .replace(R.id.frame_layout,showFragment_10tTruck)
                        .commit();
            }
        });

        mbtn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();
                fragmentManager0.beginTransaction()
                        .addToBackStack("b")
                        .replace(R.id.frame_layout,homeFragment)
                        .commit();

            }
        });

        mbtn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();
                fragmentManager0.beginTransaction()
                        .replace(R.id.frame_layout,carFragment)
                        .commit();

            }
        });
        mbtn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager0 = getActivity().getSupportFragmentManager();
                fragmentManager0.beginTransaction()
                        .replace(R.id.frame_layout,fiveTFragment)
                        .commit();
            }
        });
        return rootview;

    }

}
