package project.hotelbooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RoomControllerTest {
	
	@Autowired
	private MockMvc mock;

	@Autowired
	private ObjectMapper jsonifier;
	
	public void testgetAll() throws Exception {
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.GET, "/rooms/allrooms");
		mockRequest.contentType(MediaType.APPLICATION_JSON);
		mockRequest.accept(MediaType.APPLICATION_JSON);
		ResultMatcher matchStatus = MockMvcResultMatchers.status().isOk();
		this.mock.perform(mockRequest).andExpect(matchStatus);
	 
	}

}
