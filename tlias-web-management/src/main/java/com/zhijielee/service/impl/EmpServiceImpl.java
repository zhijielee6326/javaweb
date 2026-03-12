package com.zhijielee.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zhijielee.mapper.EmpExprMapper;
import com.zhijielee.mapper.EmpMapper;
import com.zhijielee.pojo.Emp;
import com.zhijielee.pojo.EmpExpr;
import com.zhijielee.pojo.EmpQueryParam;
import com.zhijielee.pojo.PageResult;
import com.zhijielee.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 员工管理
 */

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;

    public PageResult page(EmpQueryParam empQueryParam) {
        //1. 设置PageHelper分页参数
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());
        //2. 执行查询
        List<Emp> empList = empMapper.list(empQueryParam);
        //3. 封装分页结果
        Page<Emp> p = (Page<Emp>)empList;
        return new PageResult(p.getTotal(), p.getResult());
    }
    @Override
    public void save(Emp emp) {
        //1.补全基础属性
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        //2.保存员工基本信息
        empMapper.insert(emp);

        //3. 保存员工的工作经历信息 - 批量
        Integer empId = emp.getId();
        List<EmpExpr> exprList = emp.getExprList();
        if(!CollectionUtils.isEmpty(exprList)){
            exprList.forEach(empExpr -> empExpr.setEmpId(empId));
            empExprMapper.insertBatch(exprList);
        }
    }
}