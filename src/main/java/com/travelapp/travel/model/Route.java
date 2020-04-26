package com.travelapp.travel.model;

import javax.persistence.*;

@Entity
public class Route {
    @Id
    @GeneratedValue
    private int rid;

    @ManyToOne
    @JoinColumn(name="uid")
    private User user;

    @ManyToOne
    @JoinColumn(name="sid1")
    private View view1;

    @ManyToOne
    @JoinColumn(name="sid2")
    private View view2;

    @ManyToOne
    @JoinColumn(name="sid3")
    private View view13;

    @ManyToOne
    @JoinColumn(name="sid4")
    private View view14;

    @ManyToOne
    @JoinColumn(name="sid5")
    private View view15;

    private int state;
    private String route_creat_time;

    public Route() {
    }

    public Route(User user, View view1, View view2, View view13, View view14, View view15, int state, String route_creat_time) {
        this.user = user;
        this.view1 = view1;
        this.view2 = view2;
        this.view13 = view13;
        this.view14 = view14;
        this.view15 = view15;
        this.state = state;
        this.route_creat_time = route_creat_time;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public View getView1() {
        return view1;
    }

    public void setView1(View view1) {
        this.view1 = view1;
    }

    public View getView2() {
        return view2;
    }

    public void setView2(View view2) {
        this.view2 = view2;
    }

    public View getView13() {
        return view13;
    }

    public void setView13(View view13) {
        this.view13 = view13;
    }

    public View getView14() {
        return view14;
    }

    public void setView14(View view14) {
        this.view14 = view14;
    }

    public View getView15() {
        return view15;
    }

    public void setView15(View view15) {
        this.view15 = view15;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRoute_creat_time() {
        return route_creat_time;
    }

    public void setRoute_creat_time(String route_creat_time) {
        this.route_creat_time = route_creat_time;
    }
}
