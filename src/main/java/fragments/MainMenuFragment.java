package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainMenuFragment extends BaseFragment {

    protected SelenideElement rootElement = $("div.row>nav");
    private SelenideElement agileProjectLink = $x("//a[contains(text(), 'Agile Project')]");
    private SelenideElement newToursLink = $x("//a[contains(text(), 'New Tours')]");
    private SelenideElement seleniumSelector = $x("//a[@class='dropdown-toggle' and contains(text(), 'Selenium')]");
    private SelenideElement fileUploadLink = $x("//a[contains(text(), 'File Upload')]");
    private SelenideElement dragAndDropLink = $x("//a[contains(text(), 'Drag and Drop Action')]");
    private SelenideElement tableDemoLink = $x("//a[contains(text(), 'Table Demo')]");

    public MainMenuFragment() {
        super.rootElement = rootElement;
    }

    public SelenideElement getRootElement() {
        return rootElement;
    }

    private void clickSeleniumSelector() {
        seleniumSelector.click();
    }

    public void clickAgileProjectLink() {
        agileProjectLink.click();
    }

    public void clickNewToursLink() {
        newToursLink.click();
    }

    public void clickFileUploadLink() {
        clickSeleniumSelector();
        fileUploadLink.click();
    }

    public void clickDragAndDropLink() {
        clickSeleniumSelector();
        dragAndDropLink.click();
    }

    public void clickTableDemo() {
        clickSeleniumSelector();
        tableDemoLink.click();
    }
}
