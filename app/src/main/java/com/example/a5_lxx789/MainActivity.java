package com.example.a5_lxx789;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;

import controller.MainController;
import controller.SortByCategoryListener;
import controller.SortByDateListener;
import controller.SortByNameListener;
import model.EventListing;
import view.Adapter;
import view.EventView;
import controller.DetailsButtonListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * MainActivity is the main entry point of the application.
 * It extends AppCompatActivity, which is a base class for activities that use the support library action bar features.
 *
 * This class is responsible for setting up the user interface and initializing the application's functionality.
 * It sets up the RecyclerView and its Adapter, reads event data from a CSV file, and initializes the MainController.
 * It also sets up listeners for the sorting buttons and the DetailsButtonListener.
 */

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private MainController mainController;

    /**
     * Called when the activity is starting.
     * This is where most initialization should go: calling setContentView(int) to inflate the activity's UI,
     * using findViewById(int) to programmatically interact with widgets in the UI, reading and applying saved instance state,
     * and initializing class-scope variables such as adapters and listeners.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize your RecyclerView and Adapter here
        recyclerView = findViewById(R.id.recycler_view);

        // Read events from CSV file
        EventListing eventListing = new EventListing();
        try {
            InputStream is = getAssets().open("events.csv");
            eventListing.readEvent(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        adapter = new Adapter(eventListing.getEvents(), this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Initialize your MainController here
        mainController = new MainController(new EventView(adapter), this);

        // Set up listeners for your sorting buttons
        Button sortByDateButton = findViewById(R.id.sort_by_date);
        sortByDateButton.setOnClickListener(new SortByDateListener(mainController));

        Button sortByNameButton = findViewById(R.id.sort_by_name);
        sortByNameButton.setOnClickListener(new SortByNameListener(mainController));

        Button sortByCategoryButton = findViewById(R.id.sort_by_category);


        sortByCategoryButton.setOnClickListener(new SortByCategoryListener(mainController));

        // Set the MainController for the DetailsButtonListener
        DetailsButtonListener.setMainController(mainController);


    }
}
