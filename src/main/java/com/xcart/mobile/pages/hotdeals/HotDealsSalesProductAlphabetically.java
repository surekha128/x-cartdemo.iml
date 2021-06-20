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
1 - verifySaleProductsArrangeAlphabetically()
    1.1 Mouse hover on the “Hot deals” link
    1.2 Mouse hover on the “Sale”  link and click
    1.3 Verify the text “Sale”
    1.4 Mouse hover on “Sort By” and select “Name A-Z”
    1.5 Verify that the product arrange alphabetically
 */
public class HotDealsSalesProductAlphabetically extends Utility {

    By linkhotdeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By clicksale = By.linkText("Sale");
    By verifytextsale = By.cssSelector("#page-title");

    By hoveronsortby = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By clickonnameAZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]");
    By verifyproductarrangealphabetically = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]");


public void hoveronhotdeal(){
    Reporter.log("Clicking on login link " + linkhotdeals.toString() + "<br>");

    mouseHoverToElement(linkhotdeals);
}

public void clickonsale(){
    Reporter.log("Clicking on login link " + verifytextsale.toString() + "<br>");

    clickOnElement(clicksale);
    String expectedMessage = "Sale";
    String actualMessage = getTextFromElement(verifytextsale);
    Assert.assertEquals(actualMessage, expectedMessage);
}

public void hoveronsortbyandselectNameAZ(){
    Reporter.log("Clicking on login link " + hoveronsortby.toString() + "<br>");

    mouseHoverToElement(hoveronsortby);
    clickOnElement(clickonnameAZ);
    List<WebElement> deskTopList = driver.findElements(verifyproductarrangealphabetically);

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
