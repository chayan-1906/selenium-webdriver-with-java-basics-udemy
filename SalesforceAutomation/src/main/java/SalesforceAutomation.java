import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceAutomation {

	static WebDriver webDriver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webDriver.get("https://login.salesforce.com");
		webDriver.findElement(By.linkText("Forgot Your Password?")).click();
		webDriver.findElement(By.name("cancel")).click();
		webDriver.findElement(By.name("username")).sendKeys("padma9647");
		webDriver.findElement(By.name("pw")).sendKeys("123456");
		webDriver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	}

}
