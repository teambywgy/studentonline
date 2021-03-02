package com.controller;

import com.pojo.kehuxx_weihulianxiren_xiangmu;
import com.pojo.weihulianxiren;
import com.pojo.xiangmu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.kehuxxservice;

import java.io.IOException;
import java.util.List;

@Controller
public class kehuxxcontorller {
    @RequestMapping(value = "/show", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public List<kehuxx_weihulianxiren_xiangmu> kehuxx_lianxirens(kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu) throws IOException {
        kehuxxservice kehuxxservice = new kehuxxservice();
        List<kehuxx_weihulianxiren_xiangmu> kehuxx_weihulianxiren_xiangmus = kehuxxservice.findAll(kehuxx_weihulianxiren_xiangmu);//由于@ResponseBody注解，将user转成json格式返回
        return kehuxx_weihulianxiren_xiangmus;
    }

    @RequestMapping(value = "/lie", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public List<xiangmu> xiangmu() throws IOException {
        kehuxxservice kehuxxservice = new kehuxxservice();
        List<xiangmu> xiangmus = kehuxxservice.lie();//由于@ResponseBody注解，将user转成json格式返回
        return xiangmus;
    }
    @RequestMapping(value = "/liew", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public List<weihulianxiren> weihulianxiren() throws IOException {
        kehuxxservice kehuxxservice = new kehuxxservice();
        List<weihulianxiren> weihulianxirens = kehuxxservice.liew();//由于@ResponseBody注解，将user转成json格式返回
        return weihulianxirens;
    }
    @RequestMapping(value = "/add", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public boolean add(kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu) throws IOException {
        kehuxxservice kehuxxservice = new kehuxxservice();
        kehuxxservice.add(kehuxx_weihulianxiren_xiangmu);
        return true;
    }
    @RequestMapping(value = "/update", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public boolean update(kehuxx_weihulianxiren_xiangmu kehuxx_weihulianxiren_xiangmu) throws IOException {
        kehuxxservice kehuxxservice = new kehuxxservice();
        kehuxxservice.update(kehuxx_weihulianxiren_xiangmu);
        return true;
    }
}
