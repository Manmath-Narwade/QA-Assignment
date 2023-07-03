package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class CreateAccount{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manna\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://auth.dev.vntech.io/");
		
		driver.manage().window().maximize();
		
		WebElement AcceptAllcookies = driver.findElement(By.xpath("(//button[contains(@type,'button')])[5]"));
		AcceptAllcookies.click();
		
		WebElement signUp = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		signUp.click();
		
		WebElement other = driver.findElement(By.xpath("//p[contains(text(),'Other')]"));
		other.click();
		
		WebElement FirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		FirstName.sendKeys("Manmath");
		
		WebElement LastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		LastName.sendKeys("Narwade");
		
		WebElement Email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Email.sendKeys("manmathnarwade52@gmail.com");
		
		WebElement CreateAcc = driver.findElement(By.xpath("//button[text()='Create Account']"));
		CreateAcc.click();
		System.out.println("New Account Is Created");
		
		driver.get("https://mail.google.com/?");
		
		driver.manage().window().maximize();
		
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signIn.click();
		
		WebElement Email2 = driver.findElement(By.xpath("//input[@type='email']"));
		Email2.sendKeys("manmathnarwade52@gmail.com");
		
		WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click();

		WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(pass));
		pass.sendKeys("mann@1234");
		
		WebElement Next2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		Next2.click();
		Thread.sleep(2000);
		
		WebElement ClickEmail = driver.findElement(By.xpath("(//td[contains(@class,'yX xY ')])[1]"));
		
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		wait2.until(ExpectedConditions.visibilityOf(ClickEmail));
		ClickEmail.click();
		
		WebElement VerifyEmail = driver.findElement(By.xpath("//a[contains(text(),'Verify Email')]"));
		VerifyEmail.click();
		System.out.println("manmathnarwade52@gmail.com has been verified.");
	}
}
