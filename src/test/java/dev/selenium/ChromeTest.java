package dev.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v118.v118CdpInfo;

public class ChromeTest {

   static ChromeDriver driver;

   @BeforeAll
   public static void before() {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("start-maximized");
      driver = new ChromeDriver(options);

      driver.get("file:///home/sanclemente.local/a23efrencv/Escritorio/CD_UD3_Selenium_maven/src/index.html");
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

   @Test
   public void test1() {

      // Buscamos los elementos.
      WebElement inputUser = driver.findElement(By.id("inputUser"));
      WebElement inputPass = driver.findElement(By.id("inputPass"));
      WebElement searchButton = driver.findElement(By.className("btn-primary"));

      inputUser.sendKeys("efren");
      inputPass.sendKeys("abc123.");
      // Duerme 2 seg(Theread siempre va dentro de un try/catch)
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      searchButton.click();

      // assertEquals(h1 , "Formulario procesado");
      // Primero buscamos el elemento(tiene que ser de forma secuencial).
      WebElement h1 = driver.findElement(By.tagName("h1"));

      // Segundo comparamos el elemento con el texto de dicho elemento.
      assertEquals("Formulario procesado", h1.getText());
   }

   @Test
   public void test2() {
      WebElement inputCheck = driver.findElement(By.className("form-check-input"));
      WebElement searchButton = driver.findElement(By.className("btn-primary"));

      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      inputCheck.click();
      searchButton.click();

   }

   @AfterAll
   public static void after() {
      driver.quit();

   }
}
