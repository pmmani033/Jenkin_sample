package com.array_programs;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Workout_daily {
	
	

	@Test 
       public void openAutomationTestingPage() {
        WebDriverManager.chromedriver().setup(); // Auto-manages ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Open the target URL
        driver.get("https://demo.automationtesting.in/Register.html");
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.get("https://demo.automationtesting.in/Slider.html");






		









	}

}
