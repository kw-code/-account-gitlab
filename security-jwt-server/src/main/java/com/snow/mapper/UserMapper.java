package com.snow.mapper;

import com.snow.domain.projo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.authority.mapping.MapBasedAttributes2GrantedAuthoritiesMapper;
import org.springframework.stereotype.Repository;

/**
 * 用户实体Mapper
 */
@Repository
public interface UserMapper {
    /**
     *根据用户名查询信息
     * @param userName
     * @return
     */
    public UserPojo queryByUserName(@Param("userName") String userName);
}