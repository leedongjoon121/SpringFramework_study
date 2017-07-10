package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute 오버라이드 , 댓글 달기 
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap(); // request를 통해 값을 전달 받기 때문에, <"값 이름", 해당 객체> 형태인 Map
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		 // HttpServletRequest를 통해 넘어온 model의 request를 매핑 해줌
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bGroup = request.getParameter("bGroup");
		String bStep = request.getParameter("bStep");
		String bIndent = request.getParameter("bIndent");
		// 매핑된 request의 해당하는 값 할당
		BDao dao = new BDao();
		dao.reply(bId, bName, bTitle, bContent, bGroup, bStep, bIndent); // reply 메서드 호출 및 각각의 값 전달
		
	}

}
