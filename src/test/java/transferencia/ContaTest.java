package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ContaTest {

    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa", "45645645600", "393938391");
        silvioSantos = new Cliente("Silvio Santos", "19119119100", "0582311X");

        contaXuxa = new Conta("0001", "0202898970", 2500.00, xuxa);
        contaSilvio = new Conta("0002", "9898020270", 3500.00, silvioSantos);


    }

    @Test
    public void realizarTransacao() {
        contaXuxa.realizarTransferencia(1000.00, contaSilvio);

        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvio.getSaldo());
    }

    @Test
    public void realizarTransacaoInvalida() {

        boolean resultado = contaXuxa.realizarTransferencia(3500.00, contaSilvio);
        assertFalse(resultado);
    }

    @Test
    public void verificarDadosCliente() {
        assertEquals("Xuxa", xuxa.getNome());
        assertEquals("45645645600", xuxa.getCpf());
        assertEquals("393938391", xuxa.getRg());
    }
    @Test
    public void validarAgencia(){
        assertEquals("0002",contaSilvio.getAgencia());
    }
    @Test
    public void validarConta(){
        assertEquals("9898020270",contaSilvio.getNumeroConta());
    }
    @Test
    public void validarProprietario(){
        assertEquals("Silvio Santos",contaSilvio.getProprietario());
    }



}