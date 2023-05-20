package at.fhv.TeamE.shared.dto;


import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


public class EventOverviewDTO implements Serializable {
    private UUID eventId;
    private String title;
    private String location;
    private String description;
    private String date;
    private double price;
    private String time;

    private int availableSeat;

    private int availableStanding;



    public EventOverviewDTO(){

    }

    public EventOverviewDTO(UUID eventId, String title, String location, String description, String date, double price, String time, int availableSeat, int availableStanding) {
        this.eventId = eventId;
        this.title = title;
        this.location = location;
        this.description = description;
        this.date = date;
        this.price = price;
        this.time = time;
        this.availableSeat = availableSeat;
        this.availableStanding = availableStanding;
    }

    public UUID getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
//        byte[] descriptionBytes = description.getBytes(StandardCharsets.UTF_8);
//        return new String(descriptionBytes, StandardCharsets.UTF_8);
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public int getAvailableStanding() {
        return availableStanding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventOverviewDTO that = (EventOverviewDTO) o;
        return Double.compare(that.price, price) == 0 && availableSeat == that.availableSeat && availableStanding == that.availableStanding && eventId.equals(that.eventId) && title.equals(that.title) && location.equals(that.location) && description.equals(that.description) && date.equals(that.date) && time.equals(that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, title, location, description, date, price, time, availableSeat, availableStanding);
    }
}