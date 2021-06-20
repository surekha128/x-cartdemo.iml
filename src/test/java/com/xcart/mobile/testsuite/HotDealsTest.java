package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.hotdeals.*;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

    HotDealsSalesProductAlphabetically hotDealsSalesProductAlphabetically = new HotDealsSalesProductAlphabetically();
    HotDealsSalesProductPriceLowtoHigh hotDealsSalesProductPriceLowtoHigh = new HotDealsSalesProductPriceLowtoHigh();
    HotDealsSalesProductByRates hotDealsSalesProductByRates = new HotDealsSalesProductByRates();
    HotDealsBestsellerProductArrangeZtoA hotDealsSalesProductArrangeZtoA = new HotDealsBestsellerProductArrangeZtoA();
    HotDealsBestsellerProductHightoLow hotDealsSalesProductHightoLow = new HotDealsBestsellerProductHightoLow();
    HotDealsBestsellerByRates1 hotDealsBestsellerByRates1 = new HotDealsBestsellerByRates1();
    @Test
    public void verifySaleProductsArrangeAlphabetically()  {
        hotDealsSalesProductAlphabetically.hoveronhotdeal();
        hotDealsSalesProductAlphabetically.clickonsale();
        hotDealsSalesProductAlphabetically.hoveronsortbyandselectNameAZ();
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        hotDealsSalesProductPriceLowtoHigh.mousehoveronhotdeals();
        hotDealsSalesProductPriceLowtoHigh.clickonsalelink();
        hotDealsSalesProductPriceLowtoHigh.hoveronsortbyandclickpricelowtohigh();
    }

    @Test
    public void verifySaleProductsArrangeByRates(){
        hotDealsSalesProductByRates.hoverhotdeals();
        hotDealsSalesProductByRates.hoverandclicksale();
        hotDealsSalesProductByRates.hoveronsortbyselectrates();
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        hotDealsSalesProductArrangeZtoA.hoverOnHotDeals();
        hotDealsSalesProductArrangeZtoA.clickbestseller();
        hotDealsSalesProductArrangeZtoA.hoveronsortbyselectNameZtoA();
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
        hotDealsSalesProductHightoLow.mousehoveronhotdeals();
        hotDealsSalesProductHightoLow.clickbestseller();
        hotDealsSalesProductHightoLow.hoveronsortbyandclickpricehightolow();
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates(){
        hotDealsBestsellerByRates1.hoveronhotdeals();
        hotDealsBestsellerByRates1.clicklinkonbestseller();
        hotDealsBestsellerByRates1.hoversortbyselectrates();

    }
}
