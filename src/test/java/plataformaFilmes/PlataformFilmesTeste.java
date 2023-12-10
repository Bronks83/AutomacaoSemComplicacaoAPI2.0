package plataformaFilmes;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.RestUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PlataformFilmesTeste {
    static String token;

    @BeforeAll /*era a linha 33, metodo de atutenticação, criação e armazenamento do token de autenticação*/
    public static void validarLoginMap() {
        RestUtils.setBaseURI("http://localhost:8080/");
        Map<String, String> map = new HashMap<>();
        map.put("email", "aluno@email.com");
        map.put("senha", "123456");

        Response response = RestUtils.post(map, ContentType.JSON, "auth");
        assertEquals(200, response.statusCode());
        token = response.jsonPath().get("token");
    }

    /*metodo generico para envio de requisições chamado POST --foi para o pacote Utils, classe RestUtils*/

    /*metodo generico para consulta de requisições chamado GET--foi para o pacote Utils, classe RestUtils*/


    @Test
    public void validarLogin() {
        RestUtils.setBaseURI("http://localhost:8080/");

        String json = "{" + "    \"email\": \"aluno@email.com\"," + "    \"senha\": \"123456\"" + "}";
        Response response = RestUtils.post(json, ContentType.JSON, "auth");

        assertEquals(200, RestUtils.getResponse().getStatusCode());
        String token = response.jsonPath().get("token");
        System.out.println(token);
    }


    @Test
    public void validarConsultaCategorias() {
        Map<String, String> header = new HashMap<>();
        header.put("Authorization", "Bearer " + token);

        Response response = RestUtils.get(header, "categorias");
        assertEquals(200, RestUtils.getResponse().statusCode());
        assertEquals("Terror", response.jsonPath().get("tipo[2]"));

        List<String> listTipo = response.jsonPath().get("tipo");
        assertTrue(listTipo.contains("Terror"));
        //System.out.println(response.jsonPath().get().toString());
    }
}
