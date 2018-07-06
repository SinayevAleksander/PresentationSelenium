


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MishReg1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMishReg1() throws Exception {
    driver.get("https://mish.sheygam.com/#/wellcome");
    initRegistration();
    fillFirstRegistrationForm();
    clickRegistrationButton();
    fillSecondRegistrationForm();
    driver.findElement(By.xpath("//div[@id='pictureTable']/div[2]/form/div[2]/button[2]/span")).click();
  }

  private void fillSecondRegistrationForm() {
    driver.findElement(By.xpath("//div[@id='pictureTable']/div[2]/form/div/div/div/mat-form-field/div/div/div")).click();
    driver.findElement(By.id("inputFirstName")).clear();
    driver.findElement(By.id("inputFirstName")).sendKeys("First Name");
    driver.findElement(By.xpath("//di
    driver.findElement(By.id("inputLastName")).sendKeys("Last Namv[@id='pictureTable']/div[2]/form/div/div/div[2]/mat-form-field/div/div/div\")).click();\n" +
            "    driver.findElement(By.id(\"inputLastName\")).clear();e");
    driver.findElement(By.id("inputPhoneNumber")).click();
    driver.findElement(By.id("inputPhoneNumber")).clear();
    driver.findElement(By.id("inputPhoneNumber")).sendKeys("0123456789");
    driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-0']/span")).click();
    driver.findElement(By.id("inputDateOfBirth")).click();
    driver.findElement(By.id("inputDateOfBirth")).clear();
    driver.findElement(By.id("inputDateOfBirth")).sendKeys("12/12/12");
    driver.findElement(By.xpath("//mat-select[@id='mat-select-1']/div/div")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-2']/span")).click();
    driver.findElement(By.xpath("//mat-select[@id='mat-select-2']/div/div/span")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-8']/span")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-9']/span")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-10']/span")).click();
    driver.findElement(By.xpath("//body/div/div[3]")).click();
    driver.findElement(By.xpath("//div[@id='pictureTable']/div[2]/form/div/div[2]/div[3]/mat-form-field/div/div/div")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-11']/span")).click();
    driver.findElement(By.xpath("//mat-select[@id='mat-select-4']/div/div")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-16']/mat-pseudo-checkbox")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-14']/mat-pseudo-checkbox")).click();
    driver.findElement(By.id("mat-option-13")).click();
    driver.findElement(By.xpath("//body/div/div[5]")).click();
    driver.findElement(By.id("description")).click();
    driver.findElement(By.id("description")).clear();
    driver.findElement(By.id("description")).sendKeys("1");
  }

  private void clickRegistrationButton() {
    driver.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'Registration')]")).click();
  }

  private void fillFirstRegistrationForm() {
    type(By.id("mat-input-0"), "test@test.test");
    type(By.id("mat-input-1"),"1234567890");
    type(By.id("mat-input-2"),"1234567890");

}

  private void type(By locator, java.lang.String Text) {
    driver.findElement(By.id("mat-input-0")).clear();
    driver.findElement(locator).sendKeys(Text);
  }

  private void initRegistration() {
    driver.findElement(By.xpath("//a[2]/span/span")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
