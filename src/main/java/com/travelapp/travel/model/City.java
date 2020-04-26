package com.travelapp.travel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    @GeneratedValue
    private int cid;
    private String province;
    private String city;
    private String area;

    public City() {
    }

    public City(String province, String city, String area) {
        this.province = province;
        this.city = city;
        this.area = area;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
