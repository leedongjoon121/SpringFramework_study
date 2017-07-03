package com.javalec.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date); // 현재 날짜를 String 값으로 변환
		
		model.addAttribute("serverTime", formattedDate ); // model 객체에 attribute를 넣어주고 view에서 확인함
		
		return "home";
	}
	
	@RequestMapping("/board/view")
	public String view() {
		
		
		return "board/view";
	}
	
	@RequestMapping("/board/content")
	public String content(Model model) {  // MVC 중 데이터를 가지고 있는 Model 객체
		
		model.addAttribute("id", 30); // model 객체에 attribute를 넣어주고 view에서 확인함
		return "board/content";
		
	}
	
	@RequestMapping("/board/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30); // model 객체에 attribute를 넣어주고 view에서 확인함
		mv.setViewName("board/reply");
		
		return mv; // 이렇게도 할 수 있음, 위에 꺼랑 비교 
	}
	
}
