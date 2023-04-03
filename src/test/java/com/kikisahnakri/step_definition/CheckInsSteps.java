package com.kikisahnakri.step_definition;

import com.kikisahnakri.page_object.ChatPage;
import com.kikisahnakri.page_object.CheckInsPage;
import com.kikisahnakri.page_object.HomePage;
import com.kikisahnakri.page_object.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckInsSteps {
    AppiumDriver driver;

    public CheckInsSteps(){
        this.driver = Hooks.driver;
    }
    @Given("User on the checkins page")
    public void userOnTheCheckinsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.openTeam(1);

        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.checkInsPage();
    }

    @And("User click button chekins")
    public void userClickButtonChekins() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.buttonAdd();

    }

    @And("^User input question \"(.*)\"$")
    public void userInputQuestion(String textQuestion) {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.inputQuestion(textQuestion);
    }

    @And("User click day question Friday and Sunday")
    public void userClickDayQuestionFridayAndSunday() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.day();
    }

    @And("User set time 9 PM")
    public void userSetTimePM() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.setTime();
    }

    @And("User click icon add member")
    public void userClickIconAddMember() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.buttonAddMember();
    }

    @And("User click check all member")
    public void userClickCheckAllMember() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.submitAllMember();
    }

    @When("User click submit")
    public void userClickSubmit() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.saveButtonQuestion();

    }

    @Then("User successfully create question")
    public void userSuccessfullyCreateQuestion() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayedPopUpMessage());

    }
//======================PRIVATE QUESTION ===========================
    @And("^User create private question \"(.*)\"$")
    public void userCreatePrivateQuestion(String privateQuestion) {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.inputQuestionPrivate(privateQuestion);
    }

    @And("User checklist box private question")
    public void userChecklistBoxPrivateQuestion() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.radioButtonPrivateQuestion();

    }

    @Then("User successfully create private question")
    public void userSuccessfullyCreatePrivateQuestion() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayedPopUpMessage());

    }
//==================================ALL DAY =====================
    @And("User click select all days")
    public void userClickSelectAllDays() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.allDay();
    }

//===========================Add comment ============================
    @And("User click question that was created")
    public void userClickQuestionThatWasCreated() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.headlineQuestion();
    }

    @And("^User add comment \"(.*)\"$")
    public void userAddComment(String SentComment) {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.addComment(SentComment);
    }

    @When("User click submit comment")
    public void userClickSubmitComment() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.submitComment();
        checkInsPage.iconEdit();

    }

    @Then("^User successfully open and comment question \"(.*)\"$")
    public void userSuccessfullyOpenAndCommentQuestion(String verif) {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
       // Assert.assertTrue(checkInsPage.getComment());

        String verifTextHTML = checkInsPage.getComment();
        Assert.assertEquals(verif,verifTextHTML);
    }
//==========================EDIT COMMENT =====================================
    @And("User click edit comment")
    public void userClickReplyComment() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.iconEdit();
        Thread.sleep(2000);
    }

    @And("^User input new comment \"(.*)\"$")
    public void userInputNewComment(String updateComment) throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.sentNewComment(updateComment);
        Thread.sleep(4000);

    }

    @When("User click submit new comment")
    public void userClickSubmitNewComment() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.updateComment();
        Thread.sleep(2000);
    }
    @Then("User successfully update comment")
    public void userSuccessfullyUpdateComment() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayedNotifUpdateSucces());
    }
//===========================create question for general without input quesion field====================
    @Then("^User unsuccessfully create question")
    public void UnsuccessfullyCreateQuestionWithoutInputField() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayed());
    }
//============================user create general question with Uncheck all member ====================================
    @And("User click uncheck all member")
    public void userClickUncheckAllMember() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.submitUncheckMember();
        Thread.sleep(1000);
    }

    @When("User click submit question")
    public void userClickSubmitQuestion() throws InterruptedException {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        checkInsPage.saveButtonq();
        Thread.sleep(5000);
    }

//==============================create private question with uncheck member ============
    @Then("User unsuccessfully create private question")
    public void userUnsuccessfullyCreatePrivateQuestion() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayedPopUpMsg());
    }
    //==============================create private question without input field question ============
    @Then("User unsuccessfully create private question without input quesion field")
    public void UnsuccessfullyCreatePrivateQuestion() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayed());
    }
    //==============================create private question without set day question ============
    @Then("User unsuccessfully create private question without set date question")
    public void userUnsuccessfullyCreatePrivateQuestionWithoutSetDateQuestion() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayedErr());
    }

    //===========================create question for general without input quesion field====================
    @Then("^User Unsuccessfully create question with uncheck all member$")
    public void UncheckAllMember() {
        CheckInsPage checkInsPage = new CheckInsPage(driver);
        Assert.assertTrue(checkInsPage.isDisplayedPopUpMsg());

    }
}
