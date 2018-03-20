package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.aboutus_utilities.AboutUs;
import com.dpi300.aswinnagarajan.kuruksastra2k18.aboutus_utilities.AboutUs_Adapter;
import com.dpi300.aswinnagarajan.kuruksastra2k18.aboutus_utilities.Utils_AboutUs;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AboutUs_Activity extends AppCompatActivity implements AboutUs_Adapter.ListItemClickListener {

    private int num_of_members;
    private List<AboutUs> aboutUsList = new ArrayList<>();
    private String title;
    String url_graphic_des = "https://firebasestorage.googleapis.com/v0/b/friendlychat-e9cd8.appspot.com/o/KS_18%2FGRAPHIC%20DESIGNER.png?alt=media&token=7f5d52ff-9b20-4f15-b699-d9a372748031";
    String url_web_Dev = "https://firebasestorage.googleapis.com/v0/b/friendlychat-e9cd8.appspot.com/o/KS_18%2FWEB%20DEVE.png?alt=media&token=e9d3ff7d-a4e9-4c0a-9556-7198e1e882f7";
    String url_app_Dev = "https://firebasestorage.googleapis.com/v0/b/friendlychat-e9cd8.appspot.com/o/KS_18%2FAPP%20DEVE.png?alt=media&token=f5b25dec-0ed1-4999-b586-c1b2ceed0d3a";
    ImageView imageView_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        title = getIntent().getStringExtra("title");
        imageView_Cover = findViewById(R.id.imageView_toolbar);
        switch (title) {
            case "GRAPHIC DESIGNER":

                Picasso.with(getApplicationContext()).load(url_graphic_des).into(imageView_Cover);

                break;
            case "APP DEVELOPER":

                Picasso.with(getApplicationContext()).load(url_app_Dev).into(imageView_Cover);

                break;
            case "WEB DEVELOPER":

                Picasso.with(getApplicationContext()).load(url_web_Dev).into(imageView_Cover);
                break;
        }

        for (AboutUs aboutUs: Utils_AboutUs.loadShows(this.getApplicationContext() )){

            // Views are being added here on the card view

            if (aboutUs.getTitle().equalsIgnoreCase(title)) {
                aboutUsList.add(aboutUs);
                num_of_members++;
            }

        }

        RecyclerView recyclerView = findViewById(R.id.recylerView_aboutus);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        AboutUs_Adapter aboutUs_adapter = new AboutUs_Adapter(num_of_members , aboutUsList , this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(aboutUs_adapter);

    }

    @Override
    public void onListItemClick(int clickedItemIndex, int clickedCard) {

    }

    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        startActivity(new Intent(getApplicationContext() , AboutUs_main_Activity.class));
        overridePendingTransition(R.anim.slide_from_left , R.anim.slide_to_right);
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ActivityCompat.finishAfterTransition(this);
        }
        else {
            //overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
        }*/
        return true;
    }
}
