package com.example.aswinnagarajan.kuruksastra2k18;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.aswinnagarajan.kuruksastra2k18.aboutus_utilities.AboutUs;
import com.example.aswinnagarajan.kuruksastra2k18.aboutus_utilities.AboutUs_Adapter;
import com.example.aswinnagarajan.kuruksastra2k18.aboutus_utilities.Utils_AboutUs;

import java.util.ArrayList;
import java.util.List;

public class AboutUs_Activity extends AppCompatActivity implements AboutUs_Adapter.ListItemClickListener {

    private int num_of_members;
    private List<AboutUs> aboutUsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        for (AboutUs aboutUs: Utils_AboutUs.loadShows(this.getApplicationContext() )){

            // Views are being added here on the card view
            num_of_members++;
            aboutUsList.add(aboutUs);

        }

        RecyclerView recyclerView = findViewById(R.id.recylerView_aboutus);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        AboutUs_Adapter aboutUs_adapter = new AboutUs_Adapter(num_of_members , aboutUsList , this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(aboutUs_adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onListItemClick(int clickedItemIndex, int clickedCard) {

    }
}
