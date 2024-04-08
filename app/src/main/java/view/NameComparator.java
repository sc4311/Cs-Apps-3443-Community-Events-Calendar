package view;

import java.util.Comparator;
import model.CalendarEvent;


/**
 * NameComparator is a class that implements the Comparator interface for CalendarEvent objects.
 * It is used to compare two CalendarEvent objects first by their name, then by their date, and finally by their category.
 */
public class NameComparator implements Comparator<CalendarEvent> {

    /**
     * Compares two CalendarEvent objects first by their name, then by their date, and finally by their category.
     *
     * @param event1 the first CalendarEvent to be compared
     * @param event2 the second CalendarEvent to be compared
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second
     */
    @Override
    public int compare(CalendarEvent event1, CalendarEvent event2) {
        int nameComparison = event1.getName().compareTo(event2.getName());
        if (nameComparison != 0) return nameComparison;

        int dateComparison = event1.getDate().compareTo(event2.getDate());
        if (dateComparison != 0) return dateComparison;

        return event1.getCategory().compareTo(event2.getCategory());
    }
}