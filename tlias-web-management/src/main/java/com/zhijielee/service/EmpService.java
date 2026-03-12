package com.zhijielee.service;

import com.zhijielee.pojo.Emp;
import com.zhijielee.pojo.EmpQueryParam;
import com.zhijielee.pojo.PageResult;

import java.time.LocalDate;

public interface EmpService {
    /**
     * 分页查询
     */
    //PageResult page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    PageResult page(EmpQueryParam empQueryParam);
    /**
     * 添加员工
     * @param emp
     */
    void save(Emp emp);
}