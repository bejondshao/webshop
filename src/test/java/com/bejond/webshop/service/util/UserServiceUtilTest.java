package com.bejond.webshop.service.util;

import com.bejond.webshop.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bejond on 3/26/16.
 */

public class UserServiceUtilTest {
	private static ApplicationContext applicationContext;
	static {
		applicationContext =
			new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void addUser() {
		User user = new User();
		user.setName("bejond");
		user.setPassword("test");

		UserServiceUtil.addUser(user);
	}
}
