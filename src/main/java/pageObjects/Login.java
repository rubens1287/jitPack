package pageObjects;

import br.com.link.asserts.BrowserVerifications;
import br.com.link.setup.ConfigFramework;
import br.com.link.view.BrowserActions;
import org.openqa.selenium.By;

public class Login extends ConfigFramework {

    By inputNumeroEstab = By.id("input_0");
    By inputSenha = By.id("input_1");
    By btnEntrar = By.className("btn-submit-acesso");
    By mensage = By.className("texto1");

    public void executaLogin(String numero, String senha){
        BrowserActions.setText(inputNumeroEstab,numero,10);
        BrowserActions.setText(inputSenha,senha,10);
        BrowserVerifications.verifyElementIsClickable(btnEntrar,10);
        BrowserActions.clickOnElement(btnEntrar,10);
    }

    public void validaMensagemErro(String msgErro){
        browser.switchTo().frame(0);
        BrowserVerifications.verifyTextsExistingElement(mensage,msgErro,10);
    }
}
