package io.bum752.github.springrequestparam.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.bum752.github.springrequestparam.model.GetUserModel;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserJacksonController {

	@GetMapping("/users/jackson")
	public GetUserModel getUsers(@RequestParam Map<String, String> parameterMap) {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.convertValue(parameterMap, GetUserModel.class);
	}
}
