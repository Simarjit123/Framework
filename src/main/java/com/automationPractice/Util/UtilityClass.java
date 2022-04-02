package com.automationPractice.Util;

public class UtilityClass {
	public static void staticWait(long timeInMillisec) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
