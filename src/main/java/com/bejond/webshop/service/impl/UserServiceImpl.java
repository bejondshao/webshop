package com.bejond.webshop.service.impl;

import com.bejond.webshop.DAO.UserDAO;
import com.bejond.webshop.model.User;
import com.bejond.webshop.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bejond on 3/26/16.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	@Override
	public User addUser(User user) {
		userDAO.saveUser(user);

		return user;
	}
}
