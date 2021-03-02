package com.pojo;

import java.util.List;

public class weihulianxiren {
    private int id;
    private String weihulianxiren;
    private List<kehuxx> list;
    public weihulianxiren() {
    }

    public weihulianxiren(int id, String weihulianxiren, List<kehuxx> list) {
        this.id = id;
        this.weihulianxiren = weihulianxiren;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeihulianxiren() {
        return weihulianxiren;
    }

    public void setWeihulianxiren(String weihulianxiren) {
        this.weihulianxiren = weihulianxiren;
    }

    public List<kehuxx> getList() {
        return list;
    }

    public void setList(List<kehuxx> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "weihulianxiren{" +
                "id=" + id +
                ", weihulianxiren='" + weihulianxiren + '\'' +
                ", list=" + list +
                '}';
    }
}
