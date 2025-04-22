package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import java.time.LocalDate;

public class CreateEvent {
    private String eventName;
    private LocalDate eventDate;
    private String venue;
    private int startingTime,finishingTime;
    private String eventDescription;

    public CreateEvent() {

    }

    public CreateEvent(String eventName, String eventDescription, int finishingTime, String venue, int startingTime, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.finishingTime = finishingTime;
        this.venue = venue;
        this.startingTime = startingTime;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(int finishingTime) {
        this.finishingTime = finishingTime;
    }

    public int getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(int startingTime) {
        this.startingTime = startingTime;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @Override
    public String toString() {
        return "CreateEvent{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", venue='" + venue + '\'' +
                ", startingTime=" + startingTime +
                ", finishingTime=" + finishingTime +
                ", eventDescription='" + eventDescription + '\'' +
                '}';
    }
}
