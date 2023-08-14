package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class TagsAuto {
    ChromeOptions options;
    private static WebDriver driver;

    @Given("^This is the google site$")
    public void This_is_the_google_site() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
    }

    @Given("This is the Gmail site")
    public void thisIsTheGmailSite() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://gmail.com/");
    }

    @Given("This is the flipkart site")
    public void thisIsTheFlipkartSite() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
    }

    @Given("This is the amazon site")
    public void thisIsTheAmazonSite() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @Given("This is the bing search site")
    public void thisIsTheBingSearchSite() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.bing.com/");
    }

    @Given("This is the facebook site")
    public void thisIsTheFacebookSite() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Given("This is the instagram site")
    public void thisIsTheInstagramSite() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
    }
}