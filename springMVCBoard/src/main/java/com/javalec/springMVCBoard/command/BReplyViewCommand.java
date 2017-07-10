package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(Model model) { // ��� ���� Ȯ��
		
		Map<String, Object> map = model.asMap(); // request�� ���� ���� ���� �ޱ� ������, <"�� �̸�", �ش� ��ü> ������ Map
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		// HttpServletRequest�� ���� �Ѿ�� model�� request�� ���� ����
		String bId = request.getParameter("bId");
		// ���ε� request�� id �� �Ҵ�
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId); // �ش� id���� �´� ��� ���� Ȯ��
		
		model.addAttribute("reply_view", dto); // ���� 
		
	}

}
