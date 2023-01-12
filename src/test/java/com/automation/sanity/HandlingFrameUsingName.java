package com.automation.sanity;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlingFrameUsingName extends MultipleBrowser{

	@Test
	public void handlingFrames() {

		// Frame Names
		String packageListFrame = "packageListFrame";
		String packageFrame = "packageFrame";
		String classFrame = "classFrame";
		
		// Activate the list frame
		driver.switchTo().frame(packageListFrame);
		
		// click on selenium chrome link
		driver.findElement(By.xpath("/html/body/main/ul/li[5]/a")).click();
		System.out.println("Selenium Chrome Link is clicked");
		
		// Mandatory step  - switch back to default content position
		driver.switchTo().defaultContent();
		
		// Activate the package Frame
		driver.switchTo().frame(packageFrame);
		
		// Click on Chrome Option link
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[7]/a")).click();
		System.out.println("Chrome Option Link is Clicked");
		
		
		// write code to activate class frame
		driver.switchTo().defaultContent();
		
		// Activate the class frame
		driver.switchTo().frame(classFrame);
		
		// click on help link
		driver.findElement(By.linkText("HELP")).click();
		System.out.println("Help link is clicked");

	}
	
}
