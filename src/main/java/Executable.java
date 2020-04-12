import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Executable extends BaseClass {
	public static void main(String[] args) {
		launch("https://www.facebook.com/");
		url();
		WebElement user= driver.findElement(By.id("email"));
		fill(user, "greens@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		fill(pass, "123456");
		WebElement btn= driver.findElement(By.id("loginbutton"));
		klik(btn);
		kill();
	}

}
