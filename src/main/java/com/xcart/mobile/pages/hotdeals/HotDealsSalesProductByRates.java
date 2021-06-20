package com.xcart.mobile.pages.hotdeals;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	3 - verifySaleProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Sale”  link and click
		3.3 Verify the text “Sale”
		3.4 Mouse hover on “Sort By” and select “Rates”
		3.5 Verify that the product’s arrange Rates
 */
public class HotDealsSalesProductByRates extends Utility {

    By hoveronhotdeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By linkSaleclick = By.linkText("Sale");
    By verifysale = By.xpath("//h1[@id='page-title']");
    By hoversortby = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By selectrates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]");
    By verifyproductarrangerates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]");

    public void hoverhotdeals(){
        mouseHoverToElement(hoveronhotdeals);
    }

    public void hoverandclicksale(){
        clickOnElement(linkSaleclick);
        String expectedMessage = "Sale";
        String actualMessage = getTextFromElement(verifysale);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void hoveronsortbyselectrates(){
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
