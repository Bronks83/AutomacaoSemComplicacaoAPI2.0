package steps;

<<<<<<< HEAD
import io.cucumber.java.pt.E;
=======
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import utils.RestUtils;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class GenericSteps {
    @Entao("valido e recebo status {int} no response")
    public void validoEReceboStatusNoResponse(int status) {
        Assert.assertEquals(status, RestUtils.getResponse().getStatusCode());
    }

    @Entao("valido que no campo {string} possui o valor {string}")
    public void validoQueNoCampoPossuiOValor(String key, String value) {
        Assert.assertEquals(value, RestUtils.getResponse().jsonPath().get(key));


    }

    @E("valido que recebo uma lista vazia no response")
    public void validoQueReceboUmaListaVaziaNoResponse() {
        Assert.assertEquals(new ArrayList<>(),RestUtils.getResponse().jsonPath().get());
    }
}
=======
public class GenericSteps {

    @Entao("valido que recebo status {int} no response")
    public void validoQueReceboStatusNoResponse(int status) {
        Assert.assertEquals(status, RestUtils.getResponse().getStatusCode());
    }
}
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
