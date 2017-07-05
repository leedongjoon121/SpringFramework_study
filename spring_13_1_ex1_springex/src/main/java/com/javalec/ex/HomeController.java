package com.javalec.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.ex.member.Member;

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
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	// ☆★☆★☆★☆★ HttpServletRequest 를 이용한 방식 ☆★☆★☆★☆★☆★☆★ 
	@RequestMapping("board/confirmId")
	public String confirmId(HttpServletRequest httpServletRequest, Model model) {
		// HttpServletRequest 로 부터 객체가 들어옴(데이터를 받을때, 즉 요청 데이터)
		// id와 pw를 넣어 주지 않아도 페이지는 넘어간다.
		// Model : 데이터를 전송할때
		String id = httpServletRequest.getParameter("id"); // Get 방식일경우, url에 id = xxx & pw = xxx 값을 입력했을 경우, 그값을 가져옴
		                                                   // jsp의 경우 form 태그를 이용해 값을 주입 시킬 수 있다.
		String pw = httpServletRequest.getParameter("pw"); // id와 pw를 받아서 model로 add해야함
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/confirmId";
	}
	
	// ☆★☆★☆★☆★ RequestParam 을 이용한 방식 ☆★☆★☆★☆★☆★☆★
	@RequestMapping("board/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		 // 넘어오는 값의 이름을 적어주고  : @RequestParam("id") 그 값을 String id 변수에 할당
		 // id와 pw를 할당하지 않으면 에러가 난다. (페이지가 넘어가지 않는다.)
		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		return "board/checkId";
	}
	
//	@RequestMapping("/member/join")
//	public String joinData(@RequestParam("name") String name, @RequestParam("id") String id, 
//			@RequestParam("pw") String pw, @RequestParam("email") String email, Model model) {
//		
//		Member member = new Member();
//		member.setName(name);
//		member.setId(id);
//		member.setPw(pw);
//		member.setEmail(email);
//		
//		model.addAttribute("memberInfo", member);
//		
//		return "member/join";
//	}
	
	
	// 바로 위의 방식처럼 해야 할 부분들을, 데이터(커멘드)객체를 사용하면 훨씬 간편하다.
	@RequestMapping("/member/join")
	public String joinData(Member member) {
		
		return "member/join";
	}
	
}
