package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.shopping.SecureCheckout;
import com.xcart.mobile.pages.shopping.Shopping;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
        Shopping shopping = new Shopping();
        SecureCheckout secureCheckout = new SecureCheckout();
        @Test
        public void verifyThatUserShouldPlaceOrderSuccessfully() throws InterruptedException {
            Thread.sleep(10000);
            shopping.hoveronhotdeals();
            shopping.clickonsale();
            shopping.hoveronsortbyselectAtoZ();
            shopping.clickaddtocart();
            shopping.clickoncartandviewcart();
            shopping.changequty();
            shopping.checkout();
            shopping.enteremailandpassword();
            shopping.clickoncontinue();
            secureCheckout.filldetails();
        }

}
