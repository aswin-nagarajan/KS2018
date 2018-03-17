package com.example.aswinnagarajan.kuruksastra2k18.AboutKS;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aswinnagarajan.kuruksastra2k18.R;

public class DetailActivity extends AppCompatActivity {

    LinearLayout imageBack;
    TextView txt;
    Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageBack = findViewById(R.id.background);
        txt = findViewById(R.id.txt);
        typeface = Typeface.createFromAsset(getAssets(),"font/PT_Sans-Narrow-Web-Regular.ttf");
        txt.setTypeface(typeface);

        switch (getIntent().getIntExtra("OPTION",0)){

            case 1:
                imageBack.setBackgroundResource(R.drawable.sastra_back);
                txt.setText(Html.fromHtml(getString(R.string.about_sastra)));
                txt.setMovementMethod(new ScrollingMovementMethod());
            break;
            case 2:
                imageBack.setBackgroundResource(R.drawable.ks_back);
                txt.setText(Html.fromHtml(getString(R.string.about_ks)));
                txt.setMovementMethod(new ScrollingMovementMethod());
                break;
            case 3:
                imageBack.setBackgroundResource(R.drawable.uphar_back);
                txt.setText(Html.fromHtml(getString(R.string.about_up)));
                txt.setMovementMethod(new ScrollingMovementMethod());
                break;
        }
    }
}
