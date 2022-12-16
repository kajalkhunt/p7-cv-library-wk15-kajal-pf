package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @FindBy(xpath = "//div/h1[@class = 'search-header__title']")
    WebElement result;

    public String verifyTheResults(String expected){
        return getTextFromElement(result);
    }

}
