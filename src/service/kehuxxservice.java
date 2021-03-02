package service;

import com.mapper.Ikehuxx;
import com.pojo.kehuxx_weihulianxiren_xiangmu;
import com.pojo.weihulianxiren;
import com.pojo.xiangmu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class kehuxxservice {
    private SqlSession session = null;
    public List<kehuxx_weihulianxiren_xiangmu> findAll(kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu) throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        ArrayList<kehuxx_weihulianxiren_xiangmu> ss = new ArrayList<kehuxx_weihulianxiren_xiangmu>();
        if (session != null) {
            Ikehuxx kehudao = session.getMapper(Ikehuxx.class);
//接口操作和mapper文件绑定
            List<kehuxx_weihulianxiren_xiangmu> list = kehudao.selectALL(kehuxx_weihulianxiren_xiangmu);
            ss.addAll(list);
        }
        if (session != null) {
            session.close();
        }
        return ss;
    }


    public List<xiangmu> lie() throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        ArrayList<xiangmu> ss = new ArrayList<xiangmu>();
        if (session != null) {
            Ikehuxx kehudao = session.getMapper(Ikehuxx.class);
//接口操作和mapper文件绑定
            List<xiangmu> list = kehudao.lie();
            ss.addAll(list);
        }
        if (session != null) {
            session.close();
        }
        return ss;
    }

    public List<weihulianxiren> liew() throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        ArrayList<weihulianxiren> ss = new ArrayList<weihulianxiren>();
        if (session != null) {
            Ikehuxx kehudao = session.getMapper(Ikehuxx.class);
//接口操作和mapper文件绑定
            List<weihulianxiren> list = kehudao.liew();
            ss.addAll(list);
        }
        if (session != null) {
            session.close();
        }
        return ss;
    }
    public void add(kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu) throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        ArrayList<kehuxx_weihulianxiren_xiangmu> ss = new ArrayList<kehuxx_weihulianxiren_xiangmu>();
        if (session != null) {

            Ikehuxx kehudao = session.getMapper(Ikehuxx.class);
//接口操作和mapper文件绑定
          int weihulianxirenid=  kehudao.findweihulianxirenid(kehuxx_weihulianxiren_xiangmu);
          if(weihulianxirenid==0){kehudao.addweihulianxiren(kehuxx_weihulianxiren_xiangmu);}
            int xiagmuid=  kehudao.findxiangmuid(kehuxx_weihulianxiren_xiangmu);
            if(xiagmuid==0){kehudao.addxiangmu(kehuxx_weihulianxiren_xiangmu);}
            kehuxx_weihulianxiren_xiangmu.setWeihulianxirenid(kehudao.findweihulianxirenid(kehuxx_weihulianxiren_xiangmu));
            kehuxx_weihulianxiren_xiangmu.setXiangmuid(kehudao.findxiangmuid(kehuxx_weihulianxiren_xiangmu));
            kehudao.add(kehuxx_weihulianxiren_xiangmu);
        }
        if (session != null) {
            session.close();
        }
    }
    public void update(kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu) throws IOException {
        InputStream ins;
        ins = Resources.getResourceAsStream("Mybatis-Config.xml");
        //使用Mybatis的连接工厂SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
        //获取数据库的连接SqlSession
        session = factory.openSession();
        ArrayList<kehuxx_weihulianxiren_xiangmu> ss = new ArrayList<kehuxx_weihulianxiren_xiangmu>();
        if (session != null) {
            Ikehuxx kehudao = session.getMapper(Ikehuxx.class);
//接口操作和mapper文件绑定
            kehudao.update(kehuxx_weihulianxiren_xiangmu);

        }
        if (session != null) {
            session.close();
        }
    }
}
