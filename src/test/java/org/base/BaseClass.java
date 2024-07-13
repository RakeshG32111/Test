package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;

	public static void launchDriver(String browserName) throws Exception {

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Enter Valid browser Name");
		}

	}

	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void elementVisibility(WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(e));
	}

	public static void elementSendkeys(WebElement element, String value) {
		try {
			elementVisibility(element);
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void elementClick(WebElement element) {
		try {
			elementVisibility(element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
