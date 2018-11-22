package com.example.ribeshmaharjan.gaddi;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {TruckLogs.class},version = 1,exportSchema = false)
public abstract class TruckLogsDatabase extends RoomDatabase {
    public abstract TruckLogsDao truckLogsDao();
}
