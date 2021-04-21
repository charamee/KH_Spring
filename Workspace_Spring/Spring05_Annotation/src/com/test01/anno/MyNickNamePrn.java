package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//먼저 객체를 만들어주고 
//<bean id="myNickName" class="com.test01.anno.MyNickNamePrn"> 이거랑 같은것 
@Component("myNickName")
public class MyNickNamePrn {
	//bean으로 만들어줘서 값을(NickName의 값) 주입해준다
	@Autowired
	private NickName nickName;

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "제 별명은 " +nickName+ "입니다.";
	} 
	
	
	

}
