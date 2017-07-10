package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;


public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute �������̵� , �� �ۼ� 
		
		Map<String, Object> map = model.asMap(); // request�� ���� ���� ���� �ޱ� ������, <"�� �̸�", �ش� ��ü> ������ Map
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		// HttpServletRequest�� ���� �Ѿ�� model�� request�� ���� ����
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		// ���ε� request�� �ش��ϴ�  �� �Ҵ�
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent); // �� �ۼ� �޼��� ȣ�� �� �Ķ���� ����
	}
}
