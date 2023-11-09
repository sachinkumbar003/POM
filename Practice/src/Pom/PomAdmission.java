package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAdmission {
	
	@FindBy(xpath="(//img[@class='floating'])[1]")
	private WebElement admn;
	@FindBy(xpath="//input[@name='email']")
	private WebElement nme;
	@FindBy(xpath="//label[@for='rd1']")
	private WebElement gen;
	@FindBy(xpath="//input[@name='pn']")
	private WebElement phn;
	@FindBy(xpath="//input[@name='fn']")
	private WebElement phn2;
	@FindBy(xpath="//input[@name='Pleasem']")
	private WebElement refnam;
	@FindBy(xpath="//textarea[@name='story']")
	private WebElement texta;
	@FindBy(xpath="//div[@role='presentation']")
	private WebElement capt;
	@FindBy(xpath="//input[@class='button']")
	private WebElement reg;
	
	public PomAdmission(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void admission(){
		admn.click();
	}
	public void namebox(String nm){
		nme.sendKeys(nm);
	}
	public void gender(){
		gen.click();
	}
	public void phone(String pn){
		nme.sendKeys(pn);
	}
	public void phone2(String fn){
		nme.sendKeys(fn);
	}
	public void pname(String name){
		refnam.sendKeys(name);
	}
	public void textarea(String text){
		refnam.sendKeys(text);
	}
	public void captche(){
		capt.click();
	}
	public void register(){
		reg.click();
	}
}
