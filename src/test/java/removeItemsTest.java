import PAGES.LogInPage;
import PAGES.ProductsPage;
import PAGES.YourCartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class removeItemsTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        login.validLogIn();
    }


    @Test
    public void removeItemTest() {
        driver.findElement(productpage.addToCartSauceLabsBackPack).click();
        driver.findElement(productpage.addToCartSauceLabsFleeceJacket).click();
        driver.findElement(productpage.cartIconButton).click();
        String itemOne = driver.findElement(yourcart.sauceLabsBackPackItem).getText();
        String expectedItemOneText="";
        String itemTwo = driver.findElement(yourcart.sauceLabsFleeceJacketItem).getText();
        String expectedItemTwoText="";
        driver.findElement(yourcart.removeBackPack).click();
        driver.findElement(yourcart.removeFleeceJacket).click();
        Assert.assertFalse("proizvod je u korpi",itemOne.equals(expectedItemOneText));
        Assert.assertFalse("prozivod je u korpi", itemTwo.equals(expectedItemTwoText));
        System.out.println(itemOne.equals(expectedItemOneText));

            }

}
