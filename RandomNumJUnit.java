package randomNumberGenerator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomNumJUnit {
		WebDriver driver;
		
		@Before
		public void openBrowser() {
			// Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        
	        //Launch the Chrome driver
	        driver = new ChromeDriver();
	        
	        //Get the browser url
	        driver.get("http://www.calculator.net");
	        
	        //Maximize the window
	        driver.manage().window().maximize();
	        
	        //Click on Math calculator
	        driver.findElement(By.xpath("//*[@id='homelistwrap']/div[3]/div[2]/a")).click();
	        
			// Click on Random Number Generator
			driver.findElement(By.xpath("//*[@id=\'content\']/table[2]/tbody/tr/td/div[4]/a")).click();	
			
		}
		
		@Test
		public void TestCase1() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\'content\']/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/input[4]")).click();
			driver.findElement(By.name("slower")).sendKeys("1");
			driver.findElement(By.name("supper")).sendKeys("100");
			driver.findElement(By.xpath("//*[@id=\'content\']/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/input[3]")).click();
			Thread.sleep(5000);
		}
		
		@Test
		public void TestCase2() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td/input[4]")).click();
			driver.findElement(By.name("clower")).sendKeys("0.2");
			driver.findElement(By.name("cupper")).sendKeys("112.5");
			driver.findElement(By.name("cnums")).sendKeys("1");
			driver.findElement(By.name("cprec")).sendKeys("50");
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td/input[3]")).click();
			Thread.sleep(5000);
		}
		
		@Test
		public void TestCase3() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td/input[4]")).click();
			driver.findElement(By.name("clower")).sendKeys("10");
			driver.findElement(By.name("cupper")).sendKeys("100");
			driver.findElement(By.name("cnums")).sendKeys("1");
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label[1]")).click();
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td/input[3]")).click();
			Thread.sleep(5000);
		}
		
		@Test
		public void TestCase4() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td/input[4]")).click();
			driver.findElement(By.name("clower")).sendKeys("1");
			driver.findElement(By.name("cupper")).sendKeys("10");
			driver.findElement(By.name("cnums")).sendKeys("2");
			driver.findElement(By.xpath("//*[@id=\'dupsort\']/div[2]/label[2]")).click();
			driver.findElement(By.xpath("//*[@id=\'dupsort\']/div[4]/label[1]")).click();
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label[1]")).click();
			driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td/input[3]")).click();
			Thread.sleep(5000);
		}
		
		@After
		public void closeBrowser() {
			if (driver != null) {
				driver.quit();				
			}			
		}
	}
