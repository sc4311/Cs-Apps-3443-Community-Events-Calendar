package view;

import android.annotation.SuppressLint;

import java.util.Collections;
import java.util.Comparator;
import model.CalendarEvent;

/**
 * EventView is a class that provides functionality for displaying and sorting CalendarEvent objects.
 * It uses an Adapter to manage the data and updates the view when the data is sorted.
 */
public class EventView {

    private Adapter adapter;



    /**
     * Constructs a new EventView with the given Adapter.
     *
     * @param adapter the Adapter for managing the data
     */
    public EventView(Adapter adapter) {
        this.adapter = adapter;
    }


    /**
     * Returns an abbreviated description of the given CalendarEvent.
     * The description is truncated to 100 characters if it is longer.
     *
     * @param event the CalendarEvent to get the description from
     * @return the abbreviated description of the event
     */
    public static String abbreviatedDescription(CalendarEvent event) {
        // Return the abbreviated event description
        return event.getDescription().substring(0, Math.min(event.getDescription().length(), 100));
    }


    /**
     * Returns a full description of the given CalendarEvent.
     * The description includes the date, event name, category, location, admission price, and event description.
     *
     * @param event the CalendarEvent to get the description from
     * @return the full description of the event
     */
    public static String fullDescription(CalendarEvent event)
    {
        @SuppressLint("DefaultLocale") String format =
                String.format("Date: %d/%d\n", event.getDay(),           event.getMonth()) +
                        String.format("Event: %s\n", event.getName()) +
                        String.format("Category: %s\n", event.getCategory()) +
                        String.format("Location: %s\n", event.getLocation()) +
                        String.format("Admission: %s\n\n", event.getPrice()) +
                        String.format("%s", event.getDescription());

        return format;
    }


    /**
     * Sorts the events by date using the DateComparator.
     */
    public void sortByDate()
    {
        comparator(new DateComparator());
    }

    /**
     * Sorts the events by category using the CategoryComparator.
     */
    public void sortByCategory()
    {
        comparator(new CategoryComparator());
    }


    /**
     * Sorts the events by name using the NameComparator.
     */
    public void sortByName()
    {
        comparator(new NameComparator());
    }



    /**
     * Sorts the events using the given Comparator and notifies the Adapter that the data has changed.
     *
     * @param comparator the Comparator to use for sorting the events
     */
    private void comparator(Comparator<CalendarEvent> comparator) {
        Collections.sort(adapter.getEvents(), comparator);
        adapter.notifyDataSetChanged();
    }
}