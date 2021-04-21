package com.test07;

public class LgTv implements TV {
	
	

	public LgTv() {
		System.out.println("Lgtv 생성!! ");
	}

	@Override
	public void powerOn() {
		System.out.println("Lg tv on");

	}

	@Override
	public void powerOff() {
		System.out.println("Lg tv off");

	}

	@Override
	public void volumeUp() {
		System.out.println("LG tv volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("LG tv volume down");

	}

}
