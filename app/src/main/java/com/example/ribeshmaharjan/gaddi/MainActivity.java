package com.example.ribeshmaharjan.gaddi;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static  LogsDatabase logsDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        HomeFragment homeFragment=new HomeFragment();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //allowmainthreadquries hunu hunna
        logsDatabase=Room.databaseBuilder(getApplicationContext(),LogsDatabase.class,"logs.db").allowMainThreadQueries().build();
        FragmentManager fragmentManager0 = getSupportFragmentManager();
        fragmentManager0.beginTransaction()
                .replace(R.id.frame_layout,homeFragment)
                .addToBackStack(null)
                .commit();

    }
}
