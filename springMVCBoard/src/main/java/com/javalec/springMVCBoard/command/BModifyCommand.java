package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute �������̵� , ���� ����  
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap(); // request�� ���� ���� ���� �ޱ� ������, <"�� �̸�", �ش� ��ü> ������ Map
		HttpServletRequest request = (HttpServletRequest) map.get("request"); // HttpServletRequest�� ���� �Ѿ�� model�� request�� ���� ����
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		// ���ε� request�� �ش��ϴ� �� �Ҵ�
		BDao  dao = new BDao();
		dao.modify(bId, bName, bTitle, bContent);  // modify �޼��� ȣ�� �� ������ �� ���� 
			
	}

}
