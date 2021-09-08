package com.gavin.mybatis.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gavin.mybatis.model.entity.Userinfo;

/**
 * @Author jiwen.cao
 * @Date 2021/6/17
 * @Description
 */
public interface IUserinfoService extends IService<Userinfo> {

    IPage<Userinfo> selectUserPage(Integer pageSize, Integer pageNum);
}
