package controller;

import android.view.View;


/**
 * SortByCategoryListener is a class that implements the OnClickListener interface.
 * It is responsible for handling the click events of the sort by category button in the application.
 * When the sort by category button is clicked, it uses the MainController to sort the events by category.
 */
public class SortByCategoryListener implements View.OnClickListener {
    private MainController mainController;


    /**
     * Constructs a new SortByCategoryListener with the given MainController.
     *
     * @param mainController the MainController used to sort events by category
     */
    public SortByCategoryListener(MainController mainController) {
        this.mainController = mainController;
    }


    /**
     * Called when the sort by category button has been clicked.
     * It uses the MainController to sort the events by category.
     *
     * @param v the view that was clicked
     */
    @Override
    public void onClick(View v) {
        mainController.sortByCategory();
    }
}