package controller;

import android.content.Intent;

import com.example.a5_lxx789.EventDetailsActivity;
import com.example.a5_lxx789.MainActivity;
import model.CalendarEvent;
import view.EventView;
import view.Adapter;

/**
 * MainController is the class responsible for handling user interactions and controlling the flow of the application.
 * It communicates with the EventView to sort events and with the MainActivity to start the EventDetailsActivity.
 */
public class MainController {
    private EventView eventView;
    private MainActivity mainActivity;


    /**
     * Constructs a new MainController with the given EventView and MainActivity.
     *
     * @param eventView the EventView used to display and sort events
     * @param mainActivity the MainActivity used to start the EventDetailsActivity
     */
    public MainController(EventView eventView, MainActivity mainActivity) {
        this.eventView = eventView;
        this.mainActivity = mainActivity;
    }

    /**
     * Sorts the events in the EventView by date.
     */
    public void sortByDate() {
        eventView.sortByDate();
    }


    /**
     * Sorts the events in the EventView by category.
     */
    public void sortByCategory() {
        eventView.sortByCategory();
    }


    /**
     * Sorts the events in the EventView by name.
     */
    public void sortByName() {
        eventView.sortByName();
    }


    /**
     * Starts the EventDetailsActivity to show the details of the given event.
     *
     * @param event the event whose details are to be shown
     */
    public void showDetails(CalendarEvent event) {
        Intent intent = new Intent(mainActivity, com.example.a5_lxx789.EventDetailsActivity.class);
        intent.putExtra("event", EventView.fullDescription(event));
        mainActivity.startActivity(intent);
    }
}