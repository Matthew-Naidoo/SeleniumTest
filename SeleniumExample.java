package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        //WebDriver is an interface provided by Selenium that defines a set of methods for interacting
        //with web browsers. It serves as a common interface for different browser implementations.
        //ChromeDriver is a class provided by the Selenium WebDriver library specifically for interacting
        //with the Chrome browser. It's an implementation of the WebDriver interface tailored for Chrome.
        //WebDriver driver: This line declares a variable named driver of type WebDriver.
        //new ChromeDriver(): This part creates a new instance of the ChromeDriver class and assigns it to
        //the driver variable.
        //It's like saying, "Create a Chrome browser window, and let me control it using the methods
        // provided by the WebDriver interface."
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.google.com");

        //Find an element by its name attribute
        //driver.findElement(By.name("q")):
        //driver: This is an instance of the WebDriver interface that represents the web browser
        // (in your case, it's assumed to be a Chrome browser).
        //findElement: This is a method provided by WebDriver to find a single element on the web page
        //based on a specified locator strategy.
        //By.name("q"): This is a By class method that specifies the locator strategy. In this case,
        //it's looking for an HTML element with the attribute name set to "q".

        //WebElement searchBox = ...:
        //WebElement: This is an interface provided by Selenium that represents an HTML element on the web page.
        //searchBox: This is a variable declaration. It's creating a variable named searchBox of type WebElement.
        //=: This is the assignment operator. It assigns the result of driver.findElement(By.name("q")) to the
        //searchBox variable.
        //So, the overall effect of this line is to locate an HTML element on the web page with the name
        //attribute set to "q" and store a reference to that element in the searchBox variable.
        //After this line, you can interact with the searchBox WebElement using various methods provided
        //by the WebElement interface, such as sending keys, clicking, etc.
        WebElement searchBox = driver.findElement(By.name("q"));

        // Perform actions on the element (type "Hello, Selenium!")
        searchBox.sendKeys("Hello, Selenium!");

        // Find the search button by its name attribute
        WebElement searchButton = driver.findElement(By.xpath("//*[@value='Google Search']"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on the search button
        searchButton.click();

        // Wait for a few seconds to see the results
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        //driver.quit();
    }
}
