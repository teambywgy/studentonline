package com.pojo;

import java.util.List;

public class xiangmu {
    private int id;
    private  String xiangmu;
    private List<kehuxx> list;

    public xiangmu() {
    }

    public xiangmu(int id, String xiangmu, List<kehuxx> list) {
        this.id = id;
        this.xiangmu = xiangmu;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXiangmu() {
        return xiangmu;
    }

    public void setXiangmu(String xiangmu) {
        this.xiangmu = xiangmu;
    }

    public List<kehuxx> getList() {
        return list;
    }

    public void setList(List<kehuxx> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "xiangmu{" +
                "id=" + id +
                ", xiangmu='" + xiangmu + '\'' +
                ", list=" + list +
                '}';
    }
}
