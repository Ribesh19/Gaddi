package com.example.ribeshmaharjan.gaddi;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Logs.class}, version = 1,exportSchema = false)
public abstract class LogsDatabase extends RoomDatabase {

    public abstract LogsDao logsDao();
}
