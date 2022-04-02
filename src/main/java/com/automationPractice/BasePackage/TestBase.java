package com.automationPractice.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver wd;
	public static Properties prop;
	public FileInputStream file;

	public TestBase() {
		try {
			prop = new Properties();
			file = new FileInputStream(
					"C:\\Users\\jdjas\\eclipse-workspace\\FrameworkConcept\\src\\main\\java\\com\\automationPractice\\config\\configration.properties");
			prop.load(file);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			wd = new EdgeDriver();
			break;

		default:
			System.out.println("You are not passing the correct browser name!!!!!");
			break;
		}

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// Load the Page
		wd.get(prop.getProperty("URL"));

	}

	public void tearDown() {
		wd.quit();
	}

}
