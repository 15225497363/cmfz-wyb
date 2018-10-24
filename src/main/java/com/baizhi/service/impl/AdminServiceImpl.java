package com.baizhi.service.impl;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王云博 on 2018/10/23.
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public boolean login(String name, String password) {
        Map map = new HashMap();
        Admin admin = adminDao.query(name, password);
        if (admin != null) {
            return true;
        } else {
            return false;
        }

    }
}
