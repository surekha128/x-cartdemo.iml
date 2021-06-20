package com.xcart.mobile.pages.shopping;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SecureCheckout extends Utility {


    By customerFirstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By customerLastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By adress = By.id("shippingaddress-street");
    By City = By.xpath("//input[@id='shippingaddress-city']");
    By Country = By.xpath("//select[@id='shippingaddress-country-code']");
    By State = By.xpath("//input[@id='shippingaddress-custom-state']");
    By ZipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By PhoneNumber = By.xpath("//input[@id='shippingaddress-phone']");
    By Button = By.xpath("//input[@id='create_profile']");
    By Password = By.xpath("//input[@id='password']");
    By deliverymethod  = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]");
   By clicklocalshiip = By.xpath("//input[@id='method128']");
   By paymethod = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]");
   By clickCod = By.xpath("//input[@id='pmethod6']");
    By verifytotal = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]");
    By placeorder = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By thankYouForOrder = By.xpath("//h1[@id='page-title']");




    public void filldetails() throws InterruptedException {
        Thread.sleep(9000);
        sendTextToElement(customerFirstName,"leon");
        sendTextToElement(customerLastName,"kit");
        sendTextToElement(adress,"101,kfc ");
        sendTextToElement(City,"Green");
        sendTextToElement(Country,"Maldives");
        sendTextToElement(State,"criss");
        sendTextToElement(ZipCode,"29009");
        sendTextToElement(PhoneNumber,"09532431231");
        clickOnElement(Button);
        sendTextToElement(Password,"qwe123");
        Thread.sleep(10000);
        mouseHoverToElement(deliverymethod);
        clickOnElement(clicklocalshiip);
        mouseHoverToElement(paymethod);
        clickOnElement(clickCod);
        String expectedMessage = "$37.03";
        String actualMessage = getTextFromElement(verifytotal);
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(2000);
        clickOnElement(placeorder);
        String expectedMessage1 = "Thank you for your order";
        String actualMessage1 = getTextFromElement(thankYouForOrder);
        Assert.assertEquals(actualMessage1, expectedMessage1);


    }

}
