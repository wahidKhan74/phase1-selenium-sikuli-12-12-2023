package com.simplilearn.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 * Selenium + Sikuli to automate upload document.
 * @author khanw
 *
 */
public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		

		// step1: formulate a test domain url & driver path
		String siteUrl = "file:///C:/WaheedTraining/phase1-selenium-sikuli-12-12-2023/static/upload-docs.html";
		String driverPath = "drivers/windows/chromedriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		String inputFiePath="C:\\WaheedTraining\\phase1-selenium-sikuli-12-12-2023\\sikuli-inputs\\";
		WebDriver driver = new ChromeDriver();
		Screen screen = new Screen();
		
		Pattern pattern = new Pattern(inputFiePath+ "choose-file.png");
		Pattern fileInput = new Pattern(inputFiePath+ "file-text-box.png");
		Pattern openButton = new Pattern(inputFiePath+ "open-button.png");
		
		// make browser window full screen
		driver.manage().window().maximize();
		// step4: launch browser
		driver.get(siteUrl);
		
		Thread.sleep(2000);
		
		screen.click(pattern);
		
		Thread.sleep(2000);
		
		screen.click(fileInput);
		
		screen.type(fileInput, (inputFiePath + "amazon-tv.png") );
		
		Thread.sleep(2000);
		
		screen.click(openButton);
		
		
		
		// step6: close driver
		// driver.close();
	}
}
