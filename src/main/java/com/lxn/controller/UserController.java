package com.lxn.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lxn.entity.User;

import com.lxn.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "login")
	public ModelAndView login(String username, String password, HttpServletRequest request) {
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		return new ModelAndView("login");
	}

	@RequestMapping(value = "submit")
	public String submit(User user, Model model) {
		String userName = user.getUserName();
		String password = user.getPassword();
		User userFromDao = userService.getUserByNameAndByPass(userName, password);
		if (userFromDao != null) {
			model.addAttribute(userFromDao);
			return "redirect:/success";
		}

		return null;
	}

	@RequestMapping(value = "success")
	public ModelAndView success(HttpSession session, Model model) {
		return new ModelAndView("success");
	}

	@RequestMapping(value = "error")
	public ModelAndView error(HttpSession session, Model model) {
		return new ModelAndView("error");
	}

	@RequestMapping(value = "AngularTest")
	public ModelAndView angularTest(HttpSession session, Model model) {
		return new ModelAndView("AngularTest");
	}
	
	@RequestMapping(value = "register")
	public ModelAndView register(HttpSession session, Model model) {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/index.do", method = RequestMethod.POST)
	@ResponseBody
	public String users(User user, HttpSession session) {

		User userFromDao = userService.getUserByNameAndByPass(user.getUserName(), user.getPassword());
		if (userFromDao != null) {
			session.setAttribute("user", userFromDao);
			return "success";
		} else {
			return "error";
		}
	}

	@RequestMapping(value = "/registerIndex.do", method = RequestMethod.POST)
	@ResponseBody
	public String register(User user, HttpSession session) {
		User userDao = userService.getUserByUserName(user.getUserName());
		if (userDao != null) {
			return "fail";
		}
		int i = userService.insertUser(user);
		return "success";
	}

//	@RequestMapping(value="/index.do", method=RequestMethod.POST)
//	@ResponseBody
//	public String users(@RequestParam("userName") String userName, @RequestParam("password") String password) throws Exception{	
//		User userFromDao=userService.getUserByNameAndByPass(userName, password);
//		if(userFromDao!=null) {
//			return "/success";
//		}
//		else
//		{
//			return "/error";
//		}
//		
//	}

}
