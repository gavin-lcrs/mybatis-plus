package com.gavin.mybatis;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gavin.mybatis.common.CustomIdGenerator;
import com.gavin.mybatis.mapper.UserinfoMapper;
import com.gavin.mybatis.model.entity.Userinfo;
import com.gavin.mybatis.service.IUserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private IUserinfoService userinfoService;

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Autowired
    private CustomIdGenerator generator;

    @Test
    void contextLoads() {
//        Userinfo userinfo = userinfoService.getById(1L);
////        Userinfo userinfo = userinfoMapper.selectById(1L);
////        log.info("查询结果：{}", userinfo.getName());
//        log.info("查询结果：{}", JSONObject.toJSONString(userinfo));
//
//        QueryWrapper<Userinfo> wrapper = new QueryWrapper<>();
//        wrapper.select("id", "name")
//                .eq("id", 1L);
//        Userinfo u1 = userinfoService.getOne(wrapper);
//        log.info("查询结果：{}", JSONObject.toJSONString(u1));
//
//        List<Userinfo> list = userinfoMapper.selectList(new QueryWrapper<Userinfo>().eq("manager_id",3));
//        log.info("查询结果：{}", JSONArray.toJSONString(list));
//
        QueryWrapper<Userinfo> wrapper1 = new QueryWrapper<>();
        wrapper1.eq("manager_id", 3L);
        IPage<Userinfo> page = userinfoMapper.selectPage(new Page<>(2,5), wrapper1);
        log.info("{}", JSONArray.toJSONString(page));

//        userinfoService.removeById(11L);


    }


    @Test
    public void getGenerator(){
        Long id = generator.nextId(Userinfo.class);
        log.info("id={}", id);
    }
}
