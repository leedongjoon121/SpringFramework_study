package com.javalec.springMVCBoard.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute 오버라이드 , 글 리스트 확인 
		// TODO Auto-generated method stub
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list(); // dao 의 list 메서드 실행 -> dto 리턴됨 , 해당 dto값들을 배열에 할당
		model.addAttribute("list", dtos); // model에 해당 명령의 dto 주입(글 리스트) 
		
	}

}