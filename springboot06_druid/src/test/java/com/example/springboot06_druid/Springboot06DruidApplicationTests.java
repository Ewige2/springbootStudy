package com.example.springboot06_druid;

import com.example.dao.ActorDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06DruidApplicationTests {

    @Autowired
    private ActorDao actorDao;

    @Test
    void contextLoads() {
        System.out.println(actorDao.getById(5));
    }

}
