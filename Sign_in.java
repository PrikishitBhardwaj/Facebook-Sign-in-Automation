package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.click();
		Firstname.sendKeys("Prikishit");

		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.click();
		Lastname.sendKeys("Bhardwaj");
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		 Select select1 = new Select(dropdown1);
		 
         select1.selectByValue("1");
		 
         WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
 		
		 Select select2 = new Select(dropdown2);
		 
         select2.selectByValue("29");
		 
         WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
  		
		 Select select3 = new Select(dropdown3);
		 
         select3.selectByValue("2000");
		 
         WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
 		sex.click();
 		
 		WebElement Mobile_number = driver.findElement(By.xpath("//input[@name='reg_email__']"));
 		Mobile_number.click();
 		Mobile_number.sendKeys("Someone@gmail.com");
 	
 		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
 		password.click();
 		password.sendKeys("Something@1234");
 		
// 		WebElement signin = driver.findElement(By.xpath("//input[@name='websubmit']"));
// 		signin.click();
 		
 		
		driver.close();
	}

}
