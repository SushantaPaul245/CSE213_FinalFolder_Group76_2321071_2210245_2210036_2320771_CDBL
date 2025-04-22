package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class UpdateProfile {
    private String name,address;
    private int mobileNo,nationalID;

    public UpdateProfile() {
    }

    public UpdateProfile(String name, String address, int mobileNo, int nationalID) {
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.nationalID = nationalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UpdateProfile{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo=" + mobileNo +
                ", nationalID=" + nationalID +
                '}';
    }
}
