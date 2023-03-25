package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FooterHasSocialMediaIcons {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(5000);
		 
		 WebElement element=driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));
		 
		 System.out.println(element.isDisplayed());
		 
		 driver.close();
	
	}

}
