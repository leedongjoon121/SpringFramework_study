package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute 오버라이드 , 글 삭제
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap(); // request를 통해 값을 전달 받기 때문에, <"값 이름", 해당 객체> 형태인 Map
		HttpServletRequest request = (HttpServletRequest) map.get("request"); // HttpServletRequest를 통해 넘어온 model의 request를 매핑 해줌 
		
		String bId = request.getParameter("bId");  // 매핑된 request의 id 값 할당
		BDao dao = new BDao();
		dao.delete(bId); // delete 메서드에 호출 및 해당 id값 전달 
		
	}

}
