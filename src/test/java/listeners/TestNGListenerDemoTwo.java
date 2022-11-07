package listeners;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNGListenerDemoTwo extends BaseTest {

    @Test
    public void test4() {
        driver.get("https:/www.google.pl");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcde");
        driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcde");
    }

    @Test
    public void test5() {
        System.out.println("I am inside test5");
    }

    @Test
    public void test6() {
        System.out.println("I am inside test6");
    }

}
