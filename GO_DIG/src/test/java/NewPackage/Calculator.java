package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
Thread.sleep(2000);
		
		driver.findElement(By.name("Seven")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Five")).click();
		driver.findElement(By.name("Equals")).click();
	 
		Thread.sleep(2000);
		driver.findElement(By.id("Close")).click();
		

		
		
		
	}

}



