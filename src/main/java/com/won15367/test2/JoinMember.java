package com.won15367.test2;

public class JoinMember {
	
	private String joinid;
	private String joinpw;
	private String joinName;
	private String joinEmail;
	
	public JoinMember() {
		super();
	}
	
	public JoinMember(String joinid, String joinpw, String joinName, String joinEmail) {
		super();
		this.joinid = joinid;
		this.joinpw = joinpw;
		this.joinName = joinName;
		this.joinEmail = joinEmail;
	}
		
	public String getJoinid() {
		return joinid;
	}
	public void setJoinid(String joinid) {
		this.joinid = joinid;
	}
	public String getJoinpw() {
		return joinpw;
	}
	public void setJoinpw(String joinpw) {
		this.joinpw = joinpw;
	}
	public String getJoinName() {
		return joinName;
	}
	public void setJoinName(String joinName) {
		this.joinName = joinName;
	}
	public String getJoinEmail() {
		return joinEmail;
	}
	public void setJoinEmail(String joinEmail) {
		this.joinEmail = joinEmail;
	}

	
	
	
}
