package com.javalec.springMVCBoard.command;

import org.springframework.ui.Model;

public interface BCommand {  // ��� ��� (����,����,����,����ƮȮ��,���Ȯ�� ��)�� ���� �������̽� 
	
	void execute(Model model);
	
}