
package view;

import java.util.Comparator;
import model.CalendarEvent;


/**
 * DateComparator is a class that implements the Comparator interface for CalendarEvent objects.
 * It is used to compare two CalendarEvent objects first by their date, then by their category, and finally by their name.
 */
public class DateComparator implements Comparator<CalendarEvent> {

    /**
     * Compares two CalendarEvent objects first by their date, then by their category, and finally by their name.
     *
     * @param event1 the first CalendarEvent to be compared
     * @param event2 the second CalendarEvent to be compared
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second
     */
    @Override
    public int compare(CalendarEvent event1, CalendarEvent event2) {
        int dateComparison = event1.getDate().compareTo(event2.getDate());
        if (dateComparison != 0) return dateComparison;

        int categoryComparison = event1.getCategory().compareTo(event2.getCategory());
        if (categoryComparison != 0) return categoryComparison;

        return event1.getName().compareTo(event2.getName());
    }
}