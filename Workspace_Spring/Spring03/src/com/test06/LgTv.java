package com.test06;

public class LgTv implements TV {

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
