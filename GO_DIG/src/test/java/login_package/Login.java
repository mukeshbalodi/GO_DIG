package login_package;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import NewPackage.ScreenRecorderUtil;

public class Login {
    
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
    		 System.out.println("Login window open");
    		 WebDriverWait wait = new WebDriverWait(driver, 40);       
            // Wait until the element with name "enterUserID" is present
            WebElement userIdField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("enterUserID")));
            System.out.println("UserID field found");
            userIdField.sendKeys("admin@enquest.co.in");
            System.out.println("UserID entered");
       

        Thread.sleep(2000); 

       
            WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("enterPassword")));
            System.out.println("Password field found");
            passwordField.sendKeys("1234");
            System.out.println("Password entered");

       

        Thread.sleep(2000);

       
            WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("loginButton")));
            System.out.println("Login button found");
            loginButton.click();
            System.out.println("Clicked on Login Button");
            System.out.println("loading window running");
            Thread.sleep(37000);
            System.out.println("Dashboard opened");
            Thread.sleep(7000);
   		 	WebDriverWait wait1 = new WebDriverWait(driver, 40);       
            WebElement logoutButton = wait1.until(ExpectedConditions.presenceOfElementLocated(By.name("logoutButton")));
            logoutButton.click();
            System.out.println("clicked on Logout Button");

        //Thread.sleep(50000);
    	  } catch (org.openqa.selenium.NoSuchElementException e) {
              System.err.println("Element  not found");
              e.printStackTrace();
        // Reduced wait time for demonstration
    }
    	 catch (Exception ex) {
             System.err.println("Exception occurred while interacting with the application");
             ex.printStackTrace();
             // Handle other exceptions
         }
    }  	 
}
