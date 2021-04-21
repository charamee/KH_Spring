package com.test03;

import org.springframework.stereotype.Component;


//IgTV igTV = new IgTV(); 형태의 객체를 만들어준다 	
@Component
public class IgTV implements TV {
	


	public IgTV() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("igTV 생성!");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("igTV poweron");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("igTV poweroff");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("igTV volumeup");
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("igTV volumedown");
		
	}
	
	

}
