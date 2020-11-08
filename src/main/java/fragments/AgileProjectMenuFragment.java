package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AgileProjectMenuFragment {
    private SelenideElement userInput = $("input[name=uid]");
    private SelenideElement passInput = $("input[name=password]");
    private SelenideElement loginButton = $("input[name=btnLogin]");

    public void inputUserAndPass(String user, String pass) {
        userInput.val(user).click();
        passInput.val(pass).click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
