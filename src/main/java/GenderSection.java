import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GenderSection extends BasePage{ //classlar halinde gitmek istediğimiz için böyle yaptık practiceformpage e bunla ilgili eklentiler yaptık incele

    private WebDriver driver;
    private final By maleRadioLabelLocator = new By.ByCssSelector("label[for='gender-radio-1']"); //idsi olmadğığ için css ile bulduk
    private final By femaleRadioLabelLocator = new By.ByCssSelector("label[for='gender-radio-2']"); // Sitedeki male,famale kısımlarını bulmak için
    private final By otherRadioLabelLocator = new By.ByCssSelector("label[for='gender-radio-3']");

    private final By maleRadioButtonLocator = new By.ById("gender-radio-1");
    private final By femaleRadioButtonLocator = new By.ById("gender-radio-2");
    private final By otherRadioButtonLocator = new By.ById("gender-radio-3");


    public enum Genders{MALE,FEMALE,OTHER} //generic bir şey bunu tam çözemedim

    public GenderSection(WebDriver driver){
        super(driver);

    }

    public void clickRadioButton(Genders gender){ //radio butona tıklamak için yaptğımız fonksiyon
        switch (gender){
            case FEMALE:
               // driver.findElement(femaleRadioLabel).click(); // Base Page den extends ettiğimiz için fazlalık olmaması adına sadece click() methodunu koymamız yeter
                click(femaleRadioLabelLocator);
                break;

            case MALE:
                //driver.findElement(maleRadioLabel).click();

                 click(maleRadioLabelLocator);
                 break;
            case OTHER:
               // driver.findElement(otherRadioLabel).click();
                click(otherRadioLabelLocator);
                break;

        }

    }

    public boolean isRadioButtonChecked( Genders gender){
        boolean isChecked = false;
        switch (gender) {
            case FEMALE:
                isChecked = isSelected(femaleRadioButtonLocator);
                break;
            case MALE:
                isChecked = isSelected(maleRadioButtonLocator);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioButtonLocator);
                break;

        }

        return isChecked;

    }
}


