package assignment5;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Captureurl {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 String url =  driver.getCurrentUrl();
		 
		
		 if(url.contains("/login")){
			 System.out.println("the url contains login");
			
			} 
		 if(url.contains("demo")) {
			 
			 System.out.println("the url contains demo");
		 }
		 
		 String title=driver.getTitle();
		 
		 if(title.contains("HRM"))
		 {
			 System.out.println("the title contains HRM");
		 }
		 
		
		driver.close();
	}

}
