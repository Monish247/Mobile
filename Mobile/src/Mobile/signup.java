package Mobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class signup {
    @Test(dataProvider="signup") //SIGNUP
     public void sign(String Firstname,String Lastname,String Email,String password,String date,String phonenumber,String shortbio) throws Exception
     {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monish.B\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        signuplandingpage page=new signuplandingpage(driver);
        page.goTo();
        
        page.signin().click();
        Thread.sleep(1000);
        page.signup().click();
        Thread.sleep(1000);
        page.FirstName().sendKeys(Firstname);
        Thread.sleep(1000);
        page.LastName().sendKeys(Lastname);
        Thread.sleep(1000);
        page.Email().sendKeys(Email);
        Thread.sleep(1000);
        page.Password().sendKeys(password);
        Thread.sleep(1000);
        page.date().sendKeys(date);
        Thread.sleep(1000);
        page.gender().click();
        Thread.sleep(1000);
        page.phonenumber().sendKeys(phonenumber);
        Thread.sleep(1000);
        page.shortbio().sendKeys(shortbio);
        Thread.sleep(1000);
        page.register().click();
        Thread.sleep(1000);
        //driver.close();
     }
     @DataProvider(name="signup")
        public Object[][] getdata()
        {
            Object [][] data=new Object[4][7];
            data [0][0]="Monish";
            data [0][1]="bbb";
            data [0][2]="monish12@gmail.com";
            data [0][3]="934f34";
            data [0][4]="15/09/2000";
            data [0][5]="9236540214";
            data [0][6]="how u r cmg";
            data [1][0]="mo";
            data [1][1]="";
            data [1][2]="monish13@gmail.com";
            data [1][3]="934f34";
            data [1][4]="12/07/2000";
            data [1][5]="9873341114";
            data [1][6]="who r u";
            data [2][0]="monishqwewretretetwwtrtrtrtetret";
            data [2][1]="hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
            data [2][2]="monish234@gmail.com";
            data [2][3]="934f34";
            data [2][4]="15/09/2001";
            data [2][5]="876598245";
            data [2][6]="hi";
            data [3][0]="Moni";
            data [3][1]="kumar";
            data [3][2]="monish34@gmail.com";
            data [3][3]="y";
            data [3][4]="14/06/2001";
            data [3][5]="973134514635434";
            data [3][6]="*";
            
           
            
        return data;
    
    
}
}
