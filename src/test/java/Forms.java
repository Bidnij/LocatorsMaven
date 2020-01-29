import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Forms {
    private WebDriver driver;

    @Before
    public void startDriver() {
        driver = new ChromeDriver();
    }

    @Test //(timeout = 10000) // время на запуск теста
    public void thanksForm () {
        driver.get("https://kharkiv.ithillel.ua/courses/qa-automation-kharkiv");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement thanksFormClass = driver.findElement(By.className("modal__form"));
        //System.out.println(thanksFormClass.getText());

        WebElement thaksFormCss = driver.findElement(By.cssSelector("#magnet > div > div"));
        thaksFormCss.getSize(); //размер 0 на 0 потому что объект скрыт

        WebElement thanksFormXpath = driver.findElement(By.xpath("//*[@id=\"magnet\"]/div/div"));
        //thanksFormXpath.getText();
    }

    @Test
    public void thanksFields () {
        driver.get("https://kharkiv.ithillel.ua/courses/qa-automation-kharkiv");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement name = driver.findElement(By.id("inputMagnetName"));
        name.sendKeys("Myhail");
        WebElement email = driver.findElement(By.id("inputMagnetEmail"));
        email.sendKeys("test@test.com");
        WebElement button = driver.findElement(By.id("buttonSubscribe"));
        button.click();

        //Assert.assertEquals("Введите ваше имя", name.getText());

    }



    @After
    public void quitDrive() {
        driver.close();
    }

}
