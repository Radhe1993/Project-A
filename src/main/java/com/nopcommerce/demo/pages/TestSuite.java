package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TestSuite extends Utility
{
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computer;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='sublist']/li/a[@href='/desktops']")
    WebElement deskTop;

    @CacheLookup
    @FindBy()
    WebElement before;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']/option[@value='6']")
    WebElement zToA;

    @CacheLookup
    @FindBy()
    WebElement after;


    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement AToZ;

    @CacheLookup
    @FindBy(xpath ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement message;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement select;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement select1;

    @CacheLookup
    @FindBy(id= "product_attribute_3_7")
    WebElement select2;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement select3;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement checkBox1;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart1;

    @CacheLookup
    @FindBy(xpath = "//body/div[@class='bar-notification-container']/div[1]")
    WebElement message1;

    @CacheLookup
    @FindBy(xpath = "//ul/li/a[@class='ico-cart']/span[1]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement message2;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement cart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement agreeWithTerms;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement  checkout;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement tab;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postcode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 new-address-next-step-button']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement radioButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement getContinueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement getContinueButton1;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Master card')]")
    WebElement masterCard;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement carHolderName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'05')]")
    WebElement date;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'05')]")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement code;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement getContinueButton2;

  //  By computer = By.linkText("Computers");
    //By deskTop = By.xpath("//ul[@class='sublist']/li/a[@href='/desktops']");
   // ArrayList<String> before = new ArrayList<>();
   // By zToA = By.xpath("//select[@id='products-orderby']/option[@value='6']");
   // ArrayList<String> after = new ArrayList<>();
   // By AToZ = By.name("products-orderby");

   // By addToCart =By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
   // By message = By.xpath("//h1[contains(text(),'Build your own computer')]");
   // By select = By.xpath("//select[@id='product_attribute_1']");
   // By select1 = By.xpath("//select[@id='product_attribute_2']");
   // By select2 = By.xpath("//input[@id='product_attribute_3_7']");
   // By select3 = By.xpath("//input[@id='product_attribute_4_9']");
   // By checkBox = By.xpath("product_attribute_5_10");
   // By checkBox1 = By.xpath("//label[contains(text(),'Total Commander [+$5.00]')]");
  //  By price = By.xpath("//span[@id='price-value-1'][text()='$1,475.00']");
    //By addToCart1 = By.xpath("//button[@id='add-to-cart-button-1']");
    //By message1 = By.xpath("//body/div[@class='bar-notification-container']/div[1]");
   // By shoppingCart = By.xpath("//ul/li/a[@class='ico-cart']/span[1]");
    //By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
   // By message2 = By.xpath("//h1[contains(text(),'Shopping cart')]");
    //By qty = By.xpath("//input[@id='itemquantity11225']");
   // By cart = By.xpath("//button[@id='updatecart']");
    //By total = By.xpath("//tbody/tr[1]/td[6]");
   // By agreeWithTerms = By.xpath("//input[@id='termsofservice']");
   // By checkout = By.xpath("//button[@id='checkout']");
   // By text = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
  //  By tab = By.xpath("//button[contains(text(),'Checkout as Guest')]");
   // By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
   // By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
  //  By email = By.xpath("//input[@id='BillingNewAddress_Email']");
   // By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
  //  By city = By.xpath("//input[@id='BillingNewAddress_City']");
   // By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
   // By postcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
   // By phoneNumber =By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
  //  By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
   // By radioButton = By.xpath("//input[@id='shippingoption_1']");
   // By getContinueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
   // By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    //By getContinueButton1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
   // By masterCard = By.xpath("//option[contains(text(),'Master card')]");
   // By carHolderName =By.xpath("//input[@id='CardholderName']");
   // By cardNumber = By.xpath("//input[@id='CardNumber']");
   // By date = By.xpath("//option[contains(text(),'05')]");
   // By year = By.xpath("//option[contains(text(),'05')]");
    //By code = By.xpath("//input[@id='CardCode']");
   // By getContinueButton2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");



    public void setComputer()
    {
        clickOnElement(computer);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setDeskTop()
    {
        clickOnElement(deskTop);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void beforeProduct()
    {
        ArrayList<String> before = new ArrayList<>();
        List<WebElement> products =  driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        System.out.println("Total produtc ="+products.size());
        for (WebElement e : products)
        {
            before.add(e.getText());
        }
        System.out.println("Product Name = "+before);
    }

    public void setZToA()
    {
        clickOnElement(zToA);
        CustomListeners.test.log(Status.PASS,"click on button");

    }
    public void afterProduct()
    {

        ArrayList<String> after = new ArrayList<>();
        List<WebElement> products1 = driver.findElements(By.xpath("//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]"));
        System.out.println("Total product ="+products1.size());
        for (WebElement p : products1)
        {
            after.add(p.getText());
        }
        System.out.println("Product Name = "+after);
    }
    public void setAToz()  {
        //1.3 Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(AToZ,"Name: A to Z");


    }



    public void AddToCart()
    {
        try {
            //2.4 Click on "Add To Cart"
            clickOnElement(addToCart);
            CustomListeners.test.log(Status.PASS,"click on button");


        }
        catch (StaleElementReferenceException e) {
            //2.4 Click on "Add To Cart"
            clickOnElement(addToCart); ;
            CustomListeners.test.log(Status.PASS, "click on button");
        }
    }
    public void message()
    {
        //2.5 Verify the Text "Build your own computer"
        getTextFromElement(message);
    }
    public void setSelect(String select1)
    {
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        sendTextToElement(select,select1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setSelect1(String ram)
    {
        //2.7.Select "8GB [+$60.00]" using Select class.
        sendTextToElement(select1,ram);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void selectHdd()
    {
        //2.8 Select HDD radio "400 GB [+$100.00]"
        clickOnElement(select2);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setSelect3()
    {
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(select3);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void msOffice()
    {
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        clickOnElement(checkBox);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setCheckBox1()
    {
        // //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //        //[+$5.00]"
        clickOnElement(checkBox1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setPrice()
    {
        //2.11 Verify the price "$1,475.00"
        getTextFromElement(price);
    }
    public void setAddToCart()
    {
        //2.12 Click on "ADD TO CARD" Button.
        clickOnElement(addToCart1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setMessage()
    {
        //Verify the Message "The product has been added to your shopping cart" on Top
        getTextFromElement(message1);
    }
    public void setShoppingCart()
    {
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART
        mouseHoverToElement(shoppingCart);
    }
    public void goToCard()
    {
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void verifyMessage()
    {
        //2.15 Verify the message "Shopping cart"
        getTextFromElement(message2);
    }
    public void changeqty(String qty1)
    {
        //Change the Qty to "2" and Click on "Update shopping cart"
        remove(qty);
        sendTextToElement(qty,qty1);


    }
    public void Cart()
    {
        //"Update shopping cart"
        clickOnElement(cart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void totalPrice()
    {
        //2.17 Verify the Total"$2,950.00
        getTextFromElement(total);
    }
    public void setAgreeWithTerms()
    {
        //2.18 click on checkbox “I agree with the terms of service”
        clickOnElement(agreeWithTerms);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void ousetCheckt()
    {
        //2.19 Click on “CHECKOUT”
        clickOnElement(checkout);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void getText()
    {
        //2.20 Verify the Text “Welcome, Please Sign In!”
        getTextFromElement(text);
    }
    public void tab()
    {
        //In!”
        //2.21Click on “CHECKOUT AS GUEST” Tab
        clickOnElement(tab);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
       public void setFirstName(String firstName1)
       {
           //Fill the all mandatory field
           sendTextToElement(firstName,firstName1);
           CustomListeners.test.log(Status.PASS,"send "+firstName);


       }
       public void setLastName(String lastName1) {
           //Fill the all mandatory field
           sendTextToElement(lastName, lastName1);
           CustomListeners.test.log(Status.PASS,"send "+lastName);

       }
       public void setEmail(String email1)
       {
           //Fill the all mandatory field
           sendTextToElement(email,email1);
           CustomListeners.test.log(Status.PASS,"send "+email);

       }
       public void setCountry(String country1)
       {
           sendTextToElement(country,country1);
           CustomListeners.test.log(Status.PASS,"send");
       }
       public void setCity(String city1)
       {
           sendTextToElement(city,city1);
           CustomListeners.test.log(Status.PASS,"send "+city);

       }
       public void setAddress(String address1)
       {
           sendTextToElement(address,address1);
           CustomListeners.test.log(Status.PASS,"send "+address);
       }
       public void setPostcode(String postcode1)
       {
           sendTextToElement(postcode,postcode1);
           CustomListeners.test.log(Status.PASS,"send "+postcode);
       }
       public void setPhoneNumber(String phoneNumber1)
       {
           sendTextToElement(phoneNumber,phoneNumber1);
           CustomListeners.test.log(Status.PASS,"send "+phoneNumber);
       }
       public void setContinueButton()
       {
           //Click on “CONTINUE”
           clickOnElement(continueButton);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void setRadioButton()
       {
           //Click on Radio Button “Next Day Air($0.00)”
           clickOnElement(radioButton);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void setGetContinueButton()
       {
           //2.25 Click on “CONTINUE”
           clickOnElement(getContinueButton);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void setCreditCard()
       {
           //2.26 Select Radio Button “Credit Card”
           clickOnElement(creditCard);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void setGetContinueButton1()
       {
           clickOnElement(getContinueButton1);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void setMasterCard()
       {
           clickOnElement(masterCard);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void entercarHolderName(String name)
       {
           sendTextToElement(carHolderName,name);
       }
       public void enterCardNumber(String cardNumber1)
       {
           sendTextToElement(cardNumber,cardNumber1);
       }
       public void setDate()
       {
           clickOnElement(date);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void setYear()
       {
           clickOnElement(year);
           CustomListeners.test.log(Status.PASS,"click on button");
       }
       public void setCode(String code1)
       {
           sendTextToElement(code,code1);
       }
       public void setGetContinueButton2()
       {
           clickOnElement(getContinueButton2);
           CustomListeners.test.log(Status.PASS,"click on button");
       }



}
