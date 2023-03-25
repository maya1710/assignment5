package assignment5;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureurlHrefYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
		    List<WebElement> allLinks=driver.findElements(By.tagName("a"));
				

		    
			for(WebElement ele:allLinks)
			{

				System.out.println(ele.getAttribute("href"));
				if ( ele.getAttribute("href").contains("youtube"))
				{
						
					break;
				}
				

					
			}
			
			
	}
}
		

