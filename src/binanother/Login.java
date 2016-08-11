package binanother;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.xpath(".//*[@id='gmail-sign-in']")).click();
	driver.findElement(By.id("Email")).sendKeys("binjim14");
	driver.findElement(By.id("next")).click();
	

	}

}
