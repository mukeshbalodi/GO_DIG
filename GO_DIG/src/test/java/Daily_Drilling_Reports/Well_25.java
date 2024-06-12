package Daily_Drilling_Reports;
import java.awt.Robot;
import java.io.FileReader;
import java.net.MalformedURLException;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import com.opencsv.CSVReader;
public class Well_26 {

	private static WiniumDriver driver;

	public static void main(String[] args) throws Exception {
		//ScreenRecorderUtil.startRecord("main");
		
		try {
			startWiniumDriver();
			launchApplication();
			interactwithapplication();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			// Ensure proper cleanup
			if (driver != null) {
				driver.quit();
				System.out.println("Application Closed successfully");
			} else { 
				System.err.println("Application Not Closed");
			}
		}
		// ScreenRecorderUtil.stopRecord();  
	}

	private static void startWiniumDriver() throws Exception {
		System.out.println("Starting Winium Driver Server");
		ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", "Winium.Desktop.Driver.exe", "--port", "9999");
		processBuilder.start();
		Thread.sleep(20000); // Wait for the server to start
	}

	private static void launchApplication() throws MalformedURLException, InterruptedException {
		// Define the desktop options for Winium
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Users\\Administrator\\Desktop\\GoDig_Exe\\main.exe");

		// Create a new WiniumDriver instance
		System.out.println("Launching Application");
		driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(20000); // Wait for the application to launch
	}

	private static void interactwithapplication() throws InterruptedException {
		try {
			System.out.println("Handling the Sync Message Box");
			Thread.sleep(5000);
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			Actions act= new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();


			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.name("wellDropdown")));
			dropdown.click();

			Robot robot = new Robot();
			for(int i=1;i<=23;i++) {
				robot.keyPress(34); 
				robot.keyRelease(34);
			}
			
			Thread.sleep(5000);
			driver.findElement(By.name("Well-26")).click();
			Thread.sleep(5000);
			
			 WebElement ele2 = driver.findElement(By.name("   Data Upload   "));
	            System.out.println("Element 'Data Upload' found by name");
	            ele2.click();
	            Thread.sleep(3000);
	            System.out.println("Clicked on 'Data Upload'");
	          
	            act.moveByOffset(0, 50).perform();
	           
	           
	            act.moveByOffset(40, 0).perform();
	         Thread.sleep(5000);
			
	         driver.findElement(By.name("Daily Drilling Report")).click();
	         Thread.sleep(10000);
			
	 		String csv_file = "C:\\Users\\Administrator\\Downloads\\annual-enterprise-survey-2021-financial-year-provisional-csv.csv";
	 		CSVReader reader = new CSVReader(new FileReader(csv_file)); 
			String[] cell;
			while ((cell=reader.readNext())!=null) {
				
					
					
					driver.findElement(By.name("projectLineEdit")).sendKeys("Software Demo");
					
					driver.findElement(By.name("daySupervisorLineEdit")).sendKeys("Sanjiv Deori");


					driver.findElement(By.name("nightSupervisorLineEdit")).sendKeys("Rajeev Ranjan Sinha");
					driver.findElement(By.name("hseEngineerLineEdit")).sendKeys("C.S.Chundawat");
					driver.findElement(By.name("mudSupervisorLineEdit")).sendKeys("M.L.Bishnoi");
					driver.findElement(By.name("logistincSupervisorLineEdit")).sendKeys("Jagdish Duvvuru");
					Thread.sleep(5000);
					
					driver.findElement(By.name("Time Breakdown")).click();
					
			
			
		}} catch (org.openqa.selenium.NoSuchElementException e) {
			System.err.println("Element  not found");
			e.printStackTrace();
			
		}
		catch (Exception ex) {
			System.err.println("Exception occurred while interacting with the application");
			ex.printStackTrace();
			// Handle other exceptions
		}
	  	 
}}
