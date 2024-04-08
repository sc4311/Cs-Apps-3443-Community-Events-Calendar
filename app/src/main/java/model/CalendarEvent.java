package model;

import java.io.Serializable;


/**
 * CalendarEvent is a class that represents an event in a calendar.
 * It implements the Serializable interface, allowing instances of this class to be serialized.
 * Each CalendarEvent has a category, name, location, date (month and day), price, and description.
 */
public class CalendarEvent implements Serializable {
    private String category;
    private String name;
    private String location;
    private int month;
    private int day;
    private String price;
    private String description;



    /**
     * Constructs a new CalendarEvent with the given attributes.
     *
     * @param category the category of the event
     * @param name the name of the event
     * @param location the location of the event
     * @param month the month of the event
     * @param day the day of the event
     * @param price the price of the event
     * @param description the description of the event
     */
    public CalendarEvent(String category, String name, String location, int month, int day, String price, String description) {
        this.category = category;
        this.name = name;
        this.location = location;
        this.day = day;
        this.month = month;
        this.price = price;
        this.description = description;
    }

    /**
     * Returns the category of this event.
     *
     * @return the category of this event
     */
    public String getCategory() {
        return category;
    }


    /**
     * Returns the name of this event.
     *
     * @return the name of this event
     */
    public String getName() {
        return name;
    }


    /**
     * Returns the location of this event.
     *
     * @return the location of this event
     */
    public String getLocation() {
        return location;
    }


    /**
     * Returns the day of this event.
     *
     * @return the day of this event
     */
    public int getDay() {
        return day;
    }


    /**
     * Returns the month of this event.
     *
     * @return the month of this event
     */
    public int getMonth() {
        return month;
    }


    /**
     * Returns the price of this event.
     *
     * @return the price of this event
     */
    public String getPrice() {
        return price;
    }


    /**
     * Returns the description of this event.
     *
     * @return the description of this event
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the date of this event in the format "month/day".
     *
     * @return the date of this event
     */
    public String getDate() {
        return month + "/" + day;
    }
}