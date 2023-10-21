package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginclas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Automation\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver();  
driver.get("https://qa.devstorefront.co.uk/start?vehicle_id=3");
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-all")));
driver.findElement(By.id("accept-all")).click();
driver.manage().window().maximize();
WebDriverWait wait1 = new WebDriverWait(driver, 20);
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Yes, Continue')]")));
WebElement e1 = driver.findElement(By.xpath("//*[contains(text(),'Yes, Continue')]"));

((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e1);
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Yes, Continue')]")));
e1.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@name='regNum']")).sendKeys("SG13VRM");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@name='mileage']")).sendKeys("5000");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@name='email']")).sendKeys("testtestkreioytgho4565567@silverbullet.co.uk");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@name='mobile']")).sendKeys("+447506129673");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("test");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@name='surname']")).sendKeys("test56");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@name='postcode']")).sendKeys("g212bg");
Thread.sleep(2000);
WebElement e2 = driver.findElement(By.xpath("//*[contains(text(),'FIND MY VEHICLE')]"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e2);
e2.click();
Thread.sleep(5000);
WebElement e3 = driver.findElement(By.xpath("//*[@id='conditions']"));
Select s=new Select(e3);
s.selectByVisibleText("Excellent");
Thread.sleep(2000);
WebElement e4 = driver.findElement(By.xpath("//*[@for='radio-qVehicleFullServiceHistory-atrue']"));
WebElement e5 = driver.findElement(By.xpath("//*[@for='radio-qVehicleMOTMoreThan3Months-atrue']"));
WebElement e6 = driver.findElement(By.xpath("//*[@for='radio-qVehicleKeepNumberPlate-atrue']"));
WebElement e7 = driver.findElement(By.xpath("//*[@for='radio-qVehicleV5OwnerCheck-atrue']"));
WebElement e8 = driver.findElement(By.xpath("//*[@for='radio-qVehicle2SetsOfKeys-atrue']"));
WebElement e9 = driver.findElement(By.xpath("//*[@for='radio-qVehicleMajorDamageOrWarningLight-atrue']"));
WebElement e10 = driver.findElement(By.xpath("//*[@for='radio-qVehicleImported-atrue']"));
WebElement e11 = driver.findElement(By.xpath("//button[contains(text(),'VALUE MY VEHICLE')]"));

//xpath = //span[contains(text(),'YOUR TRADE-IN VEHICLE')]/following-sibling::*[1]/child::*[2]/child::*[1]
Actions a = new Actions(driver);
a.click(e4).build().perform();
Thread.sleep(1000);
a.click(e5).build().perform();
Thread.sleep(1000);
a.click(e6).build().perform();
Thread.sleep(1000);
a.click(e7).build().perform();
Thread.sleep(1000);
a.click(e8).build().perform();
Thread.sleep(1000);
a.click(e9).build().perform();
Thread.sleep(1000);
a.click(e10).build().perform();
Thread.sleep(1000);
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e11);
Thread.sleep(2000);
a.click(e11).build().perform();
Thread.sleep(4000);
WebElement e12 = driver.findElement(By.xpath("//*[@for='outstandingFinance']/following-sibling::*[1]/child::*[2]/child::*[1]"));
WebElement e13 = driver.findElement(By.xpath("//*[@for='cashback']/following-sibling::*[1]/child::*[2]/child::*[1]"));
a.sendKeys(e12, "500").build().perform();
Thread.sleep(2000);
a.sendKeys(e13, "150").build().perform();
Thread.sleep(3000);
a.click(e12).build().perform();
Thread.sleep(3000);
/*String x=driver.findElement(By.xpath("//span[contains(text(),'YOUR TRADE-IN VEHICLE')]/following-sibling::*[1]/child::*[2]/child::*[1]/following-sibling::*[1]")).getText();
if (x.equals("500")) {
	System.out.println("Matches with given value");
}
else {
	  System.out.println(x);
	}*/
WebElement e14= driver.findElement(By.xpath("//*[contains(text(),'ADD TO DEAL')]"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e14);
Thread.sleep(3000);
a.click(e14).build().perform();
Thread.sleep(3000);
a.click(e14).build().perform();
driver.findElement(By.xpath("//*[contains(text(),'BRONZE')]/parent::*/following-sibling::*[2]/child::*[2]")).click();
Thread.sleep(3000);
WebElement e15 = driver.findElement(By.xpath("//*[contains(text(),'SAVE TO DEAL')]"));
Thread.sleep(3000);

((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e15);
Thread.sleep(3000);
e15.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='cash-option']")).click();
Thread.sleep(3000);
((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
Thread.sleep(3000);
WebElement e16 = driver.findElement(By.xpath("//*[contains(text(),'CONTINUE')]"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e16);
Thread.sleep(5000);
e16.click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("+447506129673");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("test");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("test56");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
Thread.sleep(5000); 
driver.findElement(By.xpath("//*[contains(text(),'Collect')][2]")).click();
Thread.sleep(5000);
WebElement e17 = driver.findElement(By.xpath("//*[@class='cell day selected today']"));
a.click(e17).build().perform();
Thread.sleep(5000);

driver.findElement(By.xpath("//*[@class='cell day selected today']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@for='timeslot-12:00 - 13:00']")).click();
Thread.sleep(2000);
driver.findElement(By.id("confirmSelection")).click();
Thread.sleep(2000);

	}
}

/*Takeaways:
	Framework : BDD
	WebDriver*/
	
