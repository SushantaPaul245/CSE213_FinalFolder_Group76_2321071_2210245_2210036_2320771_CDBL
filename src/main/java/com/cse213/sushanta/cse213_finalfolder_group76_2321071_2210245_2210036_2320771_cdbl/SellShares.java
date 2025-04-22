package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class SellShares {
    private int numberOfShares,perSharesPrice;

    public SellShares() {
    }

    public SellShares(int numberOfShares, int perSharesPrice) {
        this.numberOfShares = numberOfShares;
        this.perSharesPrice = perSharesPrice;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getPerSharesPrice() {
        return perSharesPrice;
    }

    public void setPerSharesPrice(int perSharesPrice) {
        this.perSharesPrice = perSharesPrice;
    }

    @Override
    public String toString() {
        return "SellShares{" +
                "numberOfShares=" + numberOfShares +
                ", perSharesPrice=" + perSharesPrice +
                '}';
    }
}
