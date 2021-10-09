package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRowNumberByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\HOCTAP\\KIỂM THỰ TỰ ĐỘNG\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
        
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        
        
        getRow("Kwality", driver);
	}
	public static void getRow(String abc, WebDriver driver) {
		WebElement listElement= driver.findElement(By.tagName("table"));
		List<WebElement> childElements= listElement.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/child::tr"));
		for (int i=0; i< childElements.size(); i++) {
			if (childElements.get(i).getText().equals(abc)) {
				System.out.print("Công ty ở hàng thứ: "+ i+1);
				break;
			}
			else {
				System.out.print("Công ty không tồn tại");
				break;
			}
		}	
		
	}
}
