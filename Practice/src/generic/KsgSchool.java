package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KsgSchool {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksgcollege.com/index.php#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement collage = driver.findElement(By.xpath("(//a[@href='#'])[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(collage).perform();
		driver.findElement(By.xpath("//a[.='Videos']")).click();
		Thread.sleep(2000);
		//WebElement loc = driver.findElement(By.xpath("(//button[@aria-label='Play'])[1]"));
		//Point pt = loc.getLocation();
		//int x = pt.getX();
		//int y = pt.getY();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBY("+x+","+y+")");
		//driver.findElement(By.xpath("(//button[@aria-label='Play'])[1]")).click();
		WebElement course = driver.findElement(By.xpath("(//a[@href='#'])[4]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(course).perform();
		WebElement ug = driver.findElement(By.xpath("//a[.='UG Course']"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(ug).perform();
		driver.findElement(By.xpath("//a[.='B.C.A']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Contact'])[1]")).click();
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		Point loc1 = name.getLocation();
		int x = loc1.getX();
		int y = loc1.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("kumar k m");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sachinkum@gmail.com");
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("commerce");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("81277777777");
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(" hii there");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement insta = driver.findElement(By.xpath("(//i[@class='fa fa-instagram'])[1]"));
		Actions act4 = new Actions(driver);
		act4.contextClick(insta).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> win = driver.getWindowHandles();
		for (String sid : win) {
			driver.switchTo().window(sid);
			Thread.sleep(2000);
		}
		driver.close();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
