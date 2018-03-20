package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;


/*public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }
}*/

public class SplashScreen extends AwesomeSplash{

    @Override
    public void initSplash(ConfigSplash configSplash) {

        //circular reveal
        configSplash.setBackgroundColor(R.color.splash);
        configSplash.setAnimCircularRevealDuration(2000);
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM);

        //logo animation
        configSplash.setLogoSplash(R.drawable.ks_logo_hex);
        configSplash.setAnimLogoSplashDuration(1000);
        configSplash.setAnimLogoSplashTechnique(Techniques.BounceIn);
        //Text used " " to remove default text
        configSplash.setTitleSplash("");
        configSplash.setAnimTitleDuration(0);


    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(SplashScreen.this,MainActivity.class));
    }
}
