import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kvhq126\\Downloads\\dr\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://demoqa.com/automation-practice-table/");
		dr.manage().window().maximize();
		List<WebElement> tRows = dr.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size();i++)
		{
			WebElement tRow = tRows.get(i);
			List<WebElement> tDatas = tRow.findElements(By.tagName("td"));
			for(int j=0;j<tDatas.size();j++)
			{
				WebElement tData=tDatas.get(j);
				String txt= tData.getText();
				System.out.println(txt);
			}
	}
}
}