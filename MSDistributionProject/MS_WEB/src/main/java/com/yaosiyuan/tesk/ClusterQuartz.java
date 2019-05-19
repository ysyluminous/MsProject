package com.yaosiyuan.tesk;

import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * @Author YaoSiyuan
 * @Description //自定义任务类，打印系统信息
 * @Date 22:31 2019/5/18
 * @Param
 * @return
 **/
@Controller
public class ClusterQuartz {
    public void printUserInfo() {
        System.out.println("***      start " + DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss:SSS") + "    *************");

        System.out.println("*");
        System.out.println("*        current username is " + System.getProperty("user.name"));
        System.out.println("*        current os name is " + System.getProperty("os.name"));
        System.out.println("*");

        System.out.println("*********current user information end******************");
    }
}
