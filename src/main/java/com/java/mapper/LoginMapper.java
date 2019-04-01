package com.java.mapper;

import com.java.pojo.Login;
import org.apache.ibatis.annotations.Insert;

public interface LoginMapper {
    @Insert("INSERT INTO login VALUES (null,#{uname},#{psw},#{age},#{gender},#{weight})")
    int insert(Login login);
}
