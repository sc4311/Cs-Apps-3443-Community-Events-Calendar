package view;

import java.util.Comparator;
import model.CalendarEvent;


/**
 * CategoryComparator is a class that implements the Comparator interface for CalendarEvent objects.
 * It is used to compare two CalendarEvent objects first by their category, then by their date, and finally by their name.
 */
public class CategoryComparator implements Comparator<CalendarEvent> {

    /**
     * Compares two CalendarEvent objects first by their category, then by their date, and finally by their name.
     *
     * @param event1 the first CalendarEvent to be compared
     * @param event2 the second CalendarEvent to be compared
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second
     */
    @Override
    public int compare(CalendarEvent event1, CalendarEvent event2) {
        int categoryComparison = event1.getCategory().compareTo(event2.getCategory());
        if (categoryComparison != 0) return categoryComparison;

        int dateComparison = event1.getDate().compareTo(event2.getDate());
        if (dateComparison != 0) return dateComparison;

        return event1.getName().compareTo(event2.getName());
    }
}