package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ParticipantLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant_login);
        WebView browser = (WebView) findViewById(R.id.webview);

        browser.loadUrl("http://kuruksastra.in/participants/login.php");
    }

}
