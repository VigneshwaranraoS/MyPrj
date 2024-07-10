package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://adr-dev.agilevortex.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("superadmin@adrmhss.com");
		driver.findElement(By.xpath("//input[@class='form-control pe-7']")).sendKeys("AV@@2024");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='superadmin']")).click();
		driver.findElement(By.xpath("(//span[@class='align-middle'])[3]")).click();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
