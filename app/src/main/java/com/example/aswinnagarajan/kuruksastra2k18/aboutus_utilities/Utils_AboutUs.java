package com.example.aswinnagarajan.kuruksastra2k18.aboutus_utilities;

import android.content.Context;

import com.example.aswinnagarajan.kuruksastra2k18.proshow_utilities.Show;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import com.example.aswinnagarajan.kuruksastra2k18.proshow_utilities.Utils_ProShow;
/**
 * Created by KavinRaju on 2018-03-16.
 */

public class Utils_AboutUs {

    private static final String TAG = "Utils";

    public static List<AboutUs> loadShows(Context context){

        try{
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();

            JSONArray jsonArray = new JSONArray(Utils_ProShow.loadJsonFromAsset(context , "about_us.json"));

            List<AboutUs> aboutUsList = new ArrayList<>();

            for(int i = 0; i < jsonArray.length(); i++){
                AboutUs aboutUs = gson.fromJson(jsonArray.getString(i) , AboutUs.class);
                aboutUsList.add(aboutUs);
            }

            return aboutUsList;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

}
