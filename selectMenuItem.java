package Demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectMenuItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\HOCTAP\\KIỂM THỰ TỰ ĐỘNG\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/guru99home/";
        
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        selectMenuItem("Bank Project", driver);
	}
	
	public static void selectMenuItem(String abc, WebDriver driver) {
		WebElement listElement= driver.findElement(By.xpath("//ul[@class= 'nav navbar-nav' ]"));
		List<WebElement> childElements= listElement.findElements(By.xpath("//li[@class='dropdown']/child::a"));
		for (int i=0; i< childElements.size(); i++) {
			if (childElements.get(i).getText().equals(abc)) {
				childElements.get(i).click();
				System.out.print("Testcase Pass");
				break;
			}
		}	
		
	}

}
