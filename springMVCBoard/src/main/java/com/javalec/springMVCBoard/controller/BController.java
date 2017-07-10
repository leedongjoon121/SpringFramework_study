package com.javalec.springMVCBoard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javalec.springMVCBoard.command.BCommand;
import com.javalec.springMVCBoard.command.BContentCommand;
import com.javalec.springMVCBoard.command.BDeleteCommand;
import com.javalec.springMVCBoard.command.BListCommand;
import com.javalec.springMVCBoard.command.BModifyCommand;
import com.javalec.springMVCBoard.command.BReplyCommand;
import com.javalec.springMVCBoard.command.BReplyViewCommand;
import com.javalec.springMVCBoard.command.BWriteCommand;

/**
 * Servlet implementation class BoardFrontController
 */

@Controller
public class BController {

	BCommand command = null; // 클라이언트 명령어 인스턴스 
	
	@RequestMapping("/list") // url : /list => 댓글 목록 확인 메서드
	public String list(Model model) {
		System.out.println("list()"); 
		command = new BListCommand();  // 글 목록 확인 인스턴스
		command.execute(model); // 모델에 주입 
		
		return "list"; //  list.jsp 이동
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	
	@RequestMapping("/write") // url : /write => 글 작성 메서드 
	public String write(HttpServletRequest request, Model model) { // HttpServletRequest 활용
		System.out.println("write()");
		
		model.addAttribute("request", request);  // model에 request 주입 
		command = new BWriteCommand();
		command.execute(model); 
		
		return "redirect:list"; // 글목록을 작성하고 리스트 페이지에서 확인 (리다이랙트)
	}
	
	@RequestMapping("/content_view") // url : /content_view => 글 내부 내용 확인
	public String content_view(HttpServletRequest request, Model model){
		System.out.println("content_view()");
		
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST ) // url : /modify => 글 수정, POST 방식으로 전달 
	public String modify(HttpServletRequest request, Model model){
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view") // url : /reply_view => 댓글 내용 확인
	public String reply_view(HttpServletRequest request, Model model){
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping("/reply") // url : /reply => 댓글 달기
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("request", request);		
		command = new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete") // url : /delte => 내용 삭제
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		command = new BDeleteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
}
