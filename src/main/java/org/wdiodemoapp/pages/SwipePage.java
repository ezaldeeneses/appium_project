package org.wdiodemoapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.wdiodemoapp.base.Common;
import org.wdiodemoapp.constants.FrameworkCons;
import org.wdiodemoapp.utils.Driver;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SwipePage {

    FrameworkCons cons = new FrameworkCons();
    Common com = new Common();
    Driver driver = new Driver();

    //For sure using accessibility id is better than Xpath, but most of the elements doesn't have ID

    public void pressSwipeScreen() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Swipe.getString("swipeScreen"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Swipe.getString("swipeScreen"))).click();
    }

    //The swiping is written by appium inspector, by pressing on recode and do the action you need
    public void swipeRightTillSupportVideo() {

        driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Swipe logic to find the "SUPPORT VIDEOS" card
        boolean isElementFound = false;
        int maxSwipes = 6;  // Set a maximum number of swipes to prevent infinite loops
        int swipeCount = 0;

        while (!isElementFound && swipeCount < maxSwipes) {
            try {
                // Attempt to find the "SUPPORT VIDEOS" element
                WebElement supportVideosCard = driver.getDriver().findElement(By.xpath((cons.jsonObject_Swipe.getString("supportVideosTxt"))));
                if (supportVideosCard.isDisplayed()) {
                    System.out.println("SUPPORT VIDEOS card is visible!");
                    isElementFound = true;
                }
            } catch (Exception e) {
                // Element not found, perform swipe
                final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
                var start = new Point(903, 1622);
                var end = new Point(313, 1612);
                var swipe = new Sequence(finger, 1);
                swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                        PointerInput.Origin.viewport(), start.getX(), start.getY()));
                swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                        PointerInput.Origin.viewport(), end.getX(), end.getY()));
                swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
                driver.getDriver().perform(Arrays.asList(swipe));  // Swipe right if the element is not found

                swipeCount++;
            }
        }


    }
}
