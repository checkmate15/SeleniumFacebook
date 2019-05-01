package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver = null;

    public static WebDriver SetupDriver(String platform, String url, String browser) {

        //connection to platform and blows
        if (platform.equalsIgnoreCase("mac")&&(browser.equalsIgnoreCase("Chrome"))){

            //if platform is mac
            System.getProperty("webdriver.chrome.driver", "C:\\Users\\Adnan Ahmed\\IdeaProjects\\Google\\src\\main\\resources\\drivers\\chromedrivernew");
            driver = new ChromeDriver();
        }else if (platform.equalsIgnoreCase("mac")&&(browser.equalsIgnoreCase("Firefox"))) {
                System.getProperty("webdriver.gecko.driver", "C:\\Users\\Adnan Ahmed\\IdeaProjects\\Google\\src\\main\\resources\\drivers\\geckodriver");

                driver = new FirefoxDriver();

        } else if(platform.equalsIgnoreCase("windows")&&(browser.equalsIgnoreCase("chrome"))){
                //if the platform is Windows
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adnan Ahmed\\IdeaProjects\\Google\\src\\main\\resources\\drivers\\chromedrivernew.exe");

                driver = new ChromeDriver();

        }else if(platform.equalsIgnoreCase("windows")&&(browser.equalsIgnoreCase("Firefox"))){

                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adnan Ahmed\\IdeaProjects\\Google\\src\\main\\resources\\drivers\\geckodriver.exe");

                driver = new FirefoxDriver();

        }




        //connect to WebDriver interface and create object to ChromeDriver class
        //driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //making windows size maximize
        driver.manage().window().maximize();

        //getting url from main method to perform
        driver.get(url);



        return driver;
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void facebooklogin() {
        //giving platform name and url
        SetupDriver("Windows", "https://www.facebook.com", "Firefox");

        //Typing email
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Type your Email");

        //Typiing password
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Type your password");

        //hitting log in button
        driver.findElement(By.xpath("//*[@value='Log In']")).click();


        //giving thread.sleep to wait
        //using try catch for bypassing exception
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //don't want to see any print exception
        }

        //to exit browser
        //driver.quit();


    }

    @Test
    public void messengerValidated() {


        //giving platform name and url
        SetupDriver("Windows", "https://www.facebook.com", "Chrome");

        //checking Messenger Link
        driver.findElement(By.linkText("Messenger")).click();


        //try and catching for exceptions
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //don't want to see any print exception
        }

        //to exit browser
        // driver.quit();

    }

    @Test
    public void helpValidated() {


        //giving platform name and url
        SetupDriver("Windows", "https://www.facebook.com", "Chrome");

        //checking Messenger Link
        driver.findElement(By.linkText("Help")).click();


        //try and catching for exceptions
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //don't want to see any print exception
        }

        //to exit browser
        // driver.quit();

    }

    @Test
    public void LanguageCheck() {


        //giving platform name and url
        SetupDriver("Windows", "https://www.facebook.com", "Chrome");

        //checking Messenger Link
        driver.findElement(By.linkText("Español")).click();


        //try and catching for exceptions
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //don't want to see any print exception
        }

        //to exit browser
        // driver.quit();

    }

    @Test
    public void ForgotaccCheck() {


        //giving platform name and url
        SetupDriver("Windows", "https://www.facebook.com", "Chrome");

        //checking Messenger Link
        driver.findElement(By.linkText("Forgot account?")).click();


        //try and catching for exceptions
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //don't want to see any print exception
        }

        //to exit browser
        // driver.quit();

    }

    @Test
    public void CreatepageValidate() {


        //giving platform name and url
        SetupDriver("Windows", "https://www.facebook.com", "Firefox");

        //checking Messenger Link
        driver.findElement(By.linkText("Create a Page")).click();


        //try and catching for exceptions
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //don't want to see any print exception
        }

        //to exit browser
        // driver.quit();

    }





}






