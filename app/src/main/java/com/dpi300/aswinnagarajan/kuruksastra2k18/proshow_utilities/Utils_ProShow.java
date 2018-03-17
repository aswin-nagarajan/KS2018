package com.dpi300.aswinnagarajan.kuruksastra2k18.proshow_utilities;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KavinRaju on 2018-03-13.
 */

public class Utils_ProShow {

    private static final String TAG = "Utils";

    public static List<Show> loadShows(Context context){

        try{
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();

            JSONArray jsonArray = new JSONArray(loadJsonFromAsset(context , "pro_shows.json"));

            List<Show> showList = new ArrayList<>();

            for(int i = 0; i < jsonArray.length(); i++){
                Show show = gson.fromJson(jsonArray.getString(i) , Show.class);
                showList.add(show);
            }

            return showList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String loadJsonFromAsset(Context context , String jsonFileName){

        String json = null;
        InputStream inputStream = null;

        try {
            AssetManager assetManager = context.getAssets();
            inputStream = assetManager.open(jsonFileName);

            int size = inputStream.available();
            byte[] buffer = new byte[size];

            inputStream.read(buffer);
            inputStream.close();

            json = new String(buffer , "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return json;
        }

    // Conversion of dp tp pixels
    public static int dpTopx(int dp){
        return (int)(dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static Point getDisplaySize(WindowManager windowManager){

        try {
            if (Build.VERSION.SDK_INT > 16 ){

                Display display = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                return new Point(displayMetrics.widthPixels , displayMetrics.heightPixels);

            }
            else {
                return new  Point(0 , 0);
            }

        }catch (Exception e){
            e.printStackTrace();
            return new Point(0, 0);
        }
    }

    }







