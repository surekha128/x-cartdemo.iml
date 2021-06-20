package com.xcart.mobile.pages.hotdeals;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
2 - verifySaleProductsPriceArrangeLowToHigh()
		2.1 Mouse hover on the “Hot deals” link
		2.2 Mouse hover on the “Sale”  link and click
		2.3 Verify the text “Sale”
		2.4 Mouse hover on “Sort By” and select “Price Low-High”
		2.5 Verify that the product’s price arrange Low to High
 */
public class HotDealsSalesProductPriceLowtoHigh extends Utility {

    By hoveronhotdeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By linkSaleclick = By.linkText("Sale");
    By verifysale = By.xpath("//h1[@id='page-title']");
    By hoversortby = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By selectpricelowtohigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By verifyarrangelowtohigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]");


    public void mousehoveronhotdeals(){
        Reporter.log("Clicking on login link " + hoveronhotdeals.toString() + "<br>");

        clickOnElement(hoveronhotdeals);
    }

    public void clickonsalelink(){
        Reporter.log("Clicking on login link " + linkSaleclick.toString() + "<br>");

        clickOnElement(linkSaleclick);
        String expectedMessage = "Sale";
        String actualMessage = getTextFromElement(verifysale);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void hoveronsortbyandclickpricelowtohigh() {
        Reporter.log("Clicking on login link " + hoversortby.toString() + "<br>");
        Reporter.log("Clicking on login link " + selectpricelowtohigh.toString() + "<br>");

        mouseHoverToElement(hoversortby);
        clickOnElement(selectpricelowtohigh);
        List<WebElement> deskTopList = driver.findElements(verifyarrangelowtohigh);

        List<String> productName = new ArrayList<>();
        for (WebElement desktop : deskTopList) {
            productName.add(desktop.getText());

            List<String> templist = new ArrayList<>();  // temporary array list
            templist.addAll(productName);


            Collections.sort(templist, Collections.<String>reverseOrder());  // Collections.sort(templist); for Asc only
            System.out.println(productName);
            System.out.println(templist);

            Assert.assertEquals(productName, templist);
        }
    }
}
