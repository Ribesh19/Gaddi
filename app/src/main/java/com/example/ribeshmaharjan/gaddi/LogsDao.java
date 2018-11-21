package com.example.ribeshmaharjan.gaddi;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface LogsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Logs logs);

    @Query("Select * from Logs")
    public List<Logs> read();
}
