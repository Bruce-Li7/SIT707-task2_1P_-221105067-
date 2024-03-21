package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/Users/lijia/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Jiaqi");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
//		Find input field for lastname.
		WebElement element_lastname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element_lastname);
		element_lastname.sendKeys("Li");
		
//		find input field for phonenumber.
		WebElement element_phonenumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + element_phonenumber);
		element_phonenumber.sendKeys("0404280372");
		
//		find input field for emailaddress.
		WebElement element_emailaddress = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element_emailaddress);
		element_emailaddress.sendKeys("ohg@deakin.edu.au");
		
//		find input field for password.
		WebElement element_password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + element_password);
		element_password.sendKeys("L12345678.");
		
//		find input field for confirmpassword.
		WebElement element_confirmpassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + element_confirmpassword);
		element_confirmpassword.sendKeys("L12345678.");
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		WebElement createAccountButton = driver.findElement(By.cssSelector("button[data-testid='account-action-btn']"));
		System.out.println("Found element: " + createAccountButton);
		createAccountButton.click();
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	//jbhifi
	public static void jbhifi_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/Users/lijia/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		//click create an account button to the next page to create an account
		WebElement CreateAccount = driver.findElement(By.id("createAccount"));
		System.out.println("Found element: " + CreateAccount);
		CreateAccount.click();
		sleep(2);
		
//		Find field for firstname.
		WebElement firstname = driver.findElement(By.id("givenName"));
		System.out.println("Found element: " + firstname);
		firstname.sendKeys("jiaqi");
		
//		Find field for emailaddress.
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		email.sendKeys("ohg@deakin.edu.au");
		
		sleep(5);
		
//		Identify button 'Continue' and click to submit using Selenium API.
		WebElement button = driver.findElement(By.id("continueProxy"));
		System.out.println("Found element: " + button);
		button.click();
		
		sleep(2);
		
		driver.close();
	}
	
	
}
