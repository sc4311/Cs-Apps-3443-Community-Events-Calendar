package com.example.a5_lxx789;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import model.CalendarEvent;


/**
 * This class represents the activity for displaying event details.
 * It extends AppCompatActivity, which is a base class for activities that use the support library action bar features.
 */
public class EventDetailsActivity extends AppCompatActivity {
    /**
     * Called when the activity is starting.
     * This is where most initialization should go: calling setContentView(int) to inflate the activity's UI,
     * using findViewById(int) to programmatically interact with widgets in the UI.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        TextView update = findViewById(R.id.details_text_view);
        String event = (String) getIntent().getSerializableExtra("event");

        if(Objects.nonNull(event))
        {
            update.setText(event);
        }
    }
}