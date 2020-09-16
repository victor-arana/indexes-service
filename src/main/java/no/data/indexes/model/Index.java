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
    public int level;
    public String name;
    public Double index;

    public Index() {
    }

    public Index(long id, int level, String name, Double index) {
        this.id = id;
        this.level = level;
        this.name = name;
        this.index = index;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", level=" + level +
                ", name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
