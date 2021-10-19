package com.noorteck.qa.utils;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUI {
	
	public static WebDriver driver;

	/**
	 * This method takes 1 string parameter and opens the browser
	 * 
	 * @param browser
	 */

	public static void openBrowser(String browser) {

		try {
			switch (browser.toLowerCase()) {

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
		} catch (Exception e) {
			System.out.println("Browser has  [" + browser + "] value.Make sure to pass [chrome/ie/firefox]");
			e.printStackTrace();
		}

	}

	public static void openBrowserTWO(String browser) {
		String key = null;
		String path = null;

		try {
			switch (browser.toLowerCase()) {

			case "firefox":
				key = "webdriver.gecko.driver";
				path = "C:\\\\Users\\\\Crystal\\\\Desktop\\\\Selenium\\\\chromedriver.exe";

				System.setProperty(key, path);

				driver = new FirefoxDriver();

				break;
			case "ie":
				key = "webdriver.ie.driver";
				path = "C:\\\\Users\\\\Crystal\\\\Desktop\\\\Selenium\\\\chromedriver.exe";
				System.setProperty(key, path);
				driver = new InternetExplorerDriver();
				break;

			case "chrome":

				key = "webdriver.chrome.driver";
				path = "C:\\\\Users\\\\Crystal\\\\Desktop\\\\Selenium\\\\chromedriver.exe";
				System.setProperty(key, path);
				driver = new ChromeDriver();
			}
		} catch (Exception e) {
			System.out.println("Browser has  [" + browser + "] value.Make sure to pass [chrome/ie/firefox]");
			e.printStackTrace();
		}

	}

	/**
	 * This method takes 1 String parameter and it maximizes the browser, sets
	 * implicit wait and navigates to the page
	 * 
	 * @param url
	 */

	public static void navigate(String url) {

		try {
			driver.manage().window().maximize();
			// TODO come back and make the implicit wait time FINAL
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(url);

		} catch (Exception e) {

			System.out.println("Check the URL [" + url + "], make sure it contains proper format");
			e.printStackTrace();

		}
	}

	/**
	 * This method returns the title of the page
	 * 
	 * @return
	 */

	public static String getTitle() {
		try {

			return driver.getTitle();
		} catch (Exception e) {
			System.out.println("Driver instance is null");
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * This method takes 1 WebElement parameter and checks if the element is
	 * displayed/not
	 * 
	 * @param element
	 * @return
	 */

	public static boolean isDisplayed(WebElement element) {

		try {
			return element.isDisplayed();

		} catch (NoSuchElementException e) {
			System.out.println("Element does not exists: " + element);
			e.printStackTrace();

			return false;
		}
	}

	/**
	 * This method takes 1 WebElement parameter and checks if the element is
	 * selected/not
	 * 
	 * @param element
	 * @return
	 */

	public static boolean isSelected(WebElement element) {

		try {
			return element.isSelected();

		} catch (NoSuchElementException e) {
			System.out.println("Element does not exists: " + element);
			e.printStackTrace();

			return false;
		}
	}

	/**
	 * This method takes 1 WebElement parameter and checks if the element is
	 * selected/not
	 * 
	 * @param element
	 * @return
	 */

	public static boolean isEnabled(WebElement element) {

		try {
			return element.isEnabled();

		} catch (NoSuchElementException e) {
			System.out.println("Element does not exists: " + element);
			e.printStackTrace();

			return false;
		}
	}

	/**
	 * This method takes 1 WebElement parameter and checks if the elements is
	 * displayed then performs click action if the element is displayed
	 * 
	 * @param element
	 */

	public static void click(WebElement element) {

		if (isDisplayed(element)) {
			element.click();
		}

	}

	/**
	 * This method takes 2paramets , WebElement parameter 1 boolean and checks if
	 * the elements is selected then performs click action if the element is is not
	 * select
	 * 
	 * @param element
	 */
	public static void click(WebElement element, boolean isCheckboxSelected) {

		if (isCheckboxSelected == false) {
			element.click();
		}
	}

	/**
	 * This methods takes 1 parameter and returns the text displayed on UI
	 * 
	 * @param element
	 * @return
	 */
	public static String getText(WebElement element) {
		String text = null;

		if (isDisplayed(element)) {
			text = element.getText();
		}

		return text;
	}

	/**
	 * This method takes 2 parameters and it clear the value then enters into the
	 * texts field
	 * 
	 * @param element
	 * @param value
	 */

	public static void enter(WebElement element, String value) {

		if (isDisplayed(element)) {
			element.clear();
			element.sendKeys(value);
		}

	}

}
