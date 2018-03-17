package com.dpi300.aswinnagarajan.kuruksastra2k18.ScheduleRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;

/**
 * Created by Sibi on 15-03-2018.
 */

public class MyRecyclerView extends RecyclerView.Adapter<MyViewHolder>{

    View v;
    String[] event_name;

    public MyRecyclerView(String[] event_name){this.event_name=event_name;}

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
        holder.txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txtRounds.setVisibility(View.VISIBLE);
                holder.txtTime.setVisibility(View.VISIBLE);
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
}
