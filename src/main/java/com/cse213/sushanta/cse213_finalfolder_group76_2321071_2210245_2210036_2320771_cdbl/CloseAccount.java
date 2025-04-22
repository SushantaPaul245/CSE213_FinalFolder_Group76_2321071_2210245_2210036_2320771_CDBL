package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class CloseAccount {
    private String userName;
    private String reason;
    private int dues;

    public CloseAccount() {
    }

    public CloseAccount(String userName, String reason, int dues) {
        this.userName = userName;
        this.reason = reason;
        this.dues = dues;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDues() {
        return dues;
    }

    public void setDues(int dues) {
        this.dues = dues;
    }

    @Override
    public String toString() {
        return "CloseAccount{" +
                "userName='" + userName + '\'' +
                ", reason='" + reason + '\'' +
                ", dues=" + dues +
                '}';
    }
}
