package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsTest extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='sublist first-level']//a[contains(text(),'Cell phones ')]")
    WebElement cellPhone;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listTab;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show details for Nokia Lumia 1020']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement textNokia;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement close;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement messageSC;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement qty2;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='value-summary'])[1]")
    WebElement total;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement agreeWith;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement  register;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement textRegister;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement completedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement card;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement agree;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName1;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement getEmail;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;

   // By electronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
   // By cellPhone = By.xpath("//ul[@class='sublist first-level']//a[contains(text(),'Cell phones ')]");
   // By text = By.xpath("//h1[contains(text(),'Cell phones')]");
   // By listTab = By.xpath("//a[contains(text(),'List')]");
   // By productName =By.xpath("//a[@title='Show details for Nokia Lumia 1020']");
   // By textNokia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
   // By verifyPrice = By.xpath("//span[@id='price-value-20']");
   // By qty = By.xpath("//input[@id='product_enteredQuantity_20']");
   // By addToCart  = By.xpath("//button[@id='add-to-cart-button-20']");
   // By message = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
   // By close = By.xpath("//span[@class='close']");
   // By shoppingCart = By.xpath("//span[@class='cart-label']");
  //  By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    //By messageSC = By.xpath("//h1[contains(text(),'Shopping cart')]");
   // By qty2 = By.xpath("//input[@id='itemquantity11220'][@aria-label='Qty.']");
   // By total = By.xpath("//tbody/tr[1]/td[6]/span[1]");
   // By agreeWith = By.xpath("//input[@id='termsofservice']");
   // By checkOut = By.xpath("//button[@id='checkout']");
   // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
   // By register = By.xpath("//button[contains(text(),'Register')]");
   // By textRegister = By.xpath("//h1[contains(text(),'Register')]");
   // By firstname = By.xpath("//input[@id='FirstName']");
    //By lastName = By.xpath("//input[@id='LastName']");
   // By  email = By.xpath("//input[@id='Email']");
   // By password = By.xpath("//input[@id='Password']");
    //By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
   // By registerButton = By.xpath("//button[@id='register-button']");
   // By completedText = By.xpath("//h1[contains(text(),'Register')]");
   // By continueTab = By.xpath("//a[contains(text(),'Continue')]");
   // By card = By.xpath("//h1[contains(text(),'Shopping cart')]");
   // By agree = By.xpath("//input[@id='termsofservice']");
   // By checkOut1 = By.xpath("//button[@id='checkout']");
  // By firstName1 = By.xpath("//input[@id='BillingNewAddress_FirstName']");
   // By lastName1 = By.xpath("//input[@id='BillingNewAddress_LastName']");
    //By getEmail = By.id("BillingNewAddress_Email");
  //  By country = By.id("BillingNewAddress_CountryId");
   // By city = By.xpath("//input[@id='BillingNewAddress_City']");


    //Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    public void electronics()
    {
        //1.1 Mouse Hover on “Electronics” Tab
        mouseHoverToElement(electronics);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void cellPhone()
    {
        //1.2 Mouse Hover on “Cell phones” and click
        clickOnElement(cellPhone);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void getText()
    {
        //1.3 Verify the text “Cell phones”
        getTextFromElement(text);
    }
    public void setListTab()
    {
        //2.4 Click on List View Tab
        clickOnElement(listTab);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setProductName()
    {
        //2.5 Click on product name “Nokia Lumia 1020” link
       clickOnElement(productName);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void getTextNokia()
    {
        //2.6 Verify the text “Nokia Lumia 1020”
        getTextFromElement(textNokia);
    }
    public void setVerifyPrice()
    {
        //Verify the price “$349.00”
        getTextFromElement(verifyPrice);
    }
    public void setQty(String qty1)
    {
        //Change quantity to 2
        remove(qty);
        sendTextToElement(qty,qty1);
        CustomListeners.test.log(Status.PASS,"send "+qty);
    }
    public void setAddToCart()
    {
        //2.9 Click on “ADD TO CART” tab
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void getMessage()
    {
        //Verify the Message "The product has been added to your shopping cart" on
        getTextFromElement(message);
    }
    public void setClose()
    {
        //After that close the bar clicking on the cross button.
        clickOnElement(close);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setShoppingCart()
    {
        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void gotocart()
    {
        clickOnElement(goToCart);
    }
    public void setMessage()
    {
        //2.12 Verify the message "Shopping cart"
        getTextFromElement(messageSC);
    }
    public void setQty2()
    {
        //2.12 Verify the message "Shopping cart"
        //2.13 Verify the quantity is 2
        getTextFromElement(qty2);
    }
    public void setTotal()
    {
        //2.14 Verify the Total $698.00
        getTextFromElement(total);
    }
    public void setAgreeWith()
    {
        //2.15 click on checkbox “I agree with the terms of service”
        clickOnElement(agreeWith);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setCheckOut()
    {
        //2.16 Click on “CHECKOUT”
        clickOnElement(checkOut);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void getWelcomeText()
    {
        //2.17 Verify the Text “Welcome, Please Sign In!”
        getTextFromElement(welcomeText);
    }
    public void setRegister()
    {
        //2.18 Click on “REGISTER” tab
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void registerText()
    {
        //2.19 Verify the text “Register”
        getTextFromElement(textRegister);
    }
    public void setFirstname(String name)
    {
        //2.19 Verify the text “Register”
        //2.20 Fill the mandatory fields
        sendTextToElement(firstname,name);
        CustomListeners.test.log(Status.PASS,"send "+firstname);
    }
    public void setLastName(String lastName1)
    {
        sendTextToElement(lastName,lastName1);
        CustomListeners.test.log(Status.PASS,"send "+lastName);
    }
    public void setEmail(String email1)
    {
        sendTextToElement(email,email1);
        CustomListeners.test.log(Status.PASS,"send "+email);
    }
    public void setPassword(String password1)
    {
        sendTextToElement(password,password1);
        CustomListeners.test.log(Status.PASS,"send "+password);
    }
    public void setConfirmPassword(String confirmPassword1)
    {
        sendTextToElement(confirmPassword,confirmPassword1);
        CustomListeners.test.log(Status.PASS,"send "+confirmPassword);
    }
    public void setRegisterButton()
    {
        //2.21 Click on “REGISTER” Button
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setCompletedText()
    {
        //2.22 Verify the message “Your registration completed”
        getTextFromElement(completedText);
    }
    public void clickOnContinue()
    {
        //2.23 Click on “CONTINUE” tab
        clickOnElement(continueTab);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void card()
    {
        //2.24 Verify the text “Shopping card”
        getTextFromElement(card);
    }
    public void agreeWith()
    {
        //2.25 click on checkbox “I agree with the terms of service”
        clickOnElement(agree);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void checkOut()
    {
        //2.26 Click on “CHECKOUT”
        clickOnElement(checkOut1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setFirstName1(String data)
    {
        //2.27 Fill the Mandatory fields
        sendTextToElement(firstName1,data);
        sendTextToElement(lastName1,data);
        sendTextToElement(getEmail,data);
        sendTextToElement(country,data);
        sendTextToElement(city,data);
        CustomListeners.test.log(Status.PASS,"send ");
    }
}
