package com.bejond.webshop.service.util;

import com.bejond.webshop.model.User;
import com.bejond.webshop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by bejond on 3/26/16.
 */

@Service
public class UserServiceUtil {
	private static UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public static User addUser(User user) {
		userService.addUser(user);

		return user;
	}

}
