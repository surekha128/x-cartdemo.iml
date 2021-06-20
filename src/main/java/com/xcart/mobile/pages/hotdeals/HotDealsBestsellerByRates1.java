package com.xcart.mobile.pages.hotdeals;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
6 - verifyBestSellersProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Bestsellers”  link and click
		3.3 Verify the text “Bestsellers”
		3.4 Mouse hover on “Sort By” and select “Rates”
		3.5 Verify that the product’s arrange Rates
 */
public class HotDealsBestsellerByRates1 extends Utility {


    By hoveronhotdeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By linkBestsellersclick = By.linkText("Bestsellers");
    By verifyBestsellers = By.xpath("//h1[@id='page-title']");
    By hoversortby = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By selectrates = By.partialLinkText("Rates");
    By verifyproductarrangerates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]");

    public void hoveronhotdeals(){

        mouseHoverToElement(hoveronhotdeals);
    }

    public void clicklinkonbestseller(){
        clickOnElement(linkBestsellersclick);
        String expectedMessage = "Bestsellers";
        String actualMessage = getTextFromElement(verifyBestsellers);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void hoversortbyselectrates(){
        mouseHoverToElement(hoversortby);
        clickOnElement(selectrates);
        List<WebElement> deskTopList = driver.findElements(verifyproductarrangerates);

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
