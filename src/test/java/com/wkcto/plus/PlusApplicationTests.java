package com.wkcto.plus;

import com.wkcto.plus.entity.User;
import com.wkcto.plus.mapper.UserMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    @Test
    void deleteByBatchId() {
        //使用lambda表达式创建集合
        List<Integer> ids = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        int i = userDao.deleteBatchIds(ids);
        System.out.println(i);

    }

}
