package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(Model model) { // 댓글 내용 확인
		
		Map<String, Object> map = model.asMap(); // request를 통해 값을 전달 받기 때문에, <"값 이름", 해당 객체> 형태인 Map
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		// HttpServletRequest를 통해 넘어온 model의 request를 매핑 해줌
		String bId = request.getParameter("bId");
		// 매핑된 request의 id 값 할당
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId); // 해당 id값에 맞는 댓글 내용 확인
		
		model.addAttribute("reply_view", dto); // 전달 
		
	}

}
