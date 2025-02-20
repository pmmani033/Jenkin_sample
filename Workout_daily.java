package com.array_programs;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Workout_daily {
	
	

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\c101\\chromedriver.exe");
        WebDriverManager.chromedriver().setup(); // Auto-manages ChromeDriver
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.get("https://demo.automationtesting.in/Slider.html");






		/*
		 * String random = RandomStringUtils.randomAlphanumeric(30); String strr=
		 * random.replace("",""); String str1 = strr.substring(0, 6);
		 * System.out.println(str1);
		 * 
		 * 
		 * 
		 * String str = "12345MANI";
		 * 
		 * // Using StringBuilder to store separated values StringBuilder alphabets =
		 * new StringBuilder(); StringBuilder numbers = new StringBuilder();
		 * 
		 * for (char ch :str.toCharArray()) {
		 * 
		 * if(Character.isDigit(ch)) { numbers.append(ch); }else
		 * if(Character.isLetter(ch)){ alphabets.append(ch); }
		 * 
		 * }
		 * 
		 * // Print results System.out.println("Alphabets: " + alphabets);
		 * System.out.println("Numbers: " + numbers);
		 */









	}

}
