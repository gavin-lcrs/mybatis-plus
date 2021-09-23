package com.gavin.mybatis.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gavin.mybatis.model.entity.Userinfo;
import com.gavin.mybatis.service.IUserinfoService;
import io.lettuce.core.dynamic.annotation.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author jiwen.cao
 * @Date 2021/7/16
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserinfoService userinfoService;

    @NacosValue(value = "${wsmsg:AAA}", autoRefreshed = true)
    private String wsmsg;

    @GetMapping("/list")
    public String getUserList(){
        List<Userinfo> list = userinfoService.list();
        log.info("wsmsg={}", wsmsg);
        return JSONArray.toJSONString(list);
    }

    @GetMapping("/page")
    public String getUserListByPage(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize){
        IPage<Userinfo> page = new Page<>(pageNum, pageSize);
        IPage<Userinfo> result = userinfoService.page(page, new QueryWrapper<>());
        log.info("wsmsg={}", wsmsg);
        return JSONArray.toJSONString(result);
    }

    @GetMapping("/info")
    public String getUserById(@Param("userid") Long userid){
        Userinfo userinfo = userinfoService.getById(userid);
        log.info("wsmsg={}", wsmsg);
        return JSONObject.toJSONString(userinfo);
    }

}
