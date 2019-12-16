package io.bum752.github.springrequestparam.controller;

import io.bum752.github.springrequestparam.model.GetUserModelUsingConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConstructorController {

	@GetMapping("/users/constructor")
	public GetUserModelUsingConstructor getUsers(GetUserModelUsingConstructor getUserModel) {
		return getUserModel;
	}
}
