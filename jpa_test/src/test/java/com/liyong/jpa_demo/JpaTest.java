package com.liyong.jpa_demo;

import com.liyong.jpa_demo.dao.TUserDao;
import com.liyong.jpa_demo.model.TUserDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p> author liyong  </p>
 * <p> date 2019-03-18 23:15 </p>
 * <p> description  </p>
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {
    @Autowired
    private TUserDao tUserDao;


    @Test
    public void testAdd() {
        TUserDo tUser = new TUserDo();
        tUser.setAge(10);
        tUser.setId(12222L);
        tUser.setSex(1);
        tUser.setName("test_name");
        tUserDao.save(tUser);
    }
}
