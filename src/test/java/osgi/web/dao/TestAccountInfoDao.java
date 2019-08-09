package osgi.web.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.transaction.annotation.Transactional;

import osgi.web.models.TbAccount;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:/spring-config/beans.xml","file:src/main/webapp/WEB-INF/dispatcher-servlet.xml",
		"file:src/main/webapp/WEB-INF/hibernate-cfg.xml"})
public class TestAccountInfoDao {
	@Autowired 
	private SessionFactory sessionFactory;

	
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		
		jdbcTemplate = new JdbcTemplate(datasource);
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Autowired
    private AccountDao acd;
	
	protected int countRowsInTable(String tableName) {
		return JdbcTestUtils.countRowsInTable(this.jdbcTemplate, tableName);
	}
	
	@Transactional 
	@Test
	public void testSave() {
		int nRows = countRowsInTable("TB_ACCOUNT");
		assertEquals(0,nRows);
		TbAccount accInf = new TbAccount(new BigDecimal(1),"sauser","sa","admin","1323221972", "xxx@ss.com", 2);
		acd.addAndUpdate(accInf );
		
		sessionFactory.getCurrentSession().flush();
		
		nRows =countRowsInTable("TB_ACCOUNT");
		assertEquals(1,nRows);
		
		
		
	}


}
