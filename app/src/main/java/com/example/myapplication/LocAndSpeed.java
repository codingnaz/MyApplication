package com.example.myapplication;

import android.location.Location;

public class LocAndSpeed {
    Location loc;
    Float speed;

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }
}
