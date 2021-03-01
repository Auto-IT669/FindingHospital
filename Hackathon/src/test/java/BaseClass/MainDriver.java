package BaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import BaseClass.ApplicationDriver;


public class MainDriver 
  {

  @Test
    public WebDriver mainDriver() throws Exception {​​​​​​​
        WebDriver driver = null;
      
        //Asking user for his choice of web driver
        System.out.println("Enter the name of the browser from available choices:\n1: Chrome\n2: Firefox");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        
        //Closing scanner object to prevent leak 
        sc.close();
        
        //Creating object of ApplicationDriver to invoke driver depending upon user choice and available choices
        ApplicationDriver baseobject = new ApplicationDriver();


         if(choice.equalsIgnoreCase("Chrome"))
        {​​​​​​​
            // If user enters Chrome as the driver, calling the ChromeDriver class 
            // and storing the returned driver to static variable driver
            driver = baseobject.ChromeDriver();
            return driver;
        }​​​​​​​
        
          else if(choice.equalsIgnoreCase("Firefox"))
          {​​​​​​​
            // If user enters firefox as the driver, calling the ChromeDriver class 
            // and storing the returned driver to static variable driver
            driver = baseobject.FirefoxDriver();
            return driver;
          }​​​​​​​
          return driver;
    }​​​​​​​


 
}​​​​​​​
 






