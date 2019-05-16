/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午12:30:10
*/
package com.yaosiyuan.action;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.yaosiyuan.entity.Person;
import com.yaosiyuan.service.PersonService;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午12:30:10
 */
@Controller
public class PersonAction {
	@Autowired
	PersonService personService;

	@Test
	public void testPerson() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		PersonAction personAction = (PersonAction) applicationContext.getBean("personAction");
		// Person querypersonbyid =
		// personAction.personService.querypersonbyid(4);

		Person person = new Person();
		person.setName("姚斯元");
		person.setBirthday("12-12");
		person.setAge(12);
		person.setAddress("河南");
		personAction.personService.inserperson(person);
		// System.out.println(querypersonbyid);

	}

}
