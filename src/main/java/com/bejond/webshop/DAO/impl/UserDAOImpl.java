package com.bejond.webshop.DAO.impl;

import com.bejond.webshop.DAO.UserDAO;
import com.bejond.webshop.model.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by bejond on 3/26/16.
 */

@Repository
public class UserDAOImpl implements UserDAO {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public User saveUser(User user) {
		hibernateTemplate.save(user);

		return user;
	}
}
