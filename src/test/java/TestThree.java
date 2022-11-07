import base.BaseTest;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TestThree extends BaseTest {
@Test
    public void test3(){
    Logger logger = Logger.getLogger("TestThree");
    driver.get("https:/facebook.com");
    logger.info("siema");
}
}
