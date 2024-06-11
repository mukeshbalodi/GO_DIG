package NewPackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class test_CSV {

    public static void main(String[] args) throws CsvValidationException, IOException, InterruptedException {
        
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); 
        
        // Set Chrome options
        ChromeOptions options = new ChromeOptions();
       
        WebDriver driver = new ChromeDriver(options);

        //String baseurl = "https://www.facebook.com/";
        //String CSV_file = "C:\\Users\\Administrator\\Desktop\\TEST_CSV.csv"; 

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

       // CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Administrator\\Desktop\\TEST_CSV.csv"));
       // String[] cell;

     //   while ((cell = reader.readNext()) != null) {
      //      String email = cell[0];
       //     String password = cell[1];

            driver.findElement(By.id("email")).sendKeys("email");
            driver.findElement(By.id("pass")).sendKeys("password");
            driver.findElement(By.name("login")).click();
            Thread.sleep(5000);
            
        }

       // reader.close();
        
    
}
