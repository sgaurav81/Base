package com.gaurav.base.data;


public class BaseData {

String name;
int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
