package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class ClientTransaction {
    private int clientID;
    private String clientName;
    private String sharesType;


    public ClientTransaction() {
    }

    public ClientTransaction(int clientID, String clientName, String sharesType) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.sharesType = sharesType;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getSharesType() {
        return sharesType;
    }

    public void setSharesType(String sharesType) {
        this.sharesType = sharesType;
    }

    @Override
    public String toString() {
        return "ClientTransaction{" +
                "clientID=" + clientID +
                ", clientName='" + clientName + '\'' +
                ", sharesType='" + sharesType + '\'' +
                '}';
    }
}
