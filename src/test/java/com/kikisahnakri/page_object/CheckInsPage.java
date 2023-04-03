package com.kikisahnakri.page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckInsPage {
    AppiumDriver driver;

    public CheckInsPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    By checkInsPage= MobileBy.xpath("//android.view.View[@content-desc=\"Check-Ins\"]");
    public void checkInsPage() {
        driver.findElement(checkInsPage).click();
    }

    By buttonAdd = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public void buttonAdd() {
        driver.findElement(buttonAdd).click();
    }

    By inputQuestion = MobileBy.xpath("//android.widget.EditText[@text=\"type question here...\"]");
    public void inputQuestion(String textQuestion) {
        driver.findElement(inputQuestion).click();
        driver.findElement(inputQuestion).sendKeys(textQuestion);
    }

    By dayFri = MobileBy.xpath("//android.view.View[@content-desc=\"Fri\"]");
    By daySat = MobileBy.xpath("//android.view.View[@content-desc=\"Sat\"]");
    public void day() {
        driver.findElement(dayFri).click();
        driver.findElement(daySat).click();
    }

    By buttonTime = MobileBy.xpath("//android.view.View[@content-desc=\"set time\"]");
    By setTime = MobileBy.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    public void setTime() {
        driver.findElement(buttonTime).click();
        driver.findElement(setTime).click();
    }

    By buttonAddMember = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[15]");
    public void buttonAddMember() {
        driver.findElement(buttonAddMember).click();
    }

    By checkButton = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
    By submitButtonMember = MobileBy.xpath("//android.view.View[@content-desc=\"done\"]");
    public void submitAllMember() {
        driver.findElement(checkButton).click();
        driver.findElement(submitButtonMember).click();
    }

    By saveButtonQuestion = MobileBy.xpath("//android.widget.Button[@content-desc=\"Start collecting answer!\"]");
    public void saveButtonQuestion() {
        driver.findElement(saveButtonQuestion).click();
    }

    By successPopUp = MobileBy.xpath("//android.view.View[@content-desc=\"Create question successful\"]");
    public boolean isDisplayedPopUpMessage(){
        driver.findElement(successPopUp).isDisplayed();
        return true;
    }
//======================================PRIVATE QUESTION=============================================
    By inputQuestionPrivate = MobileBy.xpath("//android.widget.EditText[@text=\"type question here...\"]");
    public void inputQuestionPrivate(String privateQuestion) {
        driver.findElement(inputQuestionPrivate).click();
        driver.findElement(inputQuestionPrivate).sendKeys(privateQuestion);
    }
    By radioButtonPrivateQuestion = MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Switch");
    public void radioButtonPrivateQuestion() {
        driver.findElement(radioButtonPrivateQuestion).click();
    }
//=====================================ALL DAYS ==================================
    By day1 = MobileBy.xpath("//android.view.View[@content-desc=\"Mon\"]");
    By day2 = MobileBy.xpath("//android.view.View[@content-desc=\"Tue\"]");
    By day3 = MobileBy.xpath("//android.view.View[@content-desc=\"Wed\"]");
    By day4 = MobileBy.xpath("//android.view.View[@content-desc=\"Thu\"]");
    By day5 = MobileBy.xpath("//android.view.View[@content-desc=\"Fri\"]");
    By day6 = MobileBy.xpath("//android.view.View[@content-desc=\"Sat\"]");
    By day7 = MobileBy.xpath("//android.view.View[@content-desc=\"Sun\"]");

    public void allDay() {
        driver.findElement(day1).click();
        driver.findElement(day2).click();
        driver.findElement(day3).click();
        driver.findElement(day4).click();
        driver.findElement(day5).click();
        driver.findElement(day6).click();
        driver.findElement(day7).click();
    }
//====================== Add comment =====================================

    By headlineQuestion = MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
    public void headlineQuestion() {
        driver.findElement(headlineQuestion).click();
    }

    By clickButtonComment = MobileBy.xpath("//android.view.View[@content-desc=\"Add new comment...\"]");
    By inputComment = MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    public void addComment(String SentComment) {
        driver.findElement(clickButtonComment).click();
        driver.findElement(inputComment).click();
        driver.findElement(inputComment).sendKeys(SentComment);
    }
    By submitComment = MobileBy.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    public void submitComment() {
        driver.findElement(submitComment).click();
    }

    By getComment = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    public String getComment(){
       return driver.findElement(getComment).getText();
    }
//=====================================Reply Comment ======================
    By iconEdit = MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]");
    By buttonEdit = MobileBy.xpath("//android.view.View[@content-desc=\"Edit Comment\"]");

    public void iconEdit()  {
        driver.findElement(iconEdit).click();
        driver.findElement(buttonEdit).click();

    }
    //android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText
    By inputNewComment = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    public void sentNewComment(String sentComment) throws InterruptedException {
        driver.findElement(inputNewComment).click();
        driver.findElement(inputNewComment).clear();
        driver.findElement(inputNewComment).sendKeys(sentComment);
    }

    By updateComment = MobileBy.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    public void updateComment() {
        driver.findElement(updateComment).click();
    }

    By notifUpdate = MobileBy.xpath("//android.view.View[@content-desc=\"your comment has been edited\"]");
    public boolean isDisplayedNotifUpdateSucces(){
        driver.findElement(notifUpdate).isDisplayed();
        return true;
    }

//================================create question for general without input quesion field===============
    By errorMessege = MobileBy.xpath("//android.view.View[@content-desc=\"question must be filled\"]");
    public boolean isDisplayed(){
        driver.findElement(errorMessege).isDisplayed();
        return true;
    }
//================================uncheck all member question create========================
    By uncheckButton = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
    By submitButtonUncheckMember = MobileBy.xpath("//android.view.View[@content-desc=\"done\"]");
    public void submitUncheckMember() {
        driver.findElement(uncheckButton).click();
        driver.findElement(uncheckButton).click();
        driver.findElement(submitButtonUncheckMember).click();
    }

    By saveButtonq = MobileBy.xpath("//android.widget.Button[@content-desc=\"Start collecting answer!\"]");
    public void saveButtonq() {
        driver.findElement(saveButtonq).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    List<MobileElement> verifyMember;
    public String getText(){
        return verifyMember.get(verifyMember.size()-1).getAttribute("content-desc");
    }

    By ErrorMessege = MobileBy.xpath("//android.view.View[@content-desc=\"Create question successful\"]");
    public boolean isDisplayedPopUpMsg(){
        driver.findElement(ErrorMessege).isDisplayed();
        return true;
    }
//==================================create question without set date ===================
    By errorMessegeDate = MobileBy.xpath("//android.view.View[@content-desc=\"how often the question is asked to be filled in\"]");
    public boolean isDisplayedErr(){
        driver.findElement(errorMessegeDate).isDisplayed();
        return true;
    }


}
