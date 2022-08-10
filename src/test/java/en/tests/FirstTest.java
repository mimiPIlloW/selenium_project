package en.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest0() {
        System.out.println("Test 0 start");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // or (10, TimeUnit.SECOND) // expectation
        driver.get("https://google.com/"); // into to google

        WebElement search = driver.findElement
                (By.cssSelector("input[name = 'q']")); //search css selector input search
        search.sendKeys("Selenium", Keys.ENTER); // write selenium and press button on keyboard enter

        WebElement seleniumClick = driver.findElement
                (By.xpath("//h3[@class = 'LC20lb MBeuO DKV0Md']")); // search xpath
        seleniumClick.click(); // click

        WebElement downloadPage = driver.findElement
                (By.xpath("//a[@href = '/downloads']")); // or (//div[@id = 'main_navbar']/ul/li/a[@class = 'nav-link'])[1]
        downloadPage.click();

        WebElement checkingTextC = driver.findElement
                (By.xpath("(//img[@class = 'w-100 shadow-1-strong rounded'])[1]"));
        String checkingHeightC = checkingTextC.getAttribute("alt");
        System.out.println(checkingHeightC);

        WebElement checkingTextRuby = driver.findElement
                (By.xpath("(//img[@class = 'w-100 shadow-1-strong rounded'])[2]"));
        String checkingHeightRuby = checkingTextRuby.getAttribute("alt");
        System.out.println(checkingHeightRuby);

        WebElement checkingTextJava = driver.findElement
                (By.xpath("(//img[@class = 'w-100 shadow-1-strong rounded'])[3]"));
        String checkingHeightJava = checkingTextJava.getAttribute("alt");
        System.out.println(checkingHeightJava);

        WebElement checkingTextPython = driver.findElement
                (By.xpath("(//img[@class = 'w-100 shadow-1-strong rounded'])[4]"));
        String checkingHeightPython = checkingTextPython.getAttribute("alt");
        System.out.println(checkingHeightPython);

        WebElement checkingTextJavaScript = driver.findElement
                (By.xpath("(//img[@class = 'w-100 shadow-1-strong rounded'])[5]"));
        String checkingHeightJavaScript = checkingTextJavaScript.getAttribute("alt");
        System.out.println(checkingHeightJavaScript);

        WebElement downloadJava = driver.findElement
                (By.xpath("//a[@href = 'https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.1.0/selenium-java-4.1.3.zip']"));
        downloadJava.click();
        System.out.println("Test 0 finish\n");
    }

    @Test
    public void firstTest1() {
        System.out.println("Test 1 start");
        driver.get("https://point.md/");
        System.out.println("Test 1 finish\n");
    }
}

