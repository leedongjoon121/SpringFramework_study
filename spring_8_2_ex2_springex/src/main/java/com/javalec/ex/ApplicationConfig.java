package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

// xml방식이 아니라, class 파일로 환경 설정을 할 경우 @Configuration 를 붙여 준다
@Configuration
public class ApplicationConfig {

	 // 4개의 필드
	//     @Value를 이용해서   @Value("") :  의 형태로 값을 바로바로 할당 
	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub_admin.id}")
	private String sub_adminId;
	@Value("${sub_admin.pw}")
	private String sub_adminPw;
	
	// bean 생성하는 방식
	// PropertySourcesPlaceholderConfigurer : 외부에 있는 파일들을 가져올 수 있는 방식, static 타입으로 바로 호출해서 사용 가능
	// 위치값만 셋팅 하는 것이고, 해당 내부의 내용을 셋팅 하는것은 아니다.
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() { 
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] locations = new Resource[2]; // 외부 파일들이 어디에 있는 지 
		locations[0] = new ClassPathResource("admin.properties");
		locations[1] = new ClassPathResource("sub_admin.properties");
		configurer.setLocations(locations); // 어디에 있는지 셋팅
		
		return configurer; // 반환 (외부 설정파일들의 위치 값들이 있다.)
	}
	
	@Bean
	public AdminConnection adminConfig() { // main에서 사용할 adminConfig 
	
		AdminConnection adminConnection = new AdminConnection();
		
		 // 외부 파일들의 값을 바로 할당 해 주고 있다. 
		// 위에서 @Value 로 셋팅한 값들을 바탕으로  adminConnection에 셋팅 한다.
		adminConnection.setAdminId(adminId);
		adminConnection.setAdminPw(adminPw);
		adminConnection.setSub_adminId(sub_adminId);
		adminConnection.setSub_adminPw(sub_adminPw);
		return adminConnection;
	}
	
}
