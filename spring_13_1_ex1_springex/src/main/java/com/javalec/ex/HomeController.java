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
	
	// �١ڡ١ڡ١ڡ١� HttpServletRequest �� �̿��� ��� �١ڡ١ڡ١ڡ١ڡ١ڡ١� 
	@RequestMapping("board/confirmId")
	public String confirmId(HttpServletRequest httpServletRequest, Model model) {
		// HttpServletRequest �� ���� ��ü�� ����(�����͸� ������, �� ��û ������)
		// id�� pw�� �־� ���� �ʾƵ� �������� �Ѿ��.
		// Model : �����͸� �����Ҷ�
		String id = httpServletRequest.getParameter("id"); // Get ����ϰ��, url�� id = xxx & pw = xxx ���� �Է����� ���, �װ��� ������
		                                                   // jsp�� ��� form �±׸� �̿��� ���� ���� ��ų �� �ִ�.
		String pw = httpServletRequest.getParameter("pw"); // id�� pw�� �޾Ƽ� model�� add�ؾ���
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/confirmId";
	}
	
	// �١ڡ١ڡ١ڡ١� RequestParam �� �̿��� ��� �١ڡ١ڡ١ڡ١ڡ١ڡ١�
	@RequestMapping("board/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		 // �Ѿ���� ���� �̸��� �����ְ�  : @RequestParam("id") �� ���� String id ������ �Ҵ�
		 // id�� pw�� �Ҵ����� ������ ������ ����. (�������� �Ѿ�� �ʴ´�.)
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
	
	
	// �ٷ� ���� ���ó�� �ؾ� �� �κе���, ������(Ŀ���)��ü�� ����ϸ� �ξ� �����ϴ�.
	@RequestMapping("/member/join")
	public String joinData(Member member) {
		
		return "member/join";
	}
	
}
