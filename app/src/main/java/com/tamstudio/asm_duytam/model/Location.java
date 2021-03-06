package com.tamstudio.asm_duytam.model;

import com.google.android.gms.maps.model.LatLng;

public class Location {
    private String name;
    private LatLng latLng;

    public Location(String name, LatLng latLng) {
        this.name = name;
        this.latLng = latLng;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
