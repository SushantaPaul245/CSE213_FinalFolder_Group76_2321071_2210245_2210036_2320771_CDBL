package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class EditProfile {
    private String name;
    private int mobileNo;
    private int nationalID;
    private String address;

    public EditProfile() {
    }

    public EditProfile(String name, String address, int nationalID, int mobileNo) {
        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EditProfile{" +
                "name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", nationalID=" + nationalID +
                ", address='" + address + '\'' +
                '}';
    }
}
