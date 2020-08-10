package testeTOTVS.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory extends BasePage {

    private static WebDriver navegador;

    public static WebDriver getNavegador() {

        if (navegador == null) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\testeTOTVS\\core\\WebDrivers\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            navegador = new ChromeDriver(chromeOptions);
        }
        return navegador;
    }

    public static void quitNavegador() {
        navegador.quit();
    }

}
