package com.kikisahnakri.step_definition;

import com.kikisahnakri.page_object.ChatPage;
import com.kikisahnakri.page_object.HomePage;
import com.kikisahnakri.page_object.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChatSteps {

    AppiumDriver driver;

    public ChatSteps(){
        this.driver = Hooks.driver;
    }

    @Given("User on the chat group page")
    public void userOnTeamGroupPage()  {
        HomePage homePage = new HomePage(driver);
        homePage.openTeam(1);
        TeamPage teamPage = new TeamPage(driver);
        teamPage.openGroupChat();


        ChatPage chatPage = new ChatPage(driver);
        Assert.assertTrue(chatPage.isDisplayed());

    }

    @When("User send {string}")
    public void userSendMessage(String message) throws InterruptedException {

        ChatPage chatPage = new ChatPage(driver);
        chatPage.sendChat(message);
        Thread.sleep(5000);

    }

    @Then("^Last message is \"(.*)\"$")
    public void verifyLastMessage(String message){
        ChatPage chatPage = new ChatPage(driver);

        String lastMessage = chatPage.getLastMessage();
        Assert.assertTrue(lastMessage.contains(message));
    }
//===============================Mention User

    @When("^User tag mention to \"(.*)\"$")
    public void userTagMentionToUsers(String mention) throws InterruptedException {
        ChatPage chatPage = new ChatPage(driver);
        chatPage.sendChat(mention);
        Thread.sleep(5000);
    }

    @Then("^User successfully mention")
    public void userSuccessfullyMentionUser() {
        ChatPage chatPage = new ChatPage(driver);
        Assert.assertTrue(chatPage.isDisplayedUser());;
    }
//===============Add file==================================================
    @When("User add file image")
    public void userAddFileImage() throws InterruptedException {
        ChatPage chatPage = new ChatPage(driver);
        chatPage.chatBx();
        Thread.sleep(2000);
        chatPage.iconAddFile();
        Thread.sleep(2000);
        chatPage.addFile();
    }

    @Then("User successfully add file image")
    public void userSuccessfullyAddFileImage() throws InterruptedException {
        ChatPage chatPage = new ChatPage(driver);

        Assert.assertTrue(chatPage.isDisplayedLastImage());

    }
//==============Empty text===============
    @When("^User send empty \"(.*)\" text$")
    public void userSendEmptyText(String message) throws InterruptedException {
        ChatPage groupPage = new ChatPage(driver);
        groupPage.sendEmptyChat(message);
        Thread.sleep(2000);
    }

    @Then("User unsuccessfully sent text chat in group chat")
    public void userUnsuccessfullySentTextChatInGroupChat() {
        ChatPage groupPage = new ChatPage(driver);
        Assert.assertTrue(groupPage.isDisplayed());
    }

    @When("^User send html code \"(.*)\"$")
    public void userSendHtmlCodePStyleHtmlCodeP(String htmlCode) throws InterruptedException {
        ChatPage groupPage = new ChatPage(driver);
        groupPage.sendChat(htmlCode);
        Thread.sleep(5000);
    }

    @Then("^User unsuccessfully sent text html code \"(.*)\"$")
    public void userUnsuccessfullySentTextHtmlCodeChatInGroupChat(String htmlCode) {
        ChatPage groupPage = new ChatPage(driver);
        String verifTextHTML = groupPage.verifMessageHtml();
        Assert.assertTrue(verifTextHTML.contains(htmlCode));
    }
//=================Group chat Add image >25 MB============================
    @When("User input file image")
    public void userInputFileImage() throws InterruptedException {
        ChatPage chatPage = new ChatPage(driver);
        chatPage.chatBx();
        Thread.sleep(2000);
        chatPage.iconAddFile();
        Thread.sleep(2000);
        chatPage.addBigImage();
    }

    @Then("User unsuccessfully input file in conversation group chat")
    public void userUnsuccessfullyInputFileInConversationGroupChat() throws InterruptedException {
        ChatPage chatPage = new ChatPage(driver);
        Assert.assertTrue(chatPage.isDisplayedLastImage());

    }
//==========================
    @Given("User on the team group page")
    public void userOnTheTeamGroupPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openTeam(1);

        ChatPage personalChat = new ChatPage(driver);
        personalChat.burgerButton();
        Thread.sleep(1000);
        personalChat.inboxIcon();
        Thread.sleep(2000);
        personalChat.userWantToChat();

        Assert.assertTrue(personalChat.Displayed());

    }

    @When("User send text {string}")
    public void userSendText(String textMessage) throws InterruptedException {
        ChatPage personalChat = new ChatPage(driver);
        personalChat.sendChatPersonalButton(textMessage);
        Thread.sleep(5000);
    }

    @Then("User successfully send text message is {string}")
    public void userSuccessfullySendTextMessageIs(String verifMessage) {
        ChatPage personalChat = new ChatPage(driver);
        String lastMessage = personalChat.getLastPersonalMessage();
        Assert.assertTrue(lastMessage.contains(verifMessage));
    }
//=======================================Personal chat < 1mb ====================
    @When("User add file image < 1 mb")
    public void userAddFileImageMb() throws InterruptedException {
        ChatPage personalChat = new ChatPage(driver);
        personalChat.iconAddFilePersonal();
        Thread.sleep(2000);
        personalChat.AddImageFilePersonal();
        Thread.sleep(2000);
    }

    @Then("User successfully send file image")
    public void userSuccessfullySendFileImage() throws InterruptedException {
        ChatPage personalChat = new ChatPage(driver);
        Assert.assertTrue(personalChat.isDisplayedLastImagePersonal());
    }

    @When("User send empty {string} text in personal chat")
    public void userSendEmptyTextInPersonalChat(String emptyMessage) {
        ChatPage personalChat = new ChatPage(driver);
        personalChat.sendEmptyPersonalChat(emptyMessage);
    }
//========================================
    @Then("User unsuccessfully sent text")
    public void userUnsuccessfullySentText() {
        ChatPage personalChat = new ChatPage(driver);
        Assert.assertTrue(personalChat.isDisplayedPersonalChat());
    }

    @When("User input image lebih dari 25 mb")
    public void userInputImageMb() throws InterruptedException {
        ChatPage personalChat = new ChatPage(driver);
        personalChat.iconAddFilePersonal();
        Thread.sleep(2000);
        personalChat.addBigImagePersonal();
        Thread.sleep(2000);
    }

    @Then("User unsuccessfully input file image")
    public void userUnsuccessfullyInputFileImage() throws InterruptedException {
        ChatPage personalChat = new ChatPage(driver);
        Assert.assertTrue(personalChat.isDisplayedLastImagePersonal());


    }

}
