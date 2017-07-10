package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute �������̵� , �� ���� Ȯ�� 

		Map<String, Object> map = model.asMap(); // request�� ���� ���� ���� �ޱ� ������, <"�� �̸�", �ش� ��ü> ������ Map    
		HttpServletRequest request = (HttpServletRequest) map.get("request"); 
		       // HttpServletRequest�� ���� �Ѿ�� model�� request�� ���� ���� 
		String bId = request.getParameter("bId"); // ���ε� request�� id �� �Ҵ�
		
		BDao dao = new BDao(); // DAO Ŭ���� �ν��Ͻ� ����
		BDto dto = dao.contentView(bId); // DTO Ŭ���� �ν��Ͻ��� contentview �޼��� �Ҵ� (�� ���� Ȯ��)
		
		model.addAttribute("content_view", dto); // model�� �ش� ����� dto ����(�� ���� Ȯ��) 
		
	}

}
