package com.metroDemo.springbootmavenmetrodemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "stations")
public class Stations {

    @Id
    private Long stationId;
    @Column(name="station_name")
    private Stations stationName;
    @Column(name="lat")
    private long lat;
    @Column(name="lon")
    private long lon;

    @Override
    public String toString() {
        return "String{" +
                "stationId=" + stationId +
                ", stationName=" + stationName +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public long getStationId() {
        return stationId;
    }

    public void setStationId(long stationId) {
        this.stationId = stationId;
    }

    public Stations getStationName() {
        return stationName;
    }

    public void setStationName(Stations stationName) {
        this.stationName = stationName;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }
}
