package osgi.web.mvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:/spring-config/beans.xml","file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})

public class TestMvc {

	@Autowired
	private WebApplicationContext wacx;
	
	private MockMvc mockMvc;

	@Before
	public void setUp() {
		
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wacx).alwaysExpect(status().isOk()).build();
				
	}
	@Test
	public void testMvcRoot() throws Exception {
		
		this.mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("default"));
		//.andExpect(forwardedUrl("/WEB-INF/index.jsp"));
		
		
	}
	//@Repeat(15)
	@Test
	public void testMvcSayhi() throws Exception {
		
		this.mockMvc.perform(get("/say/hi").accept(MediaType.parseMediaType("application/json")))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("account")))
		.andExpect(content().string(containsString("OperatorUser")))
		.andExpect(jsonPath("$.account").value("OperatorUser"))
		.andExpect(jsonPath("$.password").value("ops_password"));
		
		//.andExpect(forwardedUrl("/WEB-INF/index.jsp"));
		
		
	}
	@Test
	public void testMvcSayhiInject() throws Exception {
		
		this.mockMvc.perform(get("/say/hinamed").accept(MediaType.parseMediaType("application/json")))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("account")))
		.andExpect(content().string(containsString("OperatorUser")))
		.andExpect(jsonPath("$.account").value("OperatorUser"))
		.andExpect(jsonPath("$.password").value("ops_password"));
		
		//.andExpect(forwardedUrl("/WEB-INF/index.jsp"));
		
		
	}
	@BeforeTransaction
	public void befTrans() {
		System.out.println("----Begin transaction-----");
		
	}
	@AfterTransaction
	public void afterTrans() {
		System.out.println("----After transaction-----");		
	}
	
	@Test
	public void trans() {
		System.out.println("---- transaction-----");
		
	}
	@Test
	public void testMvcSayhello() throws Exception {
		
		this.mockMvc.perform(get("/say/hello").accept(MediaType.TEXT_HTML))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("hello_view")));
		//.andExpect(content().string(containsString("account")))
		//.andExpect(content().string(containsString("OperatorUser")));
		
		//.andExpect(forwardedUrl("/WEB-INF/index.jsp"));
		
		
	}
	@Test
	public void testMvchello() throws Exception {
		
		this.mockMvc.perform(get("/hello").accept(MediaType.TEXT_HTML))
		.andExpect(status().isOk())
		.andExpect(view().name("hello_view"))
		.andExpect(forwardedUrl("/WEB-INF/views/hello_view.jsp"));
		//System.out.println(content().);
	//	.andExpect(content().string(containsString("Hello,UserInfo [account=Sysadmin, password=adminpassword]")));
	
		
		
	}

}
