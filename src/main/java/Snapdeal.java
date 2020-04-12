import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) throws NoSuchElementException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kvhq126\\workspace\\maven-facebook\\src\\main\\java\\Driver\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.snapdeal.com/");
		dr.manage().window().maximize();
		WebElement txtSearch = dr.findElement(By.id("inputValEnter"));
		txtSearch.sendKeys("iphone 10");
		WebElement btnSearch = dr.findElement(By.xpath("//span[text()='Search']"));
		btnSearch.click();
		WebElement mob=dr.findElement(By.xpath("//p[text()='iPhone 8 IPHONE 8 ( 64GB , 2 GB ) Golden']"));
		//dr.findElement(By.xpath("//img[@src='n2.sdlcdn.com/imgs/i/5/5/230X258_sharpened/Lenovo-Ideapad-S145-81N30063IN-15-SDL510179960-1-4ff9e.jpeg']")).click();
	//	Lenovo V145 81MT0034IH AMD A6-9225@2.6 Ghz./4 GB RAM/1 TB HDD/15.6
		
		mob.click();
		
	//	driver.findElement(By.xpath("//img[@src='web/L001/images/IMAGENAME.jpg']"));
		
		String par= dr.getWindowHandle();
		
		System.out.println(par);
		Set<String> all = dr.getWindowHandles();
		System.out.println(all);
		for(String x:all)
		{
			if(!x.equals(par))
			{
				dr.switchTo().window(x);
			}
		}
		
		WebElement btnAdd =dr.findElement(By.xpath("//span[text()='add to cart']"));
		btnAdd.click();
		
		
}

}
