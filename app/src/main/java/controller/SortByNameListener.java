package controller;

import android.view.View;

/**
 * SortByNameListener is a class that implements the OnClickListener interface.
 * It is responsible for handling the click events of the sort by name button in the application.
 * When the sort by name button is clicked, it uses the MainController to sort the events by name.
 */
public class SortByNameListener implements View.OnClickListener {
    private MainController mainController;


    /**
     * Constructs a new SortByNameListener with the given MainController.
     *
     * @param mainController the MainController used to sort events by name
     */
    public SortByNameListener(MainController mainController) {
        this.mainController = mainController;
    }


    /**
     * Called when the sort by name button has been clicked.
     * It uses the MainController to sort the events by name.
     *
     * @param v the view that was clicked
     */
    @Override
    public void onClick(View v) {
        mainController.sortByName();
    }
}