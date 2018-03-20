package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dpi300.aswinnagarajan.kuruksastra2k18.ScheduleRecyclerView.ScheduleViewPager;
import com.dpi300.aswinnagarajan.kuruksastra2k18.fragments.ScheduleDayOne;
import com.dpi300.aswinnagarajan.kuruksastra2k18.fragments.ScheduleDayThree;
import com.dpi300.aswinnagarajan.kuruksastra2k18.fragments.ScheduleDayTwo;

public class ScheduleActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ScheduleViewPager adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getWindow().getDecorView()
                .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        adapter = new ScheduleViewPager(getSupportFragmentManager());
        adapter.addFragment(new ScheduleDayOne(),"DAY 1");
        adapter.addFragment(new ScheduleDayTwo(),"DAY 2");
        adapter.addFragment(new ScheduleDayThree(),"DAY 3");
        viewPager.setAdapter(adapter);

    }

    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();
        overridePendingTransition(R.anim.slide_from_left , R.anim.slide_to_right);
        return true;
    }
}
