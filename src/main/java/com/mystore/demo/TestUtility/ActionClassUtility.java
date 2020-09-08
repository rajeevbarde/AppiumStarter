package com.mystore.demo.TestUtility;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionClassUtility {

	public WebDriver driver;
	public Actions action;
	public ActionClassUtility(WebDriver driver) {
		try {
	this.driver=driver;
		}catch (NullPointerException ae) {
		 ae.printStackTrace();
		 throw new RuntimeException("Driver instnace is null " +driver);
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Other exception");
		}
		this.action=new Actions(driver);
	}
	//========================================================================================================
	
	//Here i have mentioned all methods of action class
	/*1. Action click method with build method
	 *2. Click and hold method.
	 *3. Click Context
	 *4. Double Click
	 *5. Drag and drop
	 *6. Drag and dropby with offset
	 7.Select all text
	 8.Cut all text
	 9.Copy All text
	 10.Paste all text
	 *11.move by offset
	 *12.move to element with webelement
	 *13.move to element with offset
	 * 14.realease
	 * 15.send keys
	 * 16.send keys with webelement
	 * 17.tick with action
	 * 18.tick with interaction
	 * And get instance method so you cna call another method.
	 * 
	 * 
	 * 
	 */
	
	public Actions get_Action() {
		return this.action;
	}
	
	public WebElement moveElement(WebElement element){
		WebElement Tempelement=null;
		try{
		this.action.moveToElement(element).build().perform();
		Tempelement=element;
		return element;
		}catch(Exception ae){
			ae.printStackTrace();
		}return Tempelement;}
	
	// Action click method with build method
	public void clk_Element(WebElement element,String pageName,String actionName) {
		try {
		this.action.moveToElement(element).click().build().perform();
		}catch (NullPointerException e) {
			throw new RuntimeException("Element show " +element+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	// Click and hold method.
	public void clkAndHold_Element(WebElement element,String pageName,String actionName) {
		try {
			this.action.moveToElement(element).clickAndHold(element);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//Click Context
	public void clkContext_Element(WebElement element,String pageName,String actionName) {
		try {
			this.action.moveToElement(element).contextClick(element);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	// double click
	public void clkDouble_Element(WebElement element,String pageName,String actionName) {
		try {
			this.action.moveToElement(element).doubleClick(element);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//drag and drop
	public void dragDrop_Element(WebElement source,WebElement destination,String pageName,String actionName) {
		try {
			this.action.moveToElement(source).dragAndDrop(source, destination);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +source +" And "+destination+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}	
	}
	
	//drag and drop with offset
	public void dragDropOffset_Element(WebElement element,int x,int y,String pageName,String actionName) {
		try {
			this.action.moveToElement(element).dragAndDropBy(element, x, y);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" and "+x+" and "+y+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//Select all text
	public void select_AllText(WebElement element,String key,String actionName,String pageName) {
		try {
			this.action.moveToElement(element).keyDown(element, Keys.CONTROL).sendKeys(element, key).keyUp(Keys.CONTROL).perform();
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" and "+key+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//Cut all text
	public void cut_AllText(WebElement element,String key,String actionName,String pageName) {
		try {
			this.action.moveToElement(element).keyDown(Keys.CONTROL).sendKeys(element, key).keyUp(Keys.CONTROL).perform();
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" and "+key+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//Copy all text
	public void copy_AllText(WebElement element,String key,String actionName,String pageName) {
		try {
			this.action.moveToElement(element).keyDown(element, Keys.CONTROL).sendKeys(element, key).keyUp(Keys.CONTROL);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" and "+key+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//Paste all text
	public void paste_AllText(WebElement element,String key,String actionName,String pageName) {
		try {
			this.action.moveToElement(element).keyDown(element, Keys.CONTROL).sendKeys(element, key).keyUp(Keys.CONTROL);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Element show " +element+" and "+key+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//Move by offset
	public void moveByOffset_Element(int x,int y,String actionName,String pageName) {
		try {
			this.action.moveByOffset(x, y);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Offset show " +x+" and "+y+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//move to element
	public void moveToElement_Element(WebElement element,String actionName,String pageName) {
		try {
			this.action.moveToElement(element);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Offset show " +element+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//move to element with offset
	public void moveToElementOffset_Element(WebElement element,int x,int y,String actionName,String pageName) {
		try {
			this.action.moveToElement(element, x, y);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Offset show " +element+"and"+x+" and "+y+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//realease mouse pointer method
	public void realeasePointer_Element(WebElement element,String actionName,String pageName) {
		try {
			this.action.release(element);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Offset show " +element+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//send value using send keys method
	public void sendkeys_Element(String key,String actionName,String pageName) {
		try {
			this.action.sendKeys(key);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Offset show " +key+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//send value using send keys with offset
	public void sendkeysOffset_Element(WebElement element,String key,String actionName,String pageName) {
		try {
			this.action.sendKeys(element, key);
		}catch (NullPointerException ae) {
			throw new RuntimeException("Offset show " +element+" and "+key+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	//click using tick method
	public void tick_Element(Action action,WebElement element,String actionName,String pageName) {
		try {
			
		}catch (NullPointerException ae) {
			throw new RuntimeException("Offset show " +element+" While doing " +actionName+" on " +pageName);
		} catch(Exception ae) {
			throw new RuntimeException("Other exception " +ae.getMessage()+" While doing " +actionName+" on " +pageName);
		}
	}
	
	
	
	
	
	
}
