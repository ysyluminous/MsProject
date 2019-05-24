/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月24日 下午3:40:16
*/
package com.yaosiyuan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月24日 下午3:40:16
 */
public class DateUtil {
	public static String transferDate(Date date, String dataFormatParam) {
		DateFormat dateFormat = new SimpleDateFormat(dataFormatParam);
		return dateFormat.format(date);
	}

	public static Date transferDate(String dateString, String dataFormatParam) {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat(dataFormatParam);
		try {
			date = dateFormat.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

}
