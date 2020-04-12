import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kvhq126\\Downloads\\dr\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		String s= dr.getCurrentUrl();
		System.out.println(s);
		dr.manage().window().maximize();
		WebElement id=dr.findElement(By.id("email"));
		id.sendKeys("greens@gmail.com");
		WebElement pass= dr.findElement(By.id("pass"));
		pass.sendKeys("123456");
		WebElement btn= dr.findElement(By.id("u_0_b"));
		btn.click();
	
		
	}

}
