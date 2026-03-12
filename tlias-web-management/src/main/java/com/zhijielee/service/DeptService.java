package com.zhijielee.service;

import com.zhijielee.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();
    void deleteById(Integer id);
    void save(Dept dept);
    Dept getById(Integer id);
    void update(Dept dept);
}
