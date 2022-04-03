package com.automationPractice.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automationPractice.BasePackage.TestBase;

public class Utils extends TestBase {

	public static int IMPLICIT_WAIT = 20;
	public static int PAGE_LOAD_TIMEOUT = 30;

	public static String generateRandomEmail() {

		String email = RandomStringUtils.randomNumeric(3);

		String emailID = "simar" + email + "@gmail.com";

		return emailID;

	}

	public static String generateRandomPassword() {

		String randomStringForPassword = RandomStringUtils.randomNumeric(3);

		String password = "Manager@" + randomStringForPassword;

		return password;

	}

	public static void takeScreenShotOfFailedTestCase(String nameOfTestCase) {

		// Format the current time in my system
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		// Capturing the screen shot
		File file = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file,
					new File("./FailedScreenShot\\" + "_" + nameOfTestCase + "_" + timeStamp + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void staticWait(long timeInMillisec) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	}

