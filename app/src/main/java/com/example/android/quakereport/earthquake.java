package com.example.android.quakereport;

public class earthquake {
    private String url;
    private double intensity;
    private String location;
    private long timeInMilliseconds;

    public earthquake(double intensity, String location, long date, String url){
        this.intensity=intensity;
        this.location=location;
        this.timeInMilliseconds=date;
        this.url=url;
    }
    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
