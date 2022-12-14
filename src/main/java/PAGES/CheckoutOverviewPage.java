package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutOverviewPage {

    WebDriver driver=new ChromeDriver();

    public By finishPurchaseButton=By.cssSelector("button[data-test=\"finish\"]");


    public CheckoutOverviewPage(WebDriver driver){
        this.driver=driver;
    }






}
