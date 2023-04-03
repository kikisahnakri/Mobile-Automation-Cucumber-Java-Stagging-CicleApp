package com.kikisahnakri.page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChatPage {

    AppiumDriver driver;

    public ChatPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    MobileElement chatBox;

    @AndroidFindBy(xpath = "(//android.widget.Button)[last()]")
    MobileElement sendButton;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    List<MobileElement> sendMessage;

    public void sendChat( String message ){
        chatBox.click();
        chatBox.sendKeys(message);
        sendButton.click();
    }

    public boolean isDisplayed(){
        chatBox.isDisplayed();
        return true;
    }

    public String getLastMessage(){
        return sendMessage.get(sendMessage.size()-1).getAttribute("content-desc");
    }
//=================================Mention user======================================
    By chat= MobileBy.xpath("//android.widget.EditText[@text=\"type message...\"]");
    public void chatBx() {
        driver.findElement(chat).click();
    }

    By user= MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"KikiTesting\"])[last()]");
    public boolean isDisplayedUser(){
        driver.findElement(user).isDisplayed();
        return true;
    }


    //==============================add image 1 mb =============
    By iconAddFile= MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[5]");
    By buttonAddfile= MobileBy.xpath("//android.view.View[@content-desc=\"Image from Gallery\"]");
    public void iconAddFile() {
        driver.findElement(chat).click();
        driver.findElement(iconAddFile).click();
        driver.findElement(buttonAddfile).click();
    }

    By Addfile= MobileBy.xpath("//android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    public void addFile() {
        driver.findElement(Addfile).click();
    }
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ScrollView/android.widget.ImageView[last()]")
    MobileElement lastImage;
    public boolean isDisplayedLastImage(){
        lastImage.isDisplayed();
        return true;
    }

//===================Empty chat============
    public void sendEmptyChat( String message ){
        driver.findElement(chat).click();
        driver.findElement(chat).sendKeys(message);
    }

//==================Html code=============
    public String verifMessageHtml(){
        return sendMessage.get(sendMessage.size()-1).getAttribute("content-desc");
    }
//============================add file > 25 MB=================
    By AddImage= MobileBy.xpath("//android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
    public void addImage() {
        driver.findElement(AddImage).click();
    }
//==============Personal chat===================
    By brgrButton = MobileBy.xpath("//android.view.View[@content-desc=\"Menu\n" +
        "Tab 4 of 4\"]");
    public void burgerButton(){
        driver.findElement(brgrButton).click();
    }

    By iconInbox = MobileBy.xpath("//android.view.View[@content-desc=\"Inbox\"]");
    public void inboxIcon(){
        driver.findElement(iconInbox).click();
    }
    By chooseUser = MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView[1]");
    public void userWantToChat(){
        driver.findElement(chooseUser).click();
    }

    By chatBxPersonal= MobileBy.xpath("//android.widget.EditText[@text=\"type message...\"]");
    public boolean Displayed(){
        driver.findElement(chatBxPersonal).isDisplayed();
        return true;
    }
    By chatBoxPersonal= MobileBy.xpath("//android.widget.EditText[@text=\"type message...\"]");
    By sendChatPersonalButton= MobileBy.xpath("(//android.widget.Button)[last()]");
    public void sendChatPersonalButton( String message ){
        driver.findElement(chatBoxPersonal).click();
        driver.findElement(chatBoxPersonal).sendKeys(message);
        driver.findElement(sendChatPersonalButton).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    List<MobileElement> sendMessagePersonal;
        public String getLastPersonalMessage(){
            return sendMessagePersonal.get(sendMessagePersonal.size()-1).getAttribute("content-desc");
        }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ScrollView/android.widget.ImageView[last()]")
    MobileElement lastImagePersonal;
    public boolean isDisplayedLastImagePersonal(){
        lastImagePersonal.isDisplayed();
        return true;
    }
//============================Personal chat image < 1 mb ===============
    By personalChatbox= MobileBy.xpath("//android.widget.EditText[@text=\"type message...\"]");
    By iconAddFilePersonal= MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[4]");
    By buttonAddfilePersonal= MobileBy.xpath("//android.view.View[@content-desc=\"Image from Gallery\"]");
    public void iconAddFilePersonal() throws InterruptedException {
        driver.findElement(personalChatbox).click();
        driver.findElement(iconAddFilePersonal).click();
        driver.findElement(buttonAddfilePersonal).click();
        Thread.sleep(2000);
    }

    By AddImagefilePersonal= MobileBy.xpath("//android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    public void AddImageFilePersonal() {
        driver.findElement(AddImagefilePersonal).click();
    }

    //======================EMpty personal chat==============================
    public void sendEmptyPersonalChat( String message ){
        driver.findElement(personalChatbox).click();
        driver.findElement(personalChatbox).sendKeys(message);
    }

    public boolean isDisplayedPersonalChat(){
        driver.findElement(personalChatbox).isDisplayed();
        return true;
    }
//===============================Personal chat upload image > 25 mb ============================
    By addBigImagePersonal= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"SampleJPGImage_30mbmb.jpg, 30,79 MB, 22 Mar\"]/android.widget.RelativeLayout/android.view.View");
    public void addBigImagePersonal() {
        driver.findElement(addBigImagePersonal).click();
    }
//================================group chat upload > 25 mb ==========================
By bigImageGrp= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"SampleJPGImage_30mbmb.jpg, 30,79 MB, 22 Mar\"]/android.widget.RelativeLayout/android.view.View");
    public void addBigImage() {
        driver.findElement(bigImageGrp).click();
    }

}
