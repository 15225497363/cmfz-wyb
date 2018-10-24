package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;


/**
 * Created by 王云博 on 2018/10/23.
 */
public interface AdminDao {
    public Admin query(@Param("name") String name, @Param("password") String password);
}
