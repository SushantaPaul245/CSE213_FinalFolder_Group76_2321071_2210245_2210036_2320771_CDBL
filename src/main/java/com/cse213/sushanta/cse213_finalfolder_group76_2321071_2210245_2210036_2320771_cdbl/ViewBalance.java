package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

public class ViewBalance {
    private String userName,password;

    public ViewBalance() {
    }

    public ViewBalance(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ViewBalance{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
