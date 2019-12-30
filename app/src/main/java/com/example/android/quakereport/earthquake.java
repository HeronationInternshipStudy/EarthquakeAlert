package com.example.android.quakereport;

public class earthquake {


    private String intensity;
    private String location;
    private long timeInMilliseconds;

    public earthquake(String intensity,String location,long date){
        this.intensity=intensity;
        this.location=location;
        this.timeInMilliseconds=date;
    }
    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getDate() {
        return timeInMilliseconds;
    }

    public void setDate(long date) {
        this.timeInMilliseconds = date;
    }

}
