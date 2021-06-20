package com.xcart.mobile.pages.shopping;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
/*

	2 - verifyThatUserShouldClearShoppingCartSuccessfully()
		1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Bestseller”  link and click
		1.3 Verify the text “Bestsellers”
		1.4 Mouse hover on “Sort By” and select “Name A-Z”
		1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
1.6 Verify the message “Product has been added to your cart” display in  green bar
1.7 Click on X sign to close the message
1.8 Click on “Your cart” icon and Click on “View cart” button
1.9 Verify the text “Your shopping cart - 1 item”
1.10 Click on “Empty your cart” link
1.11 Verify the text “Are you sure you want to clear your cart?” on alert
1.12 Click “Ok” on alert
1.13 Verify the message “Item(s) deleted from your cart”
1.15 Verify the text “Your cart is empty”



 */

public class ClearShoppingCartSuccessfully extends Utility {

    By hoveronhotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By bestsellerlink = By.linkText("Bestsellers");
    By verifybestseller = By.id("page-title");
    By hoveronsortby = By.xpath("//div[@class='sort-box']");
    By selectNameAtoZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By clickoninylIdolzGhostbusters= By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[7]/div[1]/div[2]/div[4]/div[1]/button[1]");
    By verifytextpopup = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closepopup = By.className("close");
    By hoveronaddtocartndclick = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]");
    By clickviewcart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]/div[3]/div[1]/a[1]");
    By verifyitem1 = By.xpath("//h1[@id='page-title']");
    By clickemptycart = By.xpath("//a[contains(text(),'Empty your cart')]");
   String veriffytext = "Are you sure you want to clear your cart?";
    By  verifyitemdeletedocart = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
   By verifytextcartempty =By.xpath("//h1[text()='Your cart is empty']");
    public void mousehoveronhotdeals(){
      mouseHoverToElementAndClick(hoveronhotDeals);
    }

    public void clickbestsellerlink(){
        clickOnElement(bestsellerlink);
        String expectedMessage = "Bestsellers";
        String actualMessage = getTextFromElement(verifybestseller);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void moudehoveronsortby(){
        mouseHoverToElement(hoveronsortby);
    }

    public void selectNameAtoZ(){
        clickOnElement(selectNameAtoZ);
    }

    public void clickoninylIdolzGhostbusters() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElementAndClick(clickoninylIdolzGhostbusters);
        String expectedMessage = "Product has been added to your cart";
        String actualMessage = getTextFromElement(verifytextpopup);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void closepopup(){
        clickOnElement(closepopup);
    }

    public void clickoncart(){

        mouseHoverToElementAndClick(hoveronaddtocartndclick);
    }

    public void clickviewcart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickviewcart);
        String expectedMessage = "Your shopping cart - 1 item";
        String actualMessage = getTextFromElement(verifyitem1);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void clickemptycart() throws InterruptedException {Thread.sleep(2000);
        clickOnElement(clickemptycart);
    }

    public void closealert(){
        driver.switchTo().alert().getText().equals(veriffytext);
     driver.switchTo().alert().accept();

        String expectedMessage = "Item(s) deleted from your cart";
        String actualMessage = getTextFromElement(verifyitemdeletedocart);
        Assert.assertEquals(actualMessage, expectedMessage);

        String expectedMessage1 = "Your cart is empty";
        String actualMessage1 = getTextFromElement(verifytextcartempty);
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }

}
