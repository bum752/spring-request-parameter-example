package io.bum752.github.springrequestparam.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;

@Getter
public class GetUserModel {

	@JsonAlias("name")
	private String userName;

	@JsonAlias("phone")
	private String userPhone;
}
