package view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.a5_lxx789.R;

import controller.DetailsButtonListener;
import model.CalendarEvent;


/**
 * ViewHolder is a class that extends RecyclerView.ViewHolder.
 * It is responsible for providing a reference to the views for each data item in the RecyclerView.
 * Each data item is a CalendarEvent object and is presented in the RecyclerView by this ViewHolder.
 */
public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView eventBlurb;
    private Button detailsButton;


    /**
     * Constructs a new ViewHolder with the given LayoutInflater and ViewGroup.
     *
     * @param inflater the LayoutInflater to use for inflating the view
     * @param parent the ViewGroup into which the new view will be added after it is bound to an adapter position
     */
    public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.event_item, parent, false));
        eventBlurb = itemView.findViewById(R.id.event_blurb);
        detailsButton = itemView.findViewById(R.id.details_button);
    }

    /**
     * Binds the given CalendarEvent to the ViewHolder.
     * This updates the TextView and Button to display the details of the event.
     *
     * @param event the CalendarEvent to bind to the ViewHolder
     */
    public void bind(CalendarEvent event) {
        eventBlurb.setText(String.format("%s %s: %s", event.getDate(),event.getCategory(), event.getName()));
        detailsButton.setOnClickListener(new DetailsButtonListener(event));
    }
}