import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookLoginAndPostTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String url = "https://www.facebook.com/";
        String userName = "username";
        String password = "password";

        driver.get(url);

        WebElement userNameBOx = driver.findElement(By.id("email"));
        userNameBOx.sendKeys(userName);

        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.cssSelector("button[value ='1']"));
        loginButton.click();

        WebElement statusMessageBox = driver.findElement(By.cssSelector("div[class*='x1lkf'] span[class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']"));
        statusMessageBox.click();

        WebElement statusBoxInside = driver.findElement(By.cssSelector("p[class*='xdj266r x11i5rnm xat24cr x1mh8g0r ']"));
        statusBoxInside.sendKeys("Hello World");

        WebElement shareButton = driver.findElement(By.cssSelector("div[class*='x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x87ps6o x1lku1pv x1a2a7pz '] div[class*='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 ']"));

        shareButton.click();
        driver.quit();
    }
}
