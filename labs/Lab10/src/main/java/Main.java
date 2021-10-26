import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    private static WebElement search;
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    private static WebElement btSearch;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\5sem\\NPO\\labs\\Lab10\\drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("iTechArt");
        element.submit();
        WebElement elem = driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/a/h3"));
        String str = elem.getText();
        if(str.contains("iTechArt"))
            System.out.println("Содержит первая ссылка");
        else
            System.out.println("Не содержит первая ссылка");
        String newStr = driver.getTitle();
        if(newStr.contains("iTechArt"))
            System.out.println("Содержит tittle");
        else
            System.out.println("Не содержит tittle");

        ///html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/a/h3
    }
}
