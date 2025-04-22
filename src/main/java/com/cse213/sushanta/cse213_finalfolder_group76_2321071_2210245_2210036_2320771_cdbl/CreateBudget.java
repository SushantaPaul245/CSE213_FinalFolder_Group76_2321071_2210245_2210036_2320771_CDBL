package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class CreateBudget {
    private String eventName;
    private Float venueCost;
    private Float foodCost;
    private Float materialsCost;
    private Float servicesCost;
    private Float otherCost;

    public CreateBudget() {
    }

    public CreateBudget(String eventName, Float otherCost, Float materialsCost, Float foodCost, Float venueCost, Float servicesCost) {
        this.eventName = eventName;
        this.otherCost = otherCost;
        this.materialsCost = materialsCost;
        this.foodCost = foodCost;
        this.venueCost = venueCost;
        this.servicesCost = servicesCost;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Float getVenueCost() {
        return venueCost;
    }

    public void setVenueCost(Float venueCost) {
        this.venueCost = venueCost;
    }

    public Float getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(Float foodCost) {
        this.foodCost = foodCost;
    }

    public Float getMaterialsCost() {
        return materialsCost;
    }

    public void setMaterialsCost(Float materialsCost) {
        this.materialsCost = materialsCost;
    }

    public Float getServicesCost() {
        return servicesCost;
    }

    public void setServicesCost(Float servicesCost) {
        this.servicesCost = servicesCost;
    }

    public Float getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(Float otherCost) {
        this.otherCost = otherCost;
    }

    @Override
    public String toString() {
        return "CreateBudget{" +
                "eventName='" + eventName + '\'' +
                ", venueCost=" + venueCost +
                ", foodCost=" + foodCost +
                ", materialsCost=" + materialsCost +
                ", servicesCost=" + servicesCost +
                ", otherCost=" + otherCost +
                '}';
    }
}
