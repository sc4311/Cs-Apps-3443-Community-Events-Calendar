package view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a5_lxx789.MainActivity;
import com.example.a5_lxx789.R;

import java.util.ArrayList;
import model.CalendarEvent;


/**
 * Adapter is a class that extends RecyclerView.Adapter<ViewHolder>.
 * It is responsible for providing views that represent items in a data set.
 * Each data item is a CalendarEvent object and is presented in the RecyclerView by a ViewHolder.
 */
public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<CalendarEvent> events;
    private MainActivity mainActivity;


    /**
     * Constructs a new Adapter with the given list of events and MainActivity instance.
     *
     * @param events the list of CalendarEvent objects
     * @param mainActivity the MainActivity instance
     */
    public Adapter(ArrayList<CalendarEvent> events, MainActivity mainActivity) {
        this.events = events;
        this.mainActivity = mainActivity;
    }


    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return the total number of items in this adapter's data set
     */
    @Override
    public int getItemCount() {
        return events.size();
    }


    /**
     * Called when RecyclerView needs a new ViewHolder of the given type to represent an item.
     *
     * @param parent the ViewGroup into which the new View will be added after it is bound to an adapter position
     * @param viewType the view type of the new View
     * @return a new ViewHolder that holds a View of the given view type
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mainActivity);
        return new ViewHolder(inflater, parent);
    }


    /**
     * Called by RecyclerView to display the data at the specified position.
     *
     * @param viewHolder the ViewHolder which should be updated to represent the contents of the item at the given position in the data set
     * @param position the position of the item within the adapter's data set
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.bind(events.get(position));
    }


    /**
     * Returns the list of events.
     *
     * @return the list of events
     */
    public ArrayList<CalendarEvent> getEvents() {
        return events;
    }
}