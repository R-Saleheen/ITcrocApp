package com.itcroc.itcroc;


public class TeamModel {

    private int icon;
    private String name;
    private String des;



    private boolean isGroupHeader = false;

    public TeamModel(String name) {
        this(-1,name, null);
        isGroupHeader = true;
    }


    public TeamModel(int icon, String name, String des) {
        super();
        this.icon = icon;
        this.name = name;
        this.des = des;

    }




    public int getIcon() {
        return icon;
    }
    public void setIcon(int icon) {
        this.icon = icon;
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

    public boolean isGroupHeader() {
        return isGroupHeader;
    }
    public void setGroupHeader(boolean isGroupHeader) {
        this.isGroupHeader = isGroupHeader;
    }
}