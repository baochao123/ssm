package com.java.service.impl;

import com.java.mapper.LoginMapper;
import com.java.pojo.Login;
import com.java.service.IloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements IloginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public int insert(Login login) {
        return loginMapper.insert(login);
    }
}
