package pages;

import com.codeborne.selenide.SelenideElement;
import fragments.MainMenuFragment;

import static com.codeborne.selenide.Selenide.$;

public class NewToursPage extends BasePage {

    private MainMenuFragment mainMenuFragment = new MainMenuFragment();

    private SelenideElement mainFragment = $("body>div>table");

    public NewToursPage() {
    }

    public MainMenuFragment getMainMenuFragment() {
        return mainMenuFragment;
    }

    public boolean isMainFragmentPresent() {
        return mainMenuFragment.getRootElement().isDisplayed();
    }
}
