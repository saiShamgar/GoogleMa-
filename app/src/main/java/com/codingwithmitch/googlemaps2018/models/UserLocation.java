package com.codingwithmitch.googlemaps2018.models;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class UserLocation {

    private GeoPoint geoPoint;
    private @ServerTimestamp
    Date timetamp;
    private User user;

    public UserLocation(GeoPoint geoPoint, Date timetamp, User user) {
        this.geoPoint = geoPoint;
        this.timetamp = timetamp;
        this.user = user;
    }

    public UserLocation() {
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public Date getTimetamp() {
        return timetamp;
    }

    public void setTimetamp(Date timetamp) {
        this.timetamp = timetamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
