package dev.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest {

   ChromeDriver driver;

   @BeforeAll
   public void before() {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("start-maximized");
      driver = new ChromeDriver(options);

      driver.get("file:///home/sanclemente.local/a23efrencv/Escritorio/CD_UD3_Selenium_maven/src/index.html");
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

   @Test
   public void test1() {
      WebElement inputUser = driver.findElement(By.id("inputUser"));
      WebElement inputPass = driver.findElement(By.id("inputPass"));
      WebElement searchButton = driver.findElement(By.className("btn btn-primary"));

   }

   @AfterAll
   public void after() {
      driver.quit();

   }
}