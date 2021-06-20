package com.xcart.mobile.pages.shopping;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/*
1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Sale”  link and click
		1.3 Verify the text “Sale”
		1.4 Mouse hover on “Sort By” and select “Name A-Z”
		1.5 Click on “Add to cart” button of the product “Cup of Mojo Bluetooth
      Speaker”
1.6 Verify the message “Product has been added to your cart” display in  green bar
1.7 Click on X sign to close the message
1.8 Click on “Your cart” icon and Click on “View cart” button
//1.9 Verify the text “Your shopping cart - 1 item”
//1.10 Change the Qty = 2
//1.11 Verify the text “Your shopping cart - 2 items”
//1.12 Verify the Subtotal $39.98
//1.13 Verify the total $46.18
//1.14 Click on “Go to checkout” button
//1.15 Verify the text “Log in to your account”
//1.16 Enter Email address
//1.17 Click on “Continue”
//1.18 Verify the text “Secure Checkout”
//1.19 Fill all the mandatory fields
 */
public class Shopping extends Utility {

    By hoveronhotdeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By hoveronsalelinkandclick = By.linkText("Sale");
    By verifytectsale = By.xpath("//h1[@id='page-title']");
    By mousehoveronsortby = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By selectNameAtoZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By addtocartonproduct = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[4]/div[1]/button[1]");
    By verifyproductaddedtocart = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closepopup = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]");
    By clickoncartbtn = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]");
    By clickonviewcart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]/div[3]/div[1]/a[1]");
    By verifytext1item = By.xpath("//h1[@id='page-title']");
    By clearqty = By.xpath("//input[@id='amount16']");
    By changeqty = By.xpath("//input[@id='amount16']");
    By verifyitem2qty = By.xpath("//h1[@id='page-title']");
    By verifysubtotal = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]");
    By verifytotal = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]");
    By checkout = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]/button[1]");
    By verifylogintext = By.xpath("//h3[contains(text(),'Log in to your account')]");
   // By enterpassword = By.xpath("//input[@id='login-password']");
   String entremail = generateRandomNumber()+"@yahoo.com";
   By enteremail = By.cssSelector("#email");
    By clickcountinue = By.xpath("//tbody/tr[2]/td[1]/button[1]");
    By verifysecuretext = By.xpath("    //body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]\n");

    public void hoveronhotdeals(){
        mouseHoverToElement(hoveronhotdeals);
}
public void clickonsale(){
        clickOnElement(hoveronsalelinkandclick);
    String expectedMessage = "Sale";
    String actualMessage = getTextFromElement(verifytectsale);
    Assert.assertEquals(actualMessage, expectedMessage);
}
public void hoveronsortbyselectAtoZ() throws InterruptedException {
       Thread.sleep(3000);
       mouseHoverToElement( mousehoveronsortby);
       clickOnElement(selectNameAtoZ);
}
public void clickaddtocart() throws InterruptedException {
       Thread.sleep(5000);
       clickOnElement(addtocartonproduct);
    String expectedMessage = "Product has been added to your cart";
    String actualMessage = getTextFromElement(verifyproductaddedtocart);
    Assert.assertEquals(actualMessage, expectedMessage);
    clickOnElement(closepopup);
}
public void clickoncartandviewcart() throws InterruptedException {
       Thread.sleep(3000);
        clickOnElement(clickoncartbtn);
        clickOnElement(clickonviewcart);
    String expectedMessage = "Your shopping cart - 1 item";
    String actualMessage = getTextFromElement(verifytext1item);
    Assert.assertEquals(actualMessage, expectedMessage);

}
public void changequty() throws InterruptedException {
       Thread.sleep(5000);
     driver.findElement(clearqty).clear();
     sendTextToElement(changeqty,"2");
  /*  Thread.sleep(5000);
    String expectedMessage = "Your shopping cart - 2 item";
    String actualMessage = getTextFromElement(verifyitem2qty);
    Assert.assertEquals(actualMessage, expectedMessage);
*/
  /*  Thread.sleep(5000);
    String expectedMessage1 = "$29.98";
    String actualMessage1 = getTextFromElement(verifysubtotal);
    Assert.assertEquals(actualMessage1, expectedMessage1);

    String expectedMessage2 = "$36.00";
    String actualMessage2 = getTextFromElement(verifytotal);
    Assert.assertEquals(actualMessage2, expectedMessage2);*/
}
public void checkout() throws InterruptedException {
       Thread.sleep(5000);
        clickOnElement(checkout);

}

public  void enteremailandpassword() throws InterruptedException {

  /*  Thread.sleep(5000);
    String expectedMessage2 = "Log in to your account";
    String actualMessage2 = getTextFromElement(verifylogintext);
    Assert.assertEquals(actualMessage2, expectedMessage2);*/
Thread.sleep(3000);
    sendTextToElement(enteremail,entremail);
   // sendTextToElement(enterpassword,"qwe123");

   }
public void clickoncontinue(){
       clickOnElement(clickcountinue);

    String expectedMessage2 = "Secure Checkout";
    String actualMessage2 = getTextFromElement(verifysecuretext);
    Assert.assertEquals(actualMessage2, expectedMessage2);
   }


//1.20 Check the check box “Create an account for later use”
//1.21 Enter the password
//1.22 Select the Delivery Method to “Local Shipping”
//1.23 Select Payment Method “COD”
//1.24 Verify the total $47.22
//1.25 Click on “Place Order” Button
//1.26 Verify the text “Thank you for your order”
}
