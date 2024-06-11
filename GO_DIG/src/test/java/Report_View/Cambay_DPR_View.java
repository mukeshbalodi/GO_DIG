package Report_View;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Cambay_DPR_View {
	 private static WiniumDriver driver = null;
	public static void main(String[] args) {
		

		   
		    	//ScreenRecorderUtil.startRecord("main");
		    	
		    	
		        try {
		            // Start the Winium driver server
		            startWiniumDriver();

		            // Setup and launch the application
		            launchApplication();

		            // Interact with the application
		            interactWithApplication();

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Ensure proper cleanup
		            if (driver != null) {
		                driver.quit();
		                System.out.println("Application Closed successfully");
		            }
		            else { 
		            	System.err.println("Application Not Closed ");
		            }
		          
		        }
		            // ScreenRecorderUtil.stopRecord();  
		    }
		    


private static void startWiniumDriver() throws Exception {
    System.out.println("Starting Winium Driver Server");
    ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", "Winium.Desktop.Driver.exe", "--port", "9999");
    processBuilder.start();
    Thread.sleep(5000); // Wait for the server to start
}

private static void launchApplication() throws MalformedURLException, InterruptedException {
    // Define the desktop options for Winium
    DesktopOptions option = new DesktopOptions();
    option.setApplicationPath("C:\\Users\\Administrator\\Desktop\\GoDig_Exe\\main.exe");

    // Create a new WiniumDriver instance
    System.out.println("Launching Application");
    driver = new WiniumDriver(new URL("http://localhost:9999"), option);
    Thread.sleep(30000); // Wait for the application to launch
}

private static void interactWithApplication() {
    try {
    	System.out.println("Handling the Sync Message Box");
    	Thread.sleep(5000);
    	 driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    	Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		 WebElement ele = driver.findElement(By.name("Reports"));
		 ele.click();
		 Thread.sleep(1000);
		 
		 WebElement ele1 = driver.findElement(By.name("reportTypeCombo"));
		 ele1.click();
		 Thread.sleep(3000);
		 
		WebElement ele2 = driver.findElement(By.name("Daily Production Report"));
		ele2.click();
		Thread.sleep(5000);
		
		WebElement ele3 = driver.findElement(By.name("startCalender"));
		ele3.click();
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.name("June"));
		ele4.click();
		Thread.sleep(2000);
		WebElement ele5 = driver.findElement(By.name("May"));
		ele5.click();
		
		WebElement ele16 = driver.findElement(By.name("7"));
		ele16.click();
		
	//	WebElement ele6 = driver.findElement(By.name("2024"));
		//ele6.click();
	//	Thread.sleep(2000);
	//	ele6.sendKeys(Keys.ARROW_DOWN);
		
		WebElement ele7 = driver.findElement(By.name("OK"));
		ele7.click();
		
		
		WebElement ele8 = driver.findElement(By.name("endCalender"));
		ele8.click();
		Thread.sleep(2000);
		
		WebElement ele9 = driver.findElement(By.name("June"));
		ele9.click();
		Thread.sleep(2000);
		WebElement ele10 = driver.findElement(By.name("May"));
		ele10.click();
		
		//WebElement ele11 = driver.findElement(By.name("2024"));
		//ele11.click();
		//Thread.sleep(2000);
		//ele6.sendKeys("2023");
		
		WebElement ele17 = driver.findElement(By.name("7"));
		ele17.click();
		
		WebElement ele12 = driver.findElement(By.name("OK"));
		ele12.click();
		Thread.sleep(2000);
		
		WebElement ele13 = driver.findElement(By.name("fieldDropdown"));
		ele13.click();
		Thread.sleep(2000);
		WebElement ele14 = driver.findElement(By.name("Cambay"));
		ele14.click();
		Thread.sleep(2000);
		
		WebElement ele15 = driver.findElement(By.name("getReportButton"));
		ele15.click();
		
		Thread.sleep(2000);
		

		 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    } catch (org.openqa.selenium.NoSuchElementException e) {
        System.err.println("Element  not found");
        e.printStackTrace();
        // Handling the case when the element  not found
    } catch (Exception ex) {
        System.err.println("Exception occurred while interacting with the application");
        ex.printStackTrace();
        // Handle other exceptions
    }
}
}
