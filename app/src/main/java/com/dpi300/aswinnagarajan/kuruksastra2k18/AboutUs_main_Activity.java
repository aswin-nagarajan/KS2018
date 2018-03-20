package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.dpi300.aswinnagarajan.kuruksastra2k18.proshow_utilities.Utils_ProShow;
import com.squareup.picasso.Picasso;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class AboutUs_main_Activity extends AppCompatActivity {

    ImageView imageView_graphic_designer, imageView_web_dev, imageView_app_dev;
    String url_graphic_des = "https://firebasestorage.googleapis.com/v0/b/friendlychat-e9cd8.appspot.com/o/KS_18%2FGRAPHIC%20DESIGNER.png?alt=media&token=7f5d52ff-9b20-4f15-b699-d9a372748031";
    String url_web_Dev = "https://firebasestorage.googleapis.com/v0/b/friendlychat-e9cd8.appspot.com/o/KS_18%2FWEB%20DEVE.png?alt=media&token=e9d3ff7d-a4e9-4c0a-9556-7198e1e882f7";
    String url_app_Dev = "https://firebasestorage.googleapis.com/v0/b/friendlychat-e9cd8.appspot.com/o/KS_18%2FAPP%20DEVE.png?alt=media&token=f5b25dec-0ed1-4999-b586-c1b2ceed0d3a";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_main_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageView_graphic_designer = findViewById(R.id.imageView_graphic_designer);
        imageView_app_dev = findViewById(R.id.imageView_app_dev);
        imageView_web_dev = findViewById(R.id.imageView_web_dev);

        openActivity();

     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }

    private void openActivity() {

        imageView_graphic_designer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext() , AboutUs_Activity.class);
                i.putExtra("title" ,"GRAPHIC DESIGNER");
                startActivity(i);
                overridePendingTransition(R.anim.slide_from_right , R.anim.slide_to_left);
                /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    String transitionName = getString(R.string.transition_sharedelement);

                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(AboutUs_main_Activity.this,
                                    imageView_graphic_designer,   // Starting view
                                    transitionName    // The String
                            );

                    ActivityCompat.startActivity(AboutUs_main_Activity.this, i, options.toBundle());
                }
                else {
                    startActivity(i);
                    //overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                }*/
            }
        });

        imageView_web_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext() , AboutUs_Activity.class);
                i.putExtra("title" ,"WEB DEVELOPER");
                startActivity(i);
                overridePendingTransition(R.anim.slide_from_right , R.anim.slide_to_left);
                /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    String transitionName = getString(R.string.transition_sharedelement);

                    ActivityOptionsCompat options =

                            ActivityOptionsCompat.makeSceneTransitionAnimation(AboutUs_main_Activity.this,
                                    imageView_web_dev,   // Starting view
                                    transitionName    // The String
                            );

                    ActivityCompat.startActivity(AboutUs_main_Activity.this, i, options.toBundle());
                }
                else {
                    startActivity(i);
                    //overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                }*/
            }
        });


        imageView_app_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext() , AboutUs_Activity.class);
                i.putExtra("title" ,"APP DEVELOPER");
                startActivity(i);
                overridePendingTransition(R.anim.slide_from_right , R.anim.slide_to_left);
                /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    String transitionName = getString(R.string.transition_sharedelement);

                    ActivityOptionsCompat options =

                            ActivityOptionsCompat.makeSceneTransitionAnimation(AboutUs_main_Activity.this,
                                    imageView_app_dev,   // Starting view
                                    transitionName    // The String
                            );

                    ActivityCompat.startActivity(AboutUs_main_Activity.this, i, options.toBundle());
                }
                else {
                    startActivity(i);
                    //overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                }*/
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        startActivity(new Intent(getApplicationContext() , MainActivity.class));
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
