package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTotalRowNumber {
	 public static void main(String[] args) {
		 	
	    	System.setProperty("webdriver.chrome.driver","E:\\HOCTAP\\KIỂM THỰ TỰ ĐỘNG\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
	        
	        // launch Chrome and direct it to the Base URL
	        driver.get(baseUrl);
	        
	        List <WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.print("Rows: " + rows.size());
	        
	    }
}
