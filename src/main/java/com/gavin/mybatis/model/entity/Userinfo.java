package com.gavin.mybatis.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * @Author jiwen.cao
 * @Date 2021/6/17
 * @Description
 */
@Data
@TableName(value = "userinfo", schema = "mbp")
public class Userinfo {

    @TableId
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;

    @Column(name = "manager_id")
    private Long managerId;

    @Column(name = "create_time")
    private Date createTime;

    @TableLogic
    private Integer deleted;
}
