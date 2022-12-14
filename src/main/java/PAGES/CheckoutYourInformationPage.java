package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutYourInformationPage {

    WebDriver driver=new ChromeDriver();

    public By firstNameTextInputField=By.xpath("//input[@placeholder=\"First Name\"]");

    public By lastNameTextInputField=By.cssSelector("input[placeholder=\"Last Name\"]");

    public By postalCodeInputField=By.id("postal-code");

    public By continueButton=By.cssSelector("input[name=\"continue\"]");

    public void enterValidFirstName(String textToEnterInTheFirstNameField){
        driver.findElement(firstNameTextInputField).sendKeys(textToEnterInTheFirstNameField);
    }
    public void enterValidLastName(String textToEnterInTheLastNameField){
        driver.findElement(lastNameTextInputField).sendKeys(textToEnterInTheLastNameField);
    }
    public void enterValidPostalCode(String textToEnterInThePostalCodeField){
        driver.findElement((postalCodeInputField)).sendKeys(textToEnterInThePostalCodeField);
    }
    public void validLogIn(){
        driver.findElement(firstNameTextInputField).sendKeys("Nikola");
        driver.findElement(lastNameTextInputField).sendKeys("Dimitrijevic");
        driver.findElement(postalCodeInputField).sendKeys("11000");
    }


    public CheckoutYourInformationPage(WebDriver driver){
        this.driver=driver;
    }






}
