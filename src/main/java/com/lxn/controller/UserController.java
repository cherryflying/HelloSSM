package com.lxn.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lxn.entity.Book;
import com.lxn.entity.ResultEntity;
import com.lxn.entity.User;
import com.lxn.entity.UserBook;
import com.lxn.entity.UserBookEntity;
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
			// model.addAttribute(userFromDao);
			return "success";
		}

		return null;
	}

	@RequestMapping(value = "success")
	public ModelAndView success(HttpSession session, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String userId = request.getParameter("userId");
		List<UserBook> userBook = userService.queryBookByUser(userId);
		List<UserBookEntity> userBookEntitys = new ArrayList<UserBookEntity>();
		Iterator<UserBook> iterator = userBook.iterator();
		while (iterator.hasNext()) {
			UserBook userBookIter = iterator.next();
			Long bookId = userBookIter.getBookId();
			Book book = userService.queryById(bookId);
			UserBookEntity userBookEntity = new UserBookEntity();
			userBookEntity.setBookId(bookId);
			userBookEntity.setBookName(book.getName());
			userBookEntity.setExpireDate(userBookIter.getExpireDate());
			userBookEntity.setUserId(userId);
			userBookEntity.setUserName(((User) session.getAttribute("user")).getName());
			userBookEntitys.add(userBookEntity);
		}

		session.setAttribute("userBookEntitys", userBookEntitys);
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
	public ResultEntity users(User user, HttpSession session) {

		User userFromDao = userService.getUserByNameAndByPass(user.getUserName(), user.getPassword());
		ResultEntity resultEntity = new ResultEntity();
		if (userFromDao != null) {
			// session.setAttribute("user", userFromDao);
			session.setAttribute("user", userFromDao);
			resultEntity.setResultObject(userFromDao);
			resultEntity.setStatus("success");
			return resultEntity;
		} else {
			resultEntity.setStatus("fail");
			return resultEntity;
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

	@RequestMapping(value = "/UserBook.do", method = RequestMethod.GET)
	@ResponseBody
	public ResultEntity queryBookByUser(User user, HttpSession session) {
		List<UserBookEntity> list = (List<UserBookEntity>) session.getAttribute("userBookEntitys");
		ResultEntity resultEntity = new ResultEntity();
		if (list != null) {
			resultEntity.setResultObject(list);
			resultEntity.setStatus("success");
			return resultEntity;
		} else {
			resultEntity.setStatus("fail");
			return resultEntity;
		}

	}

}
