package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import java.time.LocalDate;

public class Resignation {
    private String userName;
    private LocalDate lastWorkingDate;
    private String reason,anyComment;

    public Resignation() {
    }

    public Resignation(String userName, String anyComment, String reason, LocalDate lastWorkingDate) {
        this.userName = userName;
        this.anyComment = anyComment;
        this.reason = reason;
        this.lastWorkingDate = lastWorkingDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAnyComment() {
        return anyComment;
    }

    public void setAnyComment(String anyComment) {
        this.anyComment = anyComment;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getLastWorkingDate() {
        return lastWorkingDate;
    }

    public void setLastWorkingDate(LocalDate lastWorkingDate) {
        this.lastWorkingDate = lastWorkingDate;
    }

    @Override
    public String toString() {
        return "Resignation{" +
                "userName='" + userName + '\'' +
                ", lastWorkingDate=" + lastWorkingDate +
                ", reason='" + reason + '\'' +
                ", anyComment='" + anyComment + '\'' +
                '}';
    }
}
