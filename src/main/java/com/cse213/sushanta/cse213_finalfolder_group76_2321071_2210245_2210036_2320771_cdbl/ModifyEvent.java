package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import java.time.LocalDate;

public class ModifyEvent {
    private String modifyEventName,modifyVenue,changeDescription;
    private LocalDate modifyEventDate;
    private int modifyStartingTime,modifyFinishingTime;

    public ModifyEvent() {
    }

    public ModifyEvent(String modifyEventName, int modifyFinishingTime, int modifyStartingTime, LocalDate modifyEventDate, String changeDescription, String modifyVenue) {
        this.modifyEventName = modifyEventName;
        this.modifyFinishingTime = modifyFinishingTime;
        this.modifyStartingTime = modifyStartingTime;
        this.modifyEventDate = modifyEventDate;
        this.changeDescription = changeDescription;
        this.modifyVenue = modifyVenue;
    }

    public String getModifyEventName() {
        return modifyEventName;
    }

    public void setModifyEventName(String modifyEventName) {
        this.modifyEventName = modifyEventName;
    }

    public String getModifyVenue() {
        return modifyVenue;
    }

    public void setModifyVenue(String modifyVenue) {
        this.modifyVenue = modifyVenue;
    }

    public String getChangeDescription() {
        return changeDescription;
    }

    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    public LocalDate getModifyEventDate() {
        return modifyEventDate;
    }

    public void setModifyEventDate(LocalDate modifyEventDate) {
        this.modifyEventDate = modifyEventDate;
    }

    public int getModifyFinishingTime() {
        return modifyFinishingTime;
    }

    public void setModifyFinishingTime(int modifyFinishingTime) {
        this.modifyFinishingTime = modifyFinishingTime;
    }

    public int getModifyStartingTime() {
        return modifyStartingTime;
    }

    public void setModifyStartingTime(int modifyStartingTime) {
        this.modifyStartingTime = modifyStartingTime;
    }

    @Override
    public String toString() {
        return "ModifyEvent{" +
                "modifyEventName='" + modifyEventName + '\'' +
                ", modifyVenue='" + modifyVenue + '\'' +
                ", changeDescription='" + changeDescription + '\'' +
                ", modifyEventDate=" + modifyEventDate +
                ", modifyStartingTime=" + modifyStartingTime +
                ", modifyFinishingTime=" + modifyFinishingTime +
                '}';
    }
}
