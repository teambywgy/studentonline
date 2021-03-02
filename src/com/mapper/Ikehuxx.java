package com.mapper;

import com.pojo.kehuxx_weihulianxiren_xiangmu;
import com.pojo.weihulianxiren;
import com.pojo.xiangmu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Ikehuxx {
    public List<kehuxx_weihulianxiren_xiangmu> selectALL(@Param("kehuxx_weihulianxiren_xiangmu") kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu);
    public List<xiangmu> lie();
    public List<weihulianxiren> liew();
    public void add(@Param("kehuxx_weihulianxiren_xiangmu") kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu);
    public void update(@Param("kehuxx_weihulianxiren_xiangmu") kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu);
    public int findxiangmuid(@Param("kehuxx_weihulianxiren_xiangmu") kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu);
    public int findweihulianxirenid(@Param("kehuxx_weihulianxiren_xiangmu") kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu);
    public void addweihulianxiren(@Param("kehuxx_weihulianxiren_xiangmu") kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu);
    public void addxiangmu(@Param("kehuxx_weihulianxiren_xiangmu") kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu);
}
