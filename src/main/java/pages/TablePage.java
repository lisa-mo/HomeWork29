package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TablePage extends BasePage {

    private SelenideElement table = $("table[cellspacing]");

    public TablePage() {
    }

    public boolean isTablePresent() {
        return table.isDisplayed();
    }
}
