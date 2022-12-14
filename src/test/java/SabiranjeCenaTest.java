import PAGES.LogInPage;
import PAGES.ProductsPage;
import PAGES.YourCartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SabiranjeCenaTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void sabiranjeCenaTest() {
        login.validLogIn();
        driver.findElement(productpage.addToCartSauceLabsBackPack).click();
        driver.findElement(productpage.addToCartSauceLabsFleeceJacket).click();
        driver.findElement(productpage.cartIconButton).click();
        double itemOnePrice= yourcart.priceForSauceLabsBackPack;
        double itemTwoPrice= yourcart.priceForSauceLabsFleeceJacket;
        double expectedOnePlusTwoPrice= itemOnePrice + itemTwoPrice;
        System.out.println(expectedOnePlusTwoPrice);

    }
}
