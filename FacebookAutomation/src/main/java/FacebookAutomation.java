import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	static WebDriver webDriver = new ChromeDriver();

	public static void main(String[] args) {

		webDriver.get("http://facebook.com");
		webDriver.findElement(By.name("email")).sendKeys("7319439725");
		webDriver.findElement(By.name("pass")).sendKeys("9647100133");
		webDriver.findElement(By.linkText("Forgotten password?")).click();
		// webDriver.findElement(By.name("login")).click();
	}

}
