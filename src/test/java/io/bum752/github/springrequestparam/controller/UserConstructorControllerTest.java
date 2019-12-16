package io.bum752.github.springrequestparam.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserConstructorController.class)
class UserConstructorControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void 생성자_이용_테스트() throws Exception {
		String name = "Eddy";
		String phone = "010xxxxXXXX";

		MultiValueMap<String, String> requestParam = new LinkedMultiValueMap<>();
		requestParam.set("name", name);
		requestParam.set("phone", phone);

		mockMvc
				.perform(
						MockMvcRequestBuilders.get("/users/constructor")
								.params(requestParam)
				)
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.userName").value(name))
				.andExpect(MockMvcResultMatchers.jsonPath("$.userPhone").value(phone));
	}
}