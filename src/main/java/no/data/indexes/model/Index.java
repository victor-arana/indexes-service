package no.data.indexes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String region;
    public Double index;

    public Index() {
    }

    public Index(long id, String region, Double index) {
        this.id = id;
        this.region = region;
        this.index = index;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getIndex() {
        return index;
    }

    public void setIndex(Double index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Index{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", index=" + index +
                '}';
    }
}
