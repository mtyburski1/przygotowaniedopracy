import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    ExtentReports extent;


    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();

        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
        extent.attachReporter(spark);
    }

    @AfterSuite
    public void tearDown() {
        extent.flush();
        driver.quit();
    }

}
