package en.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    protected ChromeDriver driver;

    @Before // before start test
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrive\\chromedriver.exe"); // chrome drive for google
        driver = new ChromeDriver(); // start
        System.out.println("Test start\n");
    }

    @After // after test
    public void close() {
        System.out.println("\nTest close");
        driver.close(); // close browser
    }
}
