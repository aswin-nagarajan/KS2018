package com.dpi300.aswinnagarajan.kuruksastra2k18.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.dpi300.aswinnagarajan.kuruksastra2k18.classes.Event;
import com.dpi300.aswinnagarajan.kuruksastra2k18.classes.EventHolder;

import java.util.List;

/**
 * Created by Aswin Nagarajan on 16-03-2018.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventHolder>{
    Context ctx;
    List<Event> list;
    String cluster;

    public EventsAdapter(Context ctx, List<Event> list, String cluster){
        this.ctx = ctx;
        this.list = list;
        this.cluster = cluster;
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View v = inflater.inflate(R.layout.event_item, null);
        return new EventHolder(v);
    }

    @Override
    public void onBindViewHolder(EventHolder holder, int position) {
        Event as = list.get(position);
        holder.title.setText(as.getName());
        holder.participants.setText(as.getParticipants()+"");
        holder.ctx = ctx;
        holder.cluster = cluster;
    }


}
