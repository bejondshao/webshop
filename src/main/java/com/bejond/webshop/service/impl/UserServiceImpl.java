package com.bejond.webshop.service.impl;

import com.bejond.webshop.DAO.UserDAO;
import com.bejond.webshop.model.User;
import com.bejond.webshop.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by bejond on 3/26/16.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public User addUser(User user) {
		userDAO.saveUser(user);

		return user;
	}
}
