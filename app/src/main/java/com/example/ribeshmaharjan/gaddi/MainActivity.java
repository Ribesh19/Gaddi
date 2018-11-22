package com.example.ribeshmaharjan.gaddi;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Room;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {


    public static  LogsDatabase logsDatabase;
    public static  TruckLogsDatabase truckLogsDatabase;
    public static TenTruckLogsDatabase tenTruckLogsDatabase;

    private static int position =0;

    // private DocumentReference mDocRef= FirebaseFirestore.getInstance().document("Information/Logs");
    //List<Logs> logs=MainActivity.logsDatabase.logsDao().read();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        HomeFragment homeFragment=new HomeFragment();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            return;
        }
        //allowmainthreadquries hunu hunna
        logsDatabase=Room.databaseBuilder(getApplicationContext(),LogsDatabase.class,"logs.db").allowMainThreadQueries().build();
        truckLogsDatabase=Room.databaseBuilder(getApplicationContext(),TruckLogsDatabase.class,"trucklogs.db").allowMainThreadQueries().build();
        tenTruckLogsDatabase=Room.databaseBuilder(getApplicationContext(),TenTruckLogsDatabase.class,"tentrucklogs.db").allowMainThreadQueries().build();
        FragmentManager fragmentManager0 = getSupportFragmentManager();
        fragmentManager0.beginTransaction()
                .replace(R.id.frame_layout,homeFragment)
                .addToBackStack("a")
                .commit();
        }

        protected int getFragmentno()
        {
            return ++position;
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int menuItemThatWasSelected=item.getItemId();
        if(menuItemThatWasSelected==R.id.send)
        {
            Toast.makeText(this,"ALL DATA SEND",Toast.LENGTH_SHORT).show();
            MainActivity.logsDatabase.logsDao().deleteall();
            MainActivity.tenTruckLogsDatabase.tenTruckLogsDao().deleteall();
            MainActivity.truckLogsDatabase.truckLogsDao().deleteall();
        }
        else if(menuItemThatWasSelected==R.id.save)
        {
            Toast.makeText(this," SAVED",Toast.LENGTH_SHORT).show();
        }
        else if(menuItemThatWasSelected==R.id.profile)
        {
            ProfileFragment profileFragment=new ProfileFragment();
            FragmentManager fragmentManager0 = getSupportFragmentManager();
            fragmentManager0.beginTransaction()
                    .replace(R.id.frame_layout,profileFragment)
                    .addToBackStack("a")
                    .commit();
            Toast.makeText(this,"PROFILE",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
