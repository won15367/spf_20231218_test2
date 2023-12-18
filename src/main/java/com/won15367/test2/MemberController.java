package com.won15367.test2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping(value="/loginOK")
	public String loginOK(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("memberid");
		String mpw = request.getParameter("memberpw");
		
		model.addAttribute("memberid", mid);
		model.addAttribute("memberpw", mpw);
	
		return "loginOK";
	}
	
	
	@RequestMapping(value="/loginOK2")
	public String loginOK2(
			@RequestParam("memberid") String mid,
			@RequestParam("memberpw") String mpw, Model model) {
		
		model.addAttribute("memberid", mid);
		model.addAttribute("memberpw", mpw);
		
		return "loginOK";
		
	}
	
	@RequestMapping(value="/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value="/joinOK")
	public String joinOK(JoinMember joinMember) {
		return "joinOK";
	}
	
	@RequestMapping(value="/memberNum/{memberNumber}")
	public String memberNum(@PathVariable String memberNumber, Model model) {
		model.addAttribute("memberNumber", memberNumber);
		return "memberNumOK";
	}
	
}
