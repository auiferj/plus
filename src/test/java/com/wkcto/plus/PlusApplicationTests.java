package com.wkcto.plus;

import com.wkcto.plus.entity.User;
import com.wkcto.plus.mapper.UserMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SuppressWarnings("all")
@SpringBootTest
class PlusApplicationTests {

    @Autowired
    private UserMapper userDao;

    @Test
    void testUserInsert() {
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setEmail("zhangsan@sina.com");
        int insert = userDao.insert(user);
        System.out.println(insert);
    }

}
