/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午6:49:05
*/
package com.yaosiyuan.action;

import com.yaosiyuan.entity.MsUser;
import com.yaosiyuan.entity.OnLine;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;

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

		@RequestMapping("/produceHtml")
	public void produceHtml(HttpServletRequest req){
		String htmlPath=req.getRealPath("/WEB-INF/html/");
		String contextpath = req.getScheme()
				+"://"
				+ req.getServerName()
				+ ":" +req.getServerPort()
				+req.getContextPath();
		contextpath = contextpath + "/";

		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(contextpath);
		CloseableHttpResponse response = null;

		try {
			//3.执行请求，获取响应
			response = client.execute(httpGet);
			//看请求是否成功，这儿打印的是http状态码
			System.out.println(response.getStatusLine().getStatusCode());
			//4.获取响应的实体内容，就是我们所要抓取得网页内容
			HttpEntity entity = response.getEntity();

			//5.将其打印到控制台上面
			//方法一：使用EntityUtils
			if (entity != null) {
				String html = EntityUtils.toString(entity);
				//存到应用的htmlPath目录下
				File file = new File(htmlPath+"/index.html");
				Writer writer = new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream(file), "utf-8"));
				writer.write(html);
				writer.flush();
				writer.close();
			}
			EntityUtils.consume(entity);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
    @ResponseBody
	@RequestMapping("getUser")
	public  String  getUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        OnLine onLine = (OnLine) session.getAttribute("onLine");
        if (onLine != null){
            MsUser msUser = onLine.getMsUser();
            String userAccount = msUser.getUserAccount();
            return userAccount;
        }
        return  "";
    }
}
