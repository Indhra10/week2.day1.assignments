package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
        ChromeDriver driver=new ChromeDriver();
        //opens the webpage
        driver.get("http://leaftaps.com/opentaps/control/main");
        //enters username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //enters password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //clicks login button
        driver.findElement(By.className("decorativeSubmit")).click();
        ////////////////////////
        //in the next page
        //To click CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();
        //in the following page
        //to click the option Create Lead
        driver.findElement(By.linkText("Create Lead")).click();
        
        // in the following page, fill the form
        
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MNGEnter");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indhra");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Indhu");
        driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("personaltitle");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("profittitle");
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000000");
        driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Distribution");

        driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("11");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sridhar");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("nag");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("archeology");
        driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$");
        WebElement countrycode= driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
        countrycode.clear();
        countrycode.sendKeys("5");
        
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("238");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dafdadaf@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("571");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("krishnadev");
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.vethuvettu.com");
        
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Indhra priyadharshini");
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Indhu");
        driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Doshi Wellspring");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("chennai");
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("609405");
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("31");
        driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Texas");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        
        
        

        

	}

}
