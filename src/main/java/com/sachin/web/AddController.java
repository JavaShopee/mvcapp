package com.sachin.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView home(@RequestParam("t1") int t1,@RequestParam("t2") int t2)
	{
		int c = t1 + t2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("obj",c);
		
		return mv;
	}

}
