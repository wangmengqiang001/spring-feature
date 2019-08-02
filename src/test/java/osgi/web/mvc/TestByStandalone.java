package osgi.web.mvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import osgi.web.beans.UserInfo;
import osgi.web.controller.SayHello;

public class TestByStandalone {

	
	
	private MockMvc mockMvc;
	@Before
	public void setUp() {
		SayHello hello = new SayHello();
		UserInfo usr= new UserInfo();
		usr.setAccount("testAccount");
		usr.setPassword("testPassword");
		
		ReflectionTestUtils.setField(hello,"userinfo",usr);
		
		UserInfo ui = new UserInfo();
		ui.setAccount("test team");
		ui.setPassword("token");
		ReflectionTestUtils.setField(hello,"user",ui);		
		
		mockMvc = MockMvcBuilders.standaloneSetup(hello ).build();
		
	}
	@Test
	public void testMvcRoot() throws Exception {
		
		this.mockMvc.perform(get("/"))
		.andExpect(status().is4xxClientError());
		//.andExpect(forwardedUrl("default"));
	
		
		
	}
	@Test
	public void testMvcSayhello() throws Exception {
		
		this.mockMvc.perform(get("/say/hello").accept(MediaType.TEXT_HTML))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("hello_view")));
				
	}
	
	@Test
	public void testMvcSayhi() throws Exception {
		
		this.mockMvc.perform(get("/say/hi").accept(MediaType.parseMediaType("application/json")))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("account")))
		.andExpect(content().string(containsString("password")))
		.andExpect(jsonPath("$.account").value("test team"))
		.andExpect(jsonPath("$.password").value("token"));	
		
		
	}
	

}
