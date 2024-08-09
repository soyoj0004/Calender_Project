package com.javalab.calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 스프링 애플리케이션의 메인 클래스
 * - @SpringBootApplication : 스프링 부트 애플리케이션을 구성하는 여러 을 자동으로 처리
 * - @RestController :
 */
@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Hello, Spring Boot";
	}

}
