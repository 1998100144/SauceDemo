import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NewTest {

   @Test
    public void swagLabs1() {
        // открыть браузер
        //зайти на сайт
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       WebDriver browser = new ChromeDriver();
       browser.get("https://www.saucedemo.com");
       browser.findElement(By.id("user-name"));
       browser.findElement(By.name("user-name"));
       browser.findElement(By.className("submit-button"));
       //browser.findElement(By.linkText(""));
       //browser.findElement(By.partialLinkText("pricing"));
       browser.findElement(By.xpath("//input[@id='user-name']"));
       browser.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));
       browser.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
       browser.findElement(By.xpath("//div[contains(text(),'Swag')]"));
       browser.findElement(By.xpath("//*[text()='Accepted usernames are:']//ancestor::div"));
       browser.findElement(By.xpath("//div[@id='login_credentials']/descendant::*"));
       browser.findElement(By.xpath("//div[@class='login_password']/following::*"));
       browser.findElement(By.xpath("//input[@type='submit']/parent::*"));
       browser.findElement(By.xpath("//div[@class='error-message-container']/preceding::*"));
       browser.findElement(By.xpath("//input[@id='user-name' and @type='text']"));
       browser.findElement(By.cssSelector(".form_column"));
       browser.findElement(By.cssSelector(".submit-button.btn_action"));
       browser.findElement(By.cssSelector("#login-button"));
       browser.findElement(By.cssSelector("input[id='user-name']"));
       browser.quit();

    }

}
