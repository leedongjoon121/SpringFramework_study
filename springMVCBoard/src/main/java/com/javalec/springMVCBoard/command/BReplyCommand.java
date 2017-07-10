package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) { // execute �������̵� , ��� �ޱ� 
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap(); // request�� ���� ���� ���� �ޱ� ������, <"�� �̸�", �ش� ��ü> ������ Map
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		 // HttpServletRequest�� ���� �Ѿ�� model�� request�� ���� ����
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bGroup = request.getParameter("bGroup");
		String bStep = request.getParameter("bStep");
		String bIndent = request.getParameter("bIndent");
		// ���ε� request�� �ش��ϴ� �� �Ҵ�
		BDao dao = new BDao();
		dao.reply(bId, bName, bTitle, bContent, bGroup, bStep, bIndent); // reply �޼��� ȣ�� �� ������ �� ����
		
	}

}
