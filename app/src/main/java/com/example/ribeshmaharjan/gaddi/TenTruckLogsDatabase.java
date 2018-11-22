package com.example.ribeshmaharjan.gaddi;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {TenTruckLogs.class}, version = 1, exportSchema = false)
public abstract class TenTruckLogsDatabase extends RoomDatabase {
    public abstract TenTruckLogsDao tenTruckLogsDao();

}
