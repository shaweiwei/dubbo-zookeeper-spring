package com.dearbinge.data.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dearbinge.data.api.SecurityService;
import com.dearbinge.data.dao.SecurityMapper;
import com.dearbinge.data.pojo.Security;

/**
 * 在服务提供方实现服务接口 对消费方隐藏实现
 * @author ko
 *
 */
@Service(value = "securityService")
public class SecurityServiceImpl implements SecurityService {

	@Resource
	private SecurityMapper securityMapper;

	public Security getSecurityByKey(String key) {
		// TODO Auto-generated method stub
		Security security = securityMapper.selectByPrimaryKey(key);
		return security;
	}
}
