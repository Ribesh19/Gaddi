package com.example.ribeshmaharjan.gaddi;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity///table ..BY DEFAULT table name Logs
public class Logs {

    @PrimaryKey
    @NonNull
    private String mdrivername;

    @ColumnInfo(name="car_regno")

    private  String mregno;
    private String mstartime;
    private String m1stbreak;
    private String m2ndbreak;
    private String mendtime;

    public String getMdrivername() {
        return mdrivername;
    }

    public void setMdrivername(String mdrivername) {
        this.mdrivername = mdrivername;
    }

    public String getMregno() {
        return mregno;
    }

    public void setMregno(String mregno) {
        this.mregno = mregno;
    }

    public String getMstartime() {
        return mstartime;
    }

    public void setMstartime(String mstartime) {
        this.mstartime = mstartime;
    }

    public String getM1stbreak() {
        return m1stbreak;
    }

    public void setM1stbreak(String m1stbreak) {
        this.m1stbreak = m1stbreak;
    }

    public String getM2ndbreak() {
        return m2ndbreak;
    }

    public void setM2ndbreak(String m2ndbreak) {
        this.m2ndbreak = m2ndbreak;
    }

    public String getMendtime() {
        return mendtime;
    }

    public void setMendtime(String mendtime) {
        this.mendtime = mendtime;
    }
}
