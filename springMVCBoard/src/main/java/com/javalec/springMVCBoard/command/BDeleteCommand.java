package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute �������̵� , �� ����
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap(); // request�� ���� ���� ���� �ޱ� ������, <"�� �̸�", �ش� ��ü> ������ Map
		HttpServletRequest request = (HttpServletRequest) map.get("request"); // HttpServletRequest�� ���� �Ѿ�� model�� request�� ���� ���� 
		
		String bId = request.getParameter("bId");  // ���ε� request�� id �� �Ҵ�
		BDao dao = new BDao();
		dao.delete(bId); // delete �޼��忡 ȣ�� �� �ش� id�� ���� 
		
	}

}
