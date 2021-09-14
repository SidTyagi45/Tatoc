package PageActionsClass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SampleRun.base;

public class ActionsPageActions extends base{
	
	WebDriver driver;
	By textEnter = By.name("vfb-5");
	By numberEnter = By.name("vfb-9");
	By numberResult = By.xpath("//button[@id='result_button_number']");
	By numberTextDisplay = By.xpath("//p[@id='result_number']");
	By numberClearResult = By.xpath("//button[@id='clear_result_button_number']");
	By checkBox1 = By.id("vfb-6-0");
	By checkBoxComn = By.xpath("//input[@type='checkbox']");
	By linkBox  = By.cssSelector("div[class='w3-container w3-light-grey w3-border w3-padding-8 w3-margin']");
	By linkk1  = By.xpath("//a[@href='link1']");
	By linkk2  = By.id("homepage_link");
	By selecttTab = By.name("vfb-12");
	By selectTabOption = By.xpath("//option[text()='Option 2']");
	By dragBox1 = By.id("drag_box1");
	By dragBox2 = By.id("drag_box2");
	By box = By.id("box");
	By calendar = By.xpath("//input[@id='vfb-8']");
	By monthSpecific = By.xpath("//div[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']");
	By mothNext = By.xpath("//div[@id='ui-datepicker-div']/div/a/span[text()='Next']");
	By dates = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td");
	public ActionsPageActions(WebDriver driver) {
		this.driver = driver;
	}


	public String pageTitleVerification()
	{
		return driver.getTitle();
	}
	
	public void enterText()
	{
		this.driver.findElement(textEnter).clear();
		this.driver.findElement(textEnter).sendKeys("Siddharth");
	}
	//vfb-9
	
	public void enterNumberAndCheck()
	{
		this.driver.findElement(numberEnter).clear();
		this.driver.findElement(numberEnter).sendKeys("3");
		this.driver.findElement(numberResult).click();
		System.out.println(this.driver.findElement(numberTextDisplay).getText());
		this.driver.findElement(numberClearResult).click();
		System.out.println("Done");
	}
	
	public void clickAndCountCheckBoxes()
	{
		System.out.println(this.driver.findElement(checkBox1).isSelected());
		this.driver.findElement(checkBox1).click();
		System.out.println(this.driver.findElement(checkBox1).isSelected());
		System.out.println(this.driver.findElements(checkBoxComn).size());
		System.out.println("CheckBox Complete");
	}
	
	public void linkClickAndCount() throws InterruptedException
	{
		
		/*WebElement link = this.driver.findElement(linkBox);
		int a = link.findElements(By.tagName("a")).size();
		System.out.println("Link count is printed" + a);*/
		System.out.println("Welcome Link");
		Thread.sleep(5000);
		
	String click =	Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		this.driver.findElement(linkk1).sendKeys(click);
		Thread.sleep(5000);
		this.driver.findElement(linkk2).sendKeys(click);
		Thread.sleep(5000);
				
	}
	
	public void selcttTabOptionSelect()
	{
		this.driver.findElement(selecttTab).click();
		this.driver.findElement(selectTabOption).click();
		System.out.println("Option is selected");
	}
	
	public void dragAndDrop() throws InterruptedException
	{
		WebElement from = this.driver.findElement(dragBox1);
		WebElement to = this.driver.findElement(dragBox2);
		WebElement ob = this.driver.findElement(box);
        Actions drag = new Actions(this.driver);
       // Thread.sleep(10000);
       // drag.clickAndHold(ob).dragAndDrop(from, to).build().perform();
      //drag.dragAndDrop(from, to).build().perform();
		drag.clickAndHold(ob).dragAndDrop(from, to).click().build().perform();
		System.out.println("Drageed");
	}
	
	public void calendarDateSelect() throws InterruptedException
	{
		this.driver.findElement(calendar).click();
		//this.driver.findElement(monthSpecific).click();
		//this.driver.findElement(mothNext).click();
		Thread.sleep(10000);
		
		while(!this.driver.findElement(monthSpecific).getText().contains("October"))
		{
			this.driver.findElement(mothNext).click();
			Thread.sleep(5000);
		}
		
		int count = this.driver.findElements(dates).size();
	List<WebElement> date = this.driver.findElements(dates);
	
	for(int i=0;i<count;i++)
	{
		String txt = this.driver.findElements(dates).get(i).getText();
		if(txt.equalsIgnoreCase("3"))
		{
			this.driver.findElements(dates).get(i).click();
			break;
		}
	}
	System.out.println("Date selected");
	
	}

}
