import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class SeleniumTest {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com/");
         
        driver.manage().window().maximize();
         
        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("ŷ�ޱ�");
         
        WebElement btn = driver.findElement(By.id("su"));
        btn.click();
        //Ϊ���ڲ鿴����Ч�����ɰѹر����������ע��
        //driver.close();
 
    }
 
}