import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; //@test ekleyince otomatik olarak eklendi

public class Test_Setting_Name_Lastname_Email extends BaseTest { //TestSetting ile başlayan basetestin child classı oldu


    @Test
    public void setName(){
        practiceFormPage.setName("Can"); //practiceformpageye tanımlıyoruz
        Assertions.assertEquals(  "Can",practiceFormPage.getName(),"Name Value is not correct! "); //jupiter kütüphanesinden bu komutlar, girdiğimiz parametrelerin doğruluğuna bakar
        //getname ile girdiğimiz değeri alır
    }

    @Test
    public void setLastName(){
        practiceFormPage.setLastName("ALTUN");
        Assertions.assertEquals("ALTUN",practiceFormPage.getLastName(),"Last Name Value is not correct!");
    }


    @Test
    public void setEmail(){
        practiceFormPage.setMail("xxxxx@gmail.com");
        Assertions.assertEquals("xxxxx@gmail.com",practiceFormPage.getEmail(),"E-mail Value is not correct!");


    }



}



