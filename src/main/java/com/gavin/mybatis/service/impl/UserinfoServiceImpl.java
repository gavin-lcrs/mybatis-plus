package com.gavin.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gavin.mybatis.mapper.UserinfoMapper;
import com.gavin.mybatis.model.entity.Userinfo;
import com.gavin.mybatis.service.IUserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author jiwen.cao
 * @Date 2021/6/17
 * @Description
 */
@Slf4j
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {
}
