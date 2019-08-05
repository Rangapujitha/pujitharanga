package com.loginreg.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.loginreg.model.Login;
import com.loginreg.model.Reg;
import com.loginreg.repository.LoginRepository;

@Controller
public class LoginregController {
	
	//@Autowired
	//LoginRepository loginrepository;
	
	@RequestMapping("/")
	//@ResponseBody
	public String login() {
		System.out.println("controller");
		return "login.jsp";
	}
	@RequestMapping("/loginPage")
	//@ResponseBody
	public String loginPage(Login login, HttpServletRequest req) {
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		System.out.println(name+"--"+req.getParameter("password"));
		//List result=loginrepository.findByNameAndPassword(name,password);
		/*if(! result.isEmpty()) {*/
		if(name.equals(password)) {
		System.out.println("correct");
		//ModelAndView mv=new ModelAndView();
		//mv.addObject("name", login.getUsername());
		return "loginPage.jsp";
		}
		else {
			String msg="Username and Password must be same";
			session.setAttribute("msg", msg);
			return "login.jsp";
		}
	}
	@RequestMapping("/regPage")
	public String regPage() {
		System.out.println("regPage");
		return "reg.jsp";
	}
	@RequestMapping("/regsucess")
	//@ResponseBody
	public String regsucess(HttpServletRequest req, Reg reg) {
		//String name=req.getParameter("name");

	    HttpSession session=req.getSession();
		if(req.getParameter("password").equals(req.getParameter("rpass"))) {
			session.setAttribute("name", req.getParameter("name"));
			session.setAttribute("place", req.getParameter("place"));
			// loginrepository.save(reg);
		    return "regsucess.jsp";
		}
		else {
			String msg1="Password and Re-Enter Password must be same";
			session.setAttribute("msg1", msg1);
			return "reg.jsp";
		}
	}

}
