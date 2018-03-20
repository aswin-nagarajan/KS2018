package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.dpi300.aswinnagarajan.kuruksastra2k18.AboutKS.AboutKSActivity;
import com.dpi300.aswinnagarajan.kuruksastra2k18.EventsActivity;
import com.dpi300.aswinnagarajan.kuruksastra2k18.FlipPager.HomeEvent;
import com.dpi300.aswinnagarajan.kuruksastra2k18.FlipPager.HomeEventAdapter;
import com.dpi300.aswinnagarajan.kuruksastra2k18.ProShowActivity;
import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.dpi300.aswinnagarajan.kuruksastra2k18.ScheduleActivity;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.yalantis.flipviewpager.utils.FlipSettings;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        final ListView friends = (ListView) findViewById(R.id.friends);

        FlipSettings settings = new FlipSettings.Builder().defaultPage(1).build();
        final HomeEventAdapter adap = new HomeEventAdapter(this, getHomeEvents(), settings);
        friends.setAdapter(adap);

        friends.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HomeEvent f = (HomeEvent) friends.getAdapter().getItem(position);


                    if (adap.getItem(position).getNickname().equals("EVENTS")) {

                        Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                        startActivity(intent);
                        //getBaseContext().startActivity(intent);
                    } else if (adap.getItem(position).getNickname().equals("SCHEDULE")) {

                        Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                        //getBaseContext().startActivity(intent);
                        startActivity(intent);
                    } else if (adap.getItem(position).getNickname().equals("PRO SHOWS")) {

                        Intent intent = new Intent(MainActivity.this, ProShowActivity.class);
                        startActivity(intent);
                        //getBaseContext().startActivity(intent);
                    } else if(adap.getItem(position).getNickname().equals("ABOUT KURUKSASTRA")){
                        Intent intent = new Intent(MainActivity.this, AboutKSActivity.class);
                        startActivity(intent);
                    }
                    else if(adap.getItem(position).getNickname().equals("ABOUT US")){
                        Intent intent = new Intent(MainActivity.this, AboutUs_main_Activity.class);
                        startActivity(intent);
                    }
                    else if(adap.getItem(position).getNickname().equals("SPONSORS")){
                        Intent intent = new Intent(MainActivity.this, Sponsors.class);
                        startActivity(intent);
                    }

            }
        });

        if (isFirstTime()) {
            TapTargetView.showFor(this,                 // `this` is an Activity
                    TapTarget.forView(findViewById(R.id.title_logo), "Welcome to KS 2018", "Swipe right on the images to show description \nClick to go to the category main screen")
                            // All options below are optional
                            .outerCircleColor(R.color.white)      // Specify a color for the outer circle
                            .outerCircleAlpha(0.96f)            // Specify the alpha amount for the outer circle
                            .targetCircleColor(R.color.colorPrimary)   // Specify a color for the target circle
                            .titleTextSize(30)                  // Specify the size (in sp) of the title text
                            .titleTextColor(R.color.colorPrimary)      // Specify the color of the title text
                            .descriptionTextSize(20)            // Specify the size (in sp) of the description text
                            .descriptionTextColor(R.color.pink)  // Specify the color of the description text
                            .textColor(R.color.green)            // Specify a color for both the title and description text
                            .textTypeface(Typeface.SANS_SERIF)  // Specify a typeface for the text
                            .dimColor(R.color.orange)            // If set, will dim behind the view with 30% opacity of the given color
                            .drawShadow(true)                   // Whether to draw a drop shadow or not
                            .cancelable(false)                  // Whether tapping outside the outer circle dismisses the view
                            .tintTarget(true)                   // Whether to tint the target view's color
                            .transparentTarget(false)           // Specify whether the target is transparent (displays the content underneath)
//                        .icon(Drawable)                     // Specify a custom drawable to draw as the target
                            .targetRadius(100),                  // Specify the target radius (in dp)
                    new TapTargetView.Listener() {          // The listener can listen for regular clicks, long clicks or cancels
                        @Override
                        public void onTargetClick(TapTargetView view) {
                            super.onTargetClick(view);
                        }
                    });
        }

    }

    private boolean isFirstTime()
    {
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        boolean ranBefore = preferences.getBoolean("RanBefore", false);
        if (!ranBefore) {
            // first time
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("RanBefore", true);
            editor.commit();
        }
        return !ranBefore;
    }

    public List<HomeEvent> getHomeEvents(){
        List<HomeEvent> friends = new ArrayList<HomeEvent>();
            friends.add(new HomeEvent(R.drawable.events, "EVENTS", R.color.sienna, "Dance", "Literature", "Music", "Arts", "Design"));
        friends.add(new HomeEvent(R.drawable.schedule, "SCHEDULE", R.color.purple, "Timings","Event venue","Day 1","Day 2", "Day 3"));
        friends.add(new HomeEvent(R.drawable.proshows, "PRO SHOWS", R.color.saffron, "Sid Sriram", "Evam Tamasha", "SMT", "Crea Shakti","Instrumental Night"));
        friends.add(new HomeEvent(R.drawable.aboutks, "ABOUT KURUKSASTRA", R.color.green, "History", "Showcases","About Ks Upahaar","About SASTRA","What's Special"));
        friends.add(new HomeEvent(R.drawable.aboutus, "ABOUT US", R.color.pink, "Graphics Design","Frone end Web Developers","Back end developers","Android Developers","Animators"));
        friends.add(new HomeEvent(R.drawable.sponsors, "SPONSORS", R.color.orange, "Title Sponsor", "Associate Sponsors","Co Sponsors"));
        return friends;
    }
}
