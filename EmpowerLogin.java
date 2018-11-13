import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmpowerLogin
{

	public static void main(String[] args)
	{
		WebDriver wd=new FirefoxDriver();
		wd.get("https://testing.empower360plus.com");
		//Email
		wd.findElement(By.id("login-email")).sendKeys("admin");
		//password
		wd.findElement(By.id("login-password")).sendKeys("A4Tech@123");
		//Click on login
		wd.findElement(By.xpath("/html/body/app-root/app-auth/app-login/section/div/div/div/div/form/div[2]/form/div[6]/div/button")).click();
		String actual_error=wd.findElement(By.xpath("/html/body/app-root/app-auth/app-login/app-notifications/ng2-toasty/div/ng2-toast/div/div[2]")).getText();
		System.out.println(actual_error);
        String Expected_error="/n" + "Unable to login"+ "/n" +
        		"An error occured whilst logging in, please try again later. Error: Bad Request";
        if (actual_error==Expected_error)
        {
        	System.out.println("Passed");
        }
        else
        {
        System.out.println("Failed");	
        }
	}

}
// "Unable to login \r\n" + 
//"An error occured whilst logging in, please try again later. Error: Bad Request";