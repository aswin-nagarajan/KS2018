package com.dpi300.aswinnagarajan.kuruksastra2k18.AboutKS;


import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;

public class AboutKSActivity extends AppCompatActivity {

    ImageButton btnSastra,btnKS,btnUphar;
    TextView txtSas,txtKS,txtUP;
    ActivityOptionsCompat options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_ks);

        final Intent intent = new Intent(AboutKSActivity.this,DetailActivity.class);


        btnSastra = findViewById(R.id.about_sastra);
        btnSastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSas = findViewById(R.id.textSastra);
                intent.putExtra("OPTION",1);

                Pair<View,String>p1 = Pair.create((View)btnSastra,"robot");
                Pair<View,String>p2 = Pair.create((View)txtSas,"text");
                 options = ActivityOptionsCompat.makeSceneTransitionAnimation(AboutKSActivity.this,p1,p2);

                startActivity(intent, options.toBundle());

            }
        });

        btnKS = findViewById(R.id.about_ks);
        btnKS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtKS = findViewById(R.id.textKS);
                intent.putExtra("OPTION",2);
                Pair<View,String>p1 = Pair.create((View)btnKS,"robot");
                Pair<View,String>p2 = Pair.create((View)txtKS,"text");

                options = ActivityOptionsCompat.makeSceneTransitionAnimation(AboutKSActivity.this,p1,p2);

                startActivity(intent, options.toBundle());
            }
        });

        btnUphar = findViewById(R.id.about_up);
        btnUphar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUP = findViewById(R.id.textUPHAR);
                intent.putExtra("OPTION",3);
                Pair<View,String>p1 = Pair.create((View)btnUphar,"robot");
                Pair<View,String>p2 = Pair.create((View)txtUP,"text");

                options = ActivityOptionsCompat.makeSceneTransitionAnimation(AboutKSActivity.this,p1,p2);

                startActivity(intent, options.toBundle());
            }
        });


    }



}
