package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		Developer lee = factory.getBean("lee-ss",Developer.class); 
		//"lee-ss"이라는 객체를 가져올건데 그것의 타입이 Developer.타입의 class 이다 라는 뜻 
		//형변환을 해주기 귀찮을 떄 저렇게 developer.class를 해주면 된다 
		Engineer hong = (Engineer) factory.getBean("hong-gd");
		
		System.out.println(lee);
		System.out.println(hong);
	}

}
