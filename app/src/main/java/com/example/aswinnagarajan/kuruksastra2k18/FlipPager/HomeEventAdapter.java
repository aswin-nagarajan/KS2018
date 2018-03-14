package com.example.aswinnagarajan.kuruksastra2k18.FlipPager;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aswinnagarajan.kuruksastra2k18.EventsActivity;
import com.example.aswinnagarajan.kuruksastra2k18.R;
import com.example.aswinnagarajan.kuruksastra2k18.ScheduleActivity;
import com.yalantis.flipviewpager.adapter.BaseFlipAdapter;
import com.yalantis.flipviewpager.utils.FlipSettings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aswin Nagarajan on 08-03-2018.
 */

public class HomeEventAdapter extends BaseFlipAdapter<HomeEvent>  {

    private final int PAGES = 3;
    private int[] IDS_INTEREST = {R.id.interest_1, R.id.interest_2, R.id.interest_3, R.id.interest_4, R.id.interest_5};
    LayoutInflater li;
    Context ctx;

    public HomeEventAdapter(Context context, List<HomeEvent> items, FlipSettings settings) {
        super(context, items, settings);
        ctx = context;
        li = LayoutInflater.from(context);

    }

    @Override
    public View getPage(int position, View convertView, ViewGroup parent, HomeEvent friend1, HomeEvent friend2) {

        final FriendsHolder holder;

        if (convertView == null) {
            holder = new FriendsHolder(ctx, position, this);
            convertView = li.inflate(R.layout.merged_item, parent, false);
            holder.leftAvatar = (ImageView) convertView.findViewById(R.id.first);
            holder.rightAvatar = (ImageView) convertView.findViewById(R.id.second);
            holder.infoPage = li.inflate(R.layout.pager_item, parent, false);
            holder.nickName = (TextView) holder.infoPage.findViewById(R.id.nickname);
            holder.details = (Button) holder.infoPage.findViewById(R.id.detailButton);

            for (int id : IDS_INTEREST)
                holder.interests.add((TextView) holder.infoPage.findViewById(id));

            holder.details.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Toast.makeText(ctx, "Hurray! You clicked", Toast.LENGTH_LONG).show();
                }
            });

            convertView.setTag(holder);
        } else {
            holder = (FriendsHolder) convertView.getTag();
        }


        switch (position) {
            // Merged page with 2 friends
            case 1:
                holder.leftAvatar.setImageResource(friend1.getAvatar());
                if (friend2 != null)
                    holder.rightAvatar.setImageResource(friend2.getAvatar());
                break;
            default:
                fillHolder(holder, position == 0 ? friend1 : friend2);
                holder.infoPage.setTag(holder);
                return holder.infoPage;
        }
        return convertView;
    }

    @Override
    public int getPagesCount() {
        return PAGES;
    }

    private void fillHolder(FriendsHolder holder, HomeEvent friend) {
        if (friend == null)
            return;
        Iterator<TextView> iViews = holder.interests.iterator();
        Iterator<String> iInterests = friend.getInterests().iterator();

        while (iViews.hasNext() && iInterests.hasNext())
            iViews.next().setText(iInterests.next());

        holder.infoPage.setBackgroundColor(ctx.getResources().getColor(friend.getBackground()));
        holder.nickName.setText(friend.getNickname());
        holder.details.setText("Details");
//        holder.details.setOnClickListener(this);


    }



}



    class FriendsHolder implements View.OnClickListener {
        ImageView leftAvatar;
        ImageView rightAvatar;
        View infoPage;
        int pos;
        List<TextView> interests = new ArrayList<>();
        TextView nickName;
        Button details;
        Context ctx;
        HomeEventAdapter a;

        public FriendsHolder(Context ctx, int position, HomeEventAdapter a) {
            this.ctx = ctx;
            pos = position;
            this.a = a;
        }

        @Override
        public void onClick(View view) {
            Log.d("h","In on Click");
            if (view == details) {
                if (a.getItem(pos).getNickname().equals("EVENTS")) {

                    Intent intent = new Intent(ctx, EventsActivity.class);
                    ctx.startActivity(intent);
                } else if (a.getItem(pos).getNickname().equals("SCHEDULE")) {

                    Intent intent = new Intent(ctx, ScheduleActivity.class);
                    ctx.startActivity(intent);
                }
            }
        }
    }

