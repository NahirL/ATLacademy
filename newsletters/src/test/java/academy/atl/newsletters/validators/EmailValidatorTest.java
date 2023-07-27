package academy.atl.newsletters.validators;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EmailValidatorTest {

    @Test
    public void elEmailTieneQueTenerArroba() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidEmail("sdskfjhsdfsdf");
        assertFalse(resultado);
    }

    @Test
    public void elEmailTieneQueTenerPunto() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidEmail("lucas@moy");
        assertFalse(resultado);
    }

    @Test
    public void queElArrobaNoSeaLaUltimaLetra() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidEmail("luca.smoy@");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaEspacios() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidEmail("luca moy@atl.com");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaMasDe255Caracteres() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidEmail("dfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoy@atl.com");
        assertFalse(resultado);
    }

}
