import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLClientInfoException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello worldr");

        WebDriver driver = new ChromeDriver();
        try {
            throwExcpt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void except(){
        try {
            Thread.sleep(123);
        } catch (NullPointerException e) {
            //logger.error("Some pidor touched my exceptions");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("asd");
        }
    }

    public  static void throwExcpt() throws InterruptedException {
        Thread.sleep(1);
    }
}
