import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdown {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kvhq126\\Downloads\\dr\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		WebElement mnt = dr.findElement(By.id("month"));
		Select s = new Select(mnt);
		boolean mul = s.isMultiple();
		System.out.println(mul);
		List<WebElement> op = s.getOptions();
		for(WebElement x:op)
		{
			String txt=x.getText();
			System.out.println(txt);
		}
		s.selectByIndex(4);
		//s.selectByValue("11");
		//s.selectByVisibleText("aug");

	}
}
