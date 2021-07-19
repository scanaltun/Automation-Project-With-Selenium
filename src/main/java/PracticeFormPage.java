import org.openqa.selenium.By; // By locaterı için ekleniyor
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage {

    public WebDriver driver; // sitenin webdrivera ulaşması
    private final By nameLocator = By.id("firstName"); // name kısmını incele diyerek id kısmını buraya yazdık Locaterdır
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");

    private GenderSection genderSection;

    public PracticeFormPage(WebDriver driver){ //constructor
        super(driver);
        genderSection = new GenderSection(driver); //burada amaç initiai etmek

    }

    public GenderSection genderSection(){  //buradaki amaç gendersection'ın fonksiyonlarını testte kullanılabilmesi için döndürmek
        return this.genderSection;
    }


    public void setName (String name ){
       /* WebElement nameSpace =driver.findElement(name); //bu web elementi yukarıdaki driverı kullanıp By Namei yani firstNamei buldu
        nameSpace.click();
        nameSpace.sendKeys(nameText); //sendKeys fonksiyonun içine set edeceğimiz kısmın ismini yani "nameText" i verdik mi set edebiliriz.
        bunun yerine daha pratik bir yol izleyip basepage da tanımladık*/
        type(nameLocator, name);

    }

    public void setLastName(String lastName){
       /* WebElement nameSpace =driver.findElement(lastNameLocator);
        nameSpace.click();
        nameSpace.sendKeys(lastName);
        */
        type(lastNameLocator,lastName);

    }

    public void setMail(String email){
       /* WebElement nameSpace =driver.findElement(emailLocator);
        nameSpace.click();
        nameSpace.sendKeys(emailText);
        */
        type(emailLocator, email);


    }

    public String getName(){  //isim değerinin doğruluğunu kontrol etmek amaçlı kullandığımız fonksiyon
     /*   WebElement nameSpace = driver.findElement(nameLocator);
        return nameSpace.getAttribute("value");
       */
        return find(nameLocator).getAttribute("value");

    }

    public String getLastName(){ //soyisim değerinin doğruluğunu kontrol etmek amaçlı kullanıyoruz.
       /* WebElement nameSpace = driver.findElement(lastNameLocator);
        return nameSpace.getAttribute("value");
        */
        return  find(lastNameLocator).getAttribute("value");

    }

    public String getEmail(){
       /* WebElement nameSpace = driver.findElement(emailLocator);
        return nameSpace.getAttribute("value");
        */
        return find(emailLocator).getAttribute("value");

    }

}
