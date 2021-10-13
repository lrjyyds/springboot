package com.kgc.springboot;


import com.kgc.springboot.mapper.presonMapper;
import com.kgc.springboot.pojo.person;
import com.kgc.springboot.service.impl.personServiceimpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Resource
    personServiceimpl personServiceimpl;
    @Test
 public    void contextLoads() {
        List<person> p = personServiceimpl.getAll();
        for (person person : p) {
            System.out.println(person.getName()+person.getAge());
        }
    }

}
