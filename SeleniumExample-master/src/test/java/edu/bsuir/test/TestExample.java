package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestExample {

    private WebDriver driver = WebDriverSingleton.getInstance();






    @Before
    public void shouldGoogleIbaMainPage() {
        driver.get("http://testing.cld.iba.by");
        WebElement loginField = driver.findElement(By.id("_58_login"));
        WebElement passwordField = driver.findElement(By.id("_58_password"));

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));

        loginField.sendKeys("kabanov@tc.by");


        passwordField.sendKeys("welcome");
       button.click();

        WebElement user = driver.findElement(By.xpath("//div[@class = 'float-box']//div//h3"));
        Assert.assertEquals("Александр Евгеньевич Кабанов", user.getText());

        System.setProperty("java.net.preferlPr4Stack", "true");
    }

    @Test
    public void SecondPage(){


        driver.get("http://testing.cld.iba.by/");
        WebElement podb = driver.findElement(By.xpath("//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting']"));
        podb.click();
        Assert.assertEquals("Подбор и адаптация", driver.getTitle());
    }





}
