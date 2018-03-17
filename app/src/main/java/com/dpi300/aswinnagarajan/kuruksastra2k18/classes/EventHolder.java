package com.dpi300.aswinnagarajan.kuruksastra2k18.classes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;

/**
 * Created by Aswin Nagarajan on 16-03-2018.
 */

public class EventHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView participants;
    public EventHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.event_title);
        participants = (TextView) itemView.findViewById(R.id.ev_part);
    }
}
