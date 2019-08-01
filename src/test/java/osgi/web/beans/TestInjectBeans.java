package osgi.web.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
//@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/beans.xml")
@ContextConfiguration(locations = "classpath:/spring-config/beans.xml")
public class TestInjectBeans {

	@Autowired(required=false)
	@Qualifier(value="operator")
	private UserInfo userinfo;
	
	@Autowired(required=false)
	@Qualifier(value="userinfo")
	private UserInfo usr;
	
	@Autowired(required=false)
	private Account account;
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(userinfo);
		assertEquals(userinfo.getAccount(),"OperatorUser");
		assertEquals(userinfo.getPassword(),"ops_password");
	}
	
	@Test
	public void testInjectUser() {
		assertNotNull(usr);
		assertEquals(usr.getAccount(),"Sysadmin");
		assertEquals(usr.getPassword(),"adminpassword");
	}
	@Test
	public void injectAccount() {
		assertNotNull(account);
		
	}

}
