package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;


public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute 오버라이드 , 글 작성 
		
		Map<String, Object> map = model.asMap(); // request를 통해 값을 전달 받기 때문에, <"값 이름", 해당 객체> 형태인 Map
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		// HttpServletRequest를 통해 넘어온 model의 request를 매핑 해줌
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		// 매핑된 request의 해당하는  값 할당
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent); // 글 작성 메서드 호출 및 파라미터 전달
	}
}
