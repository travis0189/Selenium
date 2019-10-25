package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Metodos {

    WebDriver driver = new ChromeDriver();

    public void  pagina() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver.get("http://blazedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.manage().window().maximize();
    }

    public void buscarVuelo() throws InterruptedException {

        Thread.sleep(1000);
        Select origen = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
        origen.selectByVisibleText("São Paolo");

        Thread.sleep(1000);
        Select destino = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
        destino.selectByVisibleText("London");
        driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
    }

    public void elegirVuelo() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();

    }

    public void CapturaVuelo() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Víctor");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Anastacio Bustamante");

        //Código para  realizar el scroll de la página.
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement boton = driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")); //codigo para dirigirse al elemento
        js.executeScript("arguments[0].scrollIntoView()", boton); //se ejecuta el codigo js
        boton.click();
    }


/*
        Thread.sleep(1000);
        Select origen = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
        origen.selectByVisibleText("São Paolo");

        Thread.sleep(1000);
        Select destino = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
        destino.selectByVisibleText("London");
        driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
        //driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).sendKeys("Hola Mundo");

        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Víctor");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Anatacio Bustamante");

        //Código para  realizar el scroll de la página.
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement boton = driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")); //codigo para dirigirse al elemento
        js.executeScript("arguments[0].scrollIntoView()", boton); //se ejecuta el codigo js

        /*driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Ciudad de México");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("México");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("07070");

        Thread.sleep(1000);
        Select card = new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
        card.selectByVisibleText("American Express");
        driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("Mario");

        //Thread.sleep(1000);
        //driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
        boton.click();
        //driver.close();

        driver.findElement(By.xpath("//input[contains(text(), 'Find')")).click();
    //}*/
}
