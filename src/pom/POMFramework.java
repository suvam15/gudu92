package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFramework extends BasePage implements AutoConstant
{
          @FindBy(xpath="(//input[@type='text'])[1]")
          private WebElement firstNameTextfield;
          
          @FindBy(xpath="(//input[@type='text'])[2]")
          private WebElement lastNameTextfield;
          
          @FindBy(xpath="(//input[@type='text'])[3]")
          private WebElement userNameTextfield;
          
          @FindBy(xpath="//input[@type='password']")
          private WebElement passwordTextfield;
          
          @FindBy(xpath="(//input[@type='text'])[4]")
          private WebElement emailIDTextfield;
          
          @FindBy(xpath="(//input[@type='radio'])[1]")
          private WebElement maleRadioButton;
          
          @FindBy(xpath="(//input[@type='radio'])[2]")
          private WebElement femaleRadoButton;
          
          @FindBy(xpath="//input[@type='checkbox']")
          private WebElement rememberMeCheckbox;
          
          @FindBy(xpath="//select[@name='countrycode']")
          private WebElement countrycodeDropdownlist;
          
          @FindBy(xpath="(//input[@type='text'])[5]")
          private WebElement mobileNumberTextfield;
          
          @FindBy(xpath="//textarea")
          private WebElement addressTextArea;
          
          @FindBy(xpath="//input[@type='button']")
          private WebElement saveButton;
          
          public POMFramework(WebDriver driver)
          {
        	  PageFactory.initElements(driver, this);
          }
          
          public void submitDetails() throws IOException
          {
			firstNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 0));
			lastNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 1));
			userNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 2));
			passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 3));
			emailIDTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 4));
			femaleRadoButton.click();
			rememberMeCheckbox.click();
			selectbyvisibletext(countrycodeDropdownlist, "+1");
			mobileNumberTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 5));
			addressTextArea.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 6));
			saveButton.click();
          }
}
