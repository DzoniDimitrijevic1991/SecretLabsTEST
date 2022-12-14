import PAGES.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class SuccessfulProductPurchaseTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        login.validLogIn();
    }

    @Test
    public void purchaseProductTest() throws InterruptedException {
        driver.findElement(productpage.addToCartSauceLabsBackPack).click();
        driver.findElement(productpage.cartIconButton).click();
        driver.findElement(yourcart.checkoutButton).click();
        infopage.validLogIn();
        driver.findElement(infopage.continueButton).click();
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(overviewpage.finishPurchaseButton).click();
        driver.findElement(completePage.thankYouForOrderMessage).getText();
        String expectedTextAfterSuscessfulPurchase="CHECKOUT: COMPLETE!";
        String realTextAfterSuscessfulPurchase=driver.findElement(completePage.checkoutCompleteText).getText();
        Assert.assertTrue("neuspesna kupovina",expectedTextAfterSuscessfulPurchase.equals(realTextAfterSuscessfulPurchase));
    }
}
