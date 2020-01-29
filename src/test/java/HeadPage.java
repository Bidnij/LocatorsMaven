

import com.thoughtworks.selenium.Selenium;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.info;


public class HeadPage {
    private WebDriver driver;

    @Before
    public void startDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void logo() {
        driver.get("https://kharkiv.ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement logoClassName = driver.findElement(By.className("logo"));
        logoClassName.getSize();
        Dimension size = logoClassName.getSize();
        System.out.println("Logo size" + size);
        Assert.assertEquals("https://kharkiv.ithillel.ua/", driver.getCurrentUrl());

        WebElement logoCssSelector = driver.findElement(By.cssSelector(".logo"));
        //logoCssSelector.click();
        Assert.assertEquals("https://kharkiv.ithillel.ua/", driver.getCurrentUrl());

        WebElement logoXPath = driver.findElement(By.xpath("/html/body/header[1]/div/a"));
        //logoXPath.click();
        Assert.assertEquals("https://kharkiv.ithillel.ua/", driver.getCurrentUrl());

    }

    @Test
    public void joinOnCourse() {
        driver.get("https://kharkiv.ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement joinOnCourseButtonId = driver.findElement(By.id("signCoursesButton"));
        joinOnCourseButtonId.click();

        WebElement joinOnCourseButtonCssSelector = driver.findElement(By.cssSelector("#signCoursesButton"));
        joinOnCourseButtonCssSelector.getLocation();


        WebElement joinOnCourseButtonXpath = driver.findElement(By.xpath("//*[@id=\"signCoursesButton\"]"));
        //joinOnCourseButtonXpath.click();

        //WebElement PopupTitle = driver.findElement(By.xpath("//*[@style=\"signCourses\"]"));

        // Assert.assertEquals(); // Нужно понять как вытягивать стиль по нему можно понять открылось окно или нет

    }

    @Test
    public void ukrainMap() {
        driver.get("https://kharkiv.ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Dimension size = new Dimension(730, 487); // параметр размера картинки

        WebElement ukrainMapCssSelector = driver.findElement(By.cssSelector("body > section.intro.intro--default.intro--main.lozad-bg > div > section > div > img"));
        //System.out.println(ukrainMapCssSelector.getSize());
        Assert.assertEquals(size, ukrainMapCssSelector.getSize());

        WebElement ukrainMapXpath = driver.findElement(By.xpath("/html/body/section[1]/div/section/div/img"));
        System.out.println(ukrainMapXpath.getSize());
        Assert.assertEquals(size, ukrainMapXpath.getSize());

    }

    @Test
    public void youtobeButton() {
        driver.get("https://kharkiv.ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement youtubeButtonId = driver.findElement(By.className("stats__icon"));
        youtubeButtonId.click();

        WebElement youtubeButtonCss = driver.findElement(By.cssSelector("#icon-Youtube"));
        youtubeButtonCss.getLocation();
        System.out.println(youtubeButtonCss.getLocation());
        //WebElement youtobeButtonXpath = driver.findElement(By.xpath("/html/body/section[1]/section/ul[1]/li[2]/a/span/svg"));
        //youtobeButtonXpath.getText();
        //System.out.println(youtobeButtonXpath.getText());
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // System.out.println( driver.getCurrentUrl());
        // Assert.assertEquals("https://www.youtube.com/user/HillelITSchool", driver.getCurrentUrl()); // Нужна как понять ссылку которая вытягивается в новом окне а не этом


    }

    @Test
    public void courseLink() {
        driver.get("https://kharkiv.ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement courseLinkId = driver.findElement(By.id("course"));
        courseLinkId.click();

        WebElement courseLinkCss = driver.findElement(By.cssSelector("#course"));
        courseLinkCss.click();

        WebElement courseLinkXpath = driver.findElement(By.xpath(".//*[text()='QA Automation']/.."));
        courseLinkXpath.getClass();
    }

    @Test
    public void testing() {
        driver.get("https://kharkiv.ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //WebElement testsCss = driver.findElement(By.cssSelector("#courseMenuNav > div > div.menu__main > ul > li.menu__item.menu__item--active > a")); //Почему то не могу кликнуть

        WebElement testXpath = driver.findElement(By.xpath("//*[@id=\"courseMenuNav\"]/div/div[1]/ul/li[2]/a"));
        //testXpath.click(); // почему то не могу кликнуть


    }



    @After
    public void quitDrive() {
        driver.close();
    }
}
