/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaosiyuan.dao.MsProductDetailMapper;
import com.yaosiyuan.entity.MsProductDetail;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
@Service
public class MsProductDetailServiceImpl implements MsProductDetailService {
	@Autowired
	MsProductDetailMapper msProductDetailMapper;

	public int deleteByPrimaryKey(Integer id) {
		return msProductDetailMapper.deleteByPrimaryKey(id);

	}

	public int insert(MsProductDetail record) {
		return msProductDetailMapper.insert(record);
	}

	public MsProductDetail selectByPrimaryKey(Integer id) {
		return msProductDetailMapper.selectByPrimaryKey(id);

	}

	public int updateByPrimaryKey(MsProductDetail record) {
		return msProductDetailMapper.updateByPrimaryKey(record);
	}

}
