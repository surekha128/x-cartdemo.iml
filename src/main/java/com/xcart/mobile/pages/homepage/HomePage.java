package com.xcart.mobile.pages.homepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

/*
1 - verifyUserShouldNavigateToShippingPageSuccessfully()
		1.1 Click on the “Shipping” link
		1.2 Verify the text “Shipping”
	2 - verifyUserShouldNavigateToNewPageSuccessfully()
		2.1 Click on the “New!” link
		2.2 Verify the text “New arrivals”
	3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
		3.1 Click on the “Coming soon” link
		3.2 Verify the text “Coming soon”
	4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
		4.1 Click on the “Contact us” link
		4.2 Verify the text “Contact us”

 */
public class HomePage extends Utility {

//1
    By linkshipping = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]");
    By verifytextshipping = By.cssSelector("#page-title");
//2
    By linknew = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]");
    By verifytextnewaarivals = By.cssSelector("#page-title");
//3
    By  linkcomingsoon = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]");
    By verifytextcomingsoon = By.cssSelector("#page-title");
//4
    By linkcontactus = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]");
    By verifytextcontactus = By.cssSelector("#page-title");


    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        Reporter.log("Clicking on login link " + linkshipping.toString() + "<br>");

        clickOnElement(linkshipping);
        String expectedMessage = "Shipping";
        String actualMessage = getTextFromElement(verifytextshipping);
        Assert.assertEquals(actualMessage, expectedMessage);
    }


    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        Reporter.log("Clicking on login link " + linknew.toString() + "<br>");

        clickOnElement(linknew);
        String expectedMessage = "New arrivals";
        String actualMessage = getTextFromElement(verifytextnewaarivals);
        Assert.assertEquals(actualMessage, expectedMessage);

    }


    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        Reporter.log("Clicking on login link " + linkcomingsoon.toString() + "<br>");

        clickOnElement(linkcomingsoon);
        String expectedMessage = "Coming soon";
        String actualMessage = getTextFromElement(verifytextcomingsoon);
        Assert.assertEquals(actualMessage, expectedMessage);

    }


    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        Reporter.log("Clicking on login link " + linkcontactus.toString() + "<br>");

        clickOnElement(linkcontactus);
        String expectedMessage = "Contact us";
        String actualMessage = getTextFromElement(verifytextcontactus);
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}

