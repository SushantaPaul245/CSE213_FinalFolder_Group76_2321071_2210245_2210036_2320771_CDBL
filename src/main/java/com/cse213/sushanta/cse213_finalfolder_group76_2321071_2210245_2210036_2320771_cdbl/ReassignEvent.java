package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import java.time.LocalDate;

public class ReassignEvent {
    private String eventName;
    private LocalDate eventDate;
    private int eventTime;

    public ReassignEvent() {
    }

    public ReassignEvent(String eventName, int eventTime, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventTime() {
        return eventTime;
    }

    public void setEventTime(int eventTime) {
        this.eventTime = eventTime;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "ReassignEvent{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventTime=" + eventTime +
                '}';
    }
}
