/**
 * Project Name:mallbase-management.service
 * File Name:UserInfoFacadeImpl.java
 * Package Name:com.hlq.mallbase.management.facade.impl
 * Date:2017年11月14日下午3:10:56
 * Copyright (c) 2017, .
 *
 */

package com.hlq.mallbase.management.facade.impl;

import com.hlq.mallbase.management.facade.intf.UserInfoFacade;

/**
 * @author hukc
 * @version
 * @since JDK 1.7
 * @see
 */

public class UserInfoFacadeImpl implements UserInfoFacade {

	@Override
	public int doLogin(String userName, String password) {
		if (userName.endsWith("123")) {
			return 1;
		}
		if (password.endsWith("123")) {
			return 1;
		}
		return 0;

	}

}
