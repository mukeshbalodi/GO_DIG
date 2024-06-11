package DailyProductionReports;

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


public class Deen_Dayal_West {
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
        Thread.sleep(5000); // Wait for the server to start
    }

    private static void launchApplication() throws MalformedURLException, InterruptedException {
        // Define the desktop options for Winium
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Users\\Administrator\\Desktop\\GoDig_Exe\\main.exe");

        // Create a new WiniumDriver instance
        System.out.println("Launching Application");
        driver = new WiniumDriver(new URL("http://localhost:9999"), option);
      
   

        
        Thread.sleep(40000);
        
        
        
        
        // Wait for the application to launch
    }

    private static void interactWithApplication() {
        try {
        	System.out.println("Handling the Sync Message Box");
        	Thread.sleep(5000);
        	 driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        	Actions act= new Actions(driver);
    		act.sendKeys(Keys.ENTER).perform();
    		
    	
    		
    		System.out.println("selecting field from the Field Dropdown");
    		 WebElement ele = driver.findElement(By.name("fieldDropdown"));
    		 ele.click();
    		 Thread.sleep(3000);
    		
    		
    		  		 
    		 WebElement ele3 = driver.findElement(By.name("Deen Dayal West"));
             ele3.click();
    		 
    		 
    		 
            System.out.println("Finding element 'Data Upload' by name");
            WebElement ele2 = driver.findElement(By.name("   Data Upload   "));
            System.out.println("Element 'Data Upload' found by name");
            ele2.click();
            Thread.sleep(3000);
            System.out.println("Clicked on 'Data Upload'");
          
            act.moveByOffset(0, 85).perform();
           
           
            act.moveByOffset(40, 0).perform();
         Thread.sleep(5000);
            
            
            WebElement ele1 = driver.findElement(By.name("Daily Production Report"));
            ele1.click();
            System.out.println("Clicked on Daily Production Report");
            // Wait for PRODUCTION element to be clickable
            
          
          
          
          //Handle the table to send data
          	driver.findElement(By.name("PRODUCTION")).click();
          	System.out.println("clicked on element PRODUCTION");
          	Actions act1 = new Actions(driver);
          	act1.moveByOffset(70,0).click().perform();
          	act1.sendKeys("9").build().perform();
          	act1.sendKeys("4").build().perform();
          	act1.sendKeys("3").build().perform();
          	act1.sendKeys("5").build().perform();
          
          	act1.sendKeys(".").build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();

          	act1.moveByOffset(95,0).click().perform();
          	act1.sendKeys("6").build().perform();
          	act1.sendKeys("6").build().perform();
          	act1.sendKeys("7").build().perform();
          	act1.sendKeys("8").build().perform();
          	
          	act1.sendKeys(".").build().perform();
         	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	
        	act1.moveByOffset(96,0).click().perform();
          	act1.sendKeys("1").build().perform();
          	act1.sendKeys("1").build().perform();
          	act1.sendKeys("4").build().perform();
          	act1.sendKeys("5").build().perform();
        	act1.sendKeys(".").build().perform();
         	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	
          	
        	act1.moveByOffset(97,0).click().perform();
          	act1.sendKeys("2").build().perform();
          	act1.sendKeys("9").build().perform();
          	act1.sendKeys("0").build().perform();
          	act1.sendKeys("9").build().perform();
          	act1.sendKeys("1").build().perform();
          	act1.sendKeys(".").build().perform();

          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	
        	act1.moveByOffset(98,0).click().perform();
          	act1.sendKeys("5").build().perform();
          	act1.sendKeys("8").build().perform();
            act1.sendKeys(".").build().perform();
            act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	
          	driver.findElement(By.name("CONSUMPTION")).click();
          	System.out.println("clicked on element CONSUMPTION");
          	Actions act2 = new Actions(driver);
        	act2.moveByOffset(70,0).click().perform();
          	act2.sendKeys("0").build().perform();
          	act2.sendKeys(".").build().perform();
          	act2.sendKeys("0").build().perform();
          	
          	act2.moveByOffset(95,0).click().perform();
          	act2.sendKeys("3").build().perform();
        	act2.sendKeys("4").build().perform();
        	act2.sendKeys("4").build().perform();
          	act2.sendKeys(".").build().perform();
            act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	
        	act2.moveByOffset(96,0).click().perform();
           
        	
        	act1.sendKeys("0").build().perform();
        	act1.sendKeys(".").build().perform();
        	act1.sendKeys("0").build().perform();
        	
          	
          	act2.moveByOffset(97,0).click().perform();
          	act1.sendKeys("2").build().perform();
          	act1.sendKeys("7").build().perform();
          	
          	act1.sendKeys(".").build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
          	act1.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
         
          	
          	

        	act2.moveByOffset(98,0).click().perform();
        	act2.sendKeys("0").build().perform();
        	act2.sendKeys(".").build().perform();
        	act2.sendKeys("0").build().perform();

        	driver.findElement(By.name("SAVED")).click();
        	System.out.println("Clicked on element SAVED ");
          	Actions act3 = new Actions(driver);
          	act3.moveByOffset(70,0).click().perform();
        	act3.sendKeys("9").build().perform();
        	
        	act3.sendKeys(".").build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act3.moveByOffset(95,0).click().perform();
        	act3.sendKeys("6").build().perform();
        	act1.sendKeys("5").build().perform();
        	
        	
        	act3.sendKeys(".").build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act3.moveByOffset(96,0).click().perform();
        	act3.sendKeys("1").build().perform();
        	act1.sendKeys("8").build().perform();
        	act3.sendKeys(".").build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	
        	
        	act3.moveByOffset(97,0).click().perform();
        	act3.sendKeys("2").build().perform();
        	
        	act1.sendKeys("3").build().perform();
        	
        	act2.sendKeys(".").build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act3.moveByOffset(98,0).click().perform();
        	act3.sendKeys("5").build().perform();
        	act2.sendKeys("8").build().perform();
        	act2.sendKeys(".").build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act3.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	
        	
        	
        	driver.findElement(By.name("SALE_DESPATCH")).click();
        	System.out.println("Clicked on the element SALE_DESPATCH");
        	Actions act4 = new Actions(driver);
        	act4.moveByOffset(70,0).click().perform();
        	act4.sendKeys("7").build().perform();act4.sendKeys("0").build().perform();act4.sendKeys("6").build().perform();act4.sendKeys("5").build().perform();
        	
        	act4.sendKeys(".").build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act4.moveByOffset(95,0).click().perform();
        	act4.sendKeys("5").build().perform();act4.sendKeys("1").build().perform();act4.sendKeys("5").build().perform();
        	act1.sendKeys("6").build().perform();
        	
        	act4.sendKeys(".").build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	
        	act4.moveByOffset(96,0).click().perform();
        	act4.sendKeys("9").build().perform();act4.sendKeys("6").build().perform();act4.sendKeys("8").build().perform();act1.sendKeys(".").build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act4.moveByOffset(97,0).click().perform();
        	act4.sendKeys("2").build().perform();act4.sendKeys("5").build().perform();act4.sendKeys("6").build().perform();
        	act1.sendKeys("2").build().perform();
        	
        	
        	act4.sendKeys(".").build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act4.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act4.moveByOffset(98,0).click().perform();
        	act4.sendKeys("0").build().perform();act1.sendKeys(".").build().perform();
            act2.sendKeys("0").build().perform();
        	
        	driver.findElement(By.name("RE-INJECTION")).click();
        	System.out.println("Clicked on the element RE-INJECTION");
        	Actions act5 = new Actions(driver);
        	act5.moveByOffset(70,0).click().perform();
        	act5.sendKeys("0").build().perform();act5.sendKeys(".").build().perform();act5.sendKeys("0").build().perform();
        	
        	act5.moveByOffset(95,0).click().perform();
        	act5.sendKeys("0").build().perform();act5.sendKeys(".").build().perform();act5.sendKeys("0").build().perform();

        	act5.moveByOffset(96,0).click().perform();
        	act5.sendKeys("0").build().perform();act5.sendKeys(".").build().perform();act5.sendKeys("0").build().perform();

        	act5.moveByOffset(97,0).click().perform();
        	act5.sendKeys("0").build().perform();act5.sendKeys(".").build().perform();act5.sendKeys("0").build().perform();

        	act5.moveByOffset(98,0).click().perform();
        	act5.sendKeys("0").build().perform();act5.sendKeys(".").build().perform();act5.sendKeys("0").build().perform();

        	driver.findElement(By.name("FLARE")).click();
        	System.out.println("Clicked on the element FLARE");
        	Actions act6 = new Actions(driver);
        	act6.moveByOffset(70,0).click().perform();
        	act6.sendKeys("0").build().perform();act6.sendKeys(".").build().perform();act6.sendKeys("0").build().perform();
        	
        	act6.moveByOffset(95,0).click().perform();
        	act6.sendKeys("0").build().perform();act6.sendKeys(".").build().perform();act6.sendKeys("0").build().perform();

        	act6.moveByOffset(96,0).click().perform();
        	act6.sendKeys("0").build().perform();act6.sendKeys(".").build().perform();act6.sendKeys("0").build().perform();

        	act6.moveByOffset(97,0).click().perform();
        	act6.sendKeys("0").build().perform();act6.sendKeys(".").build().perform();act6.sendKeys("0").build().perform();

        	act6.moveByOffset(98,0).click().perform();
        	act6.sendKeys("0").build().perform();act6.sendKeys(".").build().perform();act6.sendKeys("0").build().perform();

        	driver.findElement(By.name("NORMAL LOSS")).click();
        	System.out.println("clicked on the element NORMAL LOSS");
        	Actions act7 = new Actions(driver);
        	act7.moveByOffset(70, 0).click().perform();
        	act7.sendKeys("0").build().perform();act7.sendKeys(".").build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act7.moveByOffset(95, 0).click().perform();
        	act7.sendKeys("6").build().perform();act1.sendKeys(".").build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act7.moveByOffset(96, 0).click().perform();
        	act7.sendKeys("1").build().perform();act7.sendKeys(".").build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act7.moveByOffset(97, 0).click().perform();
        	act7.sendKeys("2").build().perform();
        	act7.sendKeys("9").build().perform();
        	
        	act1.sendKeys(".").build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act7.moveByOffset(98,0).click().perform();
        	act7.sendKeys("0").build().perform();act7.sendKeys(".").build().perform();
        	act7.sendKeys("0").build().perform();
        	act7.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	
        	driver.findElement(By.name("ABNORMAL LOSS")).click();
        	System.out.println("Clicked on the element ABNORMAL LOSS");
        	Actions act8 = new Actions(driver);
        	act8.moveByOffset(70, 0).click().perform();
        	act1.sendKeys("0").build().perform();act7.sendKeys(".").build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act8.moveByOffset(95, 0).click().perform();
        	act8.sendKeys("6").build().perform();act8.sendKeys(".").build().perform(); 
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act8.moveByOffset(96, 0).click().perform();
        	act8.sendKeys("1").build().perform();act8.sendKeys(".").build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	
        	act8.moveByOffset(97, 0).click().perform();
        	act8.sendKeys("2").build().perform();act7.sendKeys("9").build().perform();act1.sendKeys(".").build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();
        	
        	act8.moveByOffset(98,0).click().perform();
        	act8.sendKeys("0").build().perform();act8.sendKeys(".").build().perform();act8.sendKeys("0").build().perform();
        	act8.sendKeys(Integer.toString(generateRandomNumber())).build().perform();

        	Thread.sleep(3000);
        	//driver.findElement(By.name("Preview")).click();
        	driver.findElement(By.name("Submit")).click();
        	System.out.println("Report Submitted successfully");
        
        	
        	
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

   

		
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

	}


