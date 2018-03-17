package com.example.aswinnagarajan.kuruksastra2k18.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aswinnagarajan.kuruksastra2k18.R;
import com.example.aswinnagarajan.kuruksastra2k18.classes.Event;
import com.example.aswinnagarajan.kuruksastra2k18.classes.EventHolder;

import java.util.List;

/**
 * Created by Aswin Nagarajan on 16-03-2018.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventHolder> {
    Context ctx;
    List<Event> list;

    public EventsAdapter(Context ctx, List<Event> list){
        this.ctx = ctx;
        this.list = list;
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
    }
}
