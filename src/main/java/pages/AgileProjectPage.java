package pages;

import com.codeborne.selenide.SelenideElement;
import fragments.AgileProjectMenuFragment;
import fragments.MainMenuFragment;

import static com.codeborne.selenide.Selenide.$;

public class AgileProjectPage {
    AgileProjectMenuFragment agileProjectMenuFragment = new AgileProjectMenuFragment();
    MainMenuFragment mainMenuFragment = new MainMenuFragment();

    private SelenideElement welcomeMessage = $("marquee.heading3");

    public boolean isWelcomeMessagePresent() {
        return welcomeMessage.isDisplayed();
    }

    public MainMenuFragment getMainMenuFragment() {
        return mainMenuFragment;
    }

    public AgileProjectMenuFragment getAgileProjectMenuFragment() {
        return agileProjectMenuFragment;
    }
}
