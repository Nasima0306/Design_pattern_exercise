import Singleton.Logger;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LoggerTest {
    @Test
    public void testSingletonInstance() {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verifies both references point to the same object
        assertSame(logger1, logger2);
    }
}
