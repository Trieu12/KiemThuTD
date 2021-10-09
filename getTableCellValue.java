package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTableCellValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\HOCTAP\\KIỂM THỰ TỰ ĐỘNG\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
        
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        
        
        getValue(19, 2, driver);
	}
	public static void getValue(int row, int col, WebDriver driver) {
		List <WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
        WebElement SelectedRow = rows.get(row);
        List <WebElement> cols = SelectedRow.findElements(By.xpath("//td"));
        System.out.println(cols.get(col).getText());
		
	}
}
