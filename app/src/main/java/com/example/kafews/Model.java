package com.example.kafews;

public class Model {

    String riverName;
    String station;
    String maxLevel;
    String currLevel;

    public Model() {

    }

    public Model(String riverName, String station, String maxLevel, String currLevel) {
        this.riverName = riverName;
        this.station = station;
        this.maxLevel = maxLevel;
        this.currLevel = currLevel;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(String maxLevel) {
        this.maxLevel = maxLevel;
    }

    public String getCurrLevel() {
        return currLevel;
    }

    public void setCurrLevel(String currLevel) {
        this.currLevel = currLevel;
    }
}
