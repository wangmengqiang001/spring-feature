package osgi.web.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
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
	
	@Autowired
	protected ApplicationContext ctx;
	
	private UserInfo fromCtx;
	
	@Inject 
	UserInfo operator;
	
	@Inject
	@Named(value="operator")
	UserInfo namedOpe;
	

	
	@Before 
	public void setUp() {
		
		fromCtx = (UserInfo) ctx.getBean("userinfo");
		
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(userinfo);
		assertEquals(userinfo.getAccount(),"OperatorUser");
		assertEquals(userinfo.getPassword(),"ops_password");
	}
	
	@Test
	public void testFromCtx() {
		//fail("Not yet implemented");
		assertNotNull(fromCtx);
		assertEquals(fromCtx.getAccount(),"Sysadmin");
		assertEquals(fromCtx.getPassword(),"adminpassword");
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
	@Test
	public void testInjectOperator()
	{
		assertNotNull(operator);
		assertEquals(operator.getAccount(),"OperatorUser");
		assertEquals(operator.getPassword(),"ops_password");
		
	}
	@Test
	public void testNamedInjectOperator()
	{
		assertNotNull(namedOpe);
		assertEquals(namedOpe.getAccount(),"OperatorUser");
		assertEquals(namedOpe.getPassword(),"ops_password");
		
	}

}
