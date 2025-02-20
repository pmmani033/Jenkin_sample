package com.array_programs;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_alllinksprint{

	public static void main(String[] args) throws InterruptedException, IOException {



		System.setProperty("webdriver.chrome.driver",
				"C:\\c101\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkchecker.com/");



		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotFile, new File("screenshot.png"));

		//print the broken links

		List<WebElement> fins = driver.findElements(By.tagName("a"));

		int count =0;

		for (WebElement element : fins) {

			String url = element.getAttribute("href");

			if(url==null || url.isEmpty()) {
				continue;
			}

			HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection(); // use this to print the broken links
			con.connect();

			if (con.getResponseCode()!=200) {

				System.out.println(url +" is broken links");
				count++;


			}

		}
		System.out.println("-------------------------------------------------");
		System.out.println("total count of the  broken links = "+ count);
		driver.quit();




		//JavascriptExecutor js =  (JavascriptExecutor) driver;
		//js.executeScript("window.scrollby(0,document.body.scrollheight)"); //bottom of the page height

		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", js);







	}


}
