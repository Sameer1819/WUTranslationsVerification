import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://wupos-tablet2-uat1.westernunion.com/tablet-ui");
		Thread.sleep(8000);
		driver1.findElement(By.xpath("//ul[@class='header-dropdown-list']")).click();
		//List<WebElement> languages = driver1.findElements(By.xpath("//li[@ng-class='{active: lang == $ctrl.currentLang}']")); 
		driver1.close();
		ArrayList<String> otherServices = new ArrayList<String>();
		//for(int i=0; i<=languages.size();i++) {
		for(int i=0; i<=1;i++) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://wupos-tablet2-uat1.westernunion.com/tablet-ui");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//ul[@class='header-dropdown-list']")).click();
		List<WebElement> language = driver.findElements(By.xpath("//li[@ng-class='{active: lang == $ctrl.currentLang}']")); 
		language.get(i).click();
		//System.out.println(driver.findElement(By.xpath("//li[@ng-class='{active: lang == $ctrl.currentLang}']/a/text()")).getText());
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("USAGENT");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		driver.findElement(By.id("submit-login")).click();
		Thread.sleep(15000);
		driver.findElement(By.id("operator-first-name")).sendKeys("sameer");
		driver.findElement(By.id("operator-last-name")).sendKeys("agrawal");
		driver.findElement(By.xpath("//button[@type='button']//span[@translate='OPERATOR_NAME.PROCEED']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button']//span[@translate='CLOSE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']//span[@translate='PINPAD.CANCEL_BUTTON']")).click();//it has to be used for pinpad pop-up
		//driver.findElement(By.id("click-here-to-continue-link")).click();//it has to be used for WUPOS service pop-up
		driver.findElement(By.xpath("//div[@class='homepage-toggle-secion']")).click();
		otherServices.add(driver.findElement(By.xpath("//div[@class='homepage-toggle-secion']//h1[@translate='LAYOUT.OTHER_SERVICES']")).getText());
		driver.findElement(By.id("id_logout_newHome")).click();
		driver.findElement(By.xpath("//button[@translate='LAYOUT.YES']")).click();
		Thread.sleep(12000);
		driver.close();
		
		}
		for(int i=0;i<otherServices.size();i++) {
		System.out.println(otherServices.get(i));
		}

	}

}
