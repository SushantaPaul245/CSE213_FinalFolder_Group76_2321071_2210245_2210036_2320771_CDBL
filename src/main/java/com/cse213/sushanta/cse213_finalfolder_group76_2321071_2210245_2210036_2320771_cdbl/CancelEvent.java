package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import java.time.LocalDate;

public class CancelEvent {
    private String eventName;
    private LocalDate eventDate;

    public CancelEvent() {
    }

    public CancelEvent(String eventName, LocalDate eventDate) {
        this.eventName = eventName;
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

    @Override
    public String toString() {
        return "CancelEvent{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}
