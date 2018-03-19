package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EventDescriptionActivity extends AppCompatActivity {

    TextView desc;
    TextView rules;
    TextView contact;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_description);
        desc = (TextView) findViewById(R.id.event_des);
        rules = (TextView) findViewById(R.id.event_rules);
        contact = (TextView) findViewById(R.id.event_contact);
        title = (TextView) findViewById(R.id.event_title_des);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
            } else {
                desc.setText(extras.getString("Desc"));
                rules.setText(extras.getString("Rules"));
                contact.setText(extras.getString("Contact"));
                title.setText(extras.getString("Event"));
            }
        } else {
            desc.setText((String) savedInstanceState.getSerializable("Desc"));
            rules.setText((String) savedInstanceState.getSerializable("Rules"));
            contact.setText((String) savedInstanceState.getSerializable("Contact"));
            title.setText((String) savedInstanceState.getSerializable("Event"));

        }
    }
}
