package com.trooking.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
@AutoConfigureMockMvc
class BackendApplicationTests {

	@Autowired
	private MockMvc api;

	@Test
	void contextLoads() throws Exception {

		api
				.perform(get("/api/hotels"))
				.andExpectAll(
						status().isOk(),
						jsonPath("$", hasSize(4)),
						jsonPath("$[0].name", equalTo("Hotel Miami")),
						jsonPath("$[0].description", equalTo("Fabuloso")),
						jsonPath("$[0].pricePerNight", equalTo(300.0)),
						jsonPath("$[0].photoUrl", equalTo("placeholder")));

	}

}
