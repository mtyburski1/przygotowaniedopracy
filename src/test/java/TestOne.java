import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    @Test
    public void test1() {
        ExtentTest test1 = extent.createTest("MyFirstTest");
        test1.log(Status.INFO, "bblabbla1");
        driver.get("https:/www.google.pl");
        test1.log(Status.PASS, "it works");
        test1.log(Status.FAIL, "test");
        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("Spark.html", "siema").build());
        test1.log(Status.PASS, "it works2");
    }
}
