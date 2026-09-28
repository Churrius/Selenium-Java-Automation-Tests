package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void sliderTest(){
        var sliderPage = homePage.clickHorizontalSlider();
        var value = "4";
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
