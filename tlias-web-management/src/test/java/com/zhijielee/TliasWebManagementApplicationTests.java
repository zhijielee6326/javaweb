package com.zhijielee;

import com.zhijielee.mapper.EmpMapper;
import com.zhijielee.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TliasWebManagementApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    void contextLoads() {
        List<Emp> empList = empMapper.list(null);
        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

}