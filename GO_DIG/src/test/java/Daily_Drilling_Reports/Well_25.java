package Daily_Drilling_Reports;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import NewPackage.ScreenRecorderUtil;


public class Well_25 {
    private static WiniumDriver driver = null;

    public static void main(String[] args) throws Exception {
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
        Thread.sleep(10000); // Wait for the server to start
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
    		
    	
    		
    		System.out.println("selecting Well from the well Dropdown");
    		 WebElement ele = driver.findElement(By.name("wellDropdown"));
    		 ele.click();
    		 
    		 Thread.sleep(5000);
    		driver.findElement(By.name("AL-2")).click();
    	       
    		
    		


    		 
    		 
            System.out.println("Finding element 'Data Upload' by name");
            WebElement ele2 = driver.findElement(By.name("   Data Upload   "));
            System.out.println("Element 'Data Upload' found by name");
            ele2.click();
            Thread.sleep(3000);
            System.out.println("Clicked on 'Data Upload'");
          
            act.moveByOffset(0, 65).perform();
           
           
            act.moveByOffset(40, 0).perform();
         Thread.sleep(5000);
            
            
            WebElement ele1 = driver.findElement(By.name("Daily Drilling Report"));
            ele1.click();
            System.out.println("Clicked on Daily Drilling Report");
           
        	
        	
        	
        	
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

