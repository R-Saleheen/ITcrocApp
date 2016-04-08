package com.itcroc.itcroc;


public class ClientModel {

    private int icon;
    private String review;
    private String name;
    private String des;
    private String company;




    private boolean isGroupHeader = false;

    public ClientModel(String name) {
        this(-1,name, null, null, null);
        isGroupHeader = true;
    }


    public ClientModel(int icon, String review, String name, String des, String company) {
        super();
        this.icon = icon;
        this.review = review;
        this.name = name;
        this.des = des;
        this.company = company;
    }




    public int getIcon() {
        return icon;
    }
    public void setIcon(int icon) {
        this.icon = icon;
    }


    public String getreview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }


    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }


    public String getdes() {
        return des;
    }
    public void setdes(String des) {
        this.des = des;
    }


    public String getcompany() {
        return company;
    }
    public void setcompany(String company) {
        this.company = company;
    }

    public boolean isGroupHeader() {
        return isGroupHeader;
    }
    public void setGroupHeader(boolean isGroupHeader) {
        this.isGroupHeader = isGroupHeader;
    }
}