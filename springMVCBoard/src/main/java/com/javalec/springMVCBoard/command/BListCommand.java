package com.javalec.springMVCBoard.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute �������̵� , �� ����Ʈ Ȯ�� 
		// TODO Auto-generated method stub
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list(); // dao �� list �޼��� ���� -> dto ���ϵ� , �ش� dto������ �迭�� �Ҵ�
		model.addAttribute("list", dtos); // model�� �ش� ����� dto ����(�� ����Ʈ) 
		
	}

}