package com.dearbinge.data.api;

import com.dearbinge.data.pojo.Security;

/**
 * 定义服务接口（这些接口需要单独打包，在服务提供方和消费方共享）
 * @author ko
 *
 */
public interface SecurityService {
	public Security getSecurityByKey(String key);
}
