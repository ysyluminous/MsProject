package com.yaosiyuan.tesk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author YaoSiyuan
 * @Description //日期转换工具类
 * @Date 22:32 2019/5/18
 * @Param
 * @return
 **/
public class DateUtils {

	public static String dateToString(Date date) {
		// TODO Auto-generated method stub
		return dateToString(date,"yyyy=MM-dd hh:mm:ss:SSS");
	}

	public static String dateToString(Date date, String formatstring) {
		DateFormat dateFormat = new SimpleDateFormat(formatstring);
		return dateFormat.format(date);
	}

}