package com.dpi300.aswinnagarajan.kuruksastra2k18.ScheduleRecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Sibi on 15-03-2018.
 */

public class MyRecyclerView extends RecyclerView.Adapter<MyViewHolder>{

    View v;
    String event_name[];
    String time[];
    String venue[];
    //Context ctx;
    String location;
    JSONArray json_Array;
    boolean isExpanded=false;

    public MyRecyclerView(String location){
        this.location=location;
        getjson();
        jsontostring();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        v = inflater.inflate(R.layout.schedule_item,parent,false);

        MyViewHolder holder = new MyViewHolder(v);
        holder.txt = (TextView) v.findViewById(R.id.txtView);
        holder.txtRounds = (TextView) v.findViewById(R.id.round);
        holder.txtTime = (TextView) v.findViewById(R.id.time);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        holder.txt.setText(event_name[position]);
        holder.txtRounds.setText(venue[position]);
        holder.txtTime.setText(time[position]);

        holder.txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isExpanded==false) {
                    holder.txtRounds.setVisibility(View.VISIBLE);
                    holder.txtTime.setVisibility(View.VISIBLE);
                    isExpanded = true;
                }
                else{
                    holder.txtRounds.setVisibility(View.GONE);
                    holder.txtTime.setVisibility(View.GONE);
                    isExpanded = false;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if(event_name==null){
            return 1;
        }
        return event_name.length;
    }

    private void getjson(){
        try{
            JSONObject obj = new JSONObject(location);
            json_Array = obj.getJSONArray("schedule");
            event_name = new String[json_Array.length()];
            time = new String[json_Array.length()];
            venue = new String[json_Array.length()];

        } catch (JSONException ex){
            ex.printStackTrace();
        }
    }
    private void jsontostring(){
        try {
            for (int i = 0; i < json_Array.length(); i++) {
                JSONObject tempObj = json_Array.getJSONObject(i);
               event_name[i]=tempObj.getString("event");
               time[i]="from "+tempObj.getString("from_time")+" to "+tempObj.getString("to_time");
               venue[i]="in "+tempObj.getString("venue");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
