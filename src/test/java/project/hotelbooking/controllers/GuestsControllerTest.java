package project.hotelbooking.controllers;

public class GuestsControllerTest {

	/**
	 * package com.qa.hr.controllers;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.hr.entities.Employee;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:employee-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles(profiles = "test")
class EmployeeControllerTest {

	@Autowired
	private MockMvc mock;

	@Autowired
	private ObjectMapper jsonifier;

	@Test
	public void testCreate() throws Exception {
		Employee testEmp = new Employee(3,"Piers","Barber",Date.valueOf("1996-04-10"),"Consultant","PiersyB@no.co.uk");
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/create");
		mockRequest.contentType(MediaType.APPLICATION_JSON);
	--	mockRequest.content(this.jsonifier.writeValueAsString(testEmp));
		mockRequest.accept(MediaType.APPLICATION_JSON);
		
		ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();
	--	ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.jsonifier.writeValueAsString(Object));
																	.string("String")
	--	this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
	 */
	
	
	
}

//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)@AutoConfigureMockMvc@Sql(scripts = { "classpath:employee-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)@ActiveProfiles(profiles = "test")class EmployeeControllerTest { @Autowiredprivate MockMvc mock; @Autowiredprivate ObjectMapper jsonifier; @Testpublic void testCreate() throws Exception {Employee testEmp = new Employee(3,"Piers","Barber",Date.valueOf("1996-04-10"),"Consultant","PiersyB@no.co.uk");MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/create");mockRequest.contentType(MediaType.APPLICATION_JSON);mockRequest.content(this.jsonifier.writeValueAsString(testEmp));mockRequest.accept(MediaType.APPLICATION_JSON);ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.jsonifier.writeValueAsString(testEmp));this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);}@Testpublic void testUpdateSuccess() throws Exception {Employee testEmp = new Employee(1,"Piersy","B",Date.valueOf("1996-04-10"),"Consultant","PiersyB@no.co.uk");MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/update/1");mockRequest.contentType(MediaType.APPLICATION_JSON);mockRequest.content(this.jsonifier.writeValueAsString(testEmp));mockRequest.accept(MediaType.APPLICATION_JSON);ResultMatcher matchStatus = MockMvcResultMatchers.status().isAccepted();ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.jsonifier.writeValueAsString(testEmp));this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);}@Testpublic void testUpdateFail() throws Exception {Employee testEmp = new Employee(23,"Piersy","B",Date.valueOf("1996-04-10"),"Consultant","PiersyB@no.co.uk");MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/update/23");mockRequest.contentType(MediaType.APPLICATION_JSON);mockRequest.content(this.jsonifier.writeValueAsString(testEmp));mockRequest.accept(MediaType.APPLICATION_JSON);ResultMatcher matchStatus = MockMvcResultMatchers.status().isNotFound();this.mock.perform(mockRequest).andExpect(matchStatus);}
