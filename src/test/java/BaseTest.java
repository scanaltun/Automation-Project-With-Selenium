import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance; //bunu eklediğimizde setup ve teardown kısmının static olma zorunluluğu ortadan kalkıyor
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver; // private yerine protected kullandıkki extends ettiğimizdede kullanılabilsin

    PracticeFormPage practiceFormPage;

    @BeforeAll //bu komut sayesinde her şeyden önce bu başlıyor.
    public  void setUp(){ //bunun amacı browserı başlatmak
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");  //driverı belirtip pathını verdik
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("Test İnitiated.");
        practiceFormPage  = new PracticeFormPage(driver); //bu komut sayesinde practiceformpage classından methodları aldık


    }




    @AfterAll  //bu da aslında bütün metodlardan sonra çalışmasını sağlar
    public  void tearDown(){
        System.out.println("Test Finished.");
        driver.quit();

    }



}
