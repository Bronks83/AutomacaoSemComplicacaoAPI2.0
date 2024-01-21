package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import maps.LoginMap;
<<<<<<< HEAD
=======
import org.junit.Assert;
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
import utils.RestUtils;

import java.util.Map;

public class LoginSteps {
<<<<<<< HEAD
    @Dado("que tenha um payload valido da API de Login")
    public void queTenhaUmPayloadValidoDaAPIDeLogin() {
        LoginMap.initLogin();
=======
    String url = "http://localhost:8080/";
    @Dado("que tenha um payload valido da API de Login")
    public void queTenhaUmPayloadValidoDaAPIDeLogin() {
        LoginMap.initLogin();
        RestUtils.setBaseURI(url);
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
    }

    @Quando("envio uma requisicao do tipo POST de Login")
    public void envioUmaRequisicaoDoTipoPOSTDeLogin() {
<<<<<<< HEAD
        RestUtils.post(LoginMap.getLogin(), ContentType.JSON, "auth");
    }

=======
    RestUtils.post(LoginMap.getLogin(), ContentType.JSON,"auth");

    }
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
    @Entao("armazeno o token que recebo do response de Login")
    public void armazenoOTokenQueReceboDoResponseDeLogin() {
        LoginMap.token = RestUtils.getResponse().jsonPath().get("token");
    }
<<<<<<< HEAD

    @Dado("que tenha um payload da API de Login com as seguintes informacoes")
    public void queTenhaUmPayloadDaAPIDeLoginComAsSeguintesInformacoes(Map<String, String> map) {
        LoginMap.initLogin();
        LoginMap.getLogin().putAll(map);

    }

    @Dado("que tenha relizado o login com dados validos")
    public void queTenhaRelizadoOLoginComDadosValidos() {
        queTenhaUmPayloadValidoDaAPIDeLogin();
        envioUmaRequisicaoDoTipoPOSTDeLogin();
        armazenoOTokenQueReceboDoResponseDeLogin();
=======
    @Dado("que tenha um payload da API de Login com as seguintes informacoes")
    public void queTenhaUmPayloadDaAPIDeLoginComAsSeguintesInformacoes(Map<String,String> map) {
        LoginMap.initLogin();
        RestUtils.setBaseURI(url);
        LoginMap.getLogin().putAll(map);
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
    }
}
