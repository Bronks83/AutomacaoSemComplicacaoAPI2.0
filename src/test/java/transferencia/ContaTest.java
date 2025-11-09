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
        xuxa = new Cliente("Xuxa", "12345678901", "123456789");
        silvioSantos = new Cliente("Silvio Santos", "45645645600", "337889990");

        contaXuxa = new Conta("0024", "58880", 2500.00, xuxa);
        contaSilvio = new Conta("0028", "45686", 3500.00, silvioSantos);

    }

    @Test
    public void realizarTransacao() {
        contaXuxa.realizarTransferencia(1000.00, contaSilvio);

        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvio.getSaldo());
    }

    @Test
    public void realizarTransferenciaInvalida() {
        boolean resultado = contaXuxa.realizarTransferencia(3500.00, contaSilvio);

        assertFalse(resultado);
    }
    @Test
    public void validarAgencia(){
        assertEquals("0024", contaXuxa.getAgencia());
    }
    @Test
    public void validarConta(){
        assertEquals("58880", contaXuxa.getNumeroConta());
    }
    @Test
    public void validarProprietarioConta(){
        assertEquals(xuxa, contaXuxa.getProprietario());
    }

    @Test
    public void validarNomeCliente(){
        assertEquals("Xuxa", xuxa.getNome());
    }
    @Test
    public void validarCpfCliente(){
        assertEquals("12345678901", xuxa.getCpf());
    }
    @Test
    public void validarRgCliente(){
        assertEquals("123456789", xuxa.getRg());
    }

}