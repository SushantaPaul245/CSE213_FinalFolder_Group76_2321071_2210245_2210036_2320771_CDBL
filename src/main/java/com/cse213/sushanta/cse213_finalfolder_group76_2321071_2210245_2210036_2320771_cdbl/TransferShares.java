package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class TransferShares {
    private int accountNumber,numberOfShares;
    private String accountName;

    public TransferShares() {
    }

    public TransferShares(String accountName, int numberOfShares, int accountNumber) {
        this.accountName = accountName;
        this.numberOfShares = numberOfShares;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "TransferShares{" +
                "accountNumber=" + accountNumber +
                ", numberOfShares=" + numberOfShares +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
