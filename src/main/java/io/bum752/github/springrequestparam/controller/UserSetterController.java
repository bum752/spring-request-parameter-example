package io.bum752.github.springrequestparam.controller;

import io.bum752.github.springrequestparam.model.GetUserModelUsingSetter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSetterController {

	@GetMapping("/users/setter")
	public GetUserModelUsingSetter getUsers(GetUserModelUsingSetter getUserModel) {
		return getUserModel;
	}
}
