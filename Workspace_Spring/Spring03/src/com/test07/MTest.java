package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		System.out.println("spring ioc container 준비 완료");
		
		TV tv = (TV) factory.getBean("lg");
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		System.out.println("==========여기까지는 부모에서 호출=======");
		
		LgTv lg = (LgTv) factory.getBean("lg");
		lg.powerOff();
		
		
	}
}
