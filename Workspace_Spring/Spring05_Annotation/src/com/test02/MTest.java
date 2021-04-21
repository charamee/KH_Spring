package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/bean.xml");
		
		School mySchool = (School) factory.getBean("myschool");
		System.out.println(mySchool);
		
		/*
		 1.
		 그냥 이상태로 출력하면 
		 School [person=null, grade=1] 
		 값이 이렇게 나온다 
		 2.School 에서 @Autowired를 추가하면 
		 School [person=Student [name=홍길동, addr=서울시 강남구, age=100], grade=1]
		 값을 자동으로 연결해주는 어노테이션 byType-> byName 으로 찾는다. 
		 3. 
		 <bean id="lee" class="com.test02.Student">
		<constructor-arg value="이순신"></constructor-arg>
		<constructor-arg value="경기도 부천시"></constructor-arg>
		<constructor-arg value="100"></constructor-arg>
		</bean>
		xml 파일에서 같은 타입의 객체가 2가지 이상일 때 오류가 발생한다. 그래서 Qualifier를 통해 어떤 객체를 연결할것인지 정해줘야 한다. 
		 
		  
		  
		  
		 
		 
		  */
	}

}
