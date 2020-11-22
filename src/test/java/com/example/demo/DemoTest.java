package com.example.demo;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoTest {

    @Autowired
    EmployeeDao dao;

    @org.junit.jupiter.api.Test
    void contextLoads() {
        dao.delete(1004);
    }

}
