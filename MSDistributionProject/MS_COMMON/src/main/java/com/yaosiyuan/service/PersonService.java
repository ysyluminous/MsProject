/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午12:17:15
*/
package com.yaosiyuan.service;

import com.yaosiyuan.entity.Person;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午12:17:15
 */
public interface PersonService {

	public Person querypersonbyid(int id);

	public void inserperson(Person person);

}
