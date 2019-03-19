package com.liyong.demo.jdbc_test.service.impl;

import com.liyong.demo.jdbc_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * <p> author liyong  </p>
 * <p> date 2019-03-18 20:55 </p>
 * <p> description  </p>
 **/
@Service
public class UserServiceImpl implements UserService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Object getUserById(Long id) {
        return jdbcTemplate.queryForList("select * from t_user where id = " + id);
    }
}
