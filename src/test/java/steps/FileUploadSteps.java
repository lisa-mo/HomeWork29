package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FileUploadPage;
import pages.HomePage;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FileUploadSteps {

    HomePage homePage = new HomePage();
    FileUploadPage fileUploadPage = new FileUploadPage();

    public FileUploadSteps() throws AWTException {
    }

    @Given("user is on uploadFilePage")
    public void userIsOnUploadFilePage() {
        homePage.navigate();
        homePage.getMainMenuFragment().clickFileUploadLink();
    }

    @And("title of page is {string}")
    public void titleOfPageIs(String title) {
        assertEquals(title, fileUploadPage.getTitle());
    }

    @When("user click {string} button")
    public void userClickButton(String chooseFile) {
        fileUploadPage.clickSelectFileButton();
    }

    @Then("add file path")
    public void addFilePath() throws Exception {
        fileUploadPage.addFileToUpload();
    }

    @And("click {string} button")
    public void clickButton(String submitButton) {
        assertEquals(submitButton, fileUploadPage.getSubmitButton().getText());
        fileUploadPage.clickSubmitButton();

    }

    @Then("success message is shown")
    public void successMessageIsShown() {
        assertTrue(fileUploadPage.isSuccessMessagePresent());
    }
}
