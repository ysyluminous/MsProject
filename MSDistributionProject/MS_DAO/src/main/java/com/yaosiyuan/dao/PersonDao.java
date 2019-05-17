/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午12:16:39
*/
package com.yaosiyuan.dao;

import com.yaosiyuan.entity.Person;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午12:16:39
 */
public interface PersonDao {

	public Person querypersonbyid(int id);

	public void inserperson(Person person);

}
