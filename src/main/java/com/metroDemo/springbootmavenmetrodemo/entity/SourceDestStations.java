package com.metroDemo.springbootmavenmetrodemo.entity;

public class SourceDestStations {

    private Stations source;
    private Stations destination;

    @Override
    public java.lang.String toString() {
        return "SourceDestStations{" +
                "source=" + source +
                ", destination=" + destination +
                '}';
    }

    public Stations getSource() {
        return source;
    }

    public void setSource(Stations source) {
        this.source = source;
    }

    public Stations getDestination() {
        return destination;
    }

    public void setDestination(Stations destination) {
        this.destination = destination;
    }
}
