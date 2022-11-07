import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class TestTwo extends BaseTest {

    @Test
    public void test2() {
        ExtentTest test2 = extent.createTest("MySecondTest");
        test2.log(Status.INFO, "bblabbla1");
        driver.get("https:/www.google.pl");
        test2.log(Status.PASS, "it works");
        test2.log(Status.FAIL, "test");
        test2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("Spark.html", "siema").build());
        test2.log(Status.PASS, "it works2");

    }}