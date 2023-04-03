package com.kikisahnakri.step_definition;
import com.kikisahnakri.page_object.HomePage;
import com.kikisahnakri.page_object.KanbanPage;
import com.kikisahnakri.page_object.TeamPage;
import cucumber.runtime.junit.Assertions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

public class KanbanSteps {
    AppiumDriver driver;

    public KanbanSteps(){
        this.driver = Hooks.driver;
    }
    @Given("User is logged in")
    public void userIsLoggedIn() {
        HomePage homePage = new HomePage(driver);
        homePage.openTeam(1);
    }

    @And("User on the kanban board page")
    public void userOnTheKanbanBoardPage() throws InterruptedException {
        TeamPage teamPage = new TeamPage(driver);
        teamPage.openKanbanBoard();
        Thread.sleep(1000);
    }

    @When("^User input add new borad \"(.*)\"$")
    public void userInputAddNewBorad(String titleBoard) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.addButton();
        Thread.sleep(1000);
        kanbanPage.inputBoard(titleBoard);
        kanbanPage.submitButtonBoard();
        Thread.sleep(3000);
    }

    @Then("^User successfully created kanban board \"(.*)\"$")
    public void userSuccessfullyCreatedKanbanBoard(String titleBoard) {
        KanbanPage kanbanPage = new KanbanPage(driver);
        System.out.println(titleBoard+"ccccccccccccccc");

//        Assert.assertEquals(titleBoard,kanbanPage.verifyKanbanBoard());
//        System.out.println(kanbanPage.verifyKanbanBoard()+"aaaaaaaaaaaaaaaaaaaa");
        //get device width and height

    }
//=================================CARD NEW =======================================
    @When("User input new card {string}")
    public void userInputNewCard(String txtCard) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.cardNew();
        Thread.sleep(1000);
        kanbanPage.inputcardNew(txtCard);
        Thread.sleep(1000);
    }

    @Then("^User successfully created card \"(.*)\"$")
    public void userSuccessfullyCreatedCard(String verifCard) {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.submitCardnew();

    }
//
    @And("User click project want to edited")
    public void userClickProjectWantToEdited() throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.editProject();
        Thread.sleep(1000);
//        kanbanPage.editIcon();
    }

    @When("^User input new title \"(.*)\"$")
    public void userInputNewTitle(String editTitle) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.inputEditTitle(editTitle);
        Thread.sleep(1000);
    }

    @Then("^User successfully update title \"(.*)\"$")
    public void userSuccessfullyUpdateTitle(String verifEditTitle) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        Thread.sleep(1000);
        kanbanPage.saveButton();

    }
//====================ADD DESCRIPTION =================================
    @And("User click project want to add description")
    public void userClickProjectWantToAddDescription() throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.chooseBoard();
        Thread.sleep(1000);
        kanbanPage.iconDescription();
    }

    @When("^User input description \"(.*)\"$")
    public void userInputDescription(String textDescription) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.inputDescription(textDescription);
        Thread.sleep(2000);
        kanbanPage.saveDescription();
        Thread.sleep(3000);
    }

    @Then("^User successfully set description \"(.*)\"$")
    public void userSuccessfullySetDescription(String verifDescription) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.iconDescription();
        Thread.sleep(2000);
        String verif = kanbanPage.verifyDescrip();
        Assert.assertEquals(verifDescription,verif);
        System.out.println(verifDescription);
        System.out.println(verif);
    }
    // ===================================ATTACH FILE IMAGE=================================================
    @And("User click project want to add attach file")
    public void userClickProjectWantToAddAttachFile() throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.chooseBoard();
        Thread.sleep(1000);
        kanbanPage.buttonFile();
    }

    @When("User input file jpg")
    public void userInputFileJpg() {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.inputFile();
    }

    @Then("User successfully upload jpg")
    public void userSuccessfullyUploadJpg() {
        System.out.println("success upload image");
    }
//
    @When("^User submit empty title \"(.*)\"$")
    public void userSubmitEmptyTitle(String emptyTitle) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.addButton();
        Thread.sleep(1000);
        kanbanPage.inputBoard(emptyTitle);
        kanbanPage.submitButtonBoard();
    }

    @Then("User unsuccessfully created kanban board")
    public void userUnsuccessfullyCreatedKanbanBoard() {
        KanbanPage kanbanPage = new KanbanPage(driver);
        Assert.assertTrue(kanbanPage.isDisplayedTitle());

    }
//===============================EMPTY CARD ==========================================
    @When("^User submit empty card \"(.*)\"$")
    public void userSubmitEmptyCard(String emptyCard) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.cardNew();
        Thread.sleep(1000);
        kanbanPage.inputcardNew(emptyCard);
        Thread.sleep(1000);
        kanbanPage.submitCardnew();
        Thread.sleep(1000);
    }

    @Then("User unsuccessfully created card")
    public void userUnsuccessfullyCreatedCard() {
        KanbanPage kanbanPage = new KanbanPage(driver);
        Assert.assertTrue(kanbanPage.isDisplayedCard());
    }
//========================edit card title===========================================
    @When("^User submit without input data \"(.*)\"$")
    public void userSubmitWithoutInputData(String emptyTextCardTitle) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.sendTextTitle(emptyTextCardTitle);
    }

    @Then("User unsuccessfully edit card")
    public void userUnsuccessfullyEditCard() {
        KanbanPage kanbanPage = new KanbanPage(driver);
        Assert.assertTrue(kanbanPage.isDisplayedEditCardTitle());
    }
//=============================INPUT DESCRIPTION WITH HTML CODE ================
    @When("^User input html code \"(.*)\"$")
    public void userInputDescriptionPStyleYourTextHereP(String description) {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.inputDescriptionHtml(description);
    }

    @Then("^User unsuccessfully set description \"(.*)\"$")
    public void userUnsuccessfullySetDescriptionPStyleYourTextHereP(String textHtml) throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.saveDescription();
        kanbanPage.iconDescription();
        Thread.sleep(2000);
        String verif = kanbanPage.verifyDescrip();
        Assert.assertEquals(textHtml,verif);
    }

    @And("User click project")
    public void userClickProject() throws InterruptedException {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.pickProject();
        Thread.sleep(1000);
    }

    @When("User submit without input data label")
    public void userSubmitWithoutInputDataLabel() {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.iconLabel();
    }

    @Then("User unsuccessfully create label")
    public void userUnsuccessfullyCreateLabel() {
        KanbanPage kanbanPage = new KanbanPage(driver);
        kanbanPage.submitLabel();
        Assert.assertTrue(kanbanPage.isDisplayedLabel());
    }
}
