package PAGES;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsPage {

    WebDriver driver=new ChromeDriver();

    public By sauceLabsBackpackItem=By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
    public By sauceLabsBikeLightItem=By.xpath("//div[text()=\"Sauce Labs Bike Light\"]");
    public By sauceLabsBoltTshirtItem=By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]");
    public By sauceLabsFleeceJacketItem=By.xpath("//div[text()=\"Sauce Labs Fleece Jacket\"]");
    public By sauceLabsOnesieItem=By.xpath("//div[text()=\"Sauce Labs Onesie\"]");
    public By sauceTestAllThingsItem=By.xpath("//div[text()=\"Test.allTheThings() T-Shirt (Red)\"]");

    public By twitterLogoButton=By.xpath("//a[text()=\"Twitter\"]");

    public By facebookLogoButton=By.xpath("//a[text()=\"Facebook\"]");

    public By linkedInLogoButton=By.xpath("//a[text()=\"LinkedIn\"]");

    public By facebookTextLogo=By.xpath("//*[text()=\"Facebook\"]");

    public By addToCartSauceLabsBackPack=By.id("add-to-cart-sauce-labs-backpack");
    public By addToCartSauceLabsBikeLight=By.id("add-to-cart-sauce-labs-bike-light");

    public By addToCartSauceLabsBoltTshirt=By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    public By addToCartSauceLabsFleeceJacket=By.id("add-to-cart-sauce-labs-fleece-jacket");

    public By addToCartSauceLabsOnesie=By.id("add-to-cart-sauce-labs-onesie");

    public By addToCartSauceTestAllThings=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public By cartIconButton=By.id("shopping_cart_container");

    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }






}
