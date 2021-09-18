package com.metroDemo.springbootmavenmetrodemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trains")
public class Trains {

    @Id
    private long trainId;
    @Column(name="train_name")
    private Stations trainName;

    @Override
    public java.lang.String toString() {
        return "Trains{" +
                "id=" + trainId +
                ", name='" + trainName + '\'' +
                '}';
    }

    public long getTrainId() {
        return trainId;
    }

    public void setTrainId(long trainId) {
        this.trainId = trainId;
    }

    public Stations getTrainName() {
        return trainName;
    }

    public void setTrainName(Stations trainName) {
        this.trainName = trainName;
    }
}
