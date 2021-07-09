import org.example.TestProperties;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    private static Logger log = Logger.getLogger(Test.class.getName());

    @org.junit.Test
    public void test() {
        log.log(Level.INFO, "Test 333");
        log.log(Level.INFO, "test.prop=" + TestProperties.getTestProperties().getProperty("test.prop"));
    }
}
