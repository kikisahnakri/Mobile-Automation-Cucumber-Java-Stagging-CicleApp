package com.kikisahnakri.page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class TeamPage {

    AppiumDriver driver;

    public TeamPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Group Chat\"]")
    MobileElement groupChat;

    public void openGroupChat(){
        groupChat.click();
    }

    public void openKanbanBoard(){
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Board\"]")).click();
    }


}
