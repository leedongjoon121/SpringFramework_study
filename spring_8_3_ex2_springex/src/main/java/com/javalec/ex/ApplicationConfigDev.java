package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration  
@Profile("dev")  // java 파일 이므로, 에너테이션 방식으로 @Profile("dev") 와 같이 지정해 주면 끝이다.  
public class ApplicationConfigDev {
	
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("localhost");
		info.setPortNum("8181");
		return info;
	}
	
}
