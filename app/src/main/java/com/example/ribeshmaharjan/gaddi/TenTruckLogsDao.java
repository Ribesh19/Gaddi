package com.example.ribeshmaharjan.gaddi;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface TenTruckLogsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TenTruckLogs tenTruckLogs);

    @Query("Select * from TenTruckLogs")
    public List<TenTruckLogs> read();

    @Query("Delete from TenTruckLogs")
    void deleteall();
}
