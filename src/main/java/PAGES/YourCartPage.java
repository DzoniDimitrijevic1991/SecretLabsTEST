package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourCartPage {

    WebDriver driver=new ChromeDriver();


    public By checkoutButton= By.id("checkout");

    public By removeItemButton=By.xpath("//button[text()=\"Remove\"]");

    public By continueShoppingButton=By.xpath("//button[@data-test=\"remove-sauce-labs-backpack\"]");

    public By sauceLabsBackPackItem=By.xpath("//div[text()=\"Sauce Labs Backpack\"]");

    public By removeBackPack=By.id("remove-sauce-labs-backpack");

    public By removeFleeceJacket=By.id("remove-sauce-labs-fleece-jacket");

    public By sauceLabsFleeceJacketItem=By.xpath("//div[text()=\"Sauce Labs Fleece Jacket\"]");

    public By priceForItemOne=By.xpath("//div[text()=\"29.99\"]");

    public By priceForItemTwo=By.xpath("//div[text()=\"49.99\"]");

    public double priceForSauceLabsBackPack=29.99;
    public double priceForSauceLabsFleeceJacket=49.99;










    public YourCartPage(WebDriver driver){
        this.driver=driver;
    }



}
