package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class WithdrawFunds {
    private String bankName;
    private int accountNumber,amount;

    public WithdrawFunds() {
    }

    public WithdrawFunds(String bankName, int accountNumber, int amount) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "WithdrawFunds{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                '}';
    }
}
