package com.tl.controller;


import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tl.pojo.User;
import com.tl.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	@RequestMapping(value={"/login"})
	public String toLogin(HttpServletRequest request) throws Exception {
		return "login";
	};
	
	@RequestMapping("/main")
	public String toMain(String name,String realPass){
		User user = userService.selectUserByUsername(name);
		/*System.out.println(name);
		System.out.println(realPass);*/
		if(user==null){
			System.out.println("用户名不存在");
			return "error";
		}
		System.out.println(user.getName()+","+user.getRealName());
		if(realPass.equals(user.getRealPass())){
			System.out.println("登陆成功");
	//		System.out.println(user.getRealPass());
			return "redirect:/show";
		}else{
			System.out.println("密码错误");
			return "error";
		}
	}
	@RequestMapping("/show")
	public String toSuccess(HttpServletRequest req){
		List<User> list = userService.selectAll();
		req.setAttribute("list", list);
		return "success";
	}
	
	//ajax验证用户名是否存在
	@RequestMapping("/checkUsername")
	@ResponseBody
	public Boolean checkUsername(String username) throws Exception{
	//	System.out.println(11);
		User user = userService.selectUserByUsername(username);
	//	System.out.println(user);
		if(user==null){
			return false;
		}else{
			return true;
		}
	}
}   

	

