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

	BCommand command = null; // Ŭ���̾�Ʈ ��ɾ� �ν��Ͻ� 
	
	@RequestMapping("/list") // url : /list => ��� ��� Ȯ�� �޼���
	public String list(Model model) {
		System.out.println("list()"); 
		command = new BListCommand();  // �� ��� Ȯ�� �ν��Ͻ�
		command.execute(model); // �𵨿� ���� 
		
		return "list"; //  list.jsp �̵�
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	
	@RequestMapping("/write") // url : /write => �� �ۼ� �޼��� 
	public String write(HttpServletRequest request, Model model) { // HttpServletRequest Ȱ��
		System.out.println("write()");
		
		model.addAttribute("request", request);  // model�� request ���� 
		command = new BWriteCommand();
		command.execute(model); 
		
		return "redirect:list"; // �۸���� �ۼ��ϰ� ����Ʈ ���������� Ȯ�� (�����̷�Ʈ)
	}
	
	@RequestMapping("/content_view") // url : /content_view => �� ���� ���� Ȯ��
	public String content_view(HttpServletRequest request, Model model){
		System.out.println("content_view()");
		
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST ) // url : /modify => �� ����, POST ������� ���� 
	public String modify(HttpServletRequest request, Model model){
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view") // url : /reply_view => ��� ���� Ȯ��
	public String reply_view(HttpServletRequest request, Model model){
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping("/reply") // url : /reply => ��� �ޱ�
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("request", request);		
		command = new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete") // url : /delte => ���� ����
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		command = new BDeleteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
}
