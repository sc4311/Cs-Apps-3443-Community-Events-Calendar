package controller;
import android.view.View;


/**
 * SortByDateListener is a class that implements the OnClickListener interface.
 * It is responsible for handling the click events of the sort by date button in the application.
 * When the sort by date button is clicked, it uses the MainController to sort the events by date.
 */
public class SortByDateListener implements View.OnClickListener {
    private MainController mainController;

    /**
     * Constructs a new SortByDateListener with the given MainController.
     *
     * @param mainController the MainController used to sort events by date
     */
    public SortByDateListener(MainController mainController) {
        this.mainController = mainController;
    }


    /**
     * Called when the sort by date button has been clicked.
     * It uses the MainController to sort the events by date.
     *
     * @param v the view that was clicked
     */
    @Override
    public void onClick(View v) {
        mainController.sortByDate();
    }
}