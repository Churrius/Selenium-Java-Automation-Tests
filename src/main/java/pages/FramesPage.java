package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFramesButton = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesButton(){
        driver.findElement(nestedFramesButton).click();
        return new NestedFramesPage(driver);
    }


}
