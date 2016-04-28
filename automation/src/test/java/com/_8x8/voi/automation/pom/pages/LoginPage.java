package com._8x8.voi.automation.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com._8x8.voi.automation.pom.utils.PageLevelUtils;

 

public class LoginPage extends PageLevelUtils{
	
	WebDriver driver;
	 
    @FindBy(how=How.ID, using="uid") 
    WebElement uname;        
 
    @FindBy(how=How.ID, using="password") 
    WebElement password;
    
    By CompLogo = new By.ById("companyLogo");
    
    @FindBy(how=How.ID, using="companyLogo")
    List<WebElement> compLogoList;
    
    
    //http://selenium2advanced.blogspot.in/2013/08/working-with-page-factory-and-webdriver.html
    public LoginPage(WebDriver driver) throws Exception{    	 
        this.driver = driver;
        PageFactory.initElements(driver, LoginPage.class);
        
        if (!driver.getTitle().contains("8x8 Log In"))
            throw new Exception("This is not the Login page");
    }
    
    public void presenceCompLogoLocated()
	{
		WebDriverWait wait=new WebDriverWait(driver, 60, 1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(CompLogo));
	}

  
    public void login(String uname,String pwd){
    	
    }
    
    public int getCompanyLogoCount()
    {
    	int result = 0;    	
    	presenceCompLogoLocated();
    	result = compLogoList.size();
        return result;
    }

}
