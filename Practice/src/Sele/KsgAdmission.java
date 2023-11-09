package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pom.PomAdmission;
import generic.Base;

public class KsgAdmission extends Base{
	@Test
	public void test2(){
		PomAdmission pa = new PomAdmission(driver);
		pa.admission();
		pa.namebox("kumar");
		pa.gender();
		WebElement ele = driver.findElement(By.xpath("//select[@name='co']"));
		Select s = new Select(ele);
		s.selectByIndex(2);
		pa.phone("8217203006");
		pa.phone2("8147501440");
		pa.pname("sagar");
		pa.textarea("hi there");
		driver.findElement(By.xpath("//input[@name='imagefile']")).sendKeys("C:\\Users\\hp\\Desktop\\KSG collage.xlsx");
		pa.register();
	}

}