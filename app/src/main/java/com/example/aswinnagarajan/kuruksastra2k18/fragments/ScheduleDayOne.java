package com.example.aswinnagarajan.kuruksastra2k18.fragments;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aswinnagarajan.kuruksastra2k18.R;
import com.example.aswinnagarajan.kuruksastra2k18.ScheduleRecyclerView.MyRecyclerView;

/**
 * Created by Sibi on 15-03-2018.
 */
//DayOne fragment
public class ScheduleDayOne extends Fragment {

    RecyclerView recyclerView;
    MyRecyclerView adapter;
    LinearLayoutManager linear;
    Resources res;
    View v;

    public ScheduleDayOne(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_schedule_one,container,false);

        res = v.getResources();// to get array from string.xml
        recyclerView = (RecyclerView) v.findViewById(R.id.schedule_list_one);
        adapter = new MyRecyclerView(res.getStringArray(R.array.schedule_array));
        linear = new LinearLayoutManager(getActivity().getBaseContext());


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linear);
        return v;
    }
}
