package com.kas.studies;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(GreetController.class)
public class TestGreetController {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getGreetAPI() throws Exception 
	{
	  mvc.perform(MockMvcRequestBuilders
	  			.get("/greet/Duwa")
	  			.accept(MediaType.TEXT_HTML))
	      .andDo(print())
	      .andExpect(status().isOk());
	}

}
