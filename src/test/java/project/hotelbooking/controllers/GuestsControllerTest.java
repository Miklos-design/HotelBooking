package project.hotelbooking.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import project.hotelbooking.entities.Guests;

	
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles(profiles = "test")
public class GuestsControllerTest {

	@Autowired
	private MockMvc mock;

	@Autowired
	private ObjectMapper jsonifier;

	@Test
	public void testCreate() throws Exception {
		Guests test = new Guests(25, "Nicky", "noemail");
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/guests/addguest");
		mockRequest.contentType(MediaType.APPLICATION_JSON);
		//this is not needed for non return types
		mockRequest.content(this.jsonifier.writeValueAsString(test));
		mockRequest.accept(MediaType.APPLICATION_JSON);
		ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();
		//this is not needed for non return types
		ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.jsonifier.writeValueAsString(test));
								//here to put the sting expected	.string("String")
		this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
	 }
	
	@Test
	public void testUpdateSuccess() throws Exception {
		Guests test = new Guests(1,"John","noemailB@no.co.uk");
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/guests/update/1");
		mockRequest.contentType(MediaType.APPLICATION_JSON);
		mockRequest.content(this.jsonifier.writeValueAsString(test));
		mockRequest.accept(MediaType.APPLICATION_JSON);ResultMatcher matchStatus = MockMvcResultMatchers.status().isAccepted();
		ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.jsonifier.writeValueAsString(test));
		this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
		}
}





//@Testpublic void testUpdateFail() throws Exception {Employee testEmp = new Employee(23,"Piersy","B",Date.valueOf("1996-04-10"),"Consultant","PiersyB@no.co.uk");MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/update/23");mockRequest.contentType(MediaType.APPLICATION_JSON);mockRequest.content(this.jsonifier.writeValueAsString(testEmp));mockRequest.accept(MediaType.APPLICATION_JSON);ResultMatcher matchStatus = MockMvcResultMatchers.status().isNotFound();this.mock.perform(mockRequest).andExpect(matchStatus);}
