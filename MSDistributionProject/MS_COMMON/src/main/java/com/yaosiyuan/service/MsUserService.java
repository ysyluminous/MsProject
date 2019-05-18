/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午1:26:22
*/
package com.yaosiyuan.service;

import java.util.List;

import com.yaosiyuan.entity.MsUser;
import com.yaosiyuan.vo.MsUserVo;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午1:26:22
 */
public interface MsUserService {

	public int deleteByPrimaryKey(Integer id);

	public int insert(MsUser record);

	public int insertSelective(MsUser record);

	public MsUser selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(MsUser record);

	public int updateByPrimaryKey(MsUser record);

	public List<MsUser> queryMsUserByVo(MsUserVo msUserVo);

	public MsUser selectByUserAccount(String userAccount);
}
