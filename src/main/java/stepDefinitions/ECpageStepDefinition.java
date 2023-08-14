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

import static java.lang.Thread.sleep;

public class ECpageStepDefinition {
    ChromeOptions options;
   private static WebDriver driver;

    @Given("Url of the EC page")
    public void Url_of_the_EC_page() {
        System.setProperty("webdriver.chrome.driver", "/home/kc/Documents/Jar and Driver downloads/Selenium/driver/chromedriver");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://feeds.feeds-int01.red.ref.eu-west-2.mts.sgdigital.com/event-catalogue/");
        try {
            sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Given("^User enters the \"(.*)\" and \"(.*)\"$")
    public void User_enters_the_username_and_password(String Username, String Password) {
        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
    }

    @And("User in home page")
    public void User_in_home_page() throws InterruptedException {
        driver.findElement(By.id("kc-login")).click();
        sleep(5000);
        WebElement home_img;
        home_img = driver.findElement(By.xpath("//button[@data-testid='global-navigation-button']"));
        if (home_img.isDisplayed()) {
            System.out.println("In Home page");
            sleep(5000);
        }
    }
    @Then("User navigated to pending participant page")
    public void User_navigated_to_pending_participant_page() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Events']/parent::div")).click();
        driver.findElement(By.xpath("//a[text()='Reports']")).click();
        sleep(4000);
        driver.findElement(By.xpath("//div[@role='tablist']/child::a[contains(text(),'Participants')]")).click();
    }

    @And("Verify the participant details of the event.")
    public void Verify_the_participant_details_of_the_event() throws InterruptedException {
        sleep(4000);
        driver.findElement(By.xpath("//div[@id='panel1a-header']")).click();
        sleep(2000);
        String participant_name;
//        participant_name =driver.findElement(By.xpath("//div[@role='table']/child::div[@role='rowgroup']/descendant::div[@role='row']/div[2]")).getText();
//        System.out.println(participant_name);
//        if(participant_name.contains("First"))
//        {
//            System.out.println("First name present");
//        }
        driver.findElement(By.xpath("//div[@id='panel-sports-filters']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//span[text()='Basketball']/preceding-sibling::span/input[@type='checkbox']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//div[@id='panel1a-header']")).click();
        participant_name = driver.findElement(By.xpath("//div[@role='table']/child::div[@role='rowgroup']/descendant::div[@role='row']/div[2]/following::div/following::span[11]")).getText();
        System.out.println(participant_name);
    }
}