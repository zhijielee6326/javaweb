# javaweb
AI辅助web开发（vibe coding）
# tlias智能学习辅助系统

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-2.7.18-brightgreen.svg" alt="SpringBoot">
  <img src="https://img.shields.io/badge/MySQL-8.0-blue.svg" alt="MySQL">
  <img src="https://img.shields.io/badge/MyBatis--Plus-3.5.3.1-orange.svg" alt="MyBatis-Plus">
  <img src="https://img.shields.io/badge/JDK-1.8-yellow.svg" alt="JDK">
  <img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License">
</p>

tlias（Teaching and Learning Intelligent Assistant System）智能学习辅助系统是一款面向学校/培训机构的轻量化学习管理系统，聚焦「基础业务CRUD+权限管控+数据一致性」核心能力，是Java后端入门实战的经典项目。

## 📋 项目介绍
### 核心定位
- 面向Java后端初学者的实战项目，覆盖SSM/SpringBoot核心技术栈落地
- 实现学习场景下的员工、部门、课程全生命周期管理
- 提供标准化的权限控制、日志审计、数据校验解决方案

### 核心功能模块
| 模块         | 核心功能                                                                 |
|--------------|--------------------------------------------------------------------------|
| 员工管理     | 员工信息增删改查、分页查询、多条件复合检索、日期参数统一处理             |
| 部门管理     | 部门信息维护、关联员工数据联动、事务控制保障数据一致性                   |
| 课程管理     | 课程信息CRUD、报名流程管控、多步操作原子性保障                           |
| 权限管理     | JWT鉴权、拦截器登录校验、精细化接口权限控制（管理员/普通用户）|
| 系统审计     | AOP切面统一日志记录、操作人/时间/内容全链路追溯                         |

## 🛠 技术栈
### 核心技术
- **后端框架**：SpringBoot 2.7.x、SSM（Spring+SpringMVC+MyBatis）
- **数据层**：MyBatis-Plus 3.5.x、MySQL 8.0
- **权限安全**：JWT、SpringMVC拦截器
- **通用组件**：PageHelper（分页）、AOP（切面编程）
- **开发环境**：JDK 1.8、Maven 3.6+、IDEA

### 技术亮点
1. **高效CRUD**：基于MyBatis-Plus简化CRUD操作，动态SQL适配多条件检索
2. **统一分页**：整合PageHelper实现全局通用分页，降低重复开发成本
3. **权限管控**：JWT+拦截器实现无状态登录，精细化区分接口访问权限
4. **数据一致性**：事务控制保障多步操作原子性，自定义类型转换器统一参数格式
5. **日志审计**：AOP切面封装日志模块，实现全链路操作可追溯

## 🚀 快速开始
### 环境准备
1. 安装JDK 1.8、MySQL 8.0、Maven 3.6+
2. 克隆项目到本地
   ```bash
   git clone https://github.com/你的用户名/tlias.git
   cd tlias
