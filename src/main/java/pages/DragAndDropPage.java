package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DragAndDropPage {
    private SelenideElement bank = $x("//*[@id='credit2']/a");
    private SelenideElement debitSideAccountSell = $x("//*[@id='bank']/li");
    private SelenideElement sales = $x("//*[@id='credit1']/a");
    private SelenideElement creditSideAccountSell = $x("//*[@id='loan']/li");
    private SelenideElement fiveThousands = $x("//*[@id='fourth']/a");
    private SelenideElement debitSideAmount = $x("//*[@id='amt7']/li");
    private SelenideElement creditSideAmount = $x("//*[@id='amt8']/li");
    private SelenideElement perfectMessage = $x("//a[contains(text(),'Perfect')]");

    public void dragBankToDebitAccount() {
        (bank).dragAndDropTo(debitSideAccountSell);
    }

    public void dragSalesToCraditAccount() {
        (sales).dragAndDropTo(creditSideAccountSell);
    }

    public void dragFiveThousandToDebitAmount() {
        (fiveThousands).dragAndDropTo(debitSideAmount);
    }

    public void dragFiveThousandToCreditAmount() {
        (fiveThousands).dragAndDropTo(creditSideAmount);
    }

    public SelenideElement getPerfectMessage() {
      return perfectMessage;
    }

    public boolean isPerfectMessagePresent() {
        return perfectMessage.isDisplayed();
    }

    public SelenideElement getBank() {
        return bank;
    }

    public SelenideElement getSales() {
        return sales;
    }

    public SelenideElement getFiveThousands() {
        return fiveThousands;
    }

}
