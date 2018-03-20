package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Sponsors extends AppCompatActivity {

    Typeface typeface;
    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sponsors);
        setContentView(R.layout.activity_main2);

        typeface = Typeface.createFromAsset(getAssets(),"font/PT_Sans-Narrow-Web-Regular.ttf");
        /*txt1 = findViewById(R.id.prsnt);
        txt2 = findViewById(R.id.ast);
        txt3 = findViewById(R.id.ots);
        txt1.setTypeface(typeface);
        txt2.setTypeface(typeface);
        txt3.setTypeface(typeface);*/
    }
}
