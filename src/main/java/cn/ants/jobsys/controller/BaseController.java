package cn.ants.jobsys.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ants.jobsys.entity.User;
import cn.ants.jobsys.service.UserService;

@Controller
public class BaseController {
	 
	@Autowired
	private UserService userService;
	 
	@RequestMapping("/listUser")
	public String listUset(Map<String,List<User>> map){
		List<User> listUser = userService.listUser();
		map.put("user",listUser);
		return "success";
	}

}