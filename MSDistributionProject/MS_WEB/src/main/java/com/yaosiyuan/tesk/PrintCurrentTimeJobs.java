package com.yaosiyuan.tesk;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
/**
 * @Author YaoSiyuan                         
 * @Description //定时执行任务类
 * executeInternal中执行需要执行的方法
 * @Date 16:30 2019/5/18
 * @Param 
 * @return
 **/       
public class PrintCurrentTimeJobs extends QuartzJobBean {
    private static final Log LOG_RECORD = LogFactory.getLog(PrintCurrentTimeJobs.class);

//    @Autowired
//    private ClusterQuartz clusterQuartz;

    @Autowired
    ProducehtmlTask producehtmlTask;


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LOG_RECORD.info("begin to execute task," + DateUtils.dateToString(new Date()));

//        clusterQuartz.printUserInfo();

        producehtmlTask.producehtml();

        LOG_RECORD.info("end to execute task," + DateUtils.dateToString(new Date()));

    }
}

