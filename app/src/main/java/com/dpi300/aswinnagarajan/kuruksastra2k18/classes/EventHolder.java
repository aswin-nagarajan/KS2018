package com.dpi300.aswinnagarajan.kuruksastra2k18.classes;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.EventDescriptionActivity;
import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.dpi300.aswinnagarajan.kuruksastra2k18.fragments.EventFragment;

/**
 * Created by Aswin Nagarajan on 16-03-2018.
 */

public class EventHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView title;
    public TextView participants;
    public Context ctx;
    public String cluster;
    public Button det;
    public EventHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.event_title);
        participants = (TextView) itemView.findViewById(R.id.ev_part);
        det = (Button) itemView.findViewById(R.id.detail_but);
        det.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ctx, EventDescriptionActivity.class);
        intent.putExtra("Event",title.getText());
        Log.d("onclick",(String)title.getText());
//        Log.d("onclick",EventFragment.getMasterList().get(cluster).get(title).get("desc"));
        intent.putExtra("Desc",EventFragment.getEventDescription(cluster,(String)title.getText()).get("desc"));
        intent.putExtra("Rules",EventFragment.getEventDescription(cluster,(String)title.getText()).get("rules"));
        intent.putExtra("Contact",EventFragment.getEventDescription(cluster,(String)title.getText()).get("contact"));
        ctx.startActivity(intent);


    }
}
