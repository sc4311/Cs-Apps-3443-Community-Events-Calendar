package controller;

import android.util.Log;
import android.view.View;

import model.CalendarEvent;

/**
 * DetailsButtonListener is a class that implements the OnClickListener interface.
 * It is responsible for handling the click events of the details button in the application.
 * When a details button is clicked, it uses the MainController to show the details of a specific CalendarEvent.
 */
public class DetailsButtonListener implements View.OnClickListener {
    private static MainController mainController;
    private CalendarEvent event;

    /**
     * Constructs a new DetailsButtonListener with the given CalendarEvent.
     *
     * @param event the event whose details are to be shown
     */
    public DetailsButtonListener(CalendarEvent event) {
        this.event = event;
    }


    /**
     * Sets the MainController for this DetailsButtonListener.
     *
     * @param mc the MainController to be set
     */
    public static void setMainController(MainController mc) {
        mainController = mc;
    }


    /**
     * Called when the details button has been clicked.
     * It logs the click event and uses the MainController to show the details of the event.
     *
     * @param v the view that was clicked
     */
    @Override
    public void onClick(View v) {
        Log.d("DetailsButtonListener", "Details button clicked");
        mainController.showDetails(event);
    }
}
