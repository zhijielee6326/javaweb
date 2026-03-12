package com.zhijielee.service.impl;
import com.zhijielee.mapper.DeptMapper;
import com.zhijielee.pojo.Dept;
import com.zhijielee.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
    public void save(Dept dept) {
        //补全基础属性
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        //保存部门
        deptMapper.insert(dept);
    }
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }
    public void update(Dept dept) {
        //补全基础属性
        dept.setUpdateTime(LocalDateTime.now());
        //更新部门
        deptMapper.update(dept);
    }
}

