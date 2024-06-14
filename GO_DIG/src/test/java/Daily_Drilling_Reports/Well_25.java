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
        Thread.sleep(5000); // Wait for the server to start
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
            Actions act = new Actions(driver);
            act.sendKeys(Keys.ENTER).perform();

            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.name("wellDropdown")));
            dropdown.click();

            Robot robot = new Robot();
            for (int i = 1; i <= 23; i++) {
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

            driver.findElement(By.name("Maximize")).click();
            driver.findElement(By.name("projectLineEdit")).sendKeys("Software Demo");

            driver.findElement(By.name("daySupervisorLineEdit")).sendKeys("Sanjiv Deori");
            driver.findElement(By.name("nightSupervisorLineEdit")).sendKeys("Rajeev Ranjan Sinha");
            driver.findElement(By.name("hseEngineerLineEdit")).sendKeys("C.S.Chundawat");
            driver.findElement(By.name("mudSupervisorLineEdit")).sendKeys("M.L.Bishnoi");
            driver.findElement(By.name("logistincSupervisorLineEdit")).sendKeys("Jagdish Duvvuru");
            Thread.sleep(5000);

            driver.findElement(By.name("Time Breakdown")).click();
            Thread.sleep(2000);

            driver.findElement(By.name("endTimeEdit_0_0")).click();
            robot.keyPress(8); // backspace key
            robot.keyRelease(8);
            robot.keyPress(8);
            robot.keyRelease(8);

            robot.keyPress(51); // press 3
            robot.keyRelease(51);

            robot.keyPress(48); // press 0
            robot.keyRelease(48);

            robot.keyPress(37); // press left key
            robot.keyRelease(37);
            robot.keyPress(37);
            robot.keyRelease(37);
            robot.keyPress(37);
            robot.keyRelease(37);

            robot.keyPress(8); // press backspace key
            robot.keyRelease(8);
            robot.keyPress(8);
            robot.keyRelease(8);

            robot.keyPress(48); // press 0
            robot.keyRelease(48);
            robot.keyPress(54); // press 6
            robot.keyRelease(54);
            Thread.sleep(2000);

            driver.findElement(By.name("mdFromLineEdit_0_0")).sendKeys("1300");
            driver.findElement(By.name("mdToLineEdit_0_0")).sendKeys("1300");

            driver.findElement(By.name("actCodeDropDown_0_0")).click();
            Thread.sleep(2000);
            driver.findElement(By.name("BHA")).click();
            driver.findElement(By.name("remarkLineEdit_0_0")).sendKeys("Activity1");

            // new activity start
            driver.findElement(By.name("addTimeBreakDownBtn")).click();
            driver.findElement(By.name("endTimeEdit_0_1")).click();

            robot.keyPress(8); // backspace key
            robot.keyRelease(8);
            robot.keyPress(8);
            robot.keyRelease(8);

            robot.keyPress(51); // press 3
            robot.keyRelease(51);

            robot.keyPress(48); // press 0
            robot.keyRelease(48);

            robot.keyPress(37); // press left key
            robot.keyRelease(37);
            robot.keyPress(37);
            robot.keyRelease(37);
            robot.keyPress(37);
            robot.keyRelease(37);

            robot.keyPress(8); // press backspace key
            robot.keyRelease(8);
            robot.keyPress(8);
            robot.keyRelease(8);

            robot.keyPress(48); // press 0
            robot.keyRelease(48);
            robot.keyPress(55); // press 7
            robot.keyRelease(55);
            Thread.sleep(2000);

            driver.findElement(By.name("mdToLineEdit_0_1")).sendKeys("1300");
            driver.findElement(By.name("actCodeDropDown_0_1")).click();
            Thread.sleep(2000);

            driver.findElement(By.name("CIH")).click();
            driver.findElement(By.name("remarkLineEdit_0_1")).sendKeys("Activity2");

            // new activity start
            driver.findElement(By.name("addTimeBreakDownBtn")).click();
            driver.findElement(By.name("endTimeEdit_0_2")).click();

            robot.keyPress(8); // backspace key
            robot.keyRelease(8);
            robot.keyPress(8);
            robot.keyRelease(8);

            robot.keyPress(51); // press 3
            robot.keyRelease(51);

            robot.keyPress(48); // press 0
            robot.keyRelease(48);

            robot.keyPress(37); // press left key
            robot.keyRelease(37);
            robot.keyPress(37);
            robot.keyRelease(37);
            robot.keyPress(37);
            robot.keyRelease(37);

            robot.keyPress(8); // press backspace key
            robot.keyRelease(8);
            robot.keyPress(8);
            robot.keyRelease(8);

            robot.keyPress(48); // press 0
            robot.keyRelease(48);
            robot.keyPress(57); // press 9
            robot.keyRelease(57);
            Thread.sleep(2000);

            driver.findElement(By.name("mdToLineEdit_0_2")).sendKeys("1300");
            driver.findElement(By.name("actCodeDropDown_0_2")).click();
            Thread.sleep(2000);

            driver.findElement(By.name("CIC")).click();
            driver.findElement(By.name("remarkLineEdit_0_2")).sendKeys("Activity3");

            driver.findElement(By.name("Bits & BHA")).click();
            System.out.println("clicked on Bits & BHA Tab");

            String BitsBHA = "C:\\Users\\Administrator\\Desktop\\Well_Activity\\Well-18 enter data to well26_Completed\\Bhandut-6 bitrecs.csv";
            CSVReader reader = new CSVReader(new FileReader(BitsBHA));

            // Skip the first four rows
            for (int i = 0; i < 4; i++) {
                reader.readNext();
            }

            String[] cell;
            while ((cell = reader.readNext()) != null) {
               
                if (cell.length >= 30) { 
                    String wobMinLineEdit = cell[22];
                    String rpmMinLineEdit = cell[23];
                    String pumpLineEdit = cell[26];
                    String gpmLineEdit = cell[25];
                    String classLineEdit = cell[5];
                    String wobMaxLineEdit = cell[24];
                    String rpmMaxLineEdit = cell[22];
                    
                    
                    
                    
                    
                    
                    
                    driver.findElement(By.name("wobMinLineEdit")).sendKeys(wobMinLineEdit);
                    driver.findElement(By.name("rpmMinLineEdit")).sendKeys(rpmMinLineEdit);
                    driver.findElement(By.name("pumpLineEdit")).sendKeys(pumpLineEdit);
                    driver.findElement(By.name("gpmLineEdit")).sendKeys(gpmLineEdit);
                    driver.findElement(By.name("classLineEdit")).sendKeys(classLineEdit);
                    driver.findElement(By.name("wobMaxLineEdit")).sendKeys(wobMaxLineEdit);
                    driver.findElement(By.name("rpmMaxLineEdit")).sendKeys(rpmMaxLineEdit);
                    driver.findElement(By.name("bitNoLineEdit1")).sendKeys("4");
                    driver.findElement(By.name("sizeLineEdit1")).sendKeys("8.5");
                    driver.findElement(By.name("typeLineEdit1")).sendKeys("MXC1");
                    driver.findElement(By.name("iadcLineEdit1")).sendKeys("117");
                    driver.findElement(By.name("serialLineEdit1")).sendKeys("6019650");
                    driver.findElement(By.name("metersLineEdit1")).sendKeys("128");
                    driver.findElement(By.name("drillHrsLineEdit1")).sendKeys("23");
                    driver.findElement(By.name("ropLineEdit1")).sendKeys("5.6");
                    driver.findElement(By.name("jetsLineEdit1")).sendKeys("4");
                    driver.findElement(By.name("runNoLineEdit1")).sendKeys("4");
                    driver.findElement(By.name("bitjetLineEdit1")).sendKeys("18");
                    driver.findElement(By.name("bitjetLineEdit2")).sendKeys("18");
                    driver.findElement(By.name("bitjetLineEdit3")).sendKeys("18");
                    driver.findElement(By.name("bitjetLineEdit4")).sendKeys("16");
                }
            }

            reader.close();

            driver.findElement(By.name("Survey")).click();
            driver.findElement(By.name("surveyTypeLineEdit_0")).sendKeys("TOT");
            driver.findElement(By.name("surveyDifinitiveLineEdit_0")).sendKeys("1");
            driver.findElement(By.name("surveyMdLineEdit_0")).sendKeys("1300");
            driver.findElement(By.name("surveyTvdLineEdit_0")).sendKeys("1295.36");
            driver.findElement(By.name("surveyIncLineEdit_0")).sendKeys("0.5");
            driver.findElement(By.name("surveyAziLineEdit_0")).sendKeys("0");

            driver.findElement(By.name("Mud Details")).click();
            driver.findElement(By.name("mudMDLineEdit_0")).sendKeys("1300");
            driver.findElement(By.name("mudTvdrtLineEdit_0")).sendKeys("1299.8");
            driver.findElement(By.name("mudTypeLineEdit_0")).sendKeys("W");
            driver.findElement(By.name("mudWeightLineEdit_0")).sendKeys("11.51");
            driver.findElement(By.name("mudFVisLineEdit_0")).sendKeys("51");
            driver.findElement(By.name("mudPvLineEdit_0")).sendKeys("27");

        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.err.println("Element not found");
            e.printStackTrace();
        } catch (Exception ex) {
            System.err.println("Exception occurred while interacting with the application");
            ex.printStackTrace();
            // Handle other exceptions
        }
    }
}
