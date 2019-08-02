import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({osgi.web.mvc.TestMvc.class,osgi.web.mvc.TestByStandalone.class})
public class AllTests {

}
