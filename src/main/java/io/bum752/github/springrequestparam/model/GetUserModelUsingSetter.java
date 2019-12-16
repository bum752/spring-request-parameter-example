package io.bum752.github.springrequestparam.model;

import lombok.Getter;

@Getter
public class GetUserModelUsingSetter {

	private String userName;
	private String userPhone;

	public void setName(String name) {
		this.userName = name;
	}

	public void setPhone(String phone) {
		this.userPhone = phone;
	}
}
