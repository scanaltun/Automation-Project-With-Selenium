import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage { /* bu sayfada aslında practiceFormPage de sıklıkla yaptığımız
 kod tekrarının önüne geçerek daha işlevsel ve tekrarsız kod yazacağız */


    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);

    }

    public void click(By locator){
        find(locator).click();

    }
    public void type (By locator,String text) {
        find(locator).sendKeys(text);

    }

    public boolean isSelected(By locator){ // GenderSection kısmında isRadioButton bölümünü kısaltmak adına yazdık
        return find(locator).isSelected();

    }
}