package com.pojo;

import java.util.List;

public class kehuxx {
    private int id;
    private String kehuname;
    private String diqv;
    private String lianxiren;
    private int weihulianxirenid;
    private int xiangmuid;

    public kehuxx() {
    }

    public kehuxx(int id, String kehuname, String diqv, String lianxiren, int weihulianxirenid, int xiangmuid) {
        this.id = id;
        this.kehuname = kehuname;
        this.diqv = diqv;
        this.lianxiren = lianxiren;
        this.weihulianxirenid = weihulianxirenid;
        this.xiangmuid = xiangmuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKehuname() {
        return kehuname;
    }

    public void setKehuname(String kehuname) {
        this.kehuname = kehuname;
    }

    public String getDiqv() {
        return diqv;
    }

    public void setDiqv(String diqv) {
        this.diqv = diqv;
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren;
    }

    public int getWeihulianxirenid() {
        return weihulianxirenid;
    }

    public void setWeihulianxirenid(int weihulianxirenid) {
        this.weihulianxirenid = weihulianxirenid;
    }

    public int getXiangmuid() {
        return xiangmuid;
    }

    public void setXiangmuid(int xiangmuid) {
        this.xiangmuid = xiangmuid;
    }

    @Override
    public String toString() {
        return "kehuxx{" +
                "id=" + id +
                ", kehuname='" + kehuname + '\'' +
                ", diqv='" + diqv + '\'' +
                ", weihulianxiren='" + lianxiren + '\'' +
                ", weihulianxirenid=" + weihulianxirenid +
                ", xiangmuid=" + xiangmuid +
                '}';
    }
}
