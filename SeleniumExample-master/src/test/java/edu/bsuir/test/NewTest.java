package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTest {

    private WebDriver driver = WebDriverSingleton.getInstance();


    @Test(expected = IllegalArgumentException.class)
    public void ErrorPassword() {
        driver.get("http://testing.cld.iba.by");
        WebElement loginField = driver.findElement(By.id("_58_login"));
        WebElement ErrorPasswordField = driver.findElement(By.id("_58_password"));

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));

        loginField.sendKeys("kabanov@tc.by");


        ErrorPasswordField.sendKeys("weelcome");
        button.click();


        System.setProperty("java.net.preferlPr4Stack", "true");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ErrorPasswordTwo() {
        driver.get("http://testing.cld.iba.by");
        WebElement loginField = driver.findElement(By.id("_58_login"));
        WebElement SecondErrorPasswordField = driver.findElement(By.id("_58_password"));

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));

        loginField.sendKeys("kabanov@tc.by");


        SecondErrorPasswordField.sendKeys("w__lcome");
        button.click();


        System.setProperty("java.net.preferlPr4Stack", "true");
    }


    @Test(expected = IllegalArgumentException.class)
    public void ErrorPasswordThree() {
        driver.get("http://testing.cld.iba.by");
        WebElement loginField = driver.findElement(By.id("_58_login"));
        WebElement ThirdErrorPasswordField = driver.findElement(By.id("_58_password"));

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));

        loginField.sendKeys("kabanov@tc.by");


        ThirdErrorPasswordField.sendKeys("");
        button.click();


        System.setProperty("java.net.preferlPr4Stack", "true");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ErrorEmail() {
        driver.get("http://testing.cld.iba.by");
        WebElement ErrorLoginField = driver.findElement(By.id("_58_login"));
        WebElement ThirdErrorPasswordField = driver.findElement(By.id("_58_password"));

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));

        ErrorLoginField.sendKeys("kabanov1@tc.by");


        ThirdErrorPasswordField.sendKeys("welcome");
        button.click();


        System.setProperty("java.net.preferlPr4Stack", "true");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ErrorEmailTwo() {
        driver.get("http://testing.cld.iba.by");
        WebElement SecondErrorLoginField = driver.findElement(By.id("_58_login"));
        WebElement ThirdErrorPasswordField = driver.findElement(By.id("_58_password"));

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));

        SecondErrorLoginField.sendKeys("");


        ThirdErrorPasswordField.sendKeys("welcome");
        button.click();


        System.setProperty("java.net.preferlPr4Stack", "true");
    }



}
