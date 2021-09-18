package com.metroDemo.springbootmavenmetrodemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lines")
public class Lines {

    @Id
    private long lineId;
    @Column(name = "line_name")
    private Stations lineName;

    @Override
    public java.lang.String toString() {
        return "Lines{" +
                "id=" + lineId +
                ", name='" + lineName + '\'' +
                '}';
    }

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public Stations getLineName() {
        return lineName;
    }

    public void setLineName(Stations lineName) {
        this.lineName = lineName;
    }
}
