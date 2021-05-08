package com.boot.jpa.model.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MYBOARD")
public class JpaDto {
	@Id // primary key 라는 뜻 
	@Column 
	@GeneratedValue(strategy = GenerationType.AUTO) //primary key 를 어떻게 줄건지 정한다 ->?시퀀스.nextval 처럼 
	private int myno; 
	@Column
	private String myname;
	@Column
	private String mytitle;
	@Column
	private String mycontent;
	@Temporal(TemporalType.DATE) // sysdate 
	@Column(updatable = false) // 수정 안되게 할거얌 
	private Date mydate;
	
	
	public JpaDto() {
		
	}
	public JpaDto(int myno, String myname, String mytitle, String mycontent, Date mydate) {
		this.myno = myno;
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
		this.mydate = mydate;
	}
	public int getMyno() {
		return myno;
	}
	public void setMyno(int myno) {
		this.myno = myno;
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public String getMytitle() {
		return mytitle;
	}
	public void setMytitle(String mytitle) {
		this.mytitle = mytitle;
	}
	public String getMycontent() {
		return mycontent;
	}
	public void setMycontent(String mycontent) {
		this.mycontent = mycontent;
	}
	public Date getMydate() {
		return mydate;
	}
	public void setMydate(Date mydate) {
		this.mydate = mydate;
	}
	
	

}
