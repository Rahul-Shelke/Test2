import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM 
{

	public static void main(String[] args) throws Exception 
	{
		//Login on OrageHRM
		WebDriver wd=new FirefoxDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		wd.findElement(By.id("txtUsername")).sendKeys("Admin");
		wd.findElement(By.id("txtPassword")).sendKeys("admin123");
		wd.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		//PIM(Hover)-Configuration(Hover)-Reporting Methods(Click) 
	/*	WebElement element=wd.findElement(By.id("menu_pim_viewPimModule"));
	   Actions act=new Actions(wd);
		act.moveToElement(element).build().perform();
		WebElement element2=wd.findElement(By.id("menu_pim_Configuration"));
         act.moveToElement(element2).build().perform();
         Thread.sleep(3000);
         wd.findElement(By.id("menu_pim_viewReportingMethods")).click();
		
		//Admin(Click)-Linda anderson(Click)-Edit(Click)-status change to ENABLEED-save(Click)
      /*  wd.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[7]/td[2]/a")).click();
        wd.findElement(By.id("btnSave")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[4]/select/option[1]")).click();
        wd.findElement(By.id("btnSave")).click();
		*/
		
		
		//wd.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		//Recruitment(Hover)-Candidate(Click)
	/*	WebElement element3=wd.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		WebElement subelement=wd.findElement(By.id("menu_recruitment_viewCandidates"));
		Actions act3=new Actions(wd);
		act3.moveToElement(element3).build().perform();
		act3.moveToElement(subelement).build().perform();
		subelement.click();
		*/
         //Recruitment(hover)-candidate(click)-jobvacancy(testing1)-status(shortlisted)-candidate name Input(A)-keywords(B)-DOA(1/1/2018)-to(2/1/2018)-MOA(Mannual)-Search(Click)-reset(Click)
        WebElement element4=wd.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        Actions act2=new Actions(wd);
        act2.moveToElement(element4).build().perform();
        wd.findElement(By.id("menu_recruitment_viewCandidates")).click();
		wd.findElement(By.id("candidateSearch_jobVacancy")).click();
		wd.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/select/option[3]")).click();
		wd.findElement(By.id("candidateSearch_status")).click();
		wd.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/select/option[3]")).click();
		wd.findElement(By.id("candidateSearch_keywords")).sendKeys("B");;
		wd.findElement(By.id("candidateSearch_fromDate")).click();
		wd.findElement(By.id("candidateSearch_fromDate")).sendKeys("01-01-2018");
		wd.findElement(By.id("candidateSearch_toDate")).click();
		wd.findElement(By.id("candidateSearch_toDate")).sendKeys("01-02-2018");
		wd.findElement(By.id("candidateSearch_modeOfApplication")).click();
		wd.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[9]/select/option[2]")).click();
		Thread.sleep(7000);
		wd.findElement(By.id("btnSrch")).click();
		wd.findElement(By.id("btnRst")).click();
	}

}
