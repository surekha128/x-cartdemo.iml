package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.homepage.HomePage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

HomePage homePage = new HomePage();

    @Test
    public void verifytopmenutest(){
        homePage.verifyUserShouldNavigateToShippingPageSuccessfully();
        homePage.verifyUserShouldNavigateToNewPageSuccessfully();
        homePage.verifyUserShouldNavigateToComingsoonPageSuccessfully();
        homePage.verifyUserShouldNavigateToContactUsPageSuccessfully();
    }

}
