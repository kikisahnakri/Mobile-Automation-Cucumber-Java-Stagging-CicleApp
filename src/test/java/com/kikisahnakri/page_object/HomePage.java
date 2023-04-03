package com.kikisahnakri.page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    AppiumDriver driver;

    public HomePage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View/android.view.View")
    List<MobileElement> teams;


    public void openTeam(int index){
        teams.get(index).click();
    }


}
