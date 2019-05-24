# 昭阳秒杀系统

## 系统概要

## 功能实现

#### 1.ehcache模块
- [x] ehcache缓存商品信息和商品详情信息
#### 2.Redis模块
- [x] 整合redis
#### 3.web项目
- [x] quartz定时更新秒杀列表静态化任务
- [x] Jq实现倒计时和控制下单

#### 3.dubbox
* service   注册到ehcache项目
* ehcache  8082     service项目。注册到redis项目
* redis  20882 项目注册到web项目，引用ehcache
* web项目 引用redis项目

## 技术选型
### 后台技术选型
* Spring、SpringMVC、MyBatis
* dubbox 2.8.4、 zookeeper
* ehcache、redis
* durid

### 前端技术选型
* AdminLTE、Bootstrap
* jQuery、layer

### 开发环境
* 操作系统：Windows 10
* 编程语言: Java 8
* 开发工具: IDEA、Navicat、Git
* 项目构建: Maven 3.3.9
* 服务器：Tomcat 7
* 数据库: MySQL、Redis
* 代码托管平台: GitHub

### 部署环境
* 操作系统: CentOS 7.4
* 编程语言: Java 8
* 服务器: Tomcat 8.5、Nginx 1.12.2
* 数据库: MySQL、Redis

### 部署步骤
1. zookeeper
> 注册中心端口2181 服务通信端口20880  



2. MS_Service
```
tomcat7:run
```
> 下同

 8080

3. ehcache

 8082


4. redis

  8084

5. web项目

8081

6. MS_Order

## 预览效果
![首页]()


## 讨论
有问题请在[issue]()讨论
