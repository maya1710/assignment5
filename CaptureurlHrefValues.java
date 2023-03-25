package assignment5;


import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureurlHrefValues 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		Map socialm = new HashMap<String,String>();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
		 List<WebElement> allLinks=driver.findElements(By.tagName("a"));
				

		    for(WebElement ele:allLinks)
			{

				System.out.println(ele.getAttribute("href"));
				
				socialm.put(ele.getAttribute("href").substring(11,21), ele.getAttribute("href"));
				
				System.out.println("Link text is "+ele.getAttribute("href"));
					
			}
			
			
			// Iterating over keys only
			for (Object key : socialm.keySet()) {
			    System.out.println("Key = " + key);
			}

			// Iterating over values only
			for (Object value : socialm.values()) {
			    System.out.println("Value = " + value);
			}    }

		  }

		

