package com.xcart.mobile.testng;

import org.testng.annotations.Test;


public class TestNGGrouping {

    @Test(groups = {"sanity", "regression"})
    public void loginTest1() {
        System.out.println("Running test - HotDealsTest");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void loginTest2() {
        System.out.println("Running test - ShoppingTest");
    }

    @Test(groups = {"smoke", "regression1", "regression"})
    public void loginTest3() {
        System.out.println("Running test - TopMenuTest");
    }

    @Test(groups = {"smoke", "regression1", "regression"})
    public void loginTest4() {
        System.out.println("Running test - loginTest4");
    }

    @Test(groups = {"regression1", "regression"})
    public void regressionTest1() {
        System.out.println("Running test - regressionTest1");
    }

    @Test(groups = {"regression1", "regression"})
    public void computerTest1() {
        System.out.println("Running test - computerTest1");
    }

    @Test(groups = {"regression1", "regression"})
    public void computerTest2() {
        System.out.println("Running test - computerTest2");
    }

}
