package com.dubito.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubito.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		System.out.println("-----------用户登录-------------");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		 Cookie cookie = new Cookie("user", username+"-"+password);
		 cookie.setMaxAge(7*24*60*60);
		 User user = new User(username, password);
		 session.setAttribute("user", user);
		response.addCookie(cookie);
		return "redirect:/main.jsp";
	} 
	
	@RequestMapping("/ajax")
	public @ResponseBody User ajax(){
		User user = new User("jack","12345");
		return user;
	}
}
