package com.mysite.sbbmybatis;

import java.time.LocalDateTime;

public class User {
	private Integer id;
	private String usrname;
	private String psw;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	// 생성자
	public User() {
	}

	public User(String usrname) {
		super();
		this.usrname = usrname;
	}

	public User(String usrname, String psw) {
		super();
		this.usrname = usrname;
		this.psw = psw;
	}

}