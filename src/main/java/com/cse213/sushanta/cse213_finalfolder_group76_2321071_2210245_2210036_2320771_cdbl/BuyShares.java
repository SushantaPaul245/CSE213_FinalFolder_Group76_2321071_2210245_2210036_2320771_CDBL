package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class BuyShares {
    private int numberOfShares;
    private int expectPerSharesPrice;

    public BuyShares() {
    }

    public BuyShares(int expectPerSharesPrice, int numberOfShares) {
        this.expectPerSharesPrice = expectPerSharesPrice;
        this.numberOfShares = numberOfShares;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getExpectPerSharesPrice() {
        return expectPerSharesPrice;
    }

    public void setExpectPerSharesPrice(int expectPerSharesPrice) {
        this.expectPerSharesPrice = expectPerSharesPrice;
    }

    @Override
    public String toString() {
        return "BuyShares{" +
                "numberOfShares=" + numberOfShares +
                ", expectPerSharesPrice=" + expectPerSharesPrice +
                '}';
    }
}
