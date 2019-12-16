package io.bum752.github.springrequestparam.model;

import lombok.Getter;

@Getter
public class GetUserModelUsingConstructor {

	private String userName;
	private String userPhone;

	public GetUserModelUsingConstructor(String name, String phone) {
		this.userName = name;
		this.userPhone = phone;
	}
}
