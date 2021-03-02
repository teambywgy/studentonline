package com.pojo;

public class kehuxx_weihulianxiren_xiangmu {
    private int id;
    private String kehuname;
    private String diqv;
    private String lianxiren;
    private String weihulianxiren;
    private String xiangmu;
    private int weihulianxirenid;
    private int xiangmuid;
    public kehuxx_weihulianxiren_xiangmu() {
    }

    public kehuxx_weihulianxiren_xiangmu(int id, String kehuname, String diqv, String lianxiren, String weihulianxiren, String xiangmu, int weihulianxirenid, int xiangmuid) {
        this.id = id;
        this.kehuname = kehuname;
        this.diqv = diqv;
        this.lianxiren = lianxiren;
        this.weihulianxiren = weihulianxiren;
        this.xiangmu = xiangmu;
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

    public String getWeihulianxiren() {
        return weihulianxiren;
    }

    public void setWeihulianxiren(String weihulianxiren) {
        this.weihulianxiren = weihulianxiren;
    }

    public String getXiangmu() {
        return xiangmu;
    }

    public void setXiangmu(String xiangmu) {
        this.xiangmu = xiangmu;
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
        return "kehuxx_weihulianxiren_xiangmu{" +
                "id=" + id +
                ", kehuname='" + kehuname + '\'' +
                ", diqv='" + diqv + '\'' +
                ", lianxiren='" + lianxiren + '\'' +
                ", weihulianxiren='" + weihulianxiren + '\'' +
                ", xiangmu='" + xiangmu + '\'' +
                ", weihulianxirenid=" + weihulianxirenid +
                ", xiangmuid=" + xiangmuid +
                '}';
    }
}
