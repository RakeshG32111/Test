package org.step;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass{


	@Before
	public void beforeScenario() throws Exception {
		launchDriver("Chrome");
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			
			TakesScreenshot tk = (TakesScreenshot) driver;
			
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(screenshotAs, "image.png", "Screenshot");
		}
	}
}
