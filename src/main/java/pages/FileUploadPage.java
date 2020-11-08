package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.$;

public class FileUploadPage extends BasePage {

    String file = "text.txt";
    Robot robot = new Robot();

    private SelenideElement selectFileButton = $("div[id=filelist]");
    private SelenideElement submitButton = $("button[id=submitbutton]");
    private SelenideElement successMessage = $("h3[id=res]");

    public SelenideElement getSubmitButton() {
        return submitButton;
    }

    public FileUploadPage() throws AWTException {
    }

    public void clickSelectFileButton() {
        selectFileButton.click();
    }

    public void addFileToUpload() throws Exception {

        robot.setAutoDelay(2000);
        StringSelection string = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isSuccessMessagePresent() {
        return successMessage.waitUntil(Condition.visible, 2000).isDisplayed();
    }

}
