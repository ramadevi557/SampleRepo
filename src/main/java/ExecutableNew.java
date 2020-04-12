import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableNew extends BaseClass{
	public static void main(String[] args) {
		launch("https://www.facebook.com/");
		url();
		LoginPage l = new LoginPage();
		fill(l.getUser(), "greens@gmail.com");
		fill(l.getPass(), "123456");
		klik(l.getBtn().get(0));
		kill();
	}
}
