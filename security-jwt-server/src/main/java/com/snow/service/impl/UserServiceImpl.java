package com.snow.service.impl;


import com.snow.domain.projo.UserPojo;
import com.snow.mapper.UserMapper;
import com.snow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    /**
     * 根据用户名查询数据库
     * @param userName
     * @return
     * @throws UsernameNotFoundException
     */
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserPojo user = mapper.queryByUserName(userName);
        return user;
    }
}