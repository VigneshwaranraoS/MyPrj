package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class studentMenu {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://adr-dev.agilevortex.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("superadmin@adrmhss.com");
		driver.findElement(By.xpath("//input[@class='form-control pe-7']")).sendKeys("AV@@2024");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Students']")).click();
		driver.findElement(By.xpath("//span[text()='Student Creation']")).click();
		WebElement select = driver.findElement(By.id("classCategory-uid1"));
		Select sel=new Select(select);
		sel.selectByVisibleText("Matriculation");
		driver.findElement(By.id("applicationNumber-uid2")).sendKeys("20241001");
		driver.findElement(By.id("studentName-uid3")).sendKeys("Alex Johnson");
		Thread.sleep(3000);		
		WebElement select1 = driver.findElement(By.id("classToBeAdmitted-uid5"));
		Select sel1=new Select(select1);
		sel1.selectByVisibleText("VI");
		//Thread.sleep(3000);
		WebElement select2 = driver.findElement(By.id("section-uid6"));
		Select sel2=new Select(select2);
		sel2.selectByVisibleText("A(27)");
		WebElement select3 = driver.findElement(By.id("medium-uid7"));
		Select sel3=new Select(select3);
		sel3.selectByVisibleText("English");
		WebElement select4 = driver.findElement(By.id("gender-uid8"));
		Select sel4=new Select(select4);
		sel4.selectByVisibleText("Male");
		driver.findElement(By.id("dob-uid9")).sendKeys("12-07-2021");
		driver.findElement(By.id("dateOfJoining-uid10")).sendKeys("16-07-2024");
        WebElement select5 = driver.findElement(By.id("studentType-uid11"));
        Select sel5=new Select(select5);
        sel5.selectByVisibleText("Day Scholar");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='css-114i3dp']")).click();
        driver.findElement(By.id("addressLine1-uid16")).sendKeys("1234 Elm Street Springfield, XY 12345 Pudukottai");
        WebElement select6 = driver.findElement(By.id("state-uid18"));
        Select sel6=new Select(select6);
        sel6.selectByVisibleText("TAMILNADU");
        WebElement select7 = driver.findElement(By.id("city-uid19"));
        Select sel7=new Select(select7);
        sel7.selectByVisibleText("PUDUKKOTTAI");
        WebElement select8 = driver.findElement(By.id("village-uid20"));
        Select sel8=new Select(select8);
        sel8.selectByVisibleText("THANJUR");
        driver.findElement(By.id("pincode-uid21")).sendKeys("622001");
        driver.findElement(By.id("communicationPhoneNo-uid22")).sendKeys("04322");
        Thread.sleep(3000);        
        //driver.findElement(By.xpath("//button[@class='btn btn-icon btn-icon-end btn-outline-primary btn-next']")).click();
       driver.close();
        
        
        
	}

}
