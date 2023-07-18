package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ElectronicsTest;
import com.nopcommerce.demo.pages.TestSuite;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest
{

       TestSuite test;
       ElectronicsTest eTest;

       @BeforeMethod(groups = {"sanity","smoke","regression","regression1"})
       public void init()
       {
           test = new TestSuite();
           eTest = new ElectronicsTest();
       }

       @Test(groups = {"sanity"})
       public void verifyProductAddedToShoppingCartSuccessFully()
       {
           test.setComputer();
           test.setDeskTop();
           test. beforeProduct();
           test.setZToA();
           test.afterProduct();
           String expected = "Lenovo IdeaCentre 600 All-in-One PC";
           String actual =getTextFromElement(By.xpath("//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]"));
           Assert.assertEquals(actual,expected);
       }
       @Test(groups = {"smoke"})
       public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
           test.setComputer();
           test.setDeskTop();
           Thread.sleep(2000);
           test.setAToz();
           Thread.sleep(2000);
           test. AddToCart();
           Thread.sleep(2000);
           test.message();
           Thread.sleep(2000);
           test.setSelect("2.2 GHz Intel Pentium Dual-Core E2200");
           Thread.sleep(2000);
           test.setSelect1("8GB [+$60.00]");
           test.selectHdd();
           Thread.sleep(2000);
           test.setSelect3();
           Thread.sleep(2000);
           test.msOffice();
           Thread.sleep(2000);
           test.setCheckBox1();
           Thread.sleep(2000);
           test. setPrice();
           Thread.sleep(2000);
           test.setAddToCart();
           Thread.sleep(2000);
           test.setMessage();
           Thread.sleep(2000);
           test.setShoppingCart();
           Thread.sleep(2000);
           test. goToCard();
           test.verifyMessage();
           test.changeqty("2");
           Thread.sleep(2000);
           test.Cart();
           Thread.sleep(2000);
           test.totalPrice();
           Thread.sleep(2000);
           test.setAgreeWithTerms();
           Thread.sleep(2000);
           test.ousetCheckt();
           Thread.sleep(2000);
           test.getText();
           Thread.sleep(2000);
           test.tab();
           Thread.sleep(2000);
           Thread.sleep(2000);
           test.setFirstName("Ram");
           test.setLastName("Sita");
           test.setEmail("siyaram@gmail.com");
           test. setCountry("India");
           test.setCity("Surat");
           Thread.sleep(2000);
           test.setAddress("10,Opera City");
           test.setPostcode("PR511P");
           test. setPhoneNumber("5678902856");
           test. setContinueButton();
           test.setRadioButton();
           test.setGetContinueButton();
           Thread.sleep(2000);
           test.setCreditCard();
           test.setGetContinueButton1();
           test.setMasterCard();
           Thread.sleep(2000);
           test.entercarHolderName("Radha");
           test.enterCardNumber("567845");
           test.setDate();
           Thread.sleep(2000);
           test.setYear();
           test. setCode("5590");
           test.setGetContinueButton2();

       }
       @Test(groups = {"regression","regression1"})
       public void  verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
           eTest.electronics();
           eTest.cellPhone();
           eTest.getText();
           Thread.sleep(2000);
           String expected = "Cell phones";
           String actual = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
           Assert.assertEquals(actual,expected);
           eTest.setListTab();
           Thread.sleep(2000);
           eTest.setProductName();
           eTest.getTextNokia();
           String expected1 = "Nokia Lumia 1020";
           String actual1 =getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
           Assert.assertEquals(actual1,expected1);
           eTest.setVerifyPrice();
           String expected3 = "$349.00";
           String actual3 =getTextFromElement(By.xpath("//span[@id='price-value-20']"));
           Assert.assertEquals(actual3,expected3);
           Thread.sleep(2000);
           eTest.setQty("2");
           eTest.setAddToCart();
           eTest. getMessage();
           eTest. setClose();
           Thread.sleep(2000);
           eTest.setShoppingCart();
           eTest.gotocart();
           eTest.setMessage();
           eTest.setQty2();
           eTest. setTotal();
           Thread.sleep(2000);
           eTest.setAgreeWith();
           eTest.setCheckOut();
           eTest.getWelcomeText();
           eTest.setRegister();
           eTest.registerText();
           Thread.sleep(2000);
           eTest.setFirstname("Ram");
           eTest.setLastName("Sita");
           eTest.setEmail("sitaram@gmil.com");
           eTest.setPassword("sita@123");
           eTest.setConfirmPassword("sita@123");
           eTest.setRegisterButton();
           eTest.setCompletedText();
           Thread.sleep(2000);
           eTest.clickOnContinue();
           eTest.card();
           eTest.agreeWith();
           eTest.checkOut();
           eTest.setFirstName1("Radha");
       }

   }



