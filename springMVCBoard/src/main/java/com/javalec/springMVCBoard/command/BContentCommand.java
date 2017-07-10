package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute 오버라이드 , 글 내부 확인 

		Map<String, Object> map = model.asMap(); // request를 통해 값을 전달 받기 때문에, <"값 이름", 해당 객체> 형태인 Map    
		HttpServletRequest request = (HttpServletRequest) map.get("request"); 
		       // HttpServletRequest를 통해 넘어온 model의 request를 매핑 해줌 
		String bId = request.getParameter("bId"); // 매핑된 request의 id 값 할당
		
		BDao dao = new BDao(); // DAO 클래스 인스턴스 생성
		BDto dto = dao.contentView(bId); // DTO 클래스 인스턴스에 contentview 메서드 할당 (글 내부 확인)
		
		model.addAttribute("content_view", dto); // model에 해당 명령의 dto 주입(글 내부 확인) 
		
	}

}
