package model;

import android.util.Log;

import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * EventListing is a class that represents a list of CalendarEvent objects.
 * It provides functionality to read events from an InputStream and store them in an ArrayList.
 */
public class EventListing {
    private ArrayList<CalendarEvent> events;


    /**
     * Constructs a new EventListing with an empty list of events.
     */
    public EventListing() {
        this.events = new ArrayList<>();
    }


    /**
     * Reads events from the given InputStream and adds them to the list of events.
     * Each line in the InputStream should represent a single event, with attributes separated by commas.
     * The expected order of attributes is: category, name, location, month, day, price, description.
     *
     * @param is the InputStream to read events from
     */
    public void readEvent(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Log.d("EventListing", "Reading line: " + line);
                // Split the line into attributes
                String[] attributes = line.split(",");
                // Check if attributes array has the expected number of elements
                if (attributes.length == 7) {
                    // Create a CalendarEvent from the attributes
                    CalendarEvent event = new CalendarEvent(
                            attributes[0], // category
                            attributes[1], // name
                            attributes[2], // location
                            Integer.parseInt(attributes[3]), // month
                            Integer.parseInt(attributes[4]), // day of month
                            attributes[5], // admission price
                            attributes[6]  // description
                    );
                    events.add(event);
                } else {
                    Log.e("EventListing", "Incorrect number of attributes in line: " + line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("EventListing", "Error reading events", e);
        }
    }


    public ArrayList<CalendarEvent> getEvents() {
        return this.events;
    }
}