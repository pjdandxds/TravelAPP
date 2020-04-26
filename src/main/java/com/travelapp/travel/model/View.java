package com.travelapp.travel.model;

import javax.persistence.*;

@Entity
public class View {
    @Id
    @GeneratedValue
    private int vid;

    @ManyToOne
    @JoinColumn(name="cid")
    private City city;

    private String sight;
    private Double longitude;
    private Double latitude;
    private String level;
    private int price;
    private Double hot;
    private Double score;
    private String intro;
    private String introduction;
    private String open_time;
    private String picture;
    private String sight_creat_time;


    public View() {
    }

    public View(City city, String sight, Double longitude, Double latitude, String level, int price, Double hot, Double score, String intro, String introduction, String open_time, String picture, String sight_creat_time) {
        this.city = city;
        this.sight = sight;
        this.longitude = longitude;
        this.latitude = latitude;
        this.level = level;
        this.price = price;
        this.hot = hot;
        this.score = score;
        this.intro = intro;
        this.introduction = introduction;
        this.open_time = open_time;
        this.picture = picture;
        this.sight_creat_time = sight_creat_time;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getSight() {
        return sight;
    }

    public void setSight(String sight) {
        this.sight = sight;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Double getHot() {
        return hot;
    }

    public void setHot(Double hot) {
        this.hot = hot;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getOpen_time() {
        return open_time;
    }

    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSight_creat_time() {
        return sight_creat_time;
    }

    public void setSight_creat_time(String sight_creat_time) {
        this.sight_creat_time = sight_creat_time;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
