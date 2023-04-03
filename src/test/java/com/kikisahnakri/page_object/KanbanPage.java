package com.kikisahnakri.page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class KanbanPage {
    AppiumDriver driver;

    public KanbanPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void addButton(){
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
    }
    public void inputBoard(String txtBoard){
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Add new list...\"]")).sendKeys(txtBoard);
    }

    public void submitButtonBoard(){
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
    }


    By verifyT =MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[last()]/android.view.View[1]");

    public Object verifyKanbanBoard(){
      //  return driver.findElement(By.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[last()]/android.view.View")).getText();
        driver.findElement(verifyT).getLocation().getX();
        driver.findElement(verifyT).getLocation().getY();
        return null;
    }

//==================================Input card ======================================
    public void cardNew(){
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add new card\"]")).click();
    }
    public void inputcardNew(String txtCard){
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Your card name\"]")).sendKeys(txtCard);
    }

    public void submitCardnew(){
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View")).click();
    }
//===============================Edit title kanban board ===============================
    public void editProject(){
        driver.findElement(By.xpath("//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
    }
    public void editIcon(){
        driver.findElement(By.xpath("//android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")).click();
    }
    By clrTxt = MobileBy.xpath("//android.widget.EditText[@index=0]");
    public void inputEditTitle(String editTxt){
        driver.findElement(By.xpath("//android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")).click();
        driver.findElement(clrTxt).clear();
        driver.findElement(clrTxt).sendKeys(editTxt);
    }
    By saveButton = MobileBy.xpath("//android.widget.Button[@index=1]");
    public void saveButton(){
        driver.findElement(saveButton).click();
    }
//==============================ADD DESCRIPTION ==========================
    public void chooseBoard(){
        driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]")).click();
    }
    public void iconDescription() {
        driver.findElement(By.xpath("//android.view.View[2]/android.view.View/android.view.View/android.view.View[4]")).click();

    }
    public void inputDescription(String description) {
        driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.EditText")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.EditText")).clear();
        driver.findElement(By.xpath("//android.widget.EditText[@index=1] | //android.view.View[@text=\"Your text here...\"]")).sendKeys(description);
        driver.hideKeyboard();
    }
    public void saveDescription(){
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Publish\"]")).click();
    }

    public String verifyDescrip(){
        //driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.EditText")).click();
        return driver.findElement(By.xpath("//android.widget.EditText[@index=1] | //android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.EditText")).getText();
    }
//================================Attach file image==============================
    public void buttonFile(){
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Attach file\"]")).click();
    }
    public void inputFile(){
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Screenshot_2023-03-22-17-30-08-893_staging.cicle.jpg\"]")).click();
    }
//===================================Empty Title ==================================================
    By verifyTitle = MobileBy.xpath("//android.widget.EditText[@text=\"Add new list...\"]");
    public boolean isDisplayedTitle(){
        driver.findElement(verifyTitle).isDisplayed();
        return true;
    }
//====================================EMpty card =====================================================
    By verifyCard = MobileBy.xpath("((//android.widget.Button[@content-desc=\"Add new card\"])[1])");
    public boolean isDisplayedCard(){
        driver.findElement(verifyCard).isDisplayed();
        return true;
    }
//===============================Edit title empty data============================
    By clrTitle = MobileBy.xpath("//android.widget.EditText[@index=0]");
    By editIcon =MobileBy.xpath ("//android.view.View[2]/android.view.View/android.view.View/android.view.View[1]");
    public void sendTextTitle( String message ) throws InterruptedException {
        driver.findElement(editIcon).click();
        driver.findElement(clrTitle).click();
        driver.findElement(clrTitle).clear();
        Thread.sleep(1000);
        driver.findElement(clrTitle).sendKeys(message);
        driver.findElement(saveButton).click();
        Thread.sleep(2000);
    }

    By verifyEditCardTitle = MobileBy.xpath("//android.widget.EditText[@text=\"Type Card title here...\"]");
    public boolean isDisplayedEditCardTitle(){
        driver.findElement(verifyEditCardTitle).isDisplayed();
        return true;
    }
//====================================Description HTmL code ===========================================
    public void inputDescriptionHtml(String description) {
        driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.EditText")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.EditText")).clear();
        driver.findElement(By.xpath("//android.widget.EditText[@index=1] | //android.view.View[@text=\"Your text here...\"]")).sendKeys(description);
        driver.hideKeyboard();
    }
//====================================Add label empty data =====================================
    public void pickProject(){
        driver.findElement(By.xpath("//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
    }
    public void iconLabel(){
        driver.findElement(By.xpath("//android.view.View[2]/android.view.View/android.view.View/android.view.View[3]")).click();
   }

    public void submitLabel(){
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"submit\"]")).click();
    }

    By verifyLabel = MobileBy.xpath("(//android.widget.Button[@content-desc=\"submit\"])");
    public boolean isDisplayedLabel(){
        driver.findElement(verifyLabel).isDisplayed();
        return true;
    }
}
