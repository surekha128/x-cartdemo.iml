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
4 - verifyBestSellersProductsArrangeByZToA()
		1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Bestsellers”  link and click
		1.3 Verify the text “Bestsellers”
		1.4 Mouse hover on “Sort By” and select “Name Z-A”
		1.5 Verify that the product arrange by Z to A

 */
public class HotDealsBestsellerProductArrangeZtoA extends Utility {

    By hoveronhotdeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By linkBestsellersclick = By.linkText("Bestsellers");
    By verifyBestsellers = By.xpath("//h1[@id='page-title']");
    By hoversortby = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By selectNameZtoA = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]");
    By verifyproductarrangeZtoA = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]");

    public void hoverOnHotDeals(){
        Reporter.log("Clicking on login link " + hoveronhotdeals.toString() + "<br>");
        mouseHoverToElement(hoveronhotdeals);
    }

    public void clickbestseller(){
        Reporter.log("Clicking on login link " + linkBestsellersclick.toString() + "<br>");
        clickOnElement(linkBestsellersclick);
        String expectedMessage = "Bestsellers";
        String actualMessage = getTextFromElement(verifyBestsellers);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void hoveronsortbyselectNameZtoA(){
        Reporter.log("Clicking on login link " + hoversortby.toString() + "<br>");
        Reporter.log("Clicking on login link " + selectNameZtoA.toString() + "<br>");

        mouseHoverToElement(hoversortby);
        clickOnElement(selectNameZtoA);
        List<WebElement> deskTopList = driver.findElements(verifyproductarrangeZtoA);

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
