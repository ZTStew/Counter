package com.stewart.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CounterController {

	@GetMapping("")
	public String main(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int count = (int) session.getAttribute("count") + 1;
			session.setAttribute("count", count);
		}
		
//		Integer count = (Integer) session.getAttribute("count");
		return "counter.jsp";
	}
	
	@PostMapping("/count5")
	public String count5(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int count = (int) session.getAttribute("count") + 4;
			session.setAttribute("count", count);
		}
		return "redirect:";
	}
	
	@PostMapping("/count10")
	public String count10(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int count = (int) session.getAttribute("count") + 9;
			session.setAttribute("count", count);
		}
		return "redirect:";
	}
	
	@PostMapping("/clear")
	public String clear(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int count = 0;
			session.setAttribute("count", count);
		}
		return "redirect:";
	}
}
