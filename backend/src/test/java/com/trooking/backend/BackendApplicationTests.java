package com.trooking.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private MockMvc api;

	@Test
	void contextLoads() throws Exception {

		api
				.perform(get("/api/hello"))
				.andExpectAll(
						status().isOk(),
						content().string(equalTo("Hello!")));

	}

}
