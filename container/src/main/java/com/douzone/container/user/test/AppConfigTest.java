package com.douzone.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.config.user.AppConfig;
import com.douzone.container.user.Freind;
import com.douzone.container.user.User;

public class AppConfigTest {

	public static void main(String[] args) {
		testAppConfig();
		
		
		
	}

	private static void testAppConfig() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);		
		User user =ac.getBean(User.class);
		System.out.println(user);
		
		Freind freind =ac.getBean(Freind.class);
		System.out.println(freind);
	}

}
