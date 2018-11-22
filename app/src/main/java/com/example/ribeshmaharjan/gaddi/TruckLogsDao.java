package com.example.ribeshmaharjan.gaddi;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface TruckLogsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TruckLogs truckLogs);

    @Query("Select * from TruckLogs")
    public List<TruckLogs> read();

    @Query("Delete from TruckLogs")
    void deleteall();
}
