package pageObjects;
        import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//*import utility.Log;
//*import utility.Utils;
    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement lnk_MyAccount() throws Exception{
            try{ 
	        	 element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[5]/ul[1]/li[3]/a"));
	        	
	           //*  Log.info("My Account link is found on the Home Page");
            }catch (Exception e){
           		//*Log.error("My Acocunt link is not found on the Home Page");
           		throw(e);
           		} 
           	return element;
        }
        public static WebElement lnk_LogOut() throws Exception{
            try{
	        	element = driver.findElement(By.id("account_logout"));
	        
	         //*   Log.info("Log Out link is found on the Home Page");
            }catch (Exception e){
            //*	Log.error("Log Out link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        
        
        

      
    }
