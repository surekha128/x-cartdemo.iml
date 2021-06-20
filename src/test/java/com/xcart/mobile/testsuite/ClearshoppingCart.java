package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.shopping.ClearShoppingCartSuccessfully;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class ClearshoppingCart extends TestBase {
    ClearShoppingCartSuccessfully clearShoppingCartSuccessfully = new ClearShoppingCartSuccessfully();


    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        Thread.sleep(10000);
        clearShoppingCartSuccessfully.mousehoveronhotdeals();
        clearShoppingCartSuccessfully.clickbestsellerlink();
        clearShoppingCartSuccessfully.moudehoveronsortby();
        clearShoppingCartSuccessfully.selectNameAtoZ();
        clearShoppingCartSuccessfully.clickoninylIdolzGhostbusters();
        clearShoppingCartSuccessfully.closepopup();
        clearShoppingCartSuccessfully.clickoncart();
        clearShoppingCartSuccessfully.clickviewcart();
        clearShoppingCartSuccessfully.clickemptycart();
        clearShoppingCartSuccessfully.closealert();
    }
}
