/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午6:49:05
*/
package com.yaosiyuan.action;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaosiyuan.entity.MsUser;
import com.yaosiyuan.entity.OnLine;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午6:49:05
 */
@Controller
@RequestMapping("/userPageAction")
public class UserPageAction {

	@RequestMapping(value = "/toHome", method = RequestMethod.GET)
	public String index() {
		return "userHome/userIndex";
	}

	@RequestMapping("/produceJs")
	public void produceJs(HttpServletRequest req) {
		String jsPath = req.getRealPath("/static/dist/js/ms");
		String jscontent = "function remaintime(){" + "\n" + "var startTime = $(\"#startTime\").html();" + "\n"
				+ "var s1 = new Date(startTime.replace(\"/-/g\",\"/\"));" + "\n" + "var s2 = new Date();" + "\n"
				+ "var date3 = s1.getTime() - s2.getTime();//这是一个相差时间戳" + "\n" + "if(date3 > 2){" + "\n"
				+ "$(\"#sellbnt\").attr({\"disabled\":\"disabled\"});" + "\n"
				+ "var days = Math.floor(date3/(24*3600*1000));" + "\n" + "var leave = date3%(24*3600*1000)" + "\n"
				+ "var hours = Math.floor(leave/(3600*1000));" + "\n" + "var leave1 = leave%(3600*1000)" + "\n"
				+ "var minutes = Math.floor(leave1/(60*1000));" + "\n" + "var leave2 = leave1%(60*1000)" + "\n"
				+ "var seconds = Math.floor(leave2/1000)" + "\n"
				+ "$(\"#remainNoties\").html(\"相差 \"+days+\" 天\"+ hours + \" 小时\" + minutes + \" 分钟\"+seconds+\"秒\");"
				+ "\n" + "}else{" + "\n" + "$(\"#remainNoties\").html(\"\");" + "\n"
				+ "$(\"#sellBun\").removeAttr(\"disabled\");" + "\n"
				+ "$(\"#sellForm\").attr(\"action\",\"/orderAction/toPayOrder\");" + "\n" + "}" + "\n" + "}" + "\n"
				+ "// test js new " + "\n" + "setInterval('remaintime()',500);";
		File file = new File(jsPath + "/remain.js");
		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
			writer.write(jscontent);
			writer.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@RequestMapping("/produceHtml")
	public void produceHtml(HttpServletRequest req) {
		String htmlPath = req.getRealPath("/WEB-INF/html/");
		String contextpath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort()
				+ req.getContextPath();
		contextpath = contextpath + "/";

		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(contextpath);
		CloseableHttpResponse response = null;

		try {
			// 3.执行请求，获取响应
			response = client.execute(httpGet);
			// 看请求是否成功，这儿打印的是http状态码
			System.out.println(response.getStatusLine().getStatusCode());
			// 4.获取响应的实体内容，就是我们所要抓取得网页内容
			HttpEntity entity = response.getEntity();

			// 5.将其打印到控制台上面
			// 方法一：使用EntityUtils
			if (entity != null) {
				String html = EntityUtils.toString(entity);
				// 存到应用的htmlPath目录下
				File file = new File(htmlPath + "/index.html");
				Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
				writer.write(html);
				writer.flush();
				writer.close();
			}
			EntityUtils.consume(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@ResponseBody
	@RequestMapping("getUser")
	public String getUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		OnLine onLine = (OnLine) session.getAttribute("onLine");
		if (onLine != null) {
			MsUser msUser = onLine.getMsUser();
			String userAccount = msUser.getUserAccount();
			return userAccount;
		}
		return "";
	}
}
