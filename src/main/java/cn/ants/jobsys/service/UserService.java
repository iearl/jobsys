package cn.ants.jobsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ants.jobsys.dao.UserDao;
import cn.ants.jobsys.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public List<User> listUser() {
		
		return userDao.listUser();
	}
}
