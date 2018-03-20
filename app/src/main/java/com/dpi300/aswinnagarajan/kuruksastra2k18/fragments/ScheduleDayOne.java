package com.dpi300.aswinnagarajan.kuruksastra2k18.fragments;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.dpi300.aswinnagarajan.kuruksastra2k18.ScheduleRecyclerView.MyRecyclerView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

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
        adapter = new MyRecyclerView(loadJSONFromAsset());
        linear = new LinearLayoutManager(getActivity().getBaseContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linear);

        return v;
    }

    private String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getActivity().getAssets().open("day_1.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
