# SauceDemo Login Automation

This is a basic Selenium automation project using Java to automate the login process of the [SauceDemo](https://www.saucedemo.com) website.

## Technologies Used
- Java
- Selenium WebDriver
- Chrome browser

## Steps Performed
1. Open Chrome browser
2. Navigate to SauceDemo login page
3. Enter username and password
4. Click login
5. Close the browser

## Credentials Used
- Username: standard_user
- Password: secret_sauce

------------------------------------------- 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginAutomation {

    public static void main(String[] args)  throws InterruptedException {
        
        // Set path to chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo login page
        driver.get("https://www.saucedemo.com");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click Login button
        driver.findElement(By.id("login-button")).click();

        // Close the browser after few seconds
        Thread.sleep(3000); // Wait for 3 seconds to see the result

        driver.quit();  // Close the browser
    }
}

  
