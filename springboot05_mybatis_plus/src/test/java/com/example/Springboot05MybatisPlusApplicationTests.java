package com.example;

import com.example.dao.ActorDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisPlusApplicationTests {

    @Autowired
    private ActorDao actorDao;

    @Test
    void contextLoads() {

    }

}
