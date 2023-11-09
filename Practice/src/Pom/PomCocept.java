package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomCocept {
	@FindBy (xpath="(//a[.='Contact'])[1]")
	private WebElement cbtn;
	@FindBy(xpath="//input[@name='name']")
	private WebElement nbox;
	@FindBy(xpath="//input[@name='email']")
	private WebElement ebox;
	@FindBy(xpath="//input[@name='subject']")
	private WebElement sbox;
	@FindBy(xpath="//input[@name='Phone']")
	private WebElement pbox;
	@FindBy(xpath="//input[@name='message']")
	private WebElement mbox;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sbtn;
	
	public PomCocept(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void contact(){
		cbtn.click();
	}
	public void namebox(String name){
		nbox.sendKeys(name);
	}
	public void emailbox(String email){
		ebox.sendKeys(email);
	}
	public void subjectbox(String subject){
		sbox.sendKeys(subject);
	}
	public void phonebox(String num){
		sbox.sendKeys(num);
	}
	public void massagebox(String massage){
		mbox.sendKeys(massage);
	}
	public void send(){
		sbtn.click();
	}
	
	
}
