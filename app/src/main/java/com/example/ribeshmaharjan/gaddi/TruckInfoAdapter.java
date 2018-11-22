package com.example.ribeshmaharjan.gaddi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class TruckInfoAdapter extends RecyclerView.Adapter<TruckInfoAdapter.InfoViewHolder> {
    //private List<Logs> logs=MainActivity.logsDatabase.logsDao().read();
    private List<TruckLogs> truckLogs=MainActivity.truckLogsDatabase.truckLogsDao().read();

    class InfoViewHolder extends RecyclerView.ViewHolder {
        TextView mStartTime2;
        TextView m1stBreak2;
        TextView m2ndBreak2;
        TextView mEndTime2;
        TextView mDrivername2;
        TextView mRegno2;

        private InfoViewHolder(View itemView) {
            super(itemView);
            mDrivername2=itemView.findViewById(R.id.txtDrive_show);
            mRegno2=itemView.findViewById(R.id.txtRegno_show);
            mStartTime2=itemView.findViewById(R.id.txtStarttime_show);
            m1stBreak2=itemView.findViewById(R.id.txt1stbreak_show);
            m2ndBreak2=itemView.findViewById(R.id.txt2ndbreak_show);
            mEndTime2=itemView.findViewById(R.id.txtendtime_show);
        }
    }

    private final LayoutInflater mInflater;
    // Cached copy of words

    TruckInfoAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new InfoViewHolder(itemView);
    }

    //List<Logs> logs= MainActivity.logsDatabase.logsDao().read();

    //String info=" ";



    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
      /* for (Logs logs1: logs)//for each loop
        {
            String mdrivername=logs1.getMdrivername();
            String mregno=logs1.getMregno();
            String mstartime=logs1.getMstartime();
            String m1stbreak=logs1.getM1stbreak();
            String m2ndbreak=logs1.getM2ndbreak();
            String mendtime=logs1.getMendtime();
            holder.mDrivername2.setText(mdrivername);
            holder.mRegno2.setText(mregno);
            holder.mStartTime2.setText(mstartime);
            holder.m1stBreak2.setText(m1stbreak);
            holder.m2ndBreak2.setText(m2ndbreak);
            holder.mEndTime2.setText(mendtime);
        }*/
        if (truckLogs != null) {
            TruckLogs logs1 = truckLogs.get(position);
            String mdrivername = logs1.getMdrivername();
            String mregno = logs1.getMregno();
            String mstartime = logs1.getMstartime();
            String m1stbreak = logs1.getM1stbreak();
            String m2ndbreak = logs1.getM2ndbreak();
            String mendtime = logs1.getMendtime();
            holder.mDrivername2.setText(mdrivername);
            holder.mRegno2.setText(mregno);
            holder.mStartTime2.setText(mstartime);
            holder.m1stBreak2.setText(m1stbreak);
            holder.m2ndBreak2.setText(m2ndbreak);
            holder.mEndTime2.setText(mendtime);


        }
    }

   /* void setWords(List<Word> words){
        mWords = words;
        notifyDataSetChanged();
    }*/

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (truckLogs != null)
            return truckLogs.size();
        else return 0;
    }
}
