package com.javalec.springMVCBoard.command;

import org.springframework.ui.Model;

public interface BCommand {  // 모든 명령 (쓰기,수정,삭제,리스트확인,댓글확인 등)에 대한 인터페이스 
	
	void execute(Model model);
	
}