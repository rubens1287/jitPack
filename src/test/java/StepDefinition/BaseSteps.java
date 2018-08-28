package StepDefinition;

import br.com.link.setup.ConfigFramework;
import cucumber.api.java.pt.*;
import pageObjects.Login;

public class BaseSteps extends ConfigFramework {

    Login login = new Login();

    @Dado("^Precondicao$")
    public void precondicao()  {
        loadApplication("https://minhaconta2.cielo.com.br/login/",true);
    }

    @Quando("^Acao$")
    public void acao()  {
        login.executaLogin("123","rubens");
    }

    @Entao("^Validacao$")
    public void validacao() {
        login.validaMensagemErro("Os dados de acesso estão incorretos");
    }

}
