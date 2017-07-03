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

/**
 * 모든 클라이언트의 요청을 Dispatcher가 받아서 컨트롤러에 넘기는데, HomeController가 수행함
 */

@Controller  // 이 파일이 컨트롤러 임을 명시해줌  
              // 반드시 servlet-context.xml에서 설정을 해주고 @Controller임을 명시 해야 한다.
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) // 요청을 매핑 하는 어노테이션 => 이 아래의 로직이 전부 수행됨
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; // 이 스트링 값이 뷰의 이름임!!!
	}
	
	@RequestMapping(value = "/dj", method = RequestMethod.GET)
	public String test(Locale local, Model model){
		return "test";
	}
	
}
