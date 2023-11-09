package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pom.PomCocept;
import generic.Base;

public class KgsCollage extends Base {
	@Test
	public void test(){
		
		PomCocept p = new PomCocept(driver);
		p.contact();
		WebElement a = driver.findElement(By.xpath("//button[@type='submit']"));
		Point loc = a.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		p.namebox("sachin kumbar");
		p.emailbox("sachinkumbar004@gmail.com");
		p.subjectbox("commerce");
		p.phonebox("8147501440");
		p.massagebox("hi there,");
		p.send(); 
	}
	

}
